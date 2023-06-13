import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shopping implements Buy {

  enum Size {
    SMALL,
    MEDIUM,

  }

  public String dress;

  int price;
  int size;

  public Shopping(String dress, int price, int size) {
    this.dress = dress;

    this.price = price;
    this.size = size;

  }

  public static void shop() {
    System.out.println("Покупка");
  }

  public String result(String name) { // метод  который принимает в себя аргумент
    // и возвращает какой то результат
    if (name.equals("Брюки")) {
      return name + " - Купить";
    }
    return name + " - Не купить";
  }

  public static final List<String> buys = new ArrayList<>();

  static {
    buys.add("Платье красное");
    buys.add("Голубое платье");
    buys.add("Джинсы");
    buys.add("Шарф");

    Collections.sort(buys);
  }


  @Override
  public String toString() {
    return "Shopping{" +
        "dress='" + dress + '\'' +
        +'\'' +
        ", price=" + price +
        '}';
  }


  @Override
  public void showBuy() {
    System.out.println(" Size: " + this.size);

  }
}






