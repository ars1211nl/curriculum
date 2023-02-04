package check;

import constants.Constants;

public class Main {

	public static void main(String[] args) {
				
		// TODO 自動生成されたメソッド・スタブ	
		printName("shin","ashida");
		
		Pet P = new Pet(Constants.CHECK_CLASS_JAVA , Constants.CHECK_CLASS_HOGE);
		P.introduce();
		
		RobotPet RP = new RobotPet(Constants.CHECK_CLASS_R2D2 , Constants.CHECK_CLASS_LUKE);
		RP.introduce();
	}

	
    private static void printName(String firstName , String lastName) {
    	String fullName = "printNameメソッド" + " → " + lastName + " " + firstName ;
    	System.out.println(fullName);		
	}	
    
    
    
    

}
