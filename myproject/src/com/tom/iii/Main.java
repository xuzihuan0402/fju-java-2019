package com.tom.iii;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws Exception{
		
	        PrintWriterer out = null;
	        try {
	            FileWriterriter fw = new FileWriter("result.txt");
	            out = new PrintWriter(fw);
	            out.write("®}±ê®Ù");
	            out.flush();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if (out != null) {
	                out.close();
	            }
	        }




	        /*try {
	            FileWriter out = new FileWriter("result.txt");
	            out.write("JAVA ®}±ê®Ù");
	            out.flush();
	            out.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }*/





	       /* FileOutputStream fos = null;
	        OutputStreamWriter ows = null;
	        try {
	            fos = new FileOutputStream("dd.txt");
	            OutputStreamWriter osw = null;
	            try {
	                osw = new OutputStreamWriter(fos, "UTF-8");
	            } catch (UnsupportedEncodingException e) {
	                e.printStackTrace();
	            }
	            osw.write("JAVA ®}±ê®Ù");
	            osw.flush();
	            osw.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }*/







	        /*FileOutputStream fos = new FileOutputStream("dd.txt");
	        fos.write(100);
	        fos.write(66);
	        fos.flush();
	        fos.close();*/
	    }

	}

}
