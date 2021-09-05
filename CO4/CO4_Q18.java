import java.util.*;
public class CO4_Q18 
{
	public static void main(String[] args) 
	{
		Map<String,String> map=new HashMap<>();
	      map.put("1","mummy");
		  map.put("2","pappa");
		  map.put("3","sreerag");
		  map.put("4","sreelekshmi");
	      
	      System.out.println("HashMap:"+map);
	      Map<String, String> treeMap = new TreeMap<>();
	      treeMap.putAll(map);
	      System.out.println("\nTreeMap:"+treeMap);
	}

}