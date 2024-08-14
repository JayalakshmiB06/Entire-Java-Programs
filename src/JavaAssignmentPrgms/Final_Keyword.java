// Area of circumferece using Final Varible

package JavaAssignmentPrgms;

public class Final_Keyword
{
final double Pi = 3.14;

public static void main(String[] args) 
{
	int r =3;
	Final_Keyword F1= new Final_Keyword ();
	double Circumference =  2*F1.Pi*r;	
	double Area = F1.Pi*r*r;
	System.out.println(Circumference);
	System.out.println(Area);
}

}

// any variable that is final cannot change its value
// usually universal constant values are declared as final