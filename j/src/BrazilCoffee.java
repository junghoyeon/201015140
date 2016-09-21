class BrazilCoffee{
String origin;
int degreeOfRoast;
int grade;
public BrazilCoffee(String o){
this.origin=o;
}
public void roast(){
System.out.println("Roasting!"+origin);
}
public void grind(){
System.out.println("Grinding!"+origin);
}
public void brew(){
System.out.println("Brewing!"+origin);
}
}
