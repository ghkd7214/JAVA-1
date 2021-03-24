
public class 가전 {

	int 가격;
	String 제조사;
	String 종류;
	int 품질보증기간;
	String 크기;
	boolean 전원;

	public void 끄다() {
		전원 = false;
	}

	public void 켜다() {
		전원 = true;
	}

	public void 메뉴실행() {
		if (전원) {
			System.out.println("메뉴를 실행합니다.");
		} else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

}
