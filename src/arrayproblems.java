import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Math.abs;

public class arrayproblems {

    static int removeDuplicates(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        return map.keySet().size();

    }
    static int findFirstRepeatingElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            if(map.get(i)>1){
                return i;
            }
        }
        return -1;
    }
    static int findPivotIndex(int[] arr){
        int[] leftSum=new int[arr.length];
        int[] rightSum=new int[arr.length];
        leftSum[0]=arr[0];
        rightSum[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }
        for(int i=arr.length-2;i>=0;i--){
           rightSum[i]=rightSum[i+1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }
        return -1;
    }
    static List<Integer> missingElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int index=abs(arr[i])-1;
            if(arr[index]>0){
                arr[index]=-arr[index];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
    static void main() {
        int[] arr={2,3,3,3,1,5};
//        System.out.println(removeDuplicates(arr));
//        System.out.println(findFirstRepeatingElement(arr));
//        System.out.println(findPivotIndex(arr));
        System.out.println(missingElements(arr));


    }
}
