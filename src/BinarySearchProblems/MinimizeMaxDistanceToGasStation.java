package BinarySearchProblems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimizeMaxDistanceToGasStation {
    public static double minMaxDis(int[] stations, int k) {
        int[] idx = new int[stations.length-1];
        double[] obj = new double[2];
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b)-> Double.compare(b[0],a[0]));

        for(int i=0;i<stations.length-1;i++){
            pq.add(new double[]{stations[i+1]-stations[i], i});
        }

        while(k>0){
            double[] val = pq.poll();
            int val1 = (int)val[1];
            idx[val1]++;
            double calc = (stations[val1+1] - stations[val1]) / (double)(idx[val1]+1);
            pq.add(new double[]{calc, val1});
            k--;
        }
        return pq.poll()[0];
    }

    /*In this question we are using pq to store the gap between 2 consecutive stations and their indexes in an array of
    * size 2. Then retrieving the value with the largest difference between consecutive elements and adding 1 more element
    * between the 2 elements. */

}
