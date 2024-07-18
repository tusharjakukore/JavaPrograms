
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        for(i=0;i<=4;i++)
        {
        	for(j=i;j<i+5;j++)
        	{
        		System.out.printf("%d",(j%5)+1);
        	}
            System.out.print("\n");
        }
	}

}
