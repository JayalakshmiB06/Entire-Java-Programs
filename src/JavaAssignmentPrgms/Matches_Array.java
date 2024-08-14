package JavaAssignmentPrgms;

public class Matches_Array {

	public static void main(String[] args) {
		String Name ="jaya Laskshmi Bogavelly";
		System.out.println(Name.matches("j(.*)"));
		System.out.println(Name.matches("(.*)a"));
		System.out.println(Name.matches("...."));
		System.out.println(Name.indexOf('a'));
		System.out.println(Name.lastIndexOf('a'));
		
	}
}
