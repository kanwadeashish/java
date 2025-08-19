class ArrayReturn{
	
	public static void intArrayReturn(int [] rollNumbers){
		for(int number=0;number<rollNumbers.length;number++){
			System.out.println("Roll Numbers ="+rollNumbers[number]);
		}
	}
	public static void longArrayReturn(long [] phoneNumbers){
		for(int number=0;number<phoneNumbers.length;number++){
			System.out.println("Phone Numbers ="+phoneNumbers[number]);
		}
	}
	public static void floatArrayReturn(float [] percentage){
		for(int number=0;number<percentage.length;number++){
			System.out.println("Percentage ="+percentage[number]);
		}
	}
	public static void doubleArrayReturn(double [] profitPercentage){
		for(int number=0;number<profitPercentage.length;number++){
			System.out.println("Profit Percentage ="+profitPercentage[number]);
		}
	}
	public static void booleanArrayReturn(boolean [] isPassed){
		for(int number=0;number<isPassed.length;number++){
			System.out.println("Passed the exam ="+isPassed[number]);
		}
	}
	public static void charArrayReturn(char [] grade){
		for(int number=0;number<grade.length;number++){
			System.out.println("Grade ="+grade[number]);
		}
	}
	
	public static void main(String [] args){
		int [] rollNumbers={1,2,3,4,5};
		intArrayReturn(rollNumbers);
		
		long [] phoneNumbers={12345L,23456L,34567L,45678L,56789L};
		longArrayReturn(phoneNumbers);
		
		float [] percentage={10.10f,20.20f,30.30f,40.40f,50.50f};
		floatArrayReturn(percentage);
		
		double [] profitPercentage={11.11,22.22,33.33,44.44,55.55};
		doubleArrayReturn(profitPercentage);
		
		boolean [] isPassed={true,false,true,false,true};
		booleanArrayReturn(isPassed);
		
		char [] grade={'a','b','c','d','e'};
		charArrayReturn(grade);
		
	}
	
}