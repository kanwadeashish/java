class PagesRunner{
	
	public static void main(String[]args){
			
		Pages pages = new Pages(5);
		
		NoteBook book = new NoteBook(350,777,"Tensura",pages);
		book.displayNoteBookDetails();
		
		Diary diary = new Diary(400,999,"Monarch",pages);
		diary.displayDiaryDetails();
		
	}
	
}