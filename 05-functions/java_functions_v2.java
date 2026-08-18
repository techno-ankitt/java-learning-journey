// --CHEAK THE VOTE ELIGIBILITY(6)--
// import java.util.Scanner;
// public class functions{
//     public static  int cheakVoteEligibility(int a){
//         int age;
//         if(a>=18){
//         System.out.println("You are eligible to vote");}
//         else{
//             System.out.println("You are not eligible for vote");

//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);
//         System.out.print("Enter your age: ");

//         int age = sc.nextInt();
//         int result = cheakVoteEligibility(age);
       
//     }
// }

// =====================================================================    

// --CHEAK TOTAL NUMBER OF POSITIVE, NEGETIVE AND ZERO!(7)--
// import java.util.Scanner;

// public class java_functions_v2{
//     static int positive = 0;
//     static int negetive = 0;
//     static int zero = 0;

//     // Scanner sc = new Scanner(System.in);
//     public static int countPosNegZero(int n){
//         if(n>0){
//             positive++;
//         }
//         else if (n<0) {
//             negetive++;    
//         }
//         else{
//             zero++;
//         }
//         return n;
//     }
//     public static void main(String[] args) {
//          char choice;
//         do { 
//             Scanner sc = new Scanner(System.in); 

//             System.out.print("Enter your number: ");
//             int num = sc.nextInt();
//             countPosNegZero(num);

//             System.out.print("Do you want to enter more number (Y/y)" );
//             choice = sc.next().charAt(0);


//         } while (choice == 'Y' || choice == 'y');
//             System.out.println("\n====Result====");
//             System.out.println("Total postive number: " + positive);
//             System.out.println("Total negetive number: " + negetive);
//             System.out.println("Total zeros: "+ zero);
//     }
// }

// =========================================================================

// --ONE NUMBER RAISED TO THE POWER OF ANOTHER ON I.E. X^N(8)--
import java.util.Scanner;
public class java_functions_v2{
    public static double numRaisedAsPower(int n, int x){
        double a = Math.pow(x,n);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your value of X: ");
        int x = sc.nextInt();

        System.out.println("Enter your value of N: ");
        int n = sc.nextInt();

        double result = numRaisedAsPower(n,x);
        System.out.println("Result of X^n is: " + result);
    }    
}
