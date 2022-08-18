public class Main {
    public static void main(String[] args) {
        //Целочисленые
        byte a = 100;
        short b = 10000;
        int c = 54021;
        long d = 12342L;
        System.out.println("Byte ="+a);
        System.out.println("Short ="+b);
        System.out.println("Int ="+c);
        System.out.println("Long ="+d);
        //С точкой
        float e = 3.14F;
        System.out.println("Float ="+e);
        double f = 2.12323;
        System.out.println("Double ="+f);
        //Символы
        char L = 's';
        System.out.println("Char ="+L);
        //
        boolean or = true;
        System.out.println("Boolean =" + or);
        boolean fal = false;
        System.out.println("Boolean ="+ fal);

        float boxer1 = 78.2F;
        System.out.println("Вес первого боксера: "+boxer1+"кг!");
        float boxer2 = 82.7F;
        System.out.println("Вес первого боксера: "+boxer2+"кг!");
        float summ = boxer1+boxer2;
        System.out.println("общий вес двух бойцов: "+summ+"кг!");
        float razniza = boxer2-boxer1;
        System.out.println("Разница в весе: "+razniza+"кг!");


    }
}
