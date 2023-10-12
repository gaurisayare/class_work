//sorting program

class SortArrayExample
{
	public static void main(String args[])
	{
		//creating an instance of an array
		int[] arr = new int[] {58,34,76,39,30};
		System.out.println("Array elements for sorting: ");
		//sorting logic
		for(int i=0; i<5; i++)
		{
			for(int j = i+1; j<5; j++)
			{
				int tmp = 0;
				if(arr[i]>arr[j])
				{
					//logic for swapping the numbers in the array
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			//prints the sorted elements of the Array
		    System.out.println(arr[i]);
		}
		
	}
}