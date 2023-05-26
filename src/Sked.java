import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sked implements Buy { // РАСПИСАНИЕ

  String name;
  int time;
  int data;

  public Sked(String name, int time, int data) {
    this.name = name;
    this.time = time;
    this.data = data;

  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTime() {
    return time;
  }

  public void skedAll() {
    System.out.println("Следующая покупка:");
  }

  public static final List<String> buys = new ArrayList<>();

  static {
    buys.add("Платье красное");
    buys.add("Голубое платье");
    buys.add("Джинсы");
    buys.add("Шарф");

    Collections.sort(buys);
    System.out.println(buys);


  }

  @Override
  public String toString() {
    return "=================\n" +
        "name:   " + name + " ";


  }

  @Override
  public void showBuy() {

  }

}




