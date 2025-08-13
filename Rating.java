class Rating{
public static void main(String[]args){
	double samsung=9.1;
	double iPhone=9.9;
	double nokia=9.7;
	double vivo=9.6;
	double oppo=9.5;
	double iqoo=9.9;
	double mi=9.7;
	double asus=9.6;
	
	double [] phoneRating={samsung,iPhone,nokia,vivo,oppo,iqoo,mi,asus};
	
	for(int number=0;number<phoneRating.length;number++){
		double print=phoneRating[number];
		System.out.println(print);
	}
}
}