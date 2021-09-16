
public class PhonePay {
	public static void transferMoney() {
		System.out.println("Money Transfered Successfully");
	}

	public static void rechargeMobile() {
		System.out.println("Mobile recharge successfully");
	}

	public static void electricityBills() {
		System.out.println("Electricity bill paid");
	}

	public static void rechargeDTH() {
		System.out.println("DTH recharge Done");
	}

	public static void main(String[] args) {

		System.out.println("Login in to PhonePay");
		PhonePay.transferMoney();
		PhonePay.rechargeMobile();
		PhonePay.electricityBills();
		PhonePay.rechargeDTH();
		System.out.println("Lock Mobile");

	}

}
