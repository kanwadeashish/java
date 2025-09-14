class Paper{

	public int [] numbers={1,2,3,4,5,6,7,8,9};
	
	public void displayNumbers(){
		
		for(int num = 0; num<numbers.length ;num++){
			
			int display = numbers[num];
			
			if(display % 2 ==0){
				System.out.println("The number is even ="+display);
			}else{
				System.out.println("The number is odd ="+display);
			}
			
		}
		
	}

}