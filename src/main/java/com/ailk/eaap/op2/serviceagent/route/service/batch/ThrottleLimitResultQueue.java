/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:ThrottleLimitResultQueue.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service.batch 
 * Date:2015年1月28日下午4:27:25 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.serviceagent.route.service.batch;

import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;



/**
 * ClassName:ThrottleLimitResultQueue 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2015年1月28日 下午4:27:25 
 * 
 * @author wuwz
 * @version
 * @since JDK 1.6
 * 
 */
public class ThrottleLimitResultQueue {
	// Accumulation of result objects as they finish.
	private final LinkedBlockingQueue<Object> results;

	// Accumulation of dummy objects flagging expected results in the future.
	private  Semaphore waits;

	private final Object lock = new Object();

	private int count = 0;
	
	public synchronized void increase() {
		count++;
    }
	public synchronized void decrease() {
		count--;
    }

	/**
	 * @param throttleLimit
	 *            the maximum number of results that can be expected at any
	 *            given time.
	 */
	public ThrottleLimitResultQueue(int throttleLimit) {
		results = new LinkedBlockingQueue<Object>();
		waits = new Semaphore(throttleLimit);
	}
	
	public void updateThrottleLimit(int throttleLimit) {
		
		this.waits = new Semaphore(throttleLimit);
	}

	public boolean isEmpty() {
		return results.isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 *  org.springframework.batch.repeat.support.ResultQueue#isExpecting()
	 */
	public boolean isExpecting() {
		// Base the decision about whether we expect more results on a
		// counter of the number of expected results actually collected.
		// Do not synchronize! Otherwise put and expect can deadlock.
		return count > 0;
	}

	/**
	 * Tell the queue to expect one more result. Blocks until a new result is
	 * available if already expecting too many (as determined by the throttle
	 * limit).
	 * 
	 *  ResultQueue#expect()
	 */
	public void expect() throws InterruptedException {
		synchronized (lock) {
			waits.acquire();
			increase();
		}
	}

	public void put(Object holder) throws IllegalArgumentException {
		if (!isExpecting()) {
			throw new IllegalArgumentException(
					"Not expecting a result.  Call expect() before put().");
		}
		// There should be no need to block here, or to use offer()
		results.add(holder);
		// Take from the waits queue now to allow another result to
		// accumulate. But don't decrement the counter.
		waits.release();
	}

	public Object take() throws NoSuchElementException, InterruptedException {
		if (!isExpecting()) {
			throw new NoSuchElementException(
					"Not expecting a result.  Call expect() before take().");
		}
		Object value;
		synchronized (lock) {
			value = results.take();
			// Decrement the counter only when the result is collected.
			decrease();
		}
		return value;
	}
}
