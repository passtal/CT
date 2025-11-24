package 알로하자바미션.Ex14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentScore implements Comparable<StudentScore>{
	
	private int id;
	private String name;
	private int score;
	private String subject;

	public StudentScore(int id, String name, int score, String subject) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public int compareTo(StudentScore o) {
		if (this.score != o.score) {
			return o.score - this.score;
		} 
		else {
			return this.id - o.id;
		}
	}

	@Override
	public String toString() {
		return String.format("%-4d %-8s %-4d %s", id, name, score, subject);
	}
	
	public static class ScoreBoard {

		private static final String FILE_NAME = "student.txt";

	    private static List<StudentScore> loadStudentsFromFile(String fileName) {
	        List<StudentScore> students = new ArrayList<>();
	        List<String> fileContent = new ArrayList<>();
	        
	        try {
	            fileContent = Files.readAllLines(Paths.get(fileName));
	        } catch (IOException e) {
	            e.printStackTrace();
	            return students;
	        }
	        // gpt 의 도움..
	        for (String line : fileContent) {
	            String[] parts = line.split("/");
	            if (parts.length == 4) {
	                try {
	                    int id = Integer.parseInt(parts[0]);
	                    String name = parts[1];
	                    int score = Integer.parseInt(parts[2]);
	                    String subject = parts[3];
	                    students.add(new StudentScore(id, name, score, subject));
	                } catch (NumberFormatException e) {
	                }
	            } 
	        }
	        return students;
	    }
	    // gpt 의 도움 끝
	    
	    private static void printResults(List<StudentScore> students) {
	        System.out.println("번호  이름       성적    반");
	        
	        for (StudentScore s : students) {
	            System.out.println(s); 
	        }
	    }
		
		public static void main(String[] args) {
	        List<StudentScore> students = loadStudentsFromFile(FILE_NAME);

	        if (students.isEmpty()) {
	            return;
	        }

	        Collections.sort(students); 

	        printResults(students);
	    }
	}
}