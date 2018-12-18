package com.exam;

public class TicketRunner {
	/*  Result:
	 *  Taipei    Keelung  37   2  74
	 *  TaiChung  Taipei   285  1  285
	 * 
	 */
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println("Result :");
		//origin, destination, price, quantity
		Ticket ticket = new Ticket("Taipei", "Keelung", "37", "2");
		order.add(ticket);
		ticket = new Ticket("TaiChung", "Taipei", "285", "1");
		order.add(ticket);
		order.print();
		String n1 = "Hello world";
		//           01234567890
		for (int i = 10; i >=0 ; i--) {
			System.out.print(n1.charAt(i));
			}
		System.out.println("");
		
		
		String n2 = new String("Jack Tom Eric");
		String n3 ="Tom";
		int index = n2.indexOf(n3);
		System.out.println(index);
		System.out.print(n2.substring(0,index) + "boss" +
				n2.substring( index+n3.length() ));
		}
		}


