package 문제2;

class Product {
    int price; 						//제품의 가격
    Product(int price) {			//생성자
        this.price = price;
    }

    //!!!디폴트 생성자 없음!!!
}
class Tv extends Product {			//Tv Tv1 = new Tv();
    Tv() {						//생성자이며 구조는 디폴트생성자 타입
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

