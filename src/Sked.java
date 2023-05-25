
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
   @Override
    public void showBuy() {

    }
  }




