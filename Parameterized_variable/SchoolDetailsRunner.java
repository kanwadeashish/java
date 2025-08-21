class SchoolDetailsRunner{
	
	public static void main(String[]args){
		
		String[] name={"Harry","Ron","Ginny","snape"};
		String[] printName=SchoolDetails.name(name);
		for(int number=0;number<printName.length;number++){
			System.out.println("Name ="+printName[number]);
		}
		int[] rollNumber={1,2,3,4};
		int[] rollNumberPrint=SchoolDetails.rollNumber(rollNumber);
		for(int number=0;number<rollNumberPrint.length;number++){
			System.out.println("Roll Numbers ="+rollNumberPrint[number]);
		}
		long[] phoneNumber={1020L,2030L,3040L,4050L};
		long[] phoneNumberPrint=SchoolDetails.phoneNumber(phoneNumber);
		for(int number=0;number<phoneNumberPrint.length;number++){
			System.out.println("Phone Numbers ="+phoneNumberPrint[number]);
		}
		float[] percentage={50.50f,60.60f,70.70f,80.80f};
		float[] percentagePrint=SchoolDetails.percentage(percentage);
		for(int number=0;number<percentagePrint.length;number++){
			System.out.println("Percentage ="+percentagePrint[number]);
		}
		double[] absentyPercentage={2.2,3.3,4.4,5.5};
		double[] absentyPercentagePrint=SchoolDetails.absentyPercentage(absentyPercentage);
		for(int number=0;number<absentyPercentagePrint.length;number++){
			System.out.println("Absenty percentage ="+absentyPercentagePrint[number]);
		}
		boolean[] isPassed={true,true,true,true};
		boolean[] isPassedPrint=SchoolDetails.isPassed(isPassed);
		for(int number=0;number<isPassedPrint.length;number++){
			System.out.println("Student is passed ="+isPassedPrint[number]);
		}
		char[] resultGrade={'d','c','b','a'};
		char[] resultGradePrint=SchoolDetails.resultGrade(resultGrade);
		for(int number=0;number<resultGradePrint.length;number++){
			System.out.println("Results Grade ="+resultGradePrint[number]);
		}
		
	}
	
}