public class sortingAlgorthims {

    static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
             if(arr[j]>arr[j+1]){
                 int temp=arr[j+1];
                 arr[j+1]=arr[j];
                 arr[j]=temp;
             }
            }
        }
    }
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //swap minimum
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&  arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }


    static void main() {
        int[] arr={2,1,8,2,1,9,3};
//        bubbleSort(arr);
//        selectionSort(arr);
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }


    }
}
