public class Main {
    public static void main(String[] args){
        int x=-1024546;
        System.out.println("Значение переменной x с типом int равно "+x);
        byte y=126;
        System.out.println("Значение переменной y с типом byte равно "+y);
        short z=7578;
        System.out.println("Значение переменной z с типом short равно "+z);
        long w=10001135546484L;
        System.out.println("Значение переменной w с типом long равно "+w);
        float a=2.74564f;
        System.out.println("Значение переменной a с типом с float равно "+a);
        double b=7.21156456454;
        System.out.println("Значение переменной b с типом с double равно "+b);


        float rub=27.12f;
        long r=987678965549L;
        double cre=2.786;
        short yt=569;
        short hg=-159;
        int ret=27897;
        byte jh=67;

        int lP=23;
        int aS=27;
        int eA=30;
        int summChildren= lP+aS+eA;
        System.out.println("Всего ученников "+summChildren);
        int shiftEveryChildren=480/summChildren;
        System.out.println("На каждого ученика рассчитано "+shiftEveryChildren+" листов бумаги");


        int for2Minut=16;
        int for1Minut=for2Minut/2;
        int for20Minut=for1Minut*20;
        int for1Hour=for1Minut*6;
        int for1Day=for1Hour*24;
        int for3Days=for1Day*3;
        int for1Month=for1Day*30;
        System.out.println("За 20 минут машина произвела "+for20Minut+" штук бутылок");
        System.out.println("За сутки машина произвела "+for1Day+" штук бутылок");
        System.out.println("За 3 суток машина произвела "+for3Days+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+for1Month+" штук бутылок");


        int whiteColor=2;
        int brownColor=4;
        int allColor=120;
        int summFor1Class=brownColor+whiteColor;
        int numberClass=allColor/summFor1Class;
        int allWhiteColor=whiteColor*numberClass;
        int allBrownColor=brownColor*numberClass;
        System.out.println("В школе, где "+numberClass+" классов, нужно "+allWhiteColor+" банок белой краски и "+allBrownColor+" банок коричневой краски");


        int bananas=5;
        int weight1Banan=80;
        int milk=2;
        int weightMilk100=105;
        int icecream=2;
        int weight1Icecream=100;
        int eggs=4;
        int weight1Egg=70;
        int summAllInGramm=bananas*weight1Banan+milk*weightMilk100+icecream*weight1Icecream+weight1Egg*eggs;
        System.out.println("Вес спортзавтрака равен "+summAllInGramm+" грамм");
        float summAllInGramm2=summAllInGramm/1000f;
        System.out.println("Вес спортзавтрака равен "+summAllInGramm2+" килограмм");


        int weight=7000;
        int everyDay1=250;
        int everyDay2=500;
        int day1=weight/everyDay1;
        int day2=weight/everyDay2;
        int midleEveryDay=(everyDay1+everyDay2)/2;
        int day3=weight/midleEveryDay;
        System.out.println("Если спортсмен будет терять в весе "+everyDay1+" грамм, то через "+day1+" дней он сбросит необходимое количество веса");
        System.out.println("Если спортсмен будет терять в весе "+everyDay2+" грамм, то через "+day2+" дней он сбросит необходимое количество веса");
        System.out.println("Если спортсмен будет терять в весе "+midleEveryDay+" грамм, то через "+day3+" дней он сбросит необходимое количество веса");


        float masha=67760;
        float denis=83690;
        float kristina=76230;
        float masha10=masha*1.1f;
        float denis10=denis*1.1f;
        float kristina10=kristina*1.1f;
        float mashaYearBefore=masha*12f;
        float denisYearBefore=denis*12f;
        float kristinaYearBefore=kristina*12f;
        float mashaYearAfter=masha10*12f;
        float denisYearAfter=denis10*12f;
        float kristinaYearAfter=kristina10*12f;
        float mashaDifference=mashaYearAfter-mashaYearBefore;
        float denisDifference=denisYearAfter-denisYearBefore;
        float kristinaDifference=kristinaYearAfter-kristinaYearBefore;
        System.out.println("Маша теперь получает "+masha10+" рублей. Годовой доход вырос на "+mashaDifference+" рублей");
        System.out.println("Денис теперь получает "+denis10+" рублей. Годовой доход вырос на "+denisDifference+" рублей");
        System.out.println("Кристина теперь получает "+kristina10+" рублей. Годовой доход вырос на "+kristinaDifference+" рублей");


    }
}