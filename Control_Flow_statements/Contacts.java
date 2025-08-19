class Contacts{
public static void main(String[]args){
long john=1020304050L;
long khan=5040302010L;
long don=5040203010L;
long dom=1020403050L;
long ron=2030405010L;
long snape=9080705010L;
long sirius=6070405010L;
long neptun=1060807010L;

long [] contactNumbers={john,khan,don,dom,ron,snape,sirius,neptun};

for(int number=0;number<contactNumbers.length;number++){
	long print=contactNumbers[number];
	System.out.println(print);
}
}
}