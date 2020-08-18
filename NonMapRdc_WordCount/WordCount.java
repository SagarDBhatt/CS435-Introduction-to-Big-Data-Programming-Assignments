package WordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	

		WordCount wc = new WordCount();
		wc.readFile();
		
		
	}//End of main
	
	public static void readFile() throws IOException {
		
		FileReader fread = new FileReader(new File("input.txt"));
		BufferedReader bread = new BufferedReader(fread);
		
		HashMap<String, Integer> hsmp = new HashMap<String, Integer>();
		
		String lnRead;
		int temp;
		
		while((lnRead = bread.readLine())!=null)
		{
			String[] wRead = lnRead.split(" ");
			
			for (int i=0; i< wRead.length; i++)
			{
			
				if (hsmp.size()>0)
				{
					
					if (hsmp.containsKey(wRead[i]))
					{
						temp = hsmp.get(wRead[i]);
					}
					else
					{
						temp=0;
					}
					
					if (temp == 0)
					{
						hsmp.put(wRead[i], 1);
					}
					else
					{
						hsmp.put(wRead[i], temp+1);
					}
				}//end of main if
				
				else
				{
					hsmp.put(wRead[i], 1);
				}
			}//End of For loop

			for(String key: hsmp.keySet())
			{
				String value = hsmp.get(key).toString();
				System.out.println(key + " " + value);
			}
			
		}//End of While loop
		
		fread.close();
		
	}//End of method
}//End of Class
