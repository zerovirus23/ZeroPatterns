//=======================================================================
// FILE ScheduleServerFacade.java
// CREATION DATE: Jan 26, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.facade;


/**
 * Class description
 * @author Hernán Tenjo
 * @version 
*/
public class ScheduleServerFacade {
	private final ScheduleServer server = new ScheduleServer();
	
	public void startSystem(){
		server.createSystemObjects();
		server.readSystemConfigFiles();
		server.initVirtualMachine();
		server.initializeContext();
		server.initializeListeners();
		server.initQueues();
		server.createSystemObjects();
		System.out.println("Facade --> Remote system started");
	}
	
	public void stopSystem(){
		server.stopServices();
		server.stopVirtualMachine();
		server.stopSystems();
		server.shutdown();
		System.out.println("Facade --> Remote system stoped");
	}
}

