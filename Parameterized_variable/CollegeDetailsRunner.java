class CollegeDetailsRunner{
	
	public static void main(String[]args){
		
		String[] name={"Lilly","Jin","Victor","Sam"};
		String[] printName=SchoolDetails.name(name);
		for(int number=0;number<printName.length;number++){
			System.out.println("Name ="+printName[number]);
		}
		int[] rollNumber={1,2,3,4};
		int[] rollNumberPrint=SchoolDetails.rollNumber(rollNumber);
		for(int number=0;number<rollNumberPrint.length;number++){
			System.out.println("Roll Numbers ="+rollNumberPrint[number]);
		}
		long[] phoneNumber={102030L,203040L,304050L,405060L};
		long[] phoneNumberPrint=SchoolDetails.phoneNumber(phoneNumber);
		for(int number=0;number<phoneNumberPrint.length;number++){
			System.out.println("Phone Numbers ="+phoneNumberPrint[number]);
		}
		float[] percentage={55.55f,66.66f,77.77f,88.88f};
		float[] percentagePrint=SchoolDetails.percentage(percentage);
		for(int number=0;number<percentagePrint.length;number++){
			System.out.println("Percentage ="+percentagePrint[number]);
		}
		double[] absentyPercentage={1.2,2.3,3.4,4.5};
		double[] absentyPercentagePrint=SchoolDetails.absentyPercentage(absentyPercentage);
		for(int number=0;number<absentyPercentagePrint.length;number++){
			System.out.println("Absenty percentage ="+absentyPercentagePrint[number]);
		}
		boolean[] isPassed={true,true,true,true};
		boolean[] isPassedPrint=SchoolDetails.isPassed(isPassed);
		for(int number=0;number<isPassedPrint.length;number++){
			System.out.println("Student is passed ="+isPassedPrint[number]);
		}
		char[] resultGrade={'c','b','a','a'};
		char[] resultGradePrint=SchoolDetails.resultGrade(resultGrade);
		for(int number=0;number<resultGradePrint.length;number++){
			System.out.println("Results Grade ="+resultGradePrint[number]);
		}
		
	}
	
}