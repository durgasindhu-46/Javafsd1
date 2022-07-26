package PracticeProject4;
public class LongestIncreasingSubsequence {
	public static void main(String args[]){
	      //int my_arr[] = {46,34,12,2,19,31,5,8,1,20,14};
		  int my_arr[] = {1,3,4,5,8,9};
	      System.out.println("List of random numbers:");
	        for (int i = 0; i < my_arr.length; i++) {
	            System.out.print(my_arr[i] + " ");
	        }
	      int arr_len = my_arr.length;
	      System.out.println("\nThe length of longest increasing subsequence is: " +  long_incre_subseq(my_arr, arr_len));
	   }
	static int long_incre_subseq(int my_arr[], int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      //giving values for all indexes
	      for (i = 0; i < arr_len; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < arr_len; i++)
	      for (j = 0; j < i; j++)
	      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < arr_len; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	   }
	   
}
