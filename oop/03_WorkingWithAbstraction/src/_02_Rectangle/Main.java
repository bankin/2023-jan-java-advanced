package _02_Rectangle;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectanglePoints = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();

        Point bottomLeft = new Point(rectanglePoints[0], rectanglePoints[1]);
        Point topRight = new Point(rectanglePoints[2], rectanglePoints[3]);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int pointsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < pointsCount; i++) {
            Point current = PointUtil.parsePoint(scanner.nextLine());

            System.out.println(rectangle.contains(current));
        }
    }
}
