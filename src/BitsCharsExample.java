import java.io.*;

public class BitsCharsExample {
	String name;
	int age;
	public BitsCharsExample(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void writeInBinary(OutputStream out) {
		DataOutputStream dout = new DataOutputStream(out);
		try {
			dout.writeChars(name);
			dout.writeInt(age);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
public void writeInCharacter(Writer out) {
		PrintWriter pw = new PrintWriter(out);
		pw.println(name);
		pw.println(age);
	}
	public static void main(String[] args) {
		BitsCharsExample vaishu = new BitsCharsExample("Vaishali",24);
		BitsCharsExample Moni = new BitsCharsExample("Mounika",24);
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("VaishaliData.dat");
			vaishu.writeInBinary(fout);
			Moni.writeInBinary(fout);

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}

		FileWriter fwrite;
		try {
			fwrite = new FileWriter("VaishaliData.txt");
			vaishu.writeInCharacter(fwrite);
			Moni.writeInCharacter(fwrite);


		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
