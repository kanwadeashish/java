class BookRunner{
	
	public static void main(String[]args){
		
		Book book = new Book(200,300);
		Page page = new Page(book);
		
		page.displayDetails();
		
	}
	
}