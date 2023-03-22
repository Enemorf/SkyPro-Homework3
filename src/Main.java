import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    static void task1()
    {
        System.out.println("Задание 1");

        int varInt = 100_000;
        byte varByte = 10;
        short varShort = 10_000;
        long varLong = 1_000_000;
        float varFloat = 1_000_000.00f;
        double varDouble = 1_000_000.000_00;

        System.out.println("Значение переменной varInt с типом int равно "+ varInt);
        System.out.println("Значение переменной varByte с типом byte равно "+ varByte);
        System.out.println("Значение переменной varShort с типом short равно "+ varShort);
        System.out.println("Значение переменной varLong с типом long равно "+ varLong);
        System.out.println("Значение переменной varFloat с типом float равно "+ varFloat);
        System.out.println("Значение переменной varDouble с типом double равно "+ varDouble);
        System.out.println("---\n");
    }

    static void task2()
    {
        System.out.println("Задание 2");

        float var1 = 27.12f;
        long var2 = 987_678_965_549L;
        double var3 = 2.786;
        short var4 = 569;
        short var5 = -159;
        int var6 = 27897;
        byte var7 = 67;

        System.out.println("Для переменной "+var1+" был выбран тип float");
        System.out.println("Для переменной "+var2+" был выбран тип long");
        System.out.println("Для переменной "+var3+" был выбран тип double");
        System.out.println("Для переменной "+var4+" был выбран тип short");
        System.out.println("Для переменной "+var5+" был выбран тип short");
        System.out.println("Для переменной "+var6+" был выбран тип int");
        System.out.println("Для переменной "+var7+" был выбран тип byte");
        System.out.println("---\n");
    }

    static void task3()
    {
        System.out.println("Задание 3");

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short pages = 480;

        int pagerPerUser = pages / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано "+pagerPerUser+" листов бумаги");
        System.out.println("---\n");
    }

    static void task4()
    {
        System.out.println("Задание 4");

        byte bottleWork = 16;
        byte minuteWork = 2;

        byte bottlePerMinute = (byte) (bottleWork / minuteWork);

        int time1 = 20;
        int time2 = 24*60;
        int time3 = 3*24*60;
        int time4 = 30*24*60;

        System.out.println("За "+time1+" минут машина произвела " + (time1*bottlePerMinute) +" штук бутылок");
        System.out.println("За "+time2+" минут (1 сутки) машина произвела " + (time2*bottlePerMinute) +" штук бутылок");
        System.out.println("За "+time3+" минут (3 дня) машина произвела " + (time3*bottlePerMinute) +" штук бутылок");
        System.out.println("За "+time4+" минут (30 дней) машина произвела " + (time4*bottlePerMinute) +" штук бутылок");
        System.out.println("---\n");
    }

    static void task5()
    {
        System.out.println("Задание 5");

        byte potSum = 120;
        byte whitePotToClass = 2;
        byte brownPotToClass = 4;

        byte totalClasses = (byte) (potSum / (whitePotToClass + brownPotToClass));
        byte whitePot = (byte) (totalClasses * whitePotToClass);
        byte brownPot = (byte) (totalClasses * brownPotToClass);

        System.out.println("В школе, где "+ totalClasses +" классов, нужно "+whitePot+" банок белой краски и "+brownPot+
                " банок коричневой краски");
        System.out.println("---\n");
    }

    static void task6()
    {
        System.out.println("Задание 6");

        short bananaSum = 5;
        short bananaGram = 80;

        short milkSum = 200;
        short milkGram = 105;

        short iceCreamSum = 2;
        short iceCreamGram = 100;

        short eggSum = 4;
        short eggGram = 70;

        short totalGram = (short) (bananaSum*bananaGram + milkSum/100*milkGram + iceCreamSum*iceCreamGram +
                eggSum*eggGram);
        float totalKGram = totalGram / 1000f;

        System.out.println("Спортзавтрак составляет "+totalGram+" грамм или "+totalKGram+" кг.");
        System.out.println("---\n");
    }

    static void task7()
    {
        System.out.println("Задание 7");

       short totalKGram = 7;
       short totalGram = (short) (totalKGram * 1000);

       short minGram = 250;
       short maxGram = 500;

       short minDays = (short) (totalGram / maxGram);
       short maxDays = (short) (totalGram / minGram);
       short avgDays = (short) ((minGram + maxGram) / 2);
       float totalDays = (float) totalGram / avgDays;



        System.out.println("При потере 250 грамм в день спортсмен похудеет за " +maxDays+" дней");
        System.out.println("При потере 500 грамм в день спортсмен похудеет за " +minDays+" дней");
        System.out.printf(Locale.US,"Среднее число дней на похудение составляет %.2f дней\n", + totalDays);
        System.out.println("---\n");
    }

    static void task8()
    {
        System.out.println("Задание 8");

        int user1 = 67_760;
        int user2 = 83_690;
        int user3 = 76_230;

        float salaryRatio = 1.1f;

        int user1NewSalary = (int) (user1 * salaryRatio);
        int user2NewSalary = (int) (user2 * salaryRatio);
        int user3NewSalary = (int) (user3 * salaryRatio);

        System.out.println("Маша теперь получает "+user1NewSalary+" рублей. Годовой доход вырос на "
                +(user1NewSalary - user1)*12+" рублей.");
        System.out.println("Денис теперь получает "+user2NewSalary+" рублей. Годовой доход вырос на "
                +(user2NewSalary - user2)*12+" рублей.");
        System.out.println("Кристина теперь получает "+user3NewSalary+" рублей. Годовой доход вырос на "
                +(user3NewSalary - user3)*12+" рублей.");
        System.out.println("---\n");
    }
}