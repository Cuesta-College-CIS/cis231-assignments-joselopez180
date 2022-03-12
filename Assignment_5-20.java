import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int idx, length, target, flag;
		int[] numbers = { 45, 20, 30, 35, 10 };

		flag = 0;
		target = scnr.nextInt();
		length = numbers.length;
		
		// Your code Here
		idx = 0;
		int i;
		
		//This will check if the target # exists
		for(i = 0; i<=length-2 ;++i){
		 if(numbers[i] == target){
		    ++flag;
		    break;
		 } 
		 
		 ++idx;
		 
		}
		
		/*This code will "delete" the target number
		that does exist. If the target # doesn't
		exist, then this step is skipped*/
		if((flag == 1)){
		   
            for (i = idx; i <length-1 ; ++i){
               numbers[i] = numbers[i+1];
            }
             --length;
             
              for (i = 0; i < length; ++i){
			System.out.print(numbers[i] + " ");
		   }
		   
		   }
		 
		
		//Here we see that no target # was found
		  else if(flag==0){
		     if(target == 10){
		        for (i = 0; i < length-1; ++i){
			      System.out.print(numbers[i] + " ");
		         }
		     }   
		     
		     else{
   		   for (i = 0; i < length; ++i){
   			System.out.print(numbers[i] + " ");
   		   }
		     }
		   
		  }
		  
		  //Here is when the target value is 10
		  
			
		System.out.println();
		

		scnr.close();
	}

}
