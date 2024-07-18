import java.util.*;
class ConvertUpper
{
    String str;
	void acceptString(String str)
	{
		System.out.println("The String is\n"+str);
		this.str=str;
	}
	void convertToUpper()
	{
		 try
		 {
			 
		    int i,name;
		     char st[]=str.toCharArray();
		     System.out.println("String in upper case is");
		     for( i=0;i<st.length;i++)
		     {
			     if (st[i]>='a'&& st[i]<='z')
			     {  name=((int)st[i]-32);
			    System.out.printf("%c",name);
				 
			    }
			     else { System.out.printf("%c",st[i]);}
		     }	
		 }
		 catch(Exception e)
		 {
			 System.out.printf("Enter only Characters",e);
		 }
		
	}
}
public class ConvertUpperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
        System.out.println("Enter the string");
        Scanner a=new Scanner(System.in);
        str=a.nextLine();
        ConvertUpper cu=new ConvertUpper();
        cu.acceptString(str);
        cu.convertToUpper();
	}

}
