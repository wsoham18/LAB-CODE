package test;

    interface Operation {
           
    	void Calci();
    	
    }
    
    class Addition implements Operation{
    
         public void Calci() {
        	 int a=5,b=5;
        	 int sum=a+b;
        	System.out.println("The sum of two no. is: "+sum);
         }
    }
    
    class Subtraction implements Operation{
    
    	 public void Calci()  {
    		int a=10,b=8;
    		int sub=a-b;
    		System.out.println("The difference between two no. is: "+sub);
    	 }
    }
    
    class Multiply implements Operation{
            
    	  public void Calci() {
    		int a=8,b=8;
    		int product=a*b;
    		System.out.println("The product of two no. is: "+product);
    	  }
    }
    
    class Division implements Operation{
    
    	public void Calci() {
    	float a=72; int b=5;
    	float div=a/b;
    	System.out.println("The division of two no. is: "+div);
    	}
    }
    
     class Calculators{
    	 public static void main(String[] args) {
    		Addition a1=new Addition();
    		Subtraction s1=new Subtraction();
    		Multiply m1=new Multiply();
    		Division d1=new Division();
    		
    		a1.Calci();
    		s1.Calci();
    		m1.Calci();
    		d1.Calci();
    		 
    	 }
     }
	