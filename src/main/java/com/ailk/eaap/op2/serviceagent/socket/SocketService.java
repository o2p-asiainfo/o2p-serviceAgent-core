package com.ailk.eaap.op2.serviceagent.socket;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ailk.eaap.op2.serviceagent.deal.service.IDIHService;

/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Apr 2, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class SocketService implements ISocketService{
	

	private static Log log = LogFactory.getLog(SocketService.class);
	private ServerSocket serverSocket = null;
    private ExecutorService executorService;
    private IDIHService dihService;
    private int port = 10000;
    private int threadnum=10;
    public static void main(String[] args) {
    	new SocketService().startServer();
    }
     
    public void startServer() {
    	executorService=Executors.newFixedThreadPool(threadnum);
    	try {
    		
    		serverSocket = new ServerSocket(this.port);
         
    		while (true) {
    			
    			executorService.execute(new SocketServerThread(serverSocket.accept()));

    		}
    		
    	} catch (IOException e) {
    		log.error(e.getStackTrace());
    	} 
    	try {
    		if (serverSocket != null) {
    			
    			serverSocket.close();
    		}
    			
    	} catch (IOException e) {
    		log.error(e.getStackTrace());
    	}
     
    }

	


	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void stopServer() {

		try {
			serverSocket.close();
		} catch (IOException e) {
			log.error(e.getStackTrace());
		}
	}

	public ExecutorService getExecutorService() {
		return executorService;
	}

	public void setExecutorService(ExecutorService executorService) {
		this.executorService = executorService;
	}

	public int getThreadnum() {
		return threadnum;
	}

	public void setThreadnum(int threadnum) {
		this.threadnum = threadnum;
	}

	public IDIHService getDihService() {
		return dihService;
	}

	public void setDihService(IDIHService dihService) {
		this.dihService = dihService;
	}

}
