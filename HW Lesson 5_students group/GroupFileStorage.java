package students;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class GroupFileStorage {

	public static void saveGroupToCSV(Group gr) {

		File groupFolder = new File("/Java_Start20221026_projects/OOP_Lesson5_HW_studentsGroup/GroupsCSV");
		File groupFile = new File(groupFolder, gr.getGroupName() + ".csv");
		CSVStringConverter csvConverter = new CSVStringConverter();
		String groupStringRepresentation = "";

		try {
			groupFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Student[] students = gr.getStudents();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				groupStringRepresentation += csvConverter.toStringRepresentation(students[i]) + System.lineSeparator();
			}
		}

		try (Writer writer = new PrintWriter(groupFile)) {
			writer.write(groupStringRepresentation);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Group loadGroupFromCSV(File file) {

		Group group = new Group(file.getName().substring(0, file.getName().lastIndexOf('.')));
		CSVStringConverter csvStringConverter = new CSVStringConverter();
		String studentStringRepresentation = "";

		try (Scanner scanner = new Scanner(file)) {
			for (; scanner.hasNextLine();) {
				studentStringRepresentation = scanner.nextLine();
				try {
					group.addStudent(csvStringConverter.fromStringRepresentation(studentStringRepresentation));
				} catch (GroupOverflowException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return group;

	}

	public static File findFileByGroupName(String groupName, File workFolder) {

		File[] files = workFolder.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(files[i].isFile() && files[i].getName().substring(0, files[i].getName().lastIndexOf('.')).equals(groupName)) {
				return files[i];
			}
		}
		return null;
	}
}
