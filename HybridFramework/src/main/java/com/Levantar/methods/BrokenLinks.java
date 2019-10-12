package com.Levantar.methods;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Levantar.generic.Elements;

public class BrokenLinks extends Elements{
	
	
	public void brokenLinksManage(WebDriver driver,String object)
	{
		 List<WebElement> elements = ComMethods.listWeb( driver,object);
		 
		 ArrayList<String> ls = new ArrayList<String>();
		 
		 for (int i=0;i<elements.size();i++)
		 {
			 String link = elements.get(i).getAttribute("href");
			 if(link!=null)
			 {
				 ls.add(link);
			 }
		 }
		 
		 for(int i=0;i<ls.size();i++)
		 {
			 String link = ls.get(i);
			 
			 try {
			 URL u=new URL(link);
			 URLConnection ulink = u.openConnection();
			 HttpURLConnection connection = (HttpURLConnection)ulink;
			 int rcode = connection.getResponseCode();
			 
			 if(rcode==200)
				{
					System.out.println(rcode);
					System.out.println(connection.getResponseMessage());
					System.out.println("link is not broken");
				}
				else
				{
					System.out.println(rcode);
					System.out.println(connection.getResponseMessage());
					System.out.println("link is broken");
				
				}
			 
			 }
			 catch(Exception e)
			 {
				 
			 }
		 }
	}

}
