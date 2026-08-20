
public class arrays{
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 100; 
        marks[1] = 67;
        marks[2] = 78;
        marks[3] = 89;
        marks[4] = 92;

        for(int i=0; i<5; i++){
        System.out.println(marks[i]);
        }
    }
}



// import java.util.Scanner; // USER SE IMPUT LEKAR ARRAYS KE ELEMENT PRINT KARVANA
// public class arrays{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your size of num: ");
//         int size = sc.nextInt();
//         int number [] = new int [size];

//         // for input
//         for(int i=0; i<size; i++){
//             number[i] = sc.nextInt();
//         }
//         // for output
//         for(int i=0; i<size; i++){
//             System.out.println("Your enter numer is: " + number[i]);
//         }
//     }
// }



// // Q-1: PRINT THE TARGET ELEMENT X INDEX LOCATION ----
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your size of num. ");
//         int size = sc.nextInt();

//         int number [] = new int[size];

//         // for input
//         for (int i=0; i<size; i++){
//             number[i] = sc.nextInt();
//         }
        
//         System.out.print("Enter your target element x: ");
//         int x = sc.nextInt();

//         for (int i=0; i<size; i++){
//             if(number[i] == x){

//             System.out.println("Your target element index is: " + i);

//             }
//         }
//     }
// }

