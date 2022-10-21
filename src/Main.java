public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        byte myWeight = 53;
        System.out.println("Значение переменной Мой вес с типом byte равно " + myWeight);
        short averageSalary = 32700;
        System.out.println ("Значение переменной Средняя зарплата с типом short равно " + averageSalary);
        int carsCost = 7150000;
        System.out.println("Значение переменной Стоимость автомобиля с типом int равно " + carsCost);
        long populationSize = 8027325437L;
        System.out.println("Значение переменной Численность населения с типом long равно " + populationSize);
        float gravitationalAcceleration = 9.81f;
        System.out.println("Значение переменной Ускорение свободного падения с типом float равно " + gravitationalAcceleration);
        double piNumber = 3.14159265358979323846;
        System.out.println("Значение переменной Число Пи с типом double равно " + piNumber);



        //Задача 2 27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        boolean d = 100 > 101;
        System.out.println(d);
        short e = 569;
        System.out.println(e);
        short f = - 159;
        System.out.println(f);
        int g = 27897;
        System.out.println(g);
        byte h = 67;
        System.out.println(h);

        //Задача 3
        System.out.println("Задача 3");
        byte studentsA = 23;
        byte studentsB = 27;
        byte studentsC = 30;
        short paper = 480;
        int totalStudents = studentsA + studentsB + studentsC;
        System.out.println("Общее количество учеников " + totalStudents);
        int personPaper = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + personPaper + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");
        byte bottle2min = 16;
        byte time1 = 2;
        int productivity = bottle2min / time1;
        byte time2 = 20;
        int bottle20min = time2 * productivity;
        System.out.println("За 20 минут машина произвела бутылок " + bottle20min + " штук.");
        int time3 = 24 * 60;
        int bottle1day = time3 * productivity;
        System.out.println("За 1 сутки машина произвела бутылок " + bottle1day + " штук.");
        int time4 = 3 * 24 * 60;
        int bottle3day = time4 * productivity;
        System.out.println("За 3 суток машина произвела бутылок " + bottle3day + " штук.");
        int time5 = 30 * 24 * 60;
        int bottle1month = time5 * productivity;
        System.out.println("За 1 месяц машина произвела бутылок " + bottle1month + " штук. (Если в месяце 30 дней)");

        //Задача 5
        System.out.println("Задача 5");
        byte totalJar = 120;
        byte white1room = 2;
        byte brown1room = 4;
        int jar1room = white1room + brown1room;
        int totalRoom = totalJar / jar1room;
        int totalWhite = totalRoom * white1room;
        int totalBrown = totalRoom * brown1room;
        System.out.println("В школе, где " + totalRoom + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");


        //Задача 6
        System.out.println("Задача 6");
        byte bananas = 5;
        int bananasWeight = bananas * 80;
        short milk = 200;
        double milkWeight = milk * 1.05;
        byte sundae = 2;
        int sundaeWeight = sundae * 100;
        byte eggs = 4;
        int eggsWeight = eggs * 70;
        double sportBreakfast = (bananasWeight + milkWeight + sundaeWeight +eggsWeight) / 1000;
        System.out.println("Вес спортивного завтрака " + sportBreakfast + " кг");

        //Задача 7
        System.out.println("Задача 7");
        byte lostWeight = 7;
        short firstDiet = 250;
        short secondDiet = 500;
        int lostWeightG = lostWeight * 1000;
        int firstDietDays = lostWeightG / firstDiet;
        int secondDietDays = lostWeightG / secondDiet;
        int averageDays = ((firstDietDays + secondDietDays) / 2);
        System.out.println("Если спортсмен будет скидывать 250 грамм в день, то к цели он придёт за "
                + firstDietDays + " дней, а если 500 грамм в день, то за " + secondDietDays + " дней. " +
                " Или в среднем за " + averageDays + " день.");

        //Задача 8
        System.out.println("Задача 8");
        int salary1Masha = 67760;
        int salary1Denis = 83690;
        int salary1Kristina = 76230;
        double salary2Masha = (salary1Masha + (salary1Masha * 0.1));
        double salary2Denis = (salary1Denis + (salary1Denis * 0.1));
        double salary2Kristina = (salary1Kristina + (salary1Kristina * 0.1));
        double differenceMasha = ((salary2Masha - salary1Masha) * 12);
        double differenceDenis = ((salary2Denis - salary1Denis) * 12);
        double differenceKristina = ((salary2Kristina - salary1Kristina) * 12);
        System.out.println("Маша теперь получает " + salary2Masha + " руб. Годовой доход вырос на " + differenceMasha + " руб.");
        System.out.println("Денис теперь получает " + salary2Denis + " руб. Годовой доход вырос на " + differenceDenis + " руб.");
        System.out.println("Кристина теперь получает " + salary2Kristina + " руб. Годовой доход вырос на " + differenceKristina + " руб.");




    }
}