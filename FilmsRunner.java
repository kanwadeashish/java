class FilmsRunner{
	
	public static void main(String[]args){
		
		int profit=Films.profit();
		System.out.println("profit="+profit);
		
		int ticketsSold=Films.ticketsSold();
		System.out.println("ticketsSold="+ticketsSold);
		
		int actorSalary=Films.actorSalary();
		System.out.println("actorSalary="+actorSalary);
		
		int actressSalary=Films.actressSalary();
		System.out.println("actressSalary="+actressSalary);
		
		int yearOfRelease=Films.yearOfRelease();
		System.out.println("yearOfRelease="+yearOfRelease);
		
	}
	
}