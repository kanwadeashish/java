class InfoProvider{
	
	public void takingInputArray(StudentInfo[] info){
		
		for(int num=0;num<info.length;num++){
			
			StudentInfo print=info[num];
			print.displayStudentInfo();
			
		}
		
	}
	
}