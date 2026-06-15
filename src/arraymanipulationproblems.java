import java.util.HashMap;

public class arraymanipulationproblems {

    static void shiftoneposition(int[] arr){
        int i=arr.length-1;
        int temp=arr[i];
        while(i>0){
            arr[i]=arr[i-1];
            i--;
        }
        arr[0]=temp;
        for(int j:arr){
            System.out.print(j+" ");
        }

    }
    static int[] getModeAndLowest(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=-1;
        int min=Integer.MAX_VALUE;
        int maxkey=-1;
        int minkey=Integer.MAX_VALUE;

        for(int key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                maxkey=key;
            }
            if(map.get(key)<min){
                min=map.get(key);
                minkey=key;
            }
        }
        return new int[]{maxkey,minkey};



    }


    static void main() {
     int[] arr={1,1,1,1,2,2,2,3,3,4,4,5,5,5,5,5};
//   shiftoneposition(arr);
    int[]  arr1=getMode(arr);
    for(int i:arr1){
        System.out.print(i+" ");
    }

    }


}
