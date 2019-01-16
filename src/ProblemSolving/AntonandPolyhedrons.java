package ProblemSolving;

import java.util.Scanner;

public class AntonandPolyhedrons {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;


        for (int i = 0; i <= n; i++) {

            String polyhedron = scanner.nextLine();

            switch (polyhedron) {
                case "Tetrahedron":
                    sum += 4;
                    break;
                case "Cube":
                    sum += 6;
                    break;
                case "Octahedron":
                    sum += 8;
                    break;
                case "Dodecahedron":
                    sum += 12;
                    break;
                case "Icosahedron":
                    sum += 20;
                    break;
            }

        }

        System.out.println(sum);
    }

}
