public class TicketDemo{
	public static void main(String[] args){
		TicketMachine ticket = new TicketMachine(3000);
		int price = ticket.getPrice();
		int balance = ticket.getBalance();
		int total = ticket.getTotal();

		System.out.println("Price is " + price);
		System.out.println("Balance is " + balance);
		System.out.println("Total is "+ total);

		ticket.printTicket();

		System.out.println("Balance is " + ticket.getBalance());
	}
}