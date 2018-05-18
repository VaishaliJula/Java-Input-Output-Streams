import java.io.*;
public class SimpleFileExample {
	public static void main(String[] args) {
		 BufferedReader finput = null;
		 String line;
		 int count = 0;
        //this program reads input from a file and displays the lines in it
		try {
			 finput = new BufferedReader(new FileReader("testing.txt"));
			 while((line = finput.readLine())!= null) {
//					System.out.println("\n"+line);
					if(++count % 5 == 0) {
						System.out.println("\n"+line);
					}
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
