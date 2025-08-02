package GreedyAlgorithm;

import java.util.*;
public class maxUnitOnTruck {
    public static int maximumUnit(int boxTypes[][],int truckSize){
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);

        int totalUnit=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>=boxTypes[i][0]){
                totalUnit+=(boxTypes[i][0]*boxTypes[i][1]);
                truckSize-=boxTypes[i][0];
            }
            else{
                totalUnit+=(truckSize*boxTypes[i][1]);
            }
        }
        return totalUnit;
    }
    public static void main(String[] args) {
        // boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]
        int boxTypes[][] = {{1,3},{2,2},{3,1}};
        int truckSize=4;
        System.out.println("maximum total number of units that can be put on the truck:"+maximumUnit(boxTypes,truckSize));

    }
    
}
