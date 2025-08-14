class HolidaysRunner{
	
	public static void main(String[]args){
		
		int remainingHolidays=18; 
		int holidays=Holidays.totalHolidays(remainingHolidays);
		System.out.println(holidays);
		
		String day="Sundays";
		String nameOfDay=Holidays.mostHolidaysMonth(day);
		System.out.println(nameOfDay);
		
		long total=15675L;
		long number=Holidays.number(total);
		System.out.println(number);
		
		float festivalHolidays=5.0F;
		float percentage=Holidays.sundays(festivalHolidays);
		System.out.println(percentage);
		
		double governmentHolidays=8.5;
		double totalPercentage=Holidays.saturdays(governmentHolidays);
		System.out.println(totalPercentage);
		
		boolean isHolidayCompleted=true;
		boolean information=Holidays.isHolidayRemaining(isHolidayCompleted);
		System.out.println(information);
		
		char nonHolidayGrade='A';
		char rating=Holidays.holidayGrade(nonHolidayGrade);
		System.out.println(rating);
		
	}
	
}