class FestivalRunner{
	
	public static void main(String[]args){
		
		int year=2001;
		int festivalDate=Festival.date(year);
		System.out.println(festivalDate);
		
		String month="October";
		String name=Festival.festivalName(month);
		System.out.println(name);
		
		long investement=201456L;
		long number=Festival.numberOfPeople(investement);
		System.out.println(number);
		
		float discount=9.5F;
		float percentage=Festival.ticketDiscount(discount);
		System.out.println(percentage);
		
		double foodDiscount=8.5;
		double totalDiscount=Festival.preBookingDiscount(foodDiscount);
		System.out.println(totalDiscount);
		
		boolean isHoliday=true;
		boolean isExciting=Festival.isExciting(isHoliday);
		System.out.println(isExciting);
		
		char foodRating='A';
		char rating=Festival.ratingForVenue(foodRating);
		System.out.println(rating);
		
	}
	
}