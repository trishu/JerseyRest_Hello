import java.util.concurrent.CopyOnWriteArrayList;


public class DeleteConsecutiveWord {
	
	public static void main(String[] args) {
		
		//String s = "trishu bhawani sunil sunil bhawani";
		String s = "tom je je tom";
		String[] sArray = s.split(" ");
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(sArray);
		System.out.println("Before list "+list);
		
		for(int i=0; i<list.size() ; i++){
			if(list.size()>1 && list.get(i).equals(list.get(i+1))){
				list.remove(list.get(i));
				list.remove(list.get(i));
				i= i-2;
			}
		}
		
		System.out.println("list "+list);
		
	}
}
