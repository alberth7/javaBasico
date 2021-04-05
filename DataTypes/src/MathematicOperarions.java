public class MathematicOperarions {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x)); // 3.0

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x)); // 2.0

        //Devuelve en numero elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un circulo
        // pi*r2
        System.out.println(Math.PI * Math.pow(y,2));

        // Volumen de una esfera
        // (4/3)*pi*r3
        System.out.println((4/3)*Math.PI*Math.pow(y,3));
    }
}
