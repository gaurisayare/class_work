package shop.etrx;
public class Sadar
{
  private int sa_tv,sa_laptop,sa_ac;
  public Sadar(int tv3,int lapy3,int ac3)
  {
    sa_tv=tv3;
	sa_laptop=lapy3;
	sa_ac=ac3;
  }
  public double sa_income()
  {
    double sa_total=((sa_tv*25000)+(sa_laptop*60000)+(sa_ac*40000));
	return sa_total; 
  }	
}