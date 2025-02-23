import java.util.Scanner;
public class test {
  public static void main(String[] args) {
  Scanner InputStream = new Scanner(System.in);
  if (!InputStream.hasNextInt()){
    String searchString = InputStream.nextLine();
    System.out.println("Invalid parameters: expected search parameters, found " + searchString );
    }


  }
}
