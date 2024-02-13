class product{
int pcode;
String name;
double price;

public product(int pcode,String name,double price){
this.pcode=pcode;
this.name=name;
this.price=price;
}}

public class Prod{
public static void main(String[] args){
System.out.println("Name:Ajay T M\nRollno:23mca007\nTitle:Product Class\nDate:13-02-2024");
product p1=new product(1,"Oranage",80); 
product p2=new product(2,"Kiwi",200); 
product p3=new product(1,"Apple",150); 
product lowest=p1;

if(p2.price<lowest.price){
lowest=p2;
}else if(p3.price<lowest.price){
lowest=p3;
}

System.out.println("The product having lowest price is "+ lowest.name+ " with price "+lowest.price);
}}
