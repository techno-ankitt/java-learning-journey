public class operatorsAndBnumSys{

    public static void main(String[] args) {
    
        int a = 10;
        int b = 0;

        System.out.println("PRE INCREMENT IS: ");
        b = ++a;
        System.out.println(a); 
        System.out.println(b);    

        System.out.println("POST INCREMENT IS: ");
        b = a++;
        System.out.println(a);     
        System.out.println(b);        


        System.out.println("PRE DECREMENT IS");
        b = --a;
        System.out.println(a); 
        System.out.println(b);       
        
        System.out.println("POST DECREMENT IS: ");
        b = a--; 
        System.out.println(a); 
        System.out.println(b);  

        RelationalDemo(args);
    }

    public static void RelationalDemo(String[] args) {

        System.out.println("\nRelational Operators:");
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        System.out.println("\nLogical Operators:");
        System.out.println(a>b && b>c);
        System.out.println(a<b || b<c);
        System.out.println(!(a>b));

        BitwiseDemo(args);

    }

    public static void BitwiseDemo(String[] args) {

        System.out.println("\nBitwise Operators:");
        int a = 10;
        int b = 5;

        System.out.println("A and B (AND) is: " + (a & b));
        System.out.println("A | B (OR) is: " + (a | b));
        System.out.println("A ^ B (XOR) is: " + (a ^ b));
        System.out.println("A and B (AND) is: " + (a==b));
        System.out.println("Compliment of A is: " + (~(a)));
        System.out.println("Compliment of B is: " + (~(b)));
        System.out.println("Binary right shift is: " + (a>>b));
        System.out.println("Binary left shift is: " + (a<<b));

    }
}