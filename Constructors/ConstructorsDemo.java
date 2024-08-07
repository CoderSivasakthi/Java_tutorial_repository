package Constructors;

class Account{
    private String name;
    private int number;
    public Account(String n){ /*This field is called Constructor*/
        this.name=n;
    }

    /* Constructor overrideing is possible */

    public Account(int num, String n){/*This field is called Constructor*/
        this.name = n;/* in this this. keyword refers to the current object in a method or constructor */
        this.number = num;
    }

    public int getNumber(){/*This field is called Method*/
        return number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {/*This field is called Method*/
        this.name = name;
    }
}

public class ConstructorsDemo {
    public static void main(String args[]){
        Account acc1 = new Account("Siva");
        System.out.println(acc1.getName());
        acc1.setName("Mukesh");
        System.out.println(acc1.getName());
        Account acc2 = new Account(254,"siva");
        System.out.println(acc2.getNumber());
        System.out.println(acc2.getName());
    }
}
