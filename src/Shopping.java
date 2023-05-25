
public class Shopping implements Buy {

  public String dress;

  int price;

  public Shopping(String dress, int price) {
    this.dress = dress;

    this.price = price;
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

  }
}



