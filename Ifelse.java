public class Ifelse
{
public static void main(String args[]){
        int num=1234;
        if(num<100 && num>=1){
        System.out.println("It is a 2 digit number");
        }
        else if(num<=1000 && num>=100){
        System.out.println("It is a 3 digit number");
        }
        else if(num<=10000 && num>=1000){
        System.out.println("It is a 4 digit number");
        }
        else if(num<=100000 && num>=10000){
        System.out.println("It is a 5 digit number");
       } 
       else{
        System.out.println("number is not between 1 & 99999");
        }
}
}