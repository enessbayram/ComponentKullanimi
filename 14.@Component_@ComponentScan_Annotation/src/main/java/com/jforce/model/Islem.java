package com.jforce.model;

import org.springframework.stereotype.Component;

@Component("islemBean")
public class Islem {
	
	public void topla(int sayi1, int sayi2)
	{
		System.out.println("Toplam : " +  (sayi1+sayi2));
	}
	
	public void cikar(int sayi1 , int sayi2)
	{
		System.out.println("Çıkar : " + (sayi1-sayi2));
	}
	
	public void bol(int sayi1, int sayi2)
	{
		System.out.println("Böl : " + (sayi1/sayi2));
	}
	
	public void carp(int sayi1 , int sayi2)
	{
		System.out.println("Çarp : " + (sayi1*sayi2));
	}
	
}
