public class arraybasicproblems {

    static int[] sumofpostivesandnegitives(int[] arr){
        int sumpos=0;
        int sumneg=0;
        for(int i:arr){
            if(i<0){
                sumneg+=i;
            }
            else{
                sumpos+=i;
            }
        }
        return new int[]{sumpos,sumneg};
    }
    static void swapalternatelements(int[] arr){
     int i=0;
     int j=1;
     while(j<arr.length){
         int temp=arr[j];
         arr[j]=arr[i];
         arr[i]=temp;
         i+=2;
         j+=2;
     }
    }
    static void printalternateextremes(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            System.out.println(arr[i]);
            System.out.println(arr[j]);
            i++;
            j--;
        }
    }



    static void main() {
//        int[] arr={1,2,4,-1,-1,-4};
//        int[] sum=sumofpostivesandnegitives(arr);
//        for(int i:sum){
//            System.out.print(i+" ");
//        }
//        int[] arr={1,2,3,4,5};
//        swapalternatelements(arr);
//        for(int i:arr){
//            System.out.println(i);
//        }
        int[] arr={1,2,3,4,5,6,7};
        printalternateextremes(arr);

    }



}
