class FootBallTickets{
public static void main(String[]args){
int vip=5000;
int firstClass=1000;
int secondClass=2000;
int thirdClass=3000;
int fourthClass=4000;
int standing=500;
int superVIP=10000;
int ordinary=800;

int [] ticketPrices={vip,firstClass,secondClass,thirdClass,fourthClass,standing,superVIP,ordinary};

for(int num=0;num<ticketPrices.length;num++){
	int print=ticketPrices[num];
	System.out.println(print);
}
}
}