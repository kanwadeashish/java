class InfoProviderRunner{
	
	public static void main(String[]args){
		
		InfoProvider info = new InfoProvider();
		
		StudentInfo studentOne = new StudentInfo("Ajay",1,123456789L,99.99,'a');
		StudentInfo studentTwo = new StudentInfo("Vijay",2,567856789L,98.98,'a');
		StudentInfo studentThree = new StudentInfo("Sujay",3,678916789L,97.97,'a');
		StudentInfo studentFour = new StudentInfo("Ganu",4,456456789L,96.96,'a');
		
		StudentInfo[] studentInfo = {studentOne,studentTwo,studentThree,studentFour};
		
		info.takingInputArray(studentInfo);
		
	}
	
}