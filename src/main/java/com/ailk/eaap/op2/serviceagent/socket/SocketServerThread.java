package com.ailk.eaap.op2.serviceagent.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
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
public class SocketServerThread extends Thread {
	

	private static Log log = LogFactory.getLog(SocketServerThread.class);
	private Socket clientSocket = null;
    private IDIHService dihService;
    private PrintWriter pw = null;
    private BufferedReader bir = null;

	public Socket getClientSocket() {
		return clientSocket;
	}
	public void setClientSocket(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	public IDIHService getDihService() {
		return dihService;
	}
	public void setDihService(IDIHService dihService) {
		this.dihService = dihService;
	}
	public PrintWriter getPw() {
		return pw;
	}
	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}
	public BufferedReader getBir() {
		return bir;
	}
	public void setBir(BufferedReader bir) {
		this.bir = bir;
	}
    
    public SocketServerThread() {
        super("SocketServerThread");
    }
      
	public SocketServerThread(Socket clientSocket) {
	    super("SocketServerThread");
	    this.clientSocket = clientSocket;
	}
	
	public SocketServerThread(Socket clientSocket,IDIHService dihService) {
	    super("SocketServerThread");
	    this.clientSocket = clientSocket;
	    this.dihService = dihService;
	}
	
	@Override
	public void run() {

		try {
			pw = new PrintWriter(clientSocket.getOutputStream());
	        bir = new BufferedReader(new InputStreamReader(clientSocket
	             .getInputStream()));
	        
	          
	        InetAddress ia = clientSocket.getInetAddress();
	        
	        
	        MessageBO messageBo = new MessageBO();
	        messageBo.setInType(InType.SOCKET);
	        //modify by security check,  调用getHostAddress()而返回的信息不值得信任。攻击者能够欺骗 DNS
//	        messageBo.setIp(ia.getHostAddress());
	        String response = dihService.exchange(messageBo);
	        
	        sendResponse(pw, response);

	    } catch (IOException e) {
	    	log.error(e.getStackTrace());
	    } finally {
	    	try {
	    		this.pw.close();
	    		this.bir.close();
	    		this.clientSocket.close();
	    	} catch (Exception e) {
	    		log.error(e.getStackTrace());
	    	}
	    }
	}

	/**
	 * @param pw
	 * @param response
	 */
	public void sendResponse(PrintWriter pw, String response) {
		// TODO Auto-generated method stub
        pw.println(response);
        pw.flush();
	}

}
