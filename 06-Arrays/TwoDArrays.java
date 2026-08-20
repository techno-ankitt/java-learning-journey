import java.util.Scanner;
public class TwoDArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your numbers of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter your number of cols: ");
        int cols = sc.nextInt();

        int number [][] = new int[rows][cols];

        // for input
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }

        // for output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(number[i][j]+ " ");

            }
            System.out.println();
        }
    }
}


// // Q-1: PRINT THE TARGET ELEMENT X INDEX LOCATION ----
// import java.util.Scanner;
// public class TwoDArrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter your numbers of rows: ");
//         int rows = sc.nextInt();

//         System.out.print("Enter your number of cols: ");
//         int cols = sc.nextInt();

//         int number [][] = new int[rows][cols];

//         // for input
//         for(int i=0; i<rows; i++){
//             for (int j=0; j<cols; j++){
//                 number[i][j] = sc.nextInt();
//             }
//         }
//        System.out.print("Enter your target element x: ");
//         int x = sc.nextInt();

//         // for output
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 if(number[i][j] == x){
//                     System.out.println("indexing is: ("+ i + ",  "+ j +")");
//                 }
//             }

//         }
//     }
// }

