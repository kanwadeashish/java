class Students{
	
	public String [] names = {"Ajay","Abhay","Ajit","Ajinkya"};
	public int [] id = {1,2,3,4};
	public long [] phoneNumber={123456L,124536L,143625L,162435L};
	public double [] percentage = {91.1,92.2,93.3,94.4};
	public float [] results = {98.98f,97.97f,96.96f,95.95f};
	public char [] rating = {'a','a','a','a'};
	public boolean [] isPassed = {true,true,true,true};
	
	public void displayName(){
		
		for(int num = 0;num<names.length;num++){
			System.out.println(names[num]);	
		}
		
	}
	public void displayId(){
		
		for(int num = 0;num<id.length;num++){
			System.out.println(id[num]);	
		}
		
	}
	public void displayPhoneNumber(){
		
		for(int num = 0;num<phoneNumber.length;num++){
			System.out.println(phoneNumber[num]);
		}
		
	}
	public void displayPercentage(){
		
		for(int num = 0;num<percentage.length;num++){
			System.out.println(percentage[num]);
		}
		
	}
	public void displayResults(){
		
		for(int num = 0;num<results.length;num++){
			System.out.println(results[num]);
		}
		
	}
	public void displayRating(){
		
		for(int num = 0;num<rating.length;num++){
				System.out.println(rating[num]);	
		}
		
	}
	public void displayIsPassed(){
		
		for(int num = 0;num<isPassed.length;num++){
			System.out.println(isPassed[num]);
		}
		
	}
	
}