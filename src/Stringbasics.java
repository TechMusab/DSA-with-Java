public class Stringbasics {

    static String Uppercase(String str){
        String upper="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            ch= (char) ((int)ch-32);
            upper=upper+ch;
        }
        return upper;
    }
    static int freq(String str,char ch){
        int freq=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                freq++;
            }
        }
        return freq;
    }

    static boolean digits(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((int)ch>65 && (int)ch<121){
            return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        String str = "Musab";
//        int len = str.length();
//        int count = 0;
//
//        for (int i = 0; i < len; i++) {
//            char ch = str.charAt(i);
//
//            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'
//                    && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
//                count++;
//            }
//        }
//
//        System.out.println(count);

        String str="Musab Bin Ubaid";
//        System.out.println(Uppercase(str));
//        System.out.println(freq(str,'b'));
//        String[] str2=str.split(" ");
//        String str3=" ";
//      for(int i=0;i<str2.length;i++){
//          str3+=str2[i];
//       }
//       System.out.println(str3);
//System.out.println(digits(str));

        String[] str2=str.split(" ");
        System.out.println(str2.length);

    }
}