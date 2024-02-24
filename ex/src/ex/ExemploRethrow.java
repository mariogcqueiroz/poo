package ex;
import Exceptions.ExemploExc;
public class ExemploRethrow {
	 
		public static void main(String[] args){
		try {
			testExc(); 
			}
	    catch (ExemploExc e) {System.out.println("Tratamento 3"); }
	  }

	  static void testExc() throws ExemploExc{
		  try {
	         try { throw new ExemploExc(); }
	         	catch (ExemploExc e)
	             { System.out.println("Tratamento 1");
	               throw new ExemploExc(); } 
	             }
	    catch (ExemploExc e) 
	        { System.out.println("Tratamento 2");
	          throw new ExemploExc(); }
	  
	  }
	}
		

