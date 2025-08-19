class Result{
	public static void main(String[]args){
		float harry=50.00f;
		float ron=60.00f;
		float ginny=70.00f;
		float victor=80.00f;
		float snape=90.00f;
		float khan=50.00f;
		float dom=60.55f;
		float anos=70.55f;
		
		float [] percentage={harry,ron,ginny,victor,snape,khan,dom,anos};
		
		for(int number=0;number<percentage.length;number++){
			float print=percentage[number];
			System.out.println(print);
		}
		
	}
}