package quiz15;

public class MyBag implements IBag{

	private String[] arr = new String[100];
	private int n = 0;
	//private int index; -t
	
	@Override
	public void insert(String item) {
		arr[n] = item;
		n++;
	}

	@Override
	public void print() {
		for(int i = 0; i < n; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	@Override
	public int search(String item) {
		
		for(int i = 0; i <= n; i++) {
			if(arr[i].equals(item)) {
				return i;
			} 
		}
		return -1; //없는 경우
	}

	@Override
	public boolean delete(String item) {
	
		if(item == null) return false;
		
		for(int i = 0; i < n; i++) {
			if(arr[i].equals(item)) {
				for(int j = i; j < n - 1; j++) {
					arr[j] = arr[j+1];
				}
				arr[n-1] = null;
				n--;
				return true;
			} 
		}
		return false;
	}

}
