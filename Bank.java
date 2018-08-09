import java.text.DecimalFormat;

public class Bank extends Finance{
		public double InterestMonth;
		public double MoneyFirst;
		public double Interestall;
	public Bank(float m, float s, float th) {
		super(m, s, th);
		this.MoneyFirst=m;
	}
	
	public double Interest() {
		this.InterestMonth=MoneyFirst*Interest/12;
		MoneyFirst=MoneyFirst-PayMonth();
		return InterestMonth;
	}
	
	public double PayBank() {
		double interestBank=Interest();
		this.Interestall=Interestall+interestBank;
		return PayMonth()+interestBank;
	}
	
	public void printBank() {
		int i;
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.00");
		for(i=1;i<=Month;i++) {
		System.out.println("Month "+i+" FirstMoney= "+(df.format(MoneyFirst))+" Pay/Month= "+df.format(PayBank())+" Interest/Month= "+df.format(InterestMonth));
		}
		System.out.println("INTEREST ALL = "+Interestall);
	}
}
