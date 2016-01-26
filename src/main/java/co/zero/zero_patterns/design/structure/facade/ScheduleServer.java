//=======================================================================
// FILE ScheduleServer.java
// CREATION DATE: Jan 26, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.structure.facade;

/**
 * This class represent a Server interface that provide lot of services
 * to handle the system
 * @author Hernán Tenjo
 * @version 1.0
*/
public class ScheduleServer {
	//Stuff methods
	
	public void startBooting(){
		System.out.println("::: Some booting tasks");
	}
	
	public void readSystemConfigFiles(){
		System.out.println("::: Some SystemConfigFiles tasks");
	}
	
	public void initVirtualMachine(){
		System.out.println("::: Some initVirtualMachine tasks");
	}
	
	public void initializeContext(){
		System.out.println("::: Some initializeContext tasks");
	}
	
	public void initializeListeners(){
		System.out.println("::: Some initializeListeners tasks");
	}
	
	public void initQueues(){
		System.out.println("::: Some initQueues tasks");
	}
	
	public void createSystemObjects(){
		System.out.println("::: Some createSystemObjects tasks");
	}
	
	public void stopServices(){
		System.out.println("::: Some stopServices tasks");
	}
	
	public void stopVirtualMachine(){
		System.out.println("::: Some stopVirtualMachine tasks");
	}
	
	public void stopSystems(){
		System.out.println("::: Some stopSystems tasks");
	}
	
	public void shutdown(){
		System.out.println("::: Some shutdown tasks");
	}
}

