package WifiDiagnosis;

public class WifiDiagnosisDriver {

	public static void main(String[] args) {
		boolean value;
		value = WifiUtility.FirstStep();
		if(value) {
			System.out.println("Rebooting your computer seemed to work");
	System.exit(0);
		}
	else
		value = WifiUtility.SecondStep();

		if(value) {
			System.out.println("Rebooting your router seemed to work");
			System.exit(0);
		}
		else
			value = WifiUtility.ThirdStep();

		if(value) {
			System.out.println("Checking the router's cables seemed to work");
			System.exit(0);
		}
		else
			value = WifiUtility.FourthStep();
		if(value) {
			System.out.println("Going closer to the router seemed to work");
			System.exit(0);
		}
		if(!value)
			WifiUtility.FifthStep();

		

	    
	}
}
