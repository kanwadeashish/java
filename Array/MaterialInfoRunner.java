class MaterialInfoRunner{
	
	public static void main(String[]args){
		
		MaterialInfo info = new MaterialInfo();
		
		Material one = new Material("Sand",1000,123456789L,'a');
		Material two = new Material("Bricks",2000,567856789L,'a');
		Material three = new Material("Cement",3000,678916789L,'a');
		
		Material[] materialInfo = {one,two,three};
		
		info.takingInputArray(materialInfo);
		
	}

}