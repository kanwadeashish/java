class BloodTypeORunner{
	
	public static void main(String[]args){
		
		BloodTypeO typeO = new BloodTypeO("O");
		
		BloodTypeA typeA = new BloodTypeA("A",typeO);
		BloodTypeAPositive typeAPositive = new BloodTypeAPositive("A Positive",typeO);
		BloodTypeB typeB = new BloodTypeB("B",typeO);
		BloodTypeBPositive typeBPositive = new BloodTypeBPositive("B Positive",typeO);
		BloodTypeBNegative typeBNegative = new BloodTypeBNegative("B Negative",typeO);
		
		typeA.displayTypeADetails();
		typeAPositive.displayTypeAPositiveDetails();
		typeB.displayTypeBDetails();
		typeBPositive.displayTypeBPositiveDetails();
		typeBNegative.displayTypeBNegativeDetails();
		
	}
	
}