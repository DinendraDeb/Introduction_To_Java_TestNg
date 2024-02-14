
public class Java_Basics_3 {

	public static void main(String[] args) {
		String name = "Selenium is a testing tool";
		//to trim on the basis of blank spaces
		String[] splittedstring = name.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		System.out.println(splittedstring[3]);
		//to split on the basis of delimiter as characters
		String [] split = name .split("is a testing");
		System.out.println(split[0]);
		System.out.println(split[1]);
		//to trim the blank spaces from both left and right side
		System.out.println(split[0].trim());
		System.out.println(split[1].trim());
		// to print char one by one
		for (int i = 0 ; i < name.length(); i++)
		{
			System.out.println(name.charAt(i));
		}
		//to reverse a string
		for (int i =  name.length()-1; i >= 0; i--)
		{
			System.out.println(name.charAt(i));
		}

	}

}
