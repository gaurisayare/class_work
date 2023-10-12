class ThisStudent
{
   String name;
   int rno;
   float percent;
   void read(String name,int rno,float percent)
   {
     this.name=name;
     this.rno=rno;
     this.percent=percent;
   }
   void print()
   {
     System.out.println("Name: "+name+"Roll no:"+rno+"Percentage:"+percent);
   }
   public static void main(String args[])
   {
     ThisStudent s= new ThisStudent();
     s.read("Gauri",9,90);
     s.print();
   }
}