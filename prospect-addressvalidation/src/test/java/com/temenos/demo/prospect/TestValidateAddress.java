package com.temenos.demo.prospect;

import static org.junit.Assert.*;

import org.junit.Test;

import com.temenos.demo.prospect.ValidateAddress;

public class TestValidateAddress {

	@Test
	public void testValid() {
		ValidateAddress va = new ValidateAddress();
		String result = va.validate("vejnavn=F�gangen,husnr=1,etage=1,d�r=13,postnr=4180");
		System.out.println("length="+result.length());
		assertTrue(result.contains("\"status\": 1"));
	}

	@Test
	public void testInvalid() {
		ValidateAddress va = new ValidateAddress();
		String result = va.validate("vejnavn=F�gangen,husnr=1,etage=99,d�r=13,postnr=4180");
		assertFalse(result.contains("\"status\": 1"));
	}

}
