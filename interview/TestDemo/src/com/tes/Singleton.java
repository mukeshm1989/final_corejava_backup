package com.tes;
public class Singleton {

	
	private static Singleton singleton;
	private Singleton() {
	}
	
	public static Singleton getSingleton(Singleton singleton ) {
		
		synchronized (singleton) {
			if(singleton== null) {
				singleton = new Singleton();
			}
			
		}
		return singleton;
		
		
	}
	
	
	
}
