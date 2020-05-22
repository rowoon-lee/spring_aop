package spring_aop03_befor_hw;

public class BankImple implements Bank{

	String name;
	int remain;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

	@Override
	public void transfter(int money) {
		System.out.println("계좌이체를 시작합니다.");
		System.out.println(name + " 계좌에서 " + money + "원 출금되었습니다.");
		if(remain > money) {
			remain -= money;
		}
		System.out.println("잔액 : " + remain + "원");
	}

}
