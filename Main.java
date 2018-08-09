import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		float m=0,s=0,th=0;
		String money,Inter,month,select;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Loan Money");
			money = br.readLine();
			m=Float.parseFloat(money);
			System.out.println("Interest/year");
			Inter = br.readLine();
			s=Float.parseFloat(Inter);
			System.out.println("Month of loan");
			month = br.readLine();
			th=Float.parseFloat(month);
			System.out.println(" 1 = select Finance and 2 = select Bank ");
			select = br.readLine();
			i=Integer.parseInt(select);
			if(i == 1) {
				Finance c = new Finance(m,s,th);
				c.PrintFinance();
			}else if(i == 2 ) {
				Bank p = new Bank(m,s,th);
				p.printBank();
			}else {
				System.out.println("Error");
			}
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}

}
