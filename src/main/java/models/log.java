package models;

import java.io.FileWriter;
import java.io.IOException;
import java.security.Timestamp;

public class log {
	public log(int failure, int error) {
		super();
		this.failure = failure;
		this.error = error;
	}
	 
	public log() {
			super();
	}
	public int failure = 0;
	public int error = 0;
	
	
	public static void writeLog(String str) {
		FileWriter writer = null;
		try{
		     writer = new FileWriter("Log.csv", true);
		     writer.write(str,0,str.length());
		}catch(IOException ex){
		    ex.printStackTrace();
		}finally{
		  if(writer != null){
		     try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }
		}
	}
	
	public static void writeLogMutation(String str) {
		FileWriter writer = null;
		try{
		     writer = new FileWriter("LogMutation.csv", true);
		     writer.write(str,0,str.length());
		}catch(IOException ex){
		    ex.printStackTrace();
		}finally{
		  if(writer != null){
		     try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }
		}
	}
	
	public static long getCurrentTimeStamp() {
		java.util.Date date= new java.util.Date();
		return date.getTime();
	}
}
