
public class 스레드3 {

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

						System.out.println(carName + "~~달립니다");
					} catch (Exception e) {
					}
				}
			}
		}
		
		Truck car1 = new Truck("$자동차1");
		Thread truck1 = new Thread(car1);
		truck1.start();

		Truck car2 = new Truck("@자동차2");
		Thread truck2 = new Thread(car2);
		truck2.start();
		
		Truck car3 = new Truck("*자동차3");
		Thread truck3 = new Thread(car3);
		truck3.start();
	}

}
