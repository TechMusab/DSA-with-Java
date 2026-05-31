void main(){
//patterns problems
    //solid rectangle
//    int n=5;
//    for(int row=1;row<=n;row++){
//        for(int col=1;col<=5;col++){
//            System.out.print("* ");
//
//        }
//        System.out.println();
//    }
    // Hollow Rectangle
//    int n=5;
//
//    for(int row=1;row<=n;row++) {
//
//        for (int col = 1; col <= 6; col++) {
//            if (row == 1 || row == n) {
//                System.out.print("* ");
//            } else {
//                if (col == 1 || col == 6) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//        }
//        System.out.println();
//
//    }

    // Hollow Right Angle Triangle
//    int n=6;
//for(int row=1;row<=n;row++){
//    if(row==1 || row==2 || row==n){
//        for(int col=1;col<=row;col++){
//            System.out.print("* ");
//        }
//    }
//    else{
//        System.out.print("* ");
//        for(int col=1;col<=row-2;col++){
//            System.out.print("  ");
//        }
//        System.out.print("* ");
//    }
//    System.out.println();
//}
//inverted solid pyramid
//    int n=5;
//    for(int row=1;row<=n;row++){
//        //part1
//        //spaces
//        for(int col=1;col<=row-1;col++){
//            System.out.print("  ");
//        }
//        //stars
//        for(int col=1;col<=n-row+1;col++){
//            System.out.print("* ");
//        }
//        //part2
//        for(int col=1;col<=n-row;col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//
//    }

// Hollow pyramid pattern
//    int n=8;
//    for(int row=1;row<=n;row++){
//        for(int col=1;col<=n-row;col++){
//            System.out.print("  ");
//        }
//        if(row==1 || row==n){
//           for(int col=1;col<=2*row-1;col++){
//               System.out.print("* ");
//           }
//        }
//        else{
//            System.out.print("* ");
//            for(int col=1;col<=2*row-3;col++){
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//
//    }
//solid pyramid pattern
//int n=6;
//for(int row=1;row<=n;row++){
//    for(int col=1;col<=n-row;col++){
//        System.out.print("  ");
//    }
//    for(int col=1;col<=2*row-1;col++){
//        System.out.print("* ");
//    }
//    System.out.println();
//
//}
//for(int row=1;row<=n;row++){
//    if(row==1){
//        continue;
//    }
//
//    for(int col=1;col<=row-1;col++){
//        System.out.print("  ");
//    }
//    for(int col=1;col<=2*(n-row)+1;col++) {
//        System.out.print("* ");
//    }
//    System.out.println();
//}

    //Hollow diamond
//    int n=6;
//    for(int row=1;row<=n;row++){
//        //spaces
//        for(int col=1;col<=n-row;col++){
//            System.out.print("  ");
//        }
//        if(row==1){
//            System.out.print("*");
//        }
//        else{
//            System.out.print("* ");
//            for(int col=1;col<=2*row-3;col++){
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//    for(int row=1;row<=n;row++){
//        if(row==1){
//            continue;
//        }
//        for(int col=1;col<=row-1;col++){
//            System.out.print("  ");
//        }
//        if(row==n){
//            System.out.print("*");
//        }
//        else{
//            System.out.print("* ");
//            for(int col=1;col<=2*(n-row)-1;col++){
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//}
//Rhombus
//int n=7;
//for(int row=1;row<=n;row++){
//    for(int col=1;col<=n-row;col++){
//        System.out.print("  ");
//    }
//    for(int col=1;col<=n;col++){
//        System.out.print("* ");
//    }
//    System.out.println();
//}
    //Number Triangle Pattern
//    int n=5;
//    for(int row=1;row<=n;row++){
//        for(int col=1;col<=row;col++){
//            System.out.print(col+" ");
//        }
//        System.out.println();
//    }
    //Symmetric Number pyramid pattern
//    int n=4;
//    for(int row=1;row<=n;row++) {
//        for (int col = 1; col <= n - row; col++) {
//            System.out.print("  ");
//        }
//        for (int col = 1; col <= row; col++) {
//            System.out.print(col + " ");
//        }
//        int val=row;
//        int dec=val-1;
//        for (int col = 1; col <= row - 1; col++) {
//            System.out.print(dec+" ");
//            dec--;
//        }
//        System.out.println();
//    }

    //Number Pyramid Pattern
//    int n=4;
//    for(int row=1;row<=n;row++){
//        for(int col=1;col<=n-row;col++){
//            System.out.print("  ");
//        }
//        for(int col=1;col<=2*row-1;col++){
//            System.out.print(row+ " ");
//        }
//        System.out.println();
//    }
    //Floyd Triangle Pattern
//    int n=5;
//    int count=1;
//    for(int row=1;row<=n;row++){
//        for(int col=1;col<=row;col++){
//            System.out.print(count+" ");
//            count++;
//        }
//        System.out.println();
//    }

    int n=6;
    for(int row=1;row<=n;row++){
        char toPrint='A'+4;
        for(int col=1;col<=row;col++){

            System.out.print((char)toPrint+" ");
           toPrint--;
        }
        System.out.println();
    }
}


