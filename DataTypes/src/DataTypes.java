public class DataTypes {
    public static void main(String[] args) {
        // byte = 1 B
        // short = 2 B
        // int  = 4 B
        // long = 8 B

        // Punto flotante

        // float =  4 B
        // double = 8 B

        // char = solo puede alnacenar un solo elemento (rango unicode) = 2 B

        // logicos
        // boolean = 2 B (true or false)


     int n = 1234567890;
     long nL = 12345678901L;

     double nD = 123.456;
     float nF = 123.456F;


     /* A partir de Java 10 la pal;abra reservada var definira automatica mente el tipo de dato */
     // palabra reservada VAR

        var salary = 1000;  // int
        //pension 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

    }
}
