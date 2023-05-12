package a;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainClass {

	public static void main(String[] args) {
		//파일읽기
		String path = "C:\\Users\\user\\Desktop\\course\\Java\\file\\20230508file\\12.txt";
		
		try {
			InputStream is = new FileInputStream(path);
			
			//2. 배열 읽기
			byte[] arr = new byte[100];
			int a = is.read(arr);
			System.out.println(a);
			//읽어들인 크기 반환
			//더 읽을 값 없으면 -1 반환
			int i = 0;
			while(true) {
				if(arr[i] == 0) break;
				System.out.println( (char)arr[i] ); 
				i++;
			}
					
			
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
}
