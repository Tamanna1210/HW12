package HW12;

public class GetGrade {
	/*
	 * Create class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score >80 -
	 * B score >70 - C score > 50 - D anything else - F
	 */

	char grade(int score) {
		
		char studentGrade;
		
		if (score > 90) {
			studentGrade = 'A';

		}else if (score > 80 && score < 90) {
			studentGrade = 'B';
			
		} else if (score > 70 && score < 80) {
			studentGrade = 'C';

		} else if (score > 50 && score < 70) {
			studentGrade = 'D';
			
		} else {
			studentGrade='F';
		}

		return studentGrade;

	}

	public static void main(String[] args) {
		GetGrade value = new GetGrade();
		// char gradeValue=value.grade(100);
		System.out.println(value.grade(100));
	}
}
