package a;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Study {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 때까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */
		
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd");
		String now = sdf.format(date);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명>");
		String name = scan.next();
		
		String filepath = "C:\\Users\\user\\Desktop\\course\\Java\\file\\" + now + "file";
		String path = filepath + "\\" + name + ".txt" ;
			
		File file = new File(filepath);
		file.mkdir();
			
			
			
			
			
			
			
		
		
		
		
	}
  
}
