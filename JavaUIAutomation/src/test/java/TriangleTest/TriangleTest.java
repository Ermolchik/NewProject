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
       try {
           assertEquals(triangleArea(10, 12, 10), 48.0);
           assertEquals(triangleArea(3, 4, 5), 6.0);
           assertEquals(triangleArea(9, 9, 9), 35.074028853269766);
           System.out.println("Тест: Площадь треугольника, прошёл успешно!");
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    @Test
    @DisplayName("Не корректные данные")
    public static void InCorrectTest() {
       try {
           assertEquals(triangleArea(11, 12, 10), 48.0);
           assertEquals(triangleArea(3, 4, 6), 6.0);
           assertEquals(triangleArea(9, 8, 9), 35.074029);
       } catch (Exception e) {
            e.printStackTrace();
       }
    }

}