package PracticeProject5;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class FixBug {
	public static void main(String[] args) {
        System.out.println("***BUG FIXING***");
        System.out.println("****Welcome To The Desk****\n");
        System.out.println("Select the options below:");
        optionsSelection();

    }
    private static void optionsSelection() {
    	 String[] arr = {"1. I wish to review my expenditure",
                 "2. I wish to add my expenditure",
                 "3. I wish to delete my expenditure",
                 "4. I wish to sort the expenditures",
                 "5. I wish to search for a particular expenditure",
                 "6. Close the application"
         };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(2000);
        expenses.add(1800);
        expenses.add(4500);
        expenses.add(3000);
        expenses.add(500);
        expenses.add(5000);
        expenses.add(1500);
        expenses.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  choice =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(choice==j){
                switch (choice){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==choice){
                        	expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are removed or deleted !\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(expenses);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have choosen an invalid choice!");
                        break;
                }
                
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the expense you need to search:\t");
        //Search expense is given as input
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        //Linear Search used for searching
        boolean found=false;
       for(int i=0;i<leng;i++) {
    	   //get is used in array list to get particular value
        	if(arrayList.get(i)==input) {
            	   found=true;
        		System.out.println("Expense is found at " + i + " position");
        		break;
        	}   
        }
  		if(found==true)	
		    System.out.println("Expense that is searched is: "+input);
		else
		   	System.out.println("Expense is not found!");
	}
     
    
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //The expenses are sorted in ascending order 
        //collections will help to sort the elements in arraylist.
        Collections.sort(arrayList);
        System.out.println("Sorted expenses are: ");
        //case1
       //System.out.println(arrayList);
       //case2
       /* for(int i=0;i<arrlength;i++) {
        	System.out.print( arrayList.get(i)+ " ");
        }*/
        //case3
        for(Integer i: arrayList) {
        	System.out.print(i + " ");
        }
        
        System.out.println("\n");
       
    }
}