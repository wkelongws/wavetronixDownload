import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.Document;


public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String line = "\"1,979 - IL 92 EB @ Ramp I-280 - SS1979\",APS,6/24/2015   9:57:42PM,1,0,SLOW TRAFFIC I-280 NB,,TransSuiteAPS,6/24/2015   9:58:43PM";
		
		// Split the edge into two nodes 
		String[] nodes = line.split(",");
		String Device = nodes[0];
		String starttime = nodes[2];
		String Message1 = nodes[5];
		String Message2 = nodes[6];
		String stoptime = nodes[8];
		
		String Device_name = Device.replaceAll("\"", "");
		System.out.println(line);
	}

}
