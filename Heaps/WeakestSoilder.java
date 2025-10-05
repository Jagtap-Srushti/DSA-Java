package Heaps;

import java.util.*;

public class WeakestSoilder {
    public static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        Row(int soilder,int idx){
            this.soldier=soilder;
            this.idx=idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldier==r2.soldier){
                return this.idx-r2.idx;
            }
            else{
                return this.soldier-r2.soldier;
            }
        }

    }
    public static void main(String[] args) {
        int army[][]={
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0},
        };

        PriorityQueue<Row> pq=new PriorityQueue<>();
        int k=0;

        int count=0;

        for(int i=0;i<army.length;i++){
            for(int j=0;j<army[0].length;j++){
                count+=army[i][j]==1?1:0;
            }
            pq.add(new Row(count,i));
        }

        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }



        
    }
    
}
