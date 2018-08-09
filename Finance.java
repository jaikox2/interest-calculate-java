
public class Finance {
	public double Money;
	public double Interest;
	public double Month;
	public double Year;
	public double InterestAll;
	
	public Finance(double money,double interest,double month) {
		this.Money=money;
		this.Interest=interest/100;
		this.Month=month;
		this.Year=month/12;
	}
	
	public double Interest() {
		return Money*Interest*Year;
	}
	
	public double PayMonth() {
		return Money/Month;
	}
	
	public double PayFinance() {
		this.InterestAll=Interest();           
		double InterestMonth=InterestAll/ Month;
			return PayMonth()+InterestMonth;
	}
	
	public void PrintFinance() {
		System.out.println("Pay / Month = "+PayFinance());
		System.out.println("InteresrAll = "+Interest());
	}
	
}
