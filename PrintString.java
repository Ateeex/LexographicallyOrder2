import java.util.Scanner;

public class PrintString{
	public static void main (String[] args){
		//Initialized variables
		String a;
		String b;
		int aLen;
		int bLen;
		int loopVal;
		boolean noPrint = false;
		
		//Scanner object
		Scanner input = new Scanner(System.in);
		//User inputs their two words
		System.out.println("Please enter two words:");
		a = input.nextLine();
		b = input.nextLine();
		aLen = a.length();
		bLen = b.length();
		
		//loopVal is assigned the smaller number between the two user inputs
		if(aLen == bLen){
			loopVal = aLen;
		}
		else if(aLen > bLen){
			loopVal = bLen;
		}
		else{
			loopVal = aLen;
		}
		
		//If the two words are the same it just prints the two words out
		if(a.equals(b)){
			System.out.println("In lexographic order:");
			System.out.println(a);
			System.out.println(b);
		}
		else{
			//For loop goes through the entire length of loopVal(Smaller word) 
			//Compares the letter of the two words at index i 
			//Loop breaks once one letter at index i is higher lexographically
			for(int i = 0 ; i < loopVal ; i++){
				if(a.charAt(i) < b.charAt(i)){
					System.out.println("In lexographic order:");
					System.out.println(a);
					System.out.println(b);
					noPrint = true;
					break;
				} 
				else if(a.charAt(i) > b.charAt(i) ){
					System.out.println("In lexographic order:");
					System.out.println(b);
					System.out.println(a);
					noPrint = true;
					break;
				}
				
			}
			
		}
		
		//Only runs if noPrint has not been assigned true
		//The intention is to check for words that are the same to the length of loopVal(Smaller word)
		//For example would order orangek lower than orange
		if(noPrint == false){
			if(aLen > bLen){
				System.out.println("In lexographic order:");
				System.out.println(b);
				System.out.println(a);
			}else{
				System.out.println("In lexographic order:");
				System.out.println(a);
				System.out.println(b);
			}
			
		}
		
		
		
		
	}
	
}