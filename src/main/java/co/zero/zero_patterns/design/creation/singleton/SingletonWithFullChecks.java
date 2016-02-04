//=======================================================================
// FILE SingletonWithFullChecks.java
// CREATION DATE: Feb 4, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.creation.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * This class create a Singleton that initialize eager an unique intance of the class
 * and take care of other ways to create a different instance.
 * This implementation assume that no multithread issues happen to be easier of implement, 
 * if you need to take care of this {@link SingletonLazyMultithreadPartial} shows 
 * how to deal with that.  
 * @Pros:
 * 	- Guaranties that no order instance will be created
 * @Cons:
 * 	- If the Singleton is never used, you have an Object wasting your memory
 *  - Complex to implement for most of cases 	
 * @author Hernán Tenjo
 * @version 1.0
*/
public class SingletonWithFullChecks implements Serializable, SingletonOperations{
	//Default id for serializable purposes
	private static final long serialVersionUID = 1L;
	//Property that hold the unique instance of the class
	private static final SingletonWithFullChecks singleton = new SingletonWithFullChecks();
	
	/**
	 * Let's private the constructor to avoid a client can build new 
	 * instances of the class with the new operator, but additionally check
	 * if the instance already exist and avoid create a new instance using reflection
	 */
	private SingletonWithFullChecks() {
		if(singleton != null){
			throw new IllegalStateException("Already created.");
		}
	}
	
	/**
	 * Give a unique point of access to the instance
	 * @return The instance tha was already created
	 */
	public static SingletonWithFullChecks getInstance(){
		return singleton;
	}
	
	/**
	 * This method assign an alternative object (the singleton) to be deserialized
	 * @return The singleton already created
	 * @throws ObjectStreamException
	 */
	public Object readResolve() throws ObjectStreamException{
		return singleton;
	}

	/**
	 * This method use an alternative object to write in the stream 
	 * @return The singleton already created
	 * @throws ObjectStreamException
	 */
	public Object writeReplace() throws ObjectStreamException{
		return singleton;
	}
	
	/**
	 * This avoid clone operation in the object to create a new instance 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton, cannot be clonned");
	}
	
	/**
	 * Right now I'm now sure if this really works... but I think it doesn't. 
	 * So for now, I preffer to comment this methods until be sure it works.
	 * @param classname
	 * @return
	 * @throws ClassNotFoundException
	 */
	/*
	private static Class<?> getClass(String classname) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		
		if(classLoader == null){
			classLoader = SingletonWithFullChecks.class.getClassLoader();
		}

		return (classLoader.loadClass(classname));
	}*/
}