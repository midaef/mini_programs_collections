package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The addition of arrays");
		System.out.println("");
		System.out.print("Input lenght first array: ");
        int t = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.print("Input value first array: ");
        for (int i=0; i<t; i++) {
            arr.add(s.nextInt());
        }
		System.out.print("Input lenght second array: ");
		int t1 = s.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		System.out.print("Input value second array: ");
		for (int i=0; i<t1; i++) {
			arr1.add(s.nextInt());
		}
		System.out.println("");
		System.out.println("Your 1 array:");
		for (int i = 0; i < t; i++) {
			System.out.println(i + ". " + arr.get(i));
		}
		System.out.println("");
		System.out.println("Your 2 array:");
		for (int i = 0; i < t1; i++) {
			System.out.println(i + ". " + arr1.get(i));
		}
		System.out.println("");
		System.out.println("Result:");
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.addAll(arr);
		res.addAll(arr1);
		Collections.sort(res);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(i + ". " + res.get(i));
		}
    }
}
