package tmp;

public class Kisi{
  private String isim;
  private double yas;

  public Kisi(String isim, double yas){
    this.isim = isim;
    this.yas = yas;
  }
  public void yaslan(){
    yas++;
  }
  @Override
  public String toString(){
    return isim + " " + yas;
  }
}
