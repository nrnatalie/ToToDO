import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {


  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    System.out.println("=== Список дел ===");
    List<Sked> skeds = new ArrayList<>();
    skeds.add(new Sked("Спорт- клуб", 2, 3));
    skeds.add(new Sked("Встреча", 2, 16));
    skeds.add(new Sked("Шоппинг", 1, 16));
    skeds.add(new Sked("Супермаркет", 3, 15));
    skeds.add(new Sked("Совещание", 4, 15));

    //System.out.println(skeds);
    Collections.addAll(skeds);
    System.out.println(skeds);

    System.out.print("Выберите из списка :");

    int number = scanner.nextInt();
    scanner.nextLine();

    System.out.println(number);
    List<String> result = new ArrayList<>();
    switch (number) {
      case 1:
        result.add(" ");
        System.out.println("Вы ввели: спорт- клуб");
        break;
      case 2:
        result.add(" ");
        System.out.println("Вы ввели: Встреча");
        break;
      case 3:
        result.add(" ");
        System.out.println("Вы ввели: Шоппинг");
        break;
      case 4:
        result.add(" ");
        System.out.println("Супермаркет");
        break;
      case 5:
        result.add(" ");
        System.out.println("Вы ввели: Совещание");
        break;

      default:
        //System.out.println(result);
        break;


    }

    System.out.println("Выберите следующий пункт :");
    for (int i = 0; i < skeds.size(); ++i) {
      Sked n = skeds.get(i);
      int k = i + 1; // порядковый номер
      System.out.println(k + "." + n.getName());
    }
    System.out.print("Выберите из списка :");

    int number1 = scanner.nextInt();
    scanner.nextLine();

    System.out.println(number1);

    List<String> result1 = new ArrayList<>();
    switch (number1) {
      case 1:
        result1.add(" ");
        System.out.println(" Вы ввели: спорт- клуб ");
        break;
      case 2:
        result1.add(" ");
        System.out.println("Вы ввели: Встреча");
        break;
      case 3:
        result1.add(" ");
        System.out.println("Вы ввели: Шоппинг");
        break;
      case 4:
        result1.add(" ");
        System.out.println("Вы ввели: Супермаркет");
        break;
      case 5:
        result1.add(" ");
        System.out.println("Вы ввели: Совещание");
        break;

      default:
        break;
    }

    System.out.print("Выберите дело сегодняшнее - по важнее:");
    int number2 = scanner.nextInt();
    scanner.nextLine();
    System.out.println(number2);
    for (int i = 0; i < skeds.size(); ++i) {
      Sked n = skeds.get(i);
      int k = i + 1; // порядковый номер
      System.out.println(k + "." + n.getName());
    }

    List<String> result2 = new ArrayList<>();
    switch (number2) {
      case 1:
        result2.add(" ");
        System.out.println("Вы ввели: спорт- клуб");
        break;
      case 2:
        result2.add(" ");
        System.out.println("Вы ввели: Встреча");
        break;
      case 3:
        result2.add(" ");
        System.out.println("Вы ввели: Шоппинг");
        break;
      case 4:
        result2.add(" ");
        System.out.println("Вы ввели: Супермаркет");
        break;
      case 5:
        result2.add(" ");
        System.out.println("Вы ввели: Совещание");
        break;

      default:
        break;
    }

    System.out.println("----------------------------------------");
    System.out.println("Итак,вы выбрали шоппинг, тогда поехали! За покупками... ");
    System.out.println("-----------------------------------------");

    System.out.println("==== Шоппинг===");

    System.out.println(">>>>>>Оплата на кассе:<<<<<<<");
    System.out.println("Как будете оплачивать?");

    String name = scanner.nextLine();
    //System.out.println(name);

    HashMap<String, Integer> shopping = new HashMap<>();
    shopping.put("Платье", 20);
    shopping.put("Костюм", 30);
    shopping.put("Брюки", 50);
    for (String shop : shopping.keySet()) {
      int g = shopping.get(shop);
      System.out.println(shop + " - " + g + " evro ");
    }
    for (String shop : shopping.keySet()) {

      String name1 = scanner.next();
      if (shopping.containsKey(shop)) {
        shopping.remove(name1);
        System.out.println(shop + " - " + name);
      } else {
        System.out.println(" Может вы передумали?");
      }

      Shopping shopOne = new Shopping("Красное", 50, 44);
      shopOne.showBuy();

      System.out.println("Спасибо за покупку:");
      Sked skedOne = new Sked("Шоппинг", 2, 16);
      skedOne.skedAll();


    }

    System.out.println(" Думаю на сегодня достаточно, хорошего дня и до свидания!");
    System.out.println();

    Date date = new Date();
    System.out.println(date);
    SimpleDateFormat format = new SimpleDateFormat("26.05.2023");
    System.out.println(format.format(date));


  }
}













