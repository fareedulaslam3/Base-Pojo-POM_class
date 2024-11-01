package com.BaseRunner;

import java.io.IOException;

import com.BaseClass.BaseClass;

public class BaseRunner extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		 browserlaunch();
		 urllaunch("https://www.instagram.com/");
		 takesc("insta3.png");
		 close();
	}
	
}