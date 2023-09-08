package com.dsapractice;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedList = new LinkedList(1);
//        mylinkedList.appendList(2);
//        mylinkedList.appendList(3);
//        mylinkedList.appendList(1);
//        mylinkedList.appendList(3);
//        mylinkedList.appendList(3);
//        mylinkedList.appendList(4);
//        mylinkedList.deleteAllOccurrences(4);
//        mylinkedList.deleteNode(3);
//        mylinkedList.clearList();
//        mylinkedList.printList();

        int[] nums = new int[]{1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! please choose the options given below.");
        System.out.println("Type 1 to add a node in a list.");
        System.out.println("Type 2 to delete any node in a list.");
        System.out.println("Type 3 to delete any repetitive nodes in list.");
        System.out.println("Type 4 to print all nodes in a list.");
        System.out.println("Type 5 to clear all nodes in a list.");

        int userChoices = scanner.nextInt();
        boolean programExit = false;


        while (!programExit){

            switch (userChoices){
                case 1 :
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Enter the value to append : ");
                    int value = scanner.nextInt();
                    mylinkedList.appendList(value);
                    break;
                case 2 :
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter the value to delete : ");
                    int data = scanner.nextInt();
                    mylinkedList.deleteNode(data);
                    break;
                case 3 :
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Enter the value to delete : ");
                    int dataToDelete = scanner.nextInt();
                    mylinkedList.deleteAllOccurrences(dataToDelete);
                    break;
                case 4:
                    mylinkedList.printList();
                    break;
                case 5:
                    mylinkedList.clearList();
                    break;
                default:
                    System.out.println("Wrong input try again!");
            }

            Scanner ask = new Scanner(System.in);
            System.out.println("type y to continue or n to exit program.");
            String exit = scanner.next();

            if (exit == "n")
                programExit = true;

        }
    }
}