package Classes;

import java.util.ArrayList;

public class WrapperClassDemo {
    public static void main(String args[]){

        /* WrapperClass which is used to convert the primitive datatype into WrapperClassObjects.
            to convert primitive datatypes into objects autoboxing
            and reverse the autoboxing to unautoboxing the object to primitive datatypes ;

        */


        //Autoboxing
//        char ch ='a';
//
//        Character a = ch;
//
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        al.add(20);
//
//        System.out.println(al);

        //UnAutoboxing

        Character ch = 'a';
        char a = ch;
        System.out.println(a);
        if(ch instanceof Character){
            System.out.println("char value "+a);
        }
        else{
            System.out.println("NO"+a);
        }
        System.out.println(ch);

//        ArrayList<Integer> al = new ArrayList<Integer>();
//        al.add(10);
//        al.add(15);
//
//        System.out.println(al);
//        for(int i=0;i<10;i++){
//            al.add(i,al.get(i)+ al.get(i+1));
//        }
//        System.out.println(al);

    }
}
