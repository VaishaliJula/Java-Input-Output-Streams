import java.io.*;

public class Order {

	int cusID;
	String cusName;
	public Order(int ID,String name){
		cusID = ID;
		cusName = name;
	}
	public void writeText(Writer wout) {
		PrintWriter PW = new PrintWriter(wout);
		PW.println(cusName);
		PW.write(cusID);
	}
	public void writeBinary(OutputStream out) {
		DataOutputStream dout = new DataOutputStream(out);
		try {
			dout.writeInt(cusID);
			dout.writeChars(cusName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Order VaishaliData = new Order(1,"Vaishali");
		FileOutputStream FSObject = null;
		FileWriter FWObject = null;
		try {
			FSObject = new FileOutputStream("Order.dat");
			VaishaliData.writeBinary(FSObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FWObject = new FileWriter("Order.txt");
			VaishaliData.writeText(FWObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
