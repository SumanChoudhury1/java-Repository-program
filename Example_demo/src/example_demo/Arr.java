package example_demo;

import java.util.Arrays;
import java.util.Collections;

public class Arr {

	public static void main(String[] args) {
		Integer arr[]= {4,5,8,7,9,6,24};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		for(int i:arr)
		{
			
			System.out.print(arr[2]);
		}
		
	}

}
