package com.epam.lambdas_streams;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
    	int n = s.nextInt();
    	int[] list = new int[n];
    	for(int i=0;i<n;i++) {
    		list[i]=s.nextInt();
    	}
    	Average a = new Average();
        System.out.println(a.Avg(list));
	}
}
