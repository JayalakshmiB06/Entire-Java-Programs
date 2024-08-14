package JavaAssignmentPrgms;

public class DeclarationAndInitialization {

public static void main(String[] args) 
	{
		byte age;  //Declartion
		age = 25;  //Initialuzation
		short CVV = 769; // Declaration and Initialization in single line
		int OTP = 321576;
		double Pincode = 508207;
		double Bank_Balance = 10000.58;
		float pi = 3.14f;
		char Gender = 'F';
		boolean SendUpdatesToEmail = true;
		String email = "jaya.06@gmail.com";
		String Phnno = "9780564231";
		
		System.out.println(age + " "+CVV + " "+OTP+" "+ Pincode  +" " +pi + " " +Gender  +" " +email +" "+ Phnno);
		System.out.println(Bank_Balance);
		System.out.println(SendUpdatesToEmail);
	}

}


// String is not a keyword, String is class and it should start with capital S
// all the other datatypes are keywords and should be written in small letters
// Double can store upto 17 digits after decimal ponit
// Float can only store upto 7 digits after decimal point