public class IncremetDecrement {
    public static void main(String[] args) {
        /*
         Operadores de asignación:

    +=: a += b es equivalente a a = a + b.
    -=: a -= b es equivalente a a = a - b.
    *=: a *= b es equivalente a a = a * b.
    /=: a /= b es equivalente a a = a / b.
    %=: a %= b es equivalente a a = a % b.

Operadores de incremento:

    ++: i++ es equivalente a i = i + 1.
    --: i-- es equivalente a i = i - 1.

         */

    int lives = 5;
    lives = lives - 1;
    System.out.println(lives);

    lives--;
    System.out.println(lives);

    lives++;
    System.out.println(lives);

    int gift = 0;
    //postfijo, la suma lo hace primero, despues la operacion lives++
    gift = 100 + lives++;
    System.out.println(gift);

        //prefijo, la operacion ++lives lo hace primero despues lo sumna
        gift = 100 + ++lives;
        System.out.println(gift);


    }
}
