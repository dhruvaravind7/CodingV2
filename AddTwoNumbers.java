/**
 * AddTwoNumbers
 */

import java.lang.Math;
import java.util.*;
import java.util.LinkedList;
import java.util.List;


public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = InvertNumber(l1); 
        int num2 = InvertNumber(l2);
        long sum = num1 + num2;
        long mod = 10;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println(sum);
        ListNode sumList = new ListNode(sum % mod);
        ListNode current = sumList;
        sum = sum/10;
        //LinkedList<Integer> sumList = new LinkedList<>();
        while (sum >= 1){
            int insertNumber  = sum % mod;
            sum = sum/10;
            //sumList1.val = insertNucmber;
            current.next = new ListNode(insertNumber);
            current = current.next;
        }
        //System.out.println(sumList);
        return(sumList);

    }

    private int InvertNumber(ListNode l1){
        int number = 0;
        int counter = 0;
        while(l1.next != null){
            number += (l1.val * Math.pow(10, counter));
            counter ++;
            l1 = l1.next;
        }
        number += (l1.val * Math.pow(10, counter));
        return (number);
    }
}