package com.greatlearning.floorsmain;
import com.greatlearning.floors.Floors;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner.*;

public class FloorsMain {
	

		public static int floors;
		public static Integer[] floorNumber;

		public static void main(String[] args) {

		
			Floors main = new Floors();
			main.getfloorNumber();
			main.PrintingFloorOrder(main.floorNumber);

		}

	}



