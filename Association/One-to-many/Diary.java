class Diary{
	
	public int diaryPrice;
	public int numberOfPages;
	public String diaryName;
	public Pages pages;
	
	public Diary(int diaryPrice,int numberOfPages,String diaryName,Pages pages){
		
		this.diaryPrice=diaryPrice;
		this.numberOfPages=numberOfPages;
		this.diaryName=diaryName;
		this.pages=pages;
		
	}
	public void displayDiaryDetails(){
		
		System.out.println("The price of a single page is = "+pages.pricePerPage);
		System.out.println("The price of the diary is = "+diaryPrice);
		System.out.println("The number of pages in diary is = "+numberOfPages);
		System.out.println("The name of the diary is = "+diaryName);
		
		
	}
	
	
}