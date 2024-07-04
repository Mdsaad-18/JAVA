public class GooglePayRunner{

	public static void main(String args[]){
	
		GooglePay.accountValid();
		GooglePay.amountTransact(10000,"TAUFIQ_RAZA");
		GooglePay.amountReceived();
		double[] historyOfTranscation={100.0,15.0,255.0,236,50000};
		GooglePay.transactionHistory(6767,historyOfTranscation);
	
	
	}

}