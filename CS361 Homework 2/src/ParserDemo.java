public class ParserDemo {

	public static void main(String[] args) {

		// TO COMPLETE
		// Change the path!
		//TokenStream tStream = new TokenStream("D:\\Git Repositories & Misc\\CS361\\KayParser\\CS361 Homework 2\\src\\prog3.kay");
		TokenStream tStream = new TokenStream("C:\\Users\\betsy\\Documents\\GitHub\\KayParser\\CS361 Homework 2\\src\\prog2.kay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");

	}

}