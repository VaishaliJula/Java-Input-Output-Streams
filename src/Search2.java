import java.io.*;

public class Search2 {

  public static void main(String[] args) {
    String line;
    String filename;
    String pattern;

    if (args.length < 2) {
      System.err.println("Usage:  java Search2 {pattern} {file}");
      System.exit(-1);
    }
    pattern = args[0];
    filename = args[1];
    try{ 
      FileReader fin = new FileReader(filename);
      BufferedReader bufin = new BufferedReader( fin );
      try{
        while((line = bufin.readLine()) != null) {
          if(line.indexOf(pattern) >= 0) // matched!
            System.out.println(line);
        }
      }catch(IOException e){ 
        System.err.println("error reading from file"); 
        System.exit(-1);
      }
    } catch (FileNotFoundException e) { 
        System.err.println("missing data file"); 
        System.exit(-1);
    }
  }
}
