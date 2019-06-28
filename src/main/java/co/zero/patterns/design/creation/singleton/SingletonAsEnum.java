//=======================================================================
// FILE SingletonAsEnum.java
// CREATION DATE: Feb 4, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.patterns.design.creation.singleton;

/**
 * This class create a Singleton using a enum to avoid all the intricade
 * details of the commom implementation.
 * @Pros:
 * 	- Easy implementation that hide complex details of traditional approach
 * @Cons:
 * 	- Phylosofical reason: This is not the initial purpose of the enums	
 * @author Hernán Tenjo
 * @version 1.0
*/
public enum SingletonAsEnum implements SingletonOperations{
	SINGLETON;

	private int  value;

	public void increaseValue() {
		value ++;
	}

	public int getValue() {
		return value;
	}

}

