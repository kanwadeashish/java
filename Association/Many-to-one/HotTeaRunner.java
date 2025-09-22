class HotTeaRunner{
	
	public static void main(String[]args){
		
		TeaPowder powder = new TeaPowder("Heaven");
		HotMilk milk = new HotMilk("Boiling");
		NormalSugar sugar = new NormalSugar(2);
		
		HotTea tea = new HotTea(20,powder,milk,sugar);
		tea.hotTeaDetails();
		
	}
	
}