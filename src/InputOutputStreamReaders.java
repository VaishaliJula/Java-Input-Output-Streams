import java.io.*;

public class InputOutputStreamReaders {
	private String name;
	private int age;
	//This program takes input bit/streams data from keyboard and converts it to the character readers
	InputOutputStreamReaders(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "hey!!!"+name + " is " + age+"years old";
	}
	public static void main(String[] args) {
		String name = null;
		int age = 0;
//Taking the input through InoutStreamReader
		try {
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader brinput = new BufferedReader(input);
			System.out.println("Hey what is your name?");
			name = brinput.readLine();
			System.out.println("And How old are you?");
			age = Integer.parseInt(brinput.readLine());
			brinput.close();
		}catch(IOException e){System.err.println(e.getMessage());}
		InputOutputStreamReaders IOobject = new InputOutputStreamReaders(name,age);
		System.out.println(IOobject);
	}

}
