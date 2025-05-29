import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jp=new JSONParser();
		FileReader fr=new FileReader(".\\JsonFiles\\data.json");
		
		Object javaobj=jp.parse(fr);
		JSONObject jsobj=(JSONObject)javaobj;
		JSONArray jarray=(JSONArray)jsobj.get("userlogins");
		
		
		for(int i=0;i<jarray.size();i++) {
			
		JSONObject value=(JSONObject)jarray.get(i);
		String username= (String)value.get("username");
		String password= (String)value.get("password");
		
		
		System.out.println(username+"  "+password);
			
		}
		

	}

}
