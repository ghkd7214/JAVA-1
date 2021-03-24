package pack1;

import pack2.car;

public class sedan extends car {		//다른 패키지에 있는 car를 상속받으려면 import를 해야함 //pack2의 car를 상속받는 중

}

class sedan2 extends pack1.car{			//그런데 import 를 헸는데 extends car 해버리면 본래 같은패키지에 있는 car가 상속되지않고 
										//pack2가 기본으로 상속되니 앞에 패키지 이름인 pack1.car를 써줘야함
										//그러니 되도록 import 하지말고 패키지이름을 쓰도록 하자 
}