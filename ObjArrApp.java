package collection;

public class ObjArrApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Object obj[]=new Object[5];
       obj[0]=100;
       obj[1]="good";
       obj[2]=5.4f;
       obj[3]=false;
       obj[4]=new java.util.Date();
       for(int i=0;i<obj.length;i++)
       {
    	   System.out.println(obj[i]);
       }	
	}
}
