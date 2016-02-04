//=======================================================================
// FILE TestPattern.java
// CREATION DATE: Feb 4, 2016
// AUTHOR: Hernán Tenjo
//=======================================================================
package co.zero.zero_patterns.design.creation.singleton;


/**
 * This class expose how to use the pattern in a concrete example
 * @author Hernán Tenjo
 * @version 1.0
*/
public class TestPattern {
	public static void main(String[] args) {
		SingletonEager instanceEager = SingletonEager.getInstance();
		SingletonLazy instanceLazy = SingletonLazy.getInstance();
		SingletonLazyMultithreadFull instanceMulti = SingletonLazyMultithreadFull.getInstance();
		SingletonLazyMultithreadPartial instancePartial = SingletonLazyMultithreadPartial.getInstance();
		SingletonWithFullChecks instanceFull = SingletonWithFullChecks.getInstance();
		SingletonAsEnum instance = SingletonAsEnum.SINGLETON;
		
		System.out.println(instanceEager.getConnection());
		System.out.println(instanceLazy.getConnection());
		System.out.println(instanceMulti.getConnection());
		System.out.println(instancePartial.getConnection());
		System.out.println(instanceFull.getConnection());
		System.out.println(instance.getConnection());
	}
}