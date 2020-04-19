package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    double a, b, c;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
        this.a = first.distance(second); // правильно ли я сделал чтобы не тащить в каждый метод координаты точек вершин треугольника сразу в треугольнике сделал поля длина стороны?
        this.b = first.distance(third);
        this.c = second.distance(third);
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        if (exist(a, b, c)) {
            double p = (0.5 * (a + b + c));
            return p;
        } else {
            return -1;
        }
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return
     */
    static boolean exist(double a, double c, double b) {
        boolean result = (a + c) > c && (b + c) > a && (a + c) > a ? true : false;
        return result;
    }

}