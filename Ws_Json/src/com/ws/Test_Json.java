package com.ws;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import com.google.gson.Gson;

public class Test_Json {

	public static void main(String[] args) {
		Test_Json.Post_JSON();
		}
	public static void Post_JSON() {
        try {
        	  String url = "http://tawdi7atnet.com/api/api.json";
        	  URL obj = new URL(url);
        	  System.out.println(obj);
        	  //Properties properties = System.getProperties();
        	  //properties.setProperty("http.proxyHos", "isp-ceg.emea.cegedim.grp");
        	  //properties.setProperty("http.proxyPort", "3131");
        	  //System.out.println(System.getProperties());
        	  HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        	  System.out.println(con);
        	  con.setRequestMethod("POST");
        	  int responseCode = con.getResponseCode();
        	  System.out.println("\nSending 'GET' request to URL : " + url);
        	  System.out.println("Response Code : " + responseCode);
     
        	  BufferedReader in =new BufferedReader(new InputStreamReader(con.getInputStream()));
			  String inputLine;
			  StringBuffer response = new StringBuffer();
			   while ((inputLine = in.readLine()) != null) {
			     response.append(inputLine);
			   } 
			   in .close();
			   //print in String
			    System.out.println(response.toString());
			    /*
			   JSONObject myresponse = new JSONObject(response.toString());
			   System.out.println(myresponse);
			   */
			    Gson json = new Gson();
			    System.out.println(json.toJson(response));
			   con.disconnect();
        }catch(Exception e) {
        	  System.out.println(e);
        }
	}
}

