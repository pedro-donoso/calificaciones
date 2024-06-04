import Java.util.Scanner;
public class Calificaciones { public static void main(String [] args) { 
    Scanner sc = new Scanner(System.in);
    String estudiante = sc.nextLine();
    String asignatura = sc.nextLine();
    String docente = sc.nextLine();
    int nota1 = sc.nextInt();
    int nota2 = sc.nextInt();
    int nota3 = sc.nextInt();
    float promedio = (nota1 + nota2 + nota3) / 3;
    System.out.printf(
    "Estudiante:%s %s\n" + "Asignatura: %s\n" + "Docente: %s\n" + "Nota 1: %d\n",
    + "Nota 2: %d\n",
    + "Nota 3: %d\n",
    + "Promedio: %d\n",
    estudiante,
    asignatura,
    docente,
    nota1,
    nota2,
    nota3,
    promedio
    );
    } 
}

