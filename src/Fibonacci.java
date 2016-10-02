public class Fibonacci {
	public static void main(String[] args){
		System.out.println("0");
		System.out.println("1");
		for (int i=0;i<45;i++){
			nextNum();
		}
	}
	static int num1 = 0;
	static int num2 = 1;
	public static void nextNum(){
			int newnum = num1+num2;
			num1 = num2;
			num2 = newnum;
			System.out.println(newnum);
		}
		
}
