package com.greatlearning.Driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImpl;
import com.greatlearning.service.NotesCount;


public class NotesDriver {
	public static void main(String []args) {
		MergeSortImpl mergeSortImpl = new MergeSortImpl();
		NotesCount notesCount = new NotesCount();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Currency denominations: ");
		size = sc.nextInt();
		System.out.println("Enter the Currency denomination values: ");
		int noteDenomination[] = new int[size];
		for (int i=0; i<size; i++) 
		{
			noteDenomination[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay: ");
		int amt = sc.nextInt();
		
		mergeSortImpl.mergeSort(noteDenomination,0,noteDenomination.length-1);
		notesCount.implementNotesCount(noteDenomination, amt);
	}
}
