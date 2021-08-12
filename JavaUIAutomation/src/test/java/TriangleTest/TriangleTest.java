package TriangleTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    public static void main(String[] args) {
        double a;

        a = triangleArea(10, 12, 10);
        System.out.println("Площадь треугольника со сторонами 10,12,10 будет равна:" + a);

        a = triangleArea(3, 4, 5);
        System.out.println("Площадь треугольника со сторонами 3,4,5 будет равна:" + a);

        a = triangleArea(9, 9, 9);
        System.out.println("Площадь треугольника со сторонами 9,9,9 будет равна:" + a);

        CorrectTest();
        InCorrectTest();
    }

    public static double triangleArea(int a, int b, int c) {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    @Test
    @DisplayName("Площадь треугольнка")
    public static void CorrectTest() {

           assertEquals(triangleArea(10, 12, 10), 48.0);
           assertEquals(triangleArea(3, 4, 5), 6.0);
           assertEquals(triangleArea(9, 9, 9), 35.074028853269766);
           System.out.println("Тест: Площадь треугольника, прошёл успешно!");

    }

    @Test
    @DisplayName("Не корректные данные")
    public static void InCorrectTest() {
                  assertEquals(triangleArea(10, 12, 10), 49.0);
           assertEquals(triangleArea(3, 4, 5), 7.0);
           assertEquals(triangleArea(9, 9, 9), 34);


            System.out.println("Тест: Не корректные данные, провалился!");
    }

}