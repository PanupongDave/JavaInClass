public class testStack{
	public static void main(String[] args){
		Stack st = new Stack(2);

		boolean x = st.push(5);
		boolean y = st.push(6);
		st.pop();
		
		boolean check = st.isEmpty();
		

		System.out.println("Check isEmpty " + check);
	}
}