//=======================================================================
// FILE SingletonLazy.java
// CREATION DATE: Feb 4, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.creation.singleton;


/**
 * This class create a Singleton in a lazy way (when it's needed).
 * @Pros:
 * 	- Easy of implement
 *  - Create the instance in a lazy way (when it's needed)
 * @Cons:
 *  - This approach could not work in a multithreading environment
 *  - An other instance of the class could be created cloning the object
 *  - A new instance can be created loading the class with a different ClassLoader 	
 * @author Hernán Tenjo
 * @version 1.0
*/
public class SingletonLazy implements SingletonOperations{
	//Property that hold the unique instance of the class
	private static SingletonLazy singleton = null;
	
	/**
	 * Let's private the constructor to avoid a client can build new 
	 * instances of the class with the new operator
	 */
	private SingletonLazy() {
	}
	
	/**
	 * Give a unique point of access to the instance
	 * @return The instance tha was created
	 */
	public static SingletonLazy getInstance(){
		if(singleton == null){
			singleton = new SingletonLazy();
		}
		
		return singleton;
	}
}

