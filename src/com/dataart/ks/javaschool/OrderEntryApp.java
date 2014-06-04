package com.dataart.ks.javaschool;

public class OrderEntryApp {
	public static void main(String[] args) {
		System.out.println("Order Entry Application");

		Customer i = new Individual("KS-DA-USER-1", "1234234321234");
        i.setName("John");
        i.setAddress("New york");
        i.setPhone("555-555-555");
		System.out.println("Customer: " + i);

        Company c = new Company("KS-DA-USER-1");
        c.setName("John");
        c.setAddress("New york");
        c.setPhone("555-555-555");
        c.setContactName("Laura");
        c.setDiscount(12);
        System.out.println("Customer: " + c);
	}
}
//TODO create company and individual customer, display them in console.