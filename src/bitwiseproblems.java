public class bitwiseproblems {
    static void main() {
        //problem 1 count set bits
//        int n=10;
//        int count=0;
//        while(n!=0){
//            if((n&1)==1){
//                count++;
//            }
//            n=n>>1;
//        }
//        System.out.println("No of set bits:"+count);

//find missing no in array using xor

//        int arr[]={8, 2, 4, 5, 3, 7, 1};
//        int n=8;
//        int res=0;
//        int res1=0;
//        for(int i=0;i<arr.length;i++){
//            res=res^arr[i];
//        }
//        for(int j=1;j<=n;j++){
//            res1=res1^j;
//        }
//        int miss=res^res1;
//        System.out.println("Missing number:"+miss);

        // find two unique numbers in array
        int[] arr={1,1,2,2,3,5};
        int xor=0;
        //xor all numbers in array
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        // find rightmost set bit
        int exlbit=0;
        while(true){
            if((xor & 1)==1){
                break;
            }
            xor=xor>>1;
            exlbit++;
        }
        int num1=0;
        int num2=0;

        for(int num:arr){
            if(((num>>exlbit)&1)==1){
                num1^=num;
            }
            else{
                num2^=num;
            }
        }
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
// power of 4
//        int n=16;
//        if((n&n-1)==0 && (n&0x55555555)!=0){
//            System.out.println("Power of 4");
//        }
//        else{
//            System.out.println("Not Power of 4");
//        }
// convert decimal to binary
//        int n=3;
//        String binary=" ";
//        while(n!=0){
//            if((n&1)==0){
//                binary=binary+"0";
//            }
//            else{
//                binary=binary+"1";
//            }
//            n=n>>1;
//        }
//        String rev=" ";
//        for(int i=binary.length()-1;i>=0;i--){
//            rev=rev+binary.charAt(i);
//        }
//        System.out.println(rev);

        //fast exponent
        int a=3;
        int b=3;
        int res=1;
        while(b!=0){
            if((b&1)==1){
                res=res*a;
            }
            a=a*a;
            b=b>>1;
        }
        System.out.println("res:"+res);





    }

}
