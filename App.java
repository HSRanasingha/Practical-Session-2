
import p1.MyClass;
//import P2.Class2;
//import P2.Class3;

import P2.*; //this will import all the classes

class App{
    public static void main(String[] ar){
        MyClass mc=new MyClass();
        mc.display();
        
        Class2 c2=new Class2();
        c2.display();	

         Class3 c3=new Class3();
        c3.display();

         Class4 c4=new Class4();
         c4.display();		 }
}