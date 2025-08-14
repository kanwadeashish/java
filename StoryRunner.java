class StoryRunner{
	
	public static void main(String[]args){
		
		int storiesCategories=755; 
		int num=Story.storieaNumber(storiesCategories);
		System.out.println(num);
		
		String storyNickName="Tensura";
		String name=Story.storyName(storyNickName);
		System.out.println(name);
		
		long storyCopiesRemaining=15675L;
		long number=Story.storyCopiesSold(storyCopiesRemaining);
		System.out.println(number);
		
		float storyBooksProfit=3.0F;
		float profit=Story.storyBooksSales(storyBooksProfit);
		System.out.println(profit);
		
		double averageYearlysales=5.9;
		double increase=Story.averageDailySales(averageYearlysales);
		System.out.println(increase);
		
		boolean isStoryPopular=true;
		boolean information=Story.isStoryGood(isStoryPopular);
		System.out.println(information);
		
		char gradeOfStory='A';
		char rating=Story.storyGrade(gradeOfStory);
		System.out.println(rating);
		
	}
	
}