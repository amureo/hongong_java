package sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample{
	public static void main(String[] args) throws Exception{
		String filePath="src/sec02/verify/exam02/AddLineNumberExample.java";
		FileReader fr=new FileReader(filePath);
		BufferedReader br=new BufferedReader(fr);
		int line=1;
		while(true) {
			String data=br.readLine();
			if(data==null) break;
			System.out.println(line++ +": "+ data);
		}
		br.close();
	}
}