public class equiDistance {
	public static void main(String args[]){


      String s1="wipro";
      String s2="WipRo";
      if(s1==s2){
    	  System.out.println("The reference variables are same");
      }
      else
      {
    	  System.out.println("The reference variables are not same");
      }
      if(s1.equalsIgnoreCase(s2)){
  		System.out.println("The given strings are same");
  	}
	else
	{
		System.out.println("The given strings are not same");
	}
	

}

	}
