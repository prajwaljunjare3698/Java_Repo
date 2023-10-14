package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElemnts {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(List.of(3,1,5,4,3,2,7,9));
		
		for(int i=Collections.min(list);i<=Collections.max(list);i++) {
			if(!list.contains(i)) {
				System.out.println(i);
			}
		} 
		int frequency = Collections.frequency(list, 3);
		System.out.println(frequency);
	
	
	//regular porgram
		int arr[] = {2,3,4,6};
		int len = arr.length+1;
		int sum = len*(len+1)/2;
		for(int i=0;i<arr.length;i++) {
			sum = sum - arr[i];
		}
		System.out.println("\n"+sum);
	}
}
