//program to demonstrate package and access modifiers
package com.tnsif.dayfour;

public class Base 
{
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	
	void methodDefault()
	{
		System.out.println("Default Access Modifier");
		System.out.println("Default Variable: "+varDefault);
		
	}
	
	

}
