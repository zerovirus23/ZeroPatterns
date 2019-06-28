//=======================================================================
// FILE TestPattern.java
// CREATION DATE: Jan 26, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.structure.facade;


/**
 * This class expose how to use the pattern in a concrete example
 * @author Hernán Tenjo
 * @version 1.0
*/
public class TestPattern {
	public static void main(String[] args) {
		ScheduleServer server = new ScheduleServer();
		ScheduleServerFacade serviceFacade = new ScheduleServerFacade();
		ScheduleComplexClient complexClient = new ScheduleComplexClient(server);
		ScheduleSimpleClient simpleClient = new ScheduleSimpleClient(serviceFacade);
		//Complex client knows low level operations of the server and the order 
		//to be executed
		complexClient.startSystem();
		complexClient.stopSystem();
		//Simple client only know the high level operation it needs, it doesn't know
		//how the procedure is done
		simpleClient.startSystem();
		simpleClient.stopSystem();
	}
}

