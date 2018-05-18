import java.io.*;
public class Search {

	public static void main(String[] args) {
		String line;
		try {
			FileReader FR = new FileReader("VaishaliData.dat");
			BufferedReader Br = new BufferedReader(FR);
			while((line = Br.readLine()) != null) {
				if(line.indexOf("Mou")>=0) {
					System.out.println(line);
				}
			}
			Br.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
