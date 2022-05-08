package com.greatlearning.floors;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;


public class Floors {

		public static int floors;
		public static Integer[] floorNumber;

			public void getfloorNumber() {

				System.out.println(" Enter the total number of floors in the building");
				Scanner scan = new Scanner(System.in);
				int floors = scan.nextInt();
				floorNumber = new Integer[floors];

				for (int i = 1; i <= floors; i++) {
					System.out.println("Enter the Floor Size on a given day " + i);
					floorNumber[i - 1] = scan.nextInt();
				}
			}

			public void PrintingFloorOrder(Integer[] floorNumber) {
				System.out.println("The order of construction is as follows");

				int j = 0;
				Integer[] floorNumberOrganise = floorNumber.clone();
				Arrays.sort(floorNumberOrganise, Collections.reverseOrder());

				
				Stack<Integer> buliding = new Stack<Integer>();

				for (int i = 0; i < floorNumber.length; i++) {
					if (floorNumber[i] == floorNumberOrganise[j]) {
						if (i == floorNumber.length - 1)
							j = i;
						else
							j = i + 1;

						System.out.println("Day: "+ (i + 1) );
						if (buliding != null) {
							System.out.print(floorNumber[i] + " ");
							while (!buliding.isEmpty()) {
								int value = buliding.pop();
								if (value >= floorNumber[j]) {
									System.out.print( value + " ");
								} else {
									buliding.push(value);
									j -= buliding.size();
									break;
								}
							}
							System.out.println(" ");
						} else {
							System.out.println(floorNumber[i]);
						}
					} else {
						System.out.println("Day: " + (i + 1));
						buliding.push(floorNumber[i]);
			
					}
				}
			}
		}




