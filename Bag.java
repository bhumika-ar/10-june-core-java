  class Bags{
     
	  public static void main(String[] bag){
	  System.out.println("main started");
	  
	  //invoke a method
	  //call a method
	  getFeatures();
	  System.out.println("main ended");
	  }

 public static void getFeatures(){
    System.out.println("getFeatures method started");
	//local variable
	String brand = "ADISA";
	String color = "Gray";
	int Price = 9000;
	int Width = 126 ;
	int Height = 50 ;
	 String Place = "bangalore";
	String Material ="Plastic";
   
	System.out.println("the brand name is" + brand);
	
    System.out.println("the brand name is" + brand);
   System.out.println("the color name is" + color);
    System.out.println("the Price is" + Price);
   System.out.println("the Width is" + Width);
   System.out.println("the Height is" + Height);
System.out.println("the Palce is" + Place);   
   System.out.println("getFeatures method ended");
	
	
	return ;
 }
}

