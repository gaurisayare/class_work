class ThisStudent1
{
   String name;
   int rno;
   float percent;
   void read(String name,int rno,float percent)
   {
     this.name=name;
     this.rno=rno;
     this.percent=percent;
     this.print();  //print();
   }
   void print()
   {
     System.out.println("Name: "+name+"Roll no:"+rno+"Percentage:"+percent);
   }
   public static void main(String args[])
   {
     ThisStudent1 s= new ThisStudent1();
     s.read("Gauri",9,90);
   }
}