//=======================================================================
// FILE SingletonLazyMultithread.java
// CREATION DATE: Feb 4, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.creation.singleton;


/**
 * This class create a Singleton in a lazy way (when it's needed) that it's 
 * save to use in a multi threaded environment.
 * @Pros:
 *  - Create the instance in a lazy way (when it's needed)
 *  - In a multi threaded env, this approach assure that only one instance it's created
 * @Cons:
 *  - You can have a performance issue related with Synchronization
 *  - An other instance of the class could be created cloning the object
 *  - A new instance can be created loading the class with a different ClassLoader 	
 * @author Hernán Tenjo
 * @version 1.0
*/
public class SingletonLazyMultithreadFull implements SingletonOperations{
	//Property that hold the unique instance of the class
	private static SingletonLazyMultithreadFull singleton = null;
	
	/**
	 * Let's private the constructor to avoid a client can build new 
	 * instances of the class with the new operator
	 */
	private SingletonLazyMultithreadFull() {
	}
	
	/**
	 * Give a unique point of access to the instance in a thread safe way
	 * with full synchronization
	 * @return The instance that was already created
	 */
	public static synchronized SingletonLazyMultithreadFull getInstance(){
		if(singleton == null){
			singleton = new SingletonLazyMultithreadFull();
		}
		
		return singleton;
	}
}

