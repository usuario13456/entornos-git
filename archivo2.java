package comando_git;

public class archivo2 {

	private int a1;
	private int b1;
	private int ans1;
	
	public archivo2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public archivo2(int a1, int b1, int ans1) {
		super();
		this.a1 = a1;
		this.b1 = b1;
		this.ans1 = ans1;
	}

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public int getB1() {
		return b1;
	}

	public void setB1(int b1) {
		this.b1 = b1;
	}

	public int getAns1() {
		return ans1;
	}

	public void setAns1(int ans1) {
		this.ans1 = ans1;
	}
	
	public int producto() {
		
		return a1*b1;
	}
	public int division() {
		
		return a1/b1;
	}
	public int aAlCubo() {
		
		return a1*a1*a1;
	}
	public int bAlCubo() {
		
		return b1*b1*b1;
	}

}
