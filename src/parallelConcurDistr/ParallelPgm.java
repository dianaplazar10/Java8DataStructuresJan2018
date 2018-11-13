package parallelConcurDistr;

import java.util.ArrayList;
import java.util.List;

/*
 finish {
  async S1; // asynchronously compute sum of the lower half of the array
  S2;       // compute sum of the upper half of the array in parallel with S1
 }
 S3; // combine the two partial sums after both S1 and S2 have finished
 */
public class ParallelPgm {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> arr=new ArrayList<Integer>();
        int midIndex=arr.size()/2;
        int start2 = midIndex + 1;
        
        
    }

}
