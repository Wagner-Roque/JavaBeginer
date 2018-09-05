package com.bsbr.altec.wtr.seriazable;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String name;
	Dog(int w, String n) {
		weight = w; // inherited
		name = n; // not inherited

	}
	
}
