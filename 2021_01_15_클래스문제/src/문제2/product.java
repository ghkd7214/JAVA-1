package ����2;

class Product {
    int price; 						//��ǰ�� ����
    Product(int price) {			//������
        this.price = price;
    }

    //!!!����Ʈ ������ ����!!!
}
class Tv extends Product {			//Tv Tv1 = new Tv();
    Tv() {						//�������̸� ������ ����Ʈ������ Ÿ��
        super(100);
    }
    
    @Override
    public String toString() {
        return "Tv";
    }
    
}


class Computer extends Product {
    Computer() {
        super(200);
    }
    
    public String toString() {
        return "Computer";
    }
    
}


class Audio extends Product {
    Audio() {
        super(50);
    }
    
    public String toString() {
        return "Audio";
    }
    
}

