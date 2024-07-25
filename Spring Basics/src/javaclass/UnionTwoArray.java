package javaclass;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class UnionTwoArray {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int arr1[] = new int[n];
	        int arr2[] = new int[n];
	        for(int i=0;i<n;i++){
	            arr1[i] = s.nextInt();
	        }
	        for(int i=0;i<n;i++){
	            arr2[i] = s.nextInt();
	        }

	        TreeSet<Integer> set = new TreeSet<>();
	        for(int i:arr1){
	            set.add(i);
	        }
	        for(int i:arr2){
	            set.add(i);
	        }
	        //ArrayList<Integer> list = new ArrayList<>();
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i:set){
	            list.add(i);
	        }
	        for(int i:list){
	            System.out.print(i+" ");
	        }


	}

}
