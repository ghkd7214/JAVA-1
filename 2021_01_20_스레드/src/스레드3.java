
public class ������3 {

	public static void main(String[] args) {
		
		class Car {
			String carName;
		}
			
			
		class Truck extends Car implements Runnable{
			Truck (String carName){
				this.carName =carName;
			}
		
		
		
		@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(1);

						System.out.println(carName + "~~�޸��ϴ�");
					} catch (Exception e) {
					}
				}
			}
		}
		
		Truck car1 = new Truck("$�ڵ���1");
		Thread truck1 = new Thread(car1);
		truck1.start();

		Truck car2 = new Truck("@�ڵ���2");
		Thread truck2 = new Thread(car2);
		truck2.start();
		
		Truck car3 = new Truck("*�ڵ���3");
		Thread truck3 = new Thread(car3);
		truck3.start();
	}

}
