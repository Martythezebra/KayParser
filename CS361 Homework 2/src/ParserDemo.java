public class ParserDemo {

	public static void main(String[] args) {

		// TO COMPLETE
		// Change the path!
		TokenStream tStream = new TokenStream("D:\\Git Repositories & Misc\\CS361\\KayParser\\CS361 Homework 2\\src\\prog1.kay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");

	}

}