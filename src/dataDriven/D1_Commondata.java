package dataDriven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class D1_Commondata {
     public static void main(String[] args) throws IOException {
    	 FileInputStream fiFs =new FileInputStream("./Testdata/Commondata.property.txt");
    	 Properties p=new Properties();
    	 p.load(fiFs);
    	 String data = p.getProperty("url");
    	 System.out.println(data);
    	 
    	 
	
}
}
