public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 100;
        // bono de 200
        salary += 200;
        System.out.println(salary);

        // pension de 50
        salary -=50;
        System.out.println(salary);

        // 2 horas extra de 30 c/u
        // comida 45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        int x = 2 + 4 - 6 * 8 / 2;
        System.out.println(x);
    }
}
