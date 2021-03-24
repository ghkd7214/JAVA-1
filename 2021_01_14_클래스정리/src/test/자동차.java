package test;


interface 자동차 {
	void 동작한다();
	
}


interface 대포 {
	void 발사한다();
	
}


class 탱크 implements  자동차, 대포{			//다중상속을 지원하지않는 자바에서 다중상속을 받기위한 interface / implements
	
	@Override
	public void 동작한다() {
		System.out.println("탱크가 굴러갑니다.");
	}

	@Override
	public void 발사한다() {
		System.out.println("탱크가 포를 발사합니다.");
	}
	
	
}

