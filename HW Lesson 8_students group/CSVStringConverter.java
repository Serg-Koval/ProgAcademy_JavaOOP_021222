package students;

public class CSVStringConverter implements StringConverter {

	@Override
	public String toStringRepresentation(Student student) {

		return student.getLastName() + "," + student.getName() + "," + student.getGender() + ","
				+ student.getGroupName() + "," + student.getId();
	}

	@Override
	public Student fromStringRepresentation(String str) {

		String[] arrayWithStudentData = str.split("[,]");

		Student student = new Student();
		student.setLastName(arrayWithStudentData[0]);
		student.setName(arrayWithStudentData[1]);

		if (arrayWithStudentData[2].equals("MALE")) {
			student.setGender(Gender.MALE);
		}
		if (arrayWithStudentData[2].equals("FEMALE")) {
			student.setGender(Gender.FEMALE);
		}

		student.setGroupName(arrayWithStudentData[3]);

		student.setId(Integer.valueOf(arrayWithStudentData[4]));

		return student;
	}

}
