//=======================================================================
// FILE ScheduleComplexClient.java
// CREATION DATE: Jan 26, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.facade;


/**
 * This class represent the client that uses the facade as a simple
 * way to start and stop the remote system
 * @author Hernán Tenjo
 * @version 1.0
*/
public class ScheduleSimpleClient {
	private ScheduleServerFacade facade;
	
	/**
	 * Default constructor
	 * @param facade The facade instance
	 */
	public ScheduleSimpleClient(ScheduleServerFacade facade) {
		this.facade = facade;
	}
	
	/**
	 * Process required by the client to init the system provider
	 */
	public void startSystem(){
		facade.startSystem();
		System.out.println("Simple Client --> Remote system started");
	}
	
	/**
	 * Process required by the client to stop the stop provider
	 */
	public void stopSystem(){
		facade.stopSystem();
		System.out.println("Simple Client --> Remote system stoped");
	}
}

