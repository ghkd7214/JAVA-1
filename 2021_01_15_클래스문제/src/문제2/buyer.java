package ����2;

public class buyer {
    int money = 1000;					//������ ���� ����, �ʵ�
    Product[] cart = new Product[3];	//�迭 ����
    int i = 0;
    
    void buy(Product p) {			// Ŭ���� Product ����
        if (money < p.price) {
            System.out.println("�ܾ��� �����Ͽ�" + p +
                    "��/�� ��� �����ϴ�.");
            return;
        }
        
        money = money - p.price;
        add(p);
        
    }
    
    void add(Product p) {
        if(i >= cart.length) {
            System.out.println("��ٱ��� ũ�Ⱑ �����Ͽ� ū �ٱ��Ϸ� ��ü �մϴ�.");
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
        
        System.out.println("������ ���� :"+itemList);
        System.out.println("����� �ݾ� :"+sum);
        System.out.println("���� �ݾ� :"+money);
        
    }
}





