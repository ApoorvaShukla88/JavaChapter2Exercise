package chapter13;

public class Car implements Comparable<Car>{

    private String VIM;
    private double mpg;
    private double price;

    public String getVIM() {
        return VIM;
    }

    public void setVIM(String VIM) {
        this.VIM = VIM;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Car(){}
    public Car(String vim, double mpg, double price){
        this.mpg = mpg;
        this.price = price;
        this.VIM = vim;
    }

    public String toString(){
        System.out.println();
        return "VIM" + this.VIM + " MPG " + this.mpg + " PRICE " + this.price;
    }





    public int VIMcompareTo(Car o) {
        if(this.VIM.compareTo(o.VIM) > 1){
            return 1;
        }
        else if(o.VIM.compareTo(this.VIM)> 1){
            return -1;
        }
        return 0;
    }

    public int MPGcompareTo(Car o) {
      return (int) (this.mpg - o.mpg);
    }
    @Override
    public int compareTo(Car o) {
        return (int) (this.price - o.price);
    }


}
