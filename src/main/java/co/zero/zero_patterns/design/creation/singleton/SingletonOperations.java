//=======================================================================
// FILE SingletonOperations.java
// CREATION DATE: Feb 4, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.creation.singleton;


/**
 * This interface define the behavior that the singleton must have
 * @author Hernán Tenjo
 * @version 1.0
*/
public interface SingletonOperations {
	default String getName(){
		return this.getClass().getSimpleName();
	}
	
	default String getConnection(){
		return getName() + " - Connection";
	}
}

