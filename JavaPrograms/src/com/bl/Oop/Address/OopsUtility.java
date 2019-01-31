package com.bl.Oop.Address;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class OopsUtility {

	//Object Mapper
		private static ObjectMapper mapper;
		
		static
		{
			mapper=new ObjectMapper();
		}
		
		
		public static String convertJavaToJson(Object object)
		{	String jsonResult=" ";
			try
			{   
			    jsonResult= mapper.writeValueAsString(object);
			}
			catch(JsonGenerationException e)
			{
				System.out.println("exception ocur wile converting java to json");
			} 
			catch (JsonMappingException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jsonResult;
		}
		
		@JsonDeserialize
		public static <T> T convertJsonToJava(String jsonString,Class<T> cls)
		{	
			T result=null;
		
			    try
			    {
					result= mapper.readValue(jsonString, cls);
				} 
			    catch(JsonGenerationException e)
				{
					System.out.println("1exception ocur wile converting json to java  ");
				} 
				catch (JsonMappingException e) 
				{
					System.out.println("2exception ocur wile converting json to java  ");
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				catch (IOException e) 
				{
					System.out.println("3exception ocur wile converting json to java  ");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return result;
		}	
		
		//q5 to add customer
		public static void filewrite(String s,String path) throws IOException
		{
			FileOutputStream fils=null;
			//FileOutputStream will throw exception---so surrounding try catch
			
			try
			{
				fils=new FileOutputStream(path);
				
				//convert string to byte
				//as FileOutputStream support byte by byte input
				//so here we convert string to byte and create 1 byte array
				byte b[]=s.getBytes();
				
				//now we pass the byte array
				fils.write(b);
				
			System.out.println("written successfuly");
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				fils.close();
			}
		}
}
