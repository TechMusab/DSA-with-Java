import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
    static void shiftKPosition(int[] arr,int k){
        int[] arr2=new int[k];
        int j=arr.length-1;
        for(int i=k-1;i>=0;i--){
            arr2[i]=arr[j];
            j--;
        }
//        for(int i:arr2){
//            System.out.print(i+" ");
//        }
        int a=arr.length-1;
        while(a>=k){
            arr[a]=arr[a-k];
            a--;
        }
        int index=0;
        for(int i:arr2){
            arr[index]=i;
            index++;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    static Set unionofArray(int[] arr1,int[] arr2){
        Set<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }
        return set;
    }





    static void main() {
        int[] arr1={1,2,3,4};
        int[] arr2={3,4,5};
        System.out.println(unionofArray(arr1,arr2));



    }


}
