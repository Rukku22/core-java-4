package project2;
interface Phone{
	void call() ;

	void takepic();
		
}
interface Camera{
	
void takepic();

}
	
	

public class Interface implements Phone,Camera{
	public void call() {
		System.out.println("calling");
	}
	 public void takepic() {
		System.out.println("ringing");
		
	}
	
	public static void main(String[] args) {
		Phone p=new Interface();
		p.call();
		p.takepic();
		Camera c=new Interface();
		c.takepic();
		

	}

}
