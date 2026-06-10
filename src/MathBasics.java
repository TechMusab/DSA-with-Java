public class MathBasics {

    static int countDigits(int num){
        int count=0;
        while(num!=0){
         count++;
         num=num/10;

        }
        return count;
    }
    static int sumofDigits(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }
    static int reverseNumber(int num){
        int rev=0;
        while(num!=0){
           int dig=num%10;
           rev=rev*10+dig;
           num=num/10;
        }
        return rev;
    }
    static boolean isPalindrome(int num){
        int rev=reverseNumber(num);
        if(rev==num){
            return true;
        }
        return false;
    }
    static boolean isPrimeNumber(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    static int factorial(int n){
        int prod=1;
        for(int i=n;i>=1;i--){
            prod*=i;
        }
        return prod;
    }
    static int GCD(int a,int b){
        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        return a;
    }
    static int LCM(int a,int b){
        int gcd=GCD(a,b);
        int lcm=a*b/gcd;
        return lcm;
    }
    static boolean armStrongNumber(int num){
        int sum=0;
        int original=num;
        while(num!=0){
            int rem=num%10;
            rem=rem*rem*rem;
            sum+=rem;
            num=num/10;

        }
        if(sum==original){
            return true;
        }
        return false;
    }
    static int power(int a,int b){
        int prod=1;
        for(int i=1;i<=b;i++){
            prod=prod*a;
        }
        return prod;
    }







    static void main() {
        System.out.println(countDigits(1736120));
        System.out.println(sumofDigits(1736120));
        System.out.println(reverseNumber(12345));
        System.out.println(isPalindrome(12345));
        System.out.println(isPrimeNumber(8));
        System.out.println(factorial(6));
        System.out.println(GCD(18,12));
        System.out.println(LCM(18,12));
        System.out.println(armStrongNumber(153));
        System.out.println(power(2,5));


    }
}
