package recursion_39;

public class PrintSumOfAllSubsets {

	public static void subsetSum(int [] arr, int n, int idx, int sum) {
		
		//Base case
		if(idx>=n) {
			System.out.println(sum);
			return;
		}
		
		//recursive call
		//curr idx + sum
		subsetSum(arr, n, idx+1, sum + arr[idx]); //include
		subsetSum(arr, n, idx+1, sum); //exclude
	}
	public static void main(String[] args) {
		int arr[]= {2, 4, 5} ;
		subsetSum(arr, arr.length, 0, 0);
	}

}
