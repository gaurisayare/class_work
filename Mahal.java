package shop.etrx;
public class Mahal
{
  private int ma_tv,ma_laptop,ma_ac;
  public Mahal(int tv2,int lapy2,int ac2)
  {
    ma_tv=tv2;
	ma_laptop=lapy2;
	ma_ac=ac2;
  }
  public double ma_income()
  {
    double ma_total=((ma_tv*25000)+(ma_laptop*60000)+(ma_ac*40000));
	return ma_total; 
  }	
}