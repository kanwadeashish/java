class Engineer{
	
	public String name;
	public static int salary;
	
	public void showName(){
		
		System.out.println("The name is = "+name);
		name="Shiva";
		System.out.println("The name after reassigning is = "+name);
		
	}
	public static void showSalary(){
		
		System.out.println("The salary is = "+salary);
		salary=1000000;
		System.out.println("The salary after reassigning is = "+salary);
		
	}
	
}