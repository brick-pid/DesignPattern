package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ticket studentTicket = new Ticket(22, new StudentDiscount());
        System.out.println(studentTicket.getPrice());

        Ticket VIPTicket = new Ticket(22, new VIPDiscount());
        System.out.println(VIPTicket.getPrice());
    }
}
