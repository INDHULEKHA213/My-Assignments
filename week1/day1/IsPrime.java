package week1.day1;
public class IsPrime 
{
public static void main(String[] args) {
		int input = 19,flag=0;
		
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				System.out.println(input+" is Non prime number");
				flag=1;
				break;}
		}
				if(flag==0) {
				System.out.println(input+" is Prime number");}
			}
		}
	

