package Basics.Pattern;

public class Nesting {
    public static void main(String args[]){
        
        //Nesting loops
        /*

                ****
                ****
                ****
                ****

        */
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
            System.out.print("*");
            }
           System.out.print("\n");
        }

        /*

                *****
                *****
                *****
                *****

        */
        int rows=4;
        int cols = 5;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
            System.out.print("*");
            }
           System.out.print("\n");
        }
        /*

                *****
                *   *
                *   *
                *****

        */
        int rows1=4;
        int cols1 =5;
        for(int i=1;i<=rows1;i++){
            for(int j=1;j<=cols1;j++){
                //cell -> (i,j)
                //make sure to print only when i/j is 1 or equal to rows/cols
                if(i==1 || j==1 || i==rows1 ||j==cols1){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
           System.out.print("\n");
        }
        /*
            (Row times stars)
                *
                **
                ***
                ****

        */
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println();
        }
        /*
            (Dekho kitne stars print hai)
                ****
                ***
                **
                *

        */
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println();
        }
        /*

                   * (3 space + 1 star)
                  ** (2 space + 2 star)
                 *** (1 space + 3 star)
                **** (0 space + 4 star)

        */
        int no = 4;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=no-i;j++){
                System.out.print(" ");
            }
           for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*

                **** (0 space + 4 star)
                 *** (1 space + 3 star)
                  ** (2 space + 2 star)
                   * (3 space + 1 star)

        */
        int m = 4;
        for(int i=m;i>=1;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
           for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            (Row times stars)
                1
                12
                123
                1234
                12345

        */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
           System.out.println();
        }
        /*
                12345
                1234
                123
                12
                1

        */
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
           System.out.println();
        }
        /*

                1
                2 3
                4 5 6
                7 8 9 10
                11 12 13 14 15

        */
        int pt = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(pt+" ");
                pt++;
            }
           System.out.println();
        }

        /*

                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1

        */
        
        for(int i=1;i<=5;i++){ //rows
            for(int j=1;j<=i;j++){ //col=no of rows
              if((i+j)%2==0){
                System.out.print("1");
              }
              else{
                System.out.print("0");
              }
            }
           System.out.println();
        }
    }
}

