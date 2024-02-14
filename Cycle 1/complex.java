public class complex{
private double real;
private double imaginary;

public complex(double real,double imaginary){
this.real=real;
this.imaginary=imaginary;
}

public complex add(complex other){
double realno=this.real+other.real;
double imgno=this.imaginary+other.imaginary;
return new complex(realno,imgno);
}

public String toString(){
if(imaginary>=0){
return real + "+"+imaginary + "i";
}else{
return real + "-" + (-imaginary) + "i";
}
}

public static void main(String[] args){
System.out.println("Name:Ajay T M\nRollno:23mca007\nTitle:Complex no Adiition\nDate:13-02-2024\n");
complex num1=new complex(1,3);
complex num2=new complex(2,-2);
complex sum= num1.add(num2);
System.out.println(num1 + " + " + num2 + " = " + sum);
}}
