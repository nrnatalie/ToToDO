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
    System.out.println();
  }


  @Override
  public String toString() {
    return "=================\n" +
        "name:   " + name + " ";


  }

  @Override
  public void showBuy() {
    System.out.println("Name: " + this.name);

  }

}




