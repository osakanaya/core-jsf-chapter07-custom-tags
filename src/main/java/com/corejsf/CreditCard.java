package com.corejsf;

import java.io.Serializable;

public class CreditCard implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String number;
	
	public CreditCard(String number) {
		this.number = number;
	}
	
	public String toString() {
		return number;
	}

}
