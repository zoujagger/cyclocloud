package com.cyclobox.cloud;

import com.mathworks.toolbox.javabuilder.MWArray;
//import com.mathworks.extern.java.MWArray;
import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWNumericArray;
import makesqr.Class1;



public class GetMagic {
	MWNumericArray n = null;
	Object[] result = null;
	Class1 theMagic = null;
	
	public  void testTraitement(int a)
	   {
	      
	      try
	      {
	         n = new MWNumericArray(Double.valueOf(a),
	                                      MWClassID.DOUBLE);

	         theMagic = new Class1();
	         result = new Object[1];

	         result[0] = theMagic.makesqr(1, n);
	         System.out.println(result[0]);
	      }
	      catch (Exception e)
	      {
	         System.out.println("Exception: " + e.toString());
	      }
	      finally
	      {
	    	  MWArray.disposeArray(n);
	    	  MWArray.disposeArray(result);
	          theMagic.dispose();
	      }
	   }

}