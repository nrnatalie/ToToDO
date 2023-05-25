import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
    skeds.add(new Sked("Бег", 4, 15));

    System.out.println(skeds);
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
        System.out.println("Вы ввели: Бег");
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
        System.out.println("Вы ввели: спорт- клуб");
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
        System.out.println("Вы ввели: Бег");
        break;

      default:
        break;
    }

    System.out.print("Выберите главное  дело:");
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
        System.out.println("Вы ввели: Бег");
        break;

      default:
        break;
    }
    System.out.println("----------------------------------------");
    System.out.println("Итак,вы выбрали шоппинг, тогда поехали: ");
    System.out.println("-----------------------------------------");

    System.out.println("==== Шоппинг===");

    System.out.println(">>>>>>Оплата на кассе:<<<<<<<");

    HashMap<String, Integer> shopping = new HashMap<>();
    shopping.put("Платье", 20);
    shopping.put("Костюм", 30);
    shopping.put("Брюки", 50);
    for (String shop : shopping.keySet()) {
      int g = shopping.get(shop);
      System.out.println(shop + " - " + g + " evro ");
    }
    for (String shop : shopping.keySet()) {

      // System.out.println(" Итого 100 евро:");
      String name = scanner.next();
      if (shopping.containsKey(shop)) {
        shopping.remove(name);
        System.out.println(shop + " - " + name + " evro ");
      } else {
      }

      System.out.println("Спасибо за покупку:");
      Sked skedOne = new Sked("имя", 2, 16);
      skedOne.skedAll();

    }
  }
}












