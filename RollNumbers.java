class RollNumbers{
public static void main(String[]args){
	byte harry=01;
	byte ron=02;
	byte ginny=03;
	byte victor=04;
	byte snape=05;
	byte khan=06;
	byte dom=07;
	byte anos=00; 
	
	byte [] rollNumbers={harry,ron,ginny,victor,snape,khan,dom,anos};
	
	for(int number=0;number<rollNumbers.length;number++){
		byte print=rollNumbers[number];
		System.out.println(print);
	}
}
}