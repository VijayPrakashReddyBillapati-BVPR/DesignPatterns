package com.designpatterns.practice.singletone;

import java.io.Serializable;

public class SingleTone implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingleTone instance = null;

	private SingleTone() {
	}

	public static SingleTone getInstance() {
		if (instance == null) {
			synchronized (SingleTone.class) {
				if (instance == null) {
					instance = new SingleTone();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve()
	{
		return instance;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
//		return super.clone();
		
	}
}
