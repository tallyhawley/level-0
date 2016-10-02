import javax.swing.JOptionPane;

public class primeOrNot {
	public static void main(String[] args){
	}
	public static void primeOrNot(int num){
		String ans = JOptionPane.showInputDialog("enter a number");
		num = Integer.parseInt(ans);
		if (num <= 1){
			System.out.println("not prime");
		}
		else if(num == 2){
			System.out.println("it's prime");
		}
		else if(num==3){
			System.out.println("it's prime");
		}
		else if((num%2)==0){
			System.out.println("not prime");
		}
		else if(num%3==0){
			System.out.println("not prime");
		}
		for(int i=num/2;i>3;i--){
			if(num%i==0){
				System.out.println("not prime");
			}
			else{
				System.out.println("it's prime");
			}
		}
	}
}
