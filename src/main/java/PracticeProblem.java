/**
 * Lesson: Problem Solving and Good Programming Style
 * Author: Naren Nades
 * Date Created: Mar 30, 2026
 * Date Last Modified: Mar 30, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String getFirstName(String name) {
		//Write question 1 code here
		String firstName = name.trim().substring(0, name.trim().indexOf(" "));
		return firstName;
	}

	public static String getLastName(String name) {
		//Write question 2 code here
		String lastName = name.trim().substring(name.trim().lastIndexOf(" ")+1);
		return lastName;
	}

	public static Boolean isValidName(String name) {
		//Write question 3 code here
		Boolean validName = name.trim().contains(" ") && name.trim().substring(0,name.trim().indexOf(" ")).length()>=2 && name.trim().substring(name.trim().lastIndexOf(" ")+1).length()>=2 && !name.trim().replaceFirst(" ", "").contains(" ");
		return validName;
	}
}
