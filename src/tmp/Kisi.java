package tmp;

public class Kisi{
  private String isim;
  private double yas;
  private double boy;

  public Kisi(String isim, double yas,double boy){
    this.isim = isim;
    this.yas = yas;
    this.boy = boy;
  }
  public void sporYap(double saat) {
	  boy += (saat/100);
  }
  public void yaslan(){
    yas++;
  }
  @Override
  public String toString(){
    return isim + " " + yas + " " + boy;
  }
}
