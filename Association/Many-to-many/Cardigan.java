class Cardigan{
	
	public String productName;
	public int productPrice;
	public Chiffon chiffon;
	public Crepe crepe;
	public Damask damask;
	
	public Cardigan(String productName,int productPrice,Chiffon chiffon,Crepe crepe,Damask damask){
		
		this.productName=productName;
		this.productPrice=productPrice;
		this.chiffon=chiffon;
		this.crepe=crepe;
		this.damask=damask;
		
	}
	public void cardiganDetails(){
		
		System.out.println("The name of the product is = "+productName);
		System.out.println("The price of the product is = "+productPrice);
		System.out.println("The price of the fabric used in the product is = "+chiffon.fabricPrice);
		System.out.println("The name of the fabric used in the product is = "+chiffon.fabricName);
		System.out.println("The price of the fabric used in the product is = "+crepe.fabricPrice);
		System.out.println("The name of the fabric used in the product is = "+crepe.fabricName);
		System.out.println("The price of the fabric used in the product is = "+damask.fabricPrice);
		System.out.println("The name of the fabric used in the product is = "+damask.fabricName);
		
	}
	
}