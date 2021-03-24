package 문제2;

public class buyer {
    int money = 1000;					//정수형 변수 선언, 필드
    Product[] cart = new Product[3];	//배열 선언
    int i = 0;
    
    void buy(Product p) {			// 클래스 Product 맞음
        if (money < p.price) {
            System.out.println("잔액이 부족하여" + p +
                    "을/를 살수 없습니다.");
            return;
        }
        
        money = money - p.price;
        add(p);
        
    }
    
    void add(Product p) {
        if(i >= cart.length) {
            System.out.println("장바구니 크기가 부족하여 큰 바구니로 교체 합니다.");
            Product[] tmp = new Product[cart.length*2];
            System.arraycopy(cart,0,tmp,0,cart.length);
            cart = tmp;
        }
        
        cart[i++]=p;
        
    }
    
    void summary() {
        String itemList = "";
        int sum = 0;
        
        for(int i=0; i < cart.length;i++) {
            if(cart[i]==null)
                break;
            itemList =itemList + cart[i];
            sum += cart[i].price;
        }
        
        System.out.println("구입한 물건 :"+itemList);
        System.out.println("사용한 금액 :"+sum);
        System.out.println("남은 금액 :"+money);
        
    }
}





