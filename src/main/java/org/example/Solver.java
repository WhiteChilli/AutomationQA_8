package org.example;

public class Solver {

    public int toSolve(int a, int b, int c) {
        return result;
    }
}


//6 Задача на работу с условиями.
//        6.1 Реализуйте класс Solver в котором будет метод, позволяющий
//        решать квадратные уравнения. На вход метода подаются три
//        параметра - a, b, c (параметры уравнения). Реализуйте метод так,
//
//        чтобы в зависимости от дискриминанта было возвращение количества
//        корней
//        если D < 0, корней нет; (возврат 0)
//        если D = 0, есть один корень; (возврат 1)
//        если D > 0, есть два различных корня. (возврат 2)
//        6.2 Реализуйте отдельный класс для тестирования метода например
//        src/test/java/org/example/SolverTest.java
//        и создайте в нем не менее 3 юнит-тестов
//        6.3 Дополните файл readme отдельной таблицей с проверками