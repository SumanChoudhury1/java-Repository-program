import java.io.FileWriter;
public class Exception_Throw {
	
	public static void main(String[] args) throws Exception{
		
		Exception_Throw et=new Exception_Throw();
		et.test();
		
		/*try {
			et.test();//Unhandily exception
			
		}catch(Exception e)
		{
			System.out.println(e);
		}*/
		
	}
     public void test()throws Exception{
    	 FileWriter fw=new FileWriter("D://java_script");
     }
}
