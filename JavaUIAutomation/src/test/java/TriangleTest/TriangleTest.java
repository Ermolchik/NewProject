package TriangleTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    public static void main( String[] args )
    {
        double a;

        a = triangleArea(10, 12, 10);
        System.out.println("Площадь треугольника со сторонами 10,12,10 будет равна:" + a);

        a = triangleArea(3, 4, 5);
        System.out.println("Площадь треугольника со сторонами 3,4,5 будет равна:" + a);

        a = triangleArea(9, 8, 9);
        System.out.println("Площадь треугольника со сторонами 9,9,9 будет равна:" + a );

    }

    public static double triangleArea( int a, int b, int c )
    {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
    @Test
    @DisplayName("Площадь треугольнка")
    public static void TriangleTest(double a,double b){


    }

}
