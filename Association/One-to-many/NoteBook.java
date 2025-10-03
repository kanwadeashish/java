class NoteBook{
	
	public int noteBookPrice;
	public int numberOfPages;
	public String noteBookName;
	public Pages pages;
	
	public NoteBook(int noteBookPrice,int numberOfPages,String noteBookName,Pages pages){
		
		this.noteBookPrice=noteBookPrice;
		this.numberOfPages=numberOfPages;
		this.noteBookName=noteBookName;
		this.pages=pages;
		
	}
	public void displayNoteBookDetails(){
		
		System.out.println("The price of a single page is = "+pages.pricePerPage);
		System.out.println("The price of the notebook is = "+noteBookPrice);
		System.out.println("The number of pages in notebook is = "+numberOfPages);
		System.out.println("The name of the notebook is = "+noteBookName);
		
		
	}
	
}