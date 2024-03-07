import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Approach 1 -using FileReader and BufferedReader
		/*
		FileReader fr = new FileReader("E:\\JavaPRAC\\JavaProgramming\\FileToRead.txt"); 
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	 	*/
		
		File file = new File("E:\\JavaPRAC\\JavaProgramming\\FileToRead.txt");
		Scanner sc = new Scanner(file);
		
		//Approach -2 Using Scanner and File
		/*
		//loop statement
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		*/
		
		//Approach -3 using Built-in methods 
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
	}

}
