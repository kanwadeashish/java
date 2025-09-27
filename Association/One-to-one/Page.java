class Page{
	
	public Book book;
	
	public Page(Book book){
		
		this.book=book;
		
	}
	public void displayDetails(){
		
		System.out.println("The price of the book is = "+book.price);
		System.out.println("The number of pages in the book is = "+book.numberOfPages);
		
	}
	
}