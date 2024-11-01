package com.PojoRunner;

import com.PojoClass.PojoClass;



public class PojoRunner {

	public static void main(String[] args) {
		PojoClass p=new PojoClass();
		System.out.println(p.get());
		System.out.println(p.set("wert"));
		System.out.println(p.get());
	}
}
