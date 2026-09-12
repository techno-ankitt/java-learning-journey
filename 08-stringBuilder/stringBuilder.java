public class stringBuilder{
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony is a good boy");
        System.out.println("1." + sb);

        sb.setCharAt(0, 's'); // SET CHAR AT ANY INDEX
        System.out.println("2." + sb);

        System.out.println("3." + sb.charAt(0)); // ELEMENT AT INDEX NUMBER

        System.out.println("4." + sb.replace(0,4, "Rahul")); // REPLACE

        System.out.println("5." + sb.insert(3, 'u')); // INSERT

        System.out.println("6." + sb.delete(3,4)); // DELETE

        System.out.println("7." + sb.append('y')); // APPEND (AT THE LAST AUTO)

        System.out.println("8." + ("length is: " +sb.length()));
    }
}