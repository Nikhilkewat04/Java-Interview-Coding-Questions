import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("E:\\JavaPRAC\\JavaProgramming\\FileToWrite.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Fullstack Java");
		bw.write("Automation Testing");
		bw.write("Data Science");
		
		System.out.println("FINISHED!!!!!");
		bw.close();
	}

}
