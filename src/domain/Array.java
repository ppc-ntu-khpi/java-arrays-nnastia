package domain;
import java.util.Arrays;
public class Array
{
	public static void main(String[] args) {
		int size = 10; //Інтервал [1;10]
		int a=1;
		int b=10;
		int [] arr = new int[size] ;
		for ( int i=0; i<size; i++){
		    String arrToString = Arrays.toString(arr); 
		    
		    if (arr[i]>a && arr[i]<b){
		        System.out.println(arrToString); // Виведення масиву у вигляді рядка
		    }
		}
	}
}