public class Casting {
    public static void main(String[] args) {
        // en cun anho ubicar 30 perritos
        // cuants perritos ubique al mes

        double monthDogs = 30.0/12.0;
        System.out.println(monthDogs);
        // Estimacion
        int estimatedMonthlyDogs = (int) monthDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double)a/b);


    }
}
