
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// Oh! This needs to be changed !
	private static String file1 = "D:\\Git Repositories & Misc\\CS361\\KayParser\\CS361 Homework 2\\src\\prog1.kay";
	//private static String file1 = "C:\\Users\\betsy\\Documents\\GitHub\\KayParser\\CS361 Homework 2\\src\\prog1.kay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);

		Token tk;

		while (!ts.isEndofFile()) {
			// TO BE COMPLETED
			tk = ts.nextToken();
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
