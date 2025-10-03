class Pages{
	
	public int pricePerPage;
	public NoteBook book;
	public Diary diary;
	
	public Pages(int pricePerPage,NoteBook book,Diary diary){
		
		this.pricePerPage=pricePerPage;
		this.book=book;
		this.diary=diary;
		
	}
	public void displayDetails(){
		
		System.out.println("The price of a single page is = "+pricePerPage);
		System.out.println("The price of the notebook is = "+book.noteBookPrice);
		System.out.println("The number of pages in notebook is = "+book.numberOfPages);
		System.out.println("The name of the notebook is = "+book.noteBookName);
		System.out.println("The price of the diary is = "+diary.diaryPrice);
		System.out.println("The number of pages in diary is = "+diary.numberOfPages);
		System.out.println("The name of the diary is = "+diary.diaryName);
		
		
	}
	
}