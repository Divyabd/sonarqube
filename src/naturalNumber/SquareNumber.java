package naturalNumber;

//import set1.util.ScannerValidate;
public class SquareNumber {

	public static void main(String[] args) {
		int[] array=new int[10];
		for (int i = 1; i <=10; i++)
		{
			if(i>=array.length)
			{
				System.out.println("array out of index sorry");
				break;
			}
			else {
			array[i]=i*i;
			}
		}
		for (int i = 1; i <=10; i++)
		{
			if(i>=array.length)
			{
				System.out.println("array out of index sorry");
				break;
			}
			System.out.println(array[i]);
		}
		
	}

}
