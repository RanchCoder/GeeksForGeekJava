import java.util.HashSet;
class PairsWithSum 
{
	public static void findPairs(int[] arr ,int sum){

		HashSet<Integer> hst = new HashSet<Integer>();
		for(int i = 0 ; i < arr.length ; i++){
			int temp = sum - arr[i];
			if(hst.contains(temp)){
				System.out.println("Pair with the sum are :: (" + arr[i] + " , " +temp+" )");
			}
			hst.add(arr[i]);
		}
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,10,5,6,12};
		int sum = 7;
		findPairs(arr,sum);
	}
}
