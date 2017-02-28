package com.ailk.eaap.o2p.agent.endpoint;

import bsh.EvalError;
import bsh.Interpreter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by david on 14-8-31.
 */
public class BeanShellTest {

    public static void main(String []argv) {
        ExecutorService exec = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(550);
        long begin = System.currentTimeMillis();
        for(int i=0; i<550; i++) {
            final int[] finalI = {i};
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        Interpreter interpreter = new Interpreter();
                        semaphore.acquire();
                        long begin = System.currentTimeMillis();
                        String script = "System.out.println(Runtime.getRuntime().freeMemory()/1024/1024+\"MB\");";
                        interpreter.eval("import java.util.Date; " +
                                script + "for(int i=0; i<1; i++) { } new Date(); new String();");
//                        System.out.println(finalI[0] + " : " + (System.currentTimeMillis() - begin));
//                        System.out.println( interpreter.get("bar") );
//                        interpreter.source("somefile.bsh");
                        finalI[0]++;
//                        System.out.println(finalI[0] + " : " + Runtime.getRuntime().freeMemory()/1024/1024+"MB");
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (EvalError evalError) {
                        evalError.printStackTrace();
                    }
                }
            };
            exec.execute(runnable);
        }
        try {
            exec.awaitTermination(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        exec.shutdown();
        System.out.println(System.currentTimeMillis() - begin);
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024+"MB");
    }
}
