package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LittleSearchEngineDriver {

	
	
	public static void main(String[]args) throws FileNotFoundException{
		 LittleSearchEngine bert = new LittleSearchEngine();
		 bert.makeIndex("docs.txt", "noisewords.txt");
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter top5Search word 1: ");
		 String word1 = sc.next();
		 System.out.print("Enter top5Search word 2: ");
		 String word2 = sc.next();
		 
		 while(word2.equals("quit") == false){
			 ArrayList<String> s = bert.top5search(word1, word2);
		if(s!=null){	 
			 for(int i = 0; i < s.size(); i++){
				 System.out.println(s.get(i));
			 }
		}
		else {
			System.out.println("Null");
		}
			 System.out.print("Enter top5Search word 1: ");
			  word1 = sc.next();
			 System.out.print("Enter top5Search word 2: ");
			  word2 = sc.next();
		 }
		sc.close(); 
		
		
	}
	
}
