//=======================================================================
// FILE ScheduleComplexClient.java
// CREATION DATE: Jan 26, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.facade;


/**
 * This class represent the client that uses the low level server services to 
 * start and stop the remote system
 * @author Hernán Tenjo
 * @version 1.0
*/
public class ScheduleComplexClient {
	private ScheduleServer server;
	
	public ScheduleComplexClient(ScheduleServer server) {
		this.server = server;
	}
	
	/**
	 * Process required by the client to init the system provider
	 */
	public void startSystem(){
		server.createSystemObjects();
		server.readSystemConfigFiles();
		server.initVirtualMachine();
		server.initializeContext();
		server.initializeListeners();
		server.initQueues();
		server.createSystemObjects();
		System.out.println("Complex Client --> Remote system started");
	}
	
	/**
	 * Process required by the client to stop the stop provider
	 */
	public void stopSystem(){
		server.stopServices();
		server.stopVirtualMachine();
		server.stopSystems();
		server.shutdown();
		System.out.println("Complex Client --> Remote system stoped");
	}
}

