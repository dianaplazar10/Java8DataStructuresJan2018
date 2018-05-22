package com.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class testArraysMax {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] vals1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(vals1[0]);
        int m= Integer.parseInt(vals1[1]);
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<m;i++){
        String[] valsm1 = sc.nextLine().split(" ");
         int a = Integer.parseInt(valsm1[0]);
         int b=Integer.parseInt(valsm1[1]);
         int k=Integer.parseInt(valsm1[2]);
             int max = ReturnMax(n,a, b, k);
             set.add(max);
        }
        
        int maxofAll = set.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println(maxofAll);
    }

    private static int ReturnMax(int n, int a, int b, int k) {
        List<Integer> list=new ArrayList<Integer>(Collections.nCopies(n, 0));
        for(int i =a;i<=b;i++){
            list.set(i,list.get(i) + k);
        }
        int max = list.stream().mapToInt(i -> i).max().getAsInt();
        return max;
    }
}