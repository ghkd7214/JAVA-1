package ����2;


public class test {

    public static void main(String args[]){


        buyer b = new buyer();
        b.buy(new Tv()); //������ (�� ĳ����)
        //Product p = new Tv();
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();



    }

}
