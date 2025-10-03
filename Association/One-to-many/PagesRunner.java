class PagesRunner{
	
	public static void main(String[]args){
		
		NoteBook book = new NoteBook(350,777,"Tensura");
		
		Diary diary = new Diary(400,999,"Monarch");
		
		Pages pages = new Pages(5,book,diary);
		pages.displayDetails();
		
	}
	
}