package streamapitwo;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		ProgrammingLanguage lang1 = new ProgrammingLanguage("Haskell", DifficultyLevel.HARD);
		ProgrammingLanguage lang2 = new ProgrammingLanguage("Python", DifficultyLevel.EASY);
		ProgrammingLanguage lang3 = new ProgrammingLanguage("Java", DifficultyLevel.MEDIUM);
		ProgrammingLanguage lang4 = new ProgrammingLanguage("C++", DifficultyLevel.HARD);
		ProgrammingLanguage lang5 = new ProgrammingLanguage("JS", DifficultyLevel.EASY);
		
		List<ProgrammingLanguage> languages = List.of(lang1, lang2, lang3, lang4, lang5);
		
		String skill = "MEDIUM";

		System.out.println(languages.stream()
			.filter(a -> a.getComplexity().toString().equals(skill.toUpperCase()))
			.findAny().get());
	}

}
