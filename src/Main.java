import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj współczynniki a, b i c trójmianu kwadratowego ax^2 + bx + c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Pierwiastki to: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Pierwiastkiem jest: x = " + x);
        } else {
            System.out.println("Trójmian kwadratowy nie ma pierwiastków rzeczywistych.");
        }

        sc.close();
    }
}
