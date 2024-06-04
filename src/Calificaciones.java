import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del estudiante: ");
        String estudiante = sc.nextLine();

        System.out.print("Ingresa la asignatura: ");
        String asignatura = sc.nextLine();

        System.out.print("Ingresa el nombre del docente: ");
        String docente = sc.nextLine();

        System.out.print("Ingresa la primera nota: ");
        int nota1 = sc.nextInt();

        System.out.print("Ingresa la segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.print("Ingresa la tercera nota: ");
        int nota3 = sc.nextInt();

        float promedio = (nota1 + nota2 + nota3) / 3.0f;

        System.out.printf(
            "Estudiante: %s\nAsignatura: %s\nDocente: %s\nNota 1: %d\nNota 2: %d\nNota 3: %d\nPromedio: %.2f\n",
            estudiante, asignatura, docente, nota1, nota2, nota3, promedio
        );

        sc.close();
    }
}


