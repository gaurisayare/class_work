package shop.etrx;
public class Bardi
{
  private int ba_tv,ba_laptop,ba_ac;
  public Bardi(int tv1,int lapy1,int ac1)
  {
    ba_tv=tv1;
	ba_laptop=lapy1;
	ba_ac=ac1;
  }
  public double ba_income()
  {
    double ba_total=((ba_tv*25000)+(ba_laptop*60000)+(ba_ac*40000));
	return ba_total; 
  }	
}