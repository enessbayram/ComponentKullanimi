package com.jforce.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hesapMakinesiBean")
public class HesapMakinesi {

	@Autowired
	private Islem islem;
	
	public void sonuclariYazdir(int sayi1, int sayi2)
	{
		islem.topla(sayi1, sayi2);
		islem.cikar(sayi1, sayi2);
		islem.carp(sayi1, sayi2);
		islem.bol(sayi1, sayi2);
	}
	
	public Islem getIslem() {
		return islem;
	}

	public void setIslem(Islem islem) {
		this.islem = islem;
	}
}
