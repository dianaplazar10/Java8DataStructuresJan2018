package com.algorithms;

//reference: http://www.code2learn.com/2011/09/heapsort-array-based-implementation-in.html
//To understand concept, watch a youtube video : "Implementation of heap in java - part 1 and 2 - by Sesh Gopal "

/*if a tree sorted and saved in array.. Then.
Every parent has its left child in index = 2k+1 and rt child in index, 2k+2,
where k= index of parent
Given a node index 'n', the parent index=((n/2)-1)
*/
public class HeapSort 
{
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    
    public static void buildheap(int []a){
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(a,i);
        }
    }
    
    public static void maxheap(int[] a, int i){ 
        left=2*i;
        right=2*i+1;
        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(a, largest);
        }
    }
    
    public static void exchange(int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t; 
        }
    
    public static void sort(int []a0){
        a=a0;
        buildheap(a);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }
    
    public static void main(String[] args) {
        int []a1={4,1,3,2,16,9,10,14,8,7};
        sort(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i] + " ");
        }
    }
}
