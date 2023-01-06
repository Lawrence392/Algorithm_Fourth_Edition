import java.util.Scanner;

import edu.princeton.cs.algs4.Point2D;




public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

/**
 * 1.2.1
 */
class Point_2D {
    public static void main(String[] args) {
        // initialize an scanner
        int N = 10;
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            N = scanner.nextInt();
        }
        // save coordinates
        Point2D[] array = new Point2D[N];
        for (int i = 0; i < N; i++) {
            array[i]  = new Point2D(Math.random(),Math.random());
            array[i].draw();
        }

        double minDistance = array[0].distanceSquaredTo(array[1]);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                minDistance = minDistance > array[i].distanceSquaredTo(array[j]) ? array[i].distanceSquaredTo(array[j]) : minDistance;
            }
        }

        System.out.println("the min distance: " + minDistance);
        // close the scanner
        scanner.close();
    }
}