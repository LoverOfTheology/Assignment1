package WifiDiagnosis;

import java.util.Scanner;

	public class WifiUtility {
		static Scanner s = new Scanner(System.in);
		static String success = "yes";
		static String firstAns;
		static String secondAns;
		static String thirdAns;
		static String fourthAns;
		//static boolean done = true;
		//static int wrong = -99;
		public static boolean FirstStep(){
			System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
			System.out.println("First step: reboot your computer");
			System.out.println("Are you able to connect with the internet? (yes or no)");
			firstAns =  s.nextLine();
			if(firstAns.equalsIgnoreCase(success)) {
				return true;
			}
			else
				return false;
			
		}
		public static boolean SecondStep() {
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			secondAns = s.nextLine();
			if(secondAns.equalsIgnoreCase(success)) {
				return true;
			}
			else
				return false;
		}
		public static boolean ThirdStep() {
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power"); 
		    System.out.println("Now are you able to connect with the internet? (yes or no)");
		    thirdAns = s.nextLine();
		    if(thirdAns.equalsIgnoreCase(success)) {
				return true;
			}
			else
				return false;
		}
		public static boolean FourthStep() {
			System.out.println("Fourth step: move your computer closer to your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			fourthAns = s.nextLine();
			  if(fourthAns.equalsIgnoreCase(success)) {
					return true;
				}
				else
					return false;
			}
		public static void FifthStep() {
			System.out.println("Fift Step: Contact your ISP");
			System.out.println("Make sure your ISP is hooked up to your router");
		}
	}
