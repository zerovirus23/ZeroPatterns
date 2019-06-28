//=======================================================================
// FILE SingletonEager.java
// CREATION DATE: Feb 4, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.creation.singleton;


/**
 * This class create a Singleton that initialize eager an unique intance 
 * of the class.
 * @Pros:
 * 	- Easy of implement
 * @Cons:
 * 	- If the Singleton is never used, you have an Object wasting your memory
 *  - This approach could not work in a multithreading environment
 *  - An other instance of the class could be created cloning the object
 *  - A new instance can be created loading the class with a different ClassLoader 	
 * @author Hernán Tenjo
 * @version 1.0
*/
public class SingletonEager implements SingletonOperations{
	//Property that hold the unique instance of the class
	private static final SingletonEager singleton = new SingletonEager();
	
	/**
	 * Let's private the constructor to avoid a client can build new 
	 * instances of the class with the new operator
	 */
	private SingletonEager() {
	}
	
	/**
	 * Give a unique point of access to the instance
	 * @return The instance tha was already created
	 */
	public static SingletonEager getInstance(){
		return singleton;
	}
}

