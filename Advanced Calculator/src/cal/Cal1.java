package cal;

public class Cal1 {
	
 public Double get_power(String n1 , String n2){
         
         Double a,b;
         a = Double.parseDouble(n1);
         b = Double.parseDouble(n2);
         Double c = Math.pow(a,b);
         return c;
     }
     
      public Double get_fictorial(double n1) {
     	
     	Double a = n1;
     	Double f=1.0;
     	for(int i=1 ; a>0 ; i++) {
     		
     		f *= i;
     		a--;
     	}
     	
     	return f;
     }
     
      public Double get_percent(String n1 , String n2) {
     	
     	Double a = Double.parseDouble(n1);
     	Double b = Double.parseDouble(n2);
     	Double c;
     	c = (a/100)*b;
     	return c;
     }
     
      public Double get_root(String n1) {
     	
     	Double c = Double.parseDouble(n1);
     	c = Math.sqrt(c);
     	return c;
     }
      public double Square(double n) {
  		return n*n;
  	}
      
  	public double Sum(double n,double n2) {
  		return n+n2;
  	}

}
