//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++ ) {
            System.out.println("Интерация цикла " + i);
        }

        for (int i = 2020; i < 2070 ; i = i + 4 ) {
            System.out.println("Високостный год " + i);
        }
    for ( int i = 5; i > 0 ; i --)   {
        System.out.println(i);
    }

    for ( int i = 0; i <= 10; i = i + 2){
        System.out.println(i);
    }

    int salary = 65535;
    int total = 0;
    for ( int i = 0; i < 12; i ++) {
        total = total + total / 100;
        total = total + salary;
        System.out.println("Месяц " + i + " итого " + total);
    }
    System.out.println(total);

    System.out.println("Задание 1");
        for ( int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for ( int i = 10; 1 <= i && i <= 10; i--) {
            System.out.println(i);
        }

    System.out.println("Задание 3");
      for ( int i = 0; i <= 17; i = i + 2 ) {
          System.out.println(i);
      }

    System.out.println("Задание 4");
      for ( int i = - 10; i <= 10; i++) {
          System.out.println(i);
      }

    System.out.println("Задание 5");
      for (int i = 1904 ; i <= 2096; i = i + 4) {
          System.out.println(i);
      }

    System.out.println("Задание 6");
      for ( int i = 7; i < 100; i = i + 7) {
          System.out.println(i);
      }

    System.out.println("Задача 7");
      for ( int i = 1 ; i < 550; i = i * 2){
          System.out.println(i);
      }

    System.out.println("Задача 8");
    int savings = 29000;
    int jar = 0;
    for (int i = 1; i <= 12; i++) {
        jar = jar + savings;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + jar + " рублей");
    }

    System.out.println("Задача 9");
    savings = 29000;
    int annual = 0;
    double percent = 0.01;
    for (int i = 1; i <= 12; i++ ) {
        annual = (int) ((annual + savings) * (1 + percent));
        System.out.println("Месяц " + i + ", сумма накоплений равна " + annual + " рублей");
    }

    System.out.println("Задача 10");
    int two = 2;
    int example = 0;
    for (int i = 1; i <= 10 ; i++) {
        example = two * i;
        System.out.println(two + "*" + i + " = " + example);
    }










    }
}