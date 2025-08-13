class BusTickets{
public static void main(String[]args){

int [] ticketPrices={10,20,30,40,50};
String [] ticketTypes={"First class","Second Class","Sleeper"};
char [] ticketRating={'B','C','A'};
double [] ticketDiscount={5.5,6.5,7.5};
boolean [] isComfortable={true,false,true};

System.out.println("Ticket Prices="+ticketPrices.length);
System.out.println("Ticket Types="+ticketTypes.length);
System.out.println("Ticket Rating="+ticketRating.length);
System.out.println("Ticket Discount="+ticketDiscount.length);
System.out.println("Journey is Comfortable="+isComfortable.length);

}
}