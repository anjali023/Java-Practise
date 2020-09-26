package featuresOfJava;

public class SingletonClassExample {

	private static SingletonClassExample obj;
	
	public String s; 
	private SingletonClassExample() {
		s = "Hello I am a string part of Singleton class"; 
	}
	
	private static SingletonClassExample getInstance() {
		if(obj==null) {
			obj = new SingletonClassExample();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SingletonClassExample x = SingletonClassExample.getInstance();
        SingletonClassExample y = SingletonClassExample.getInstance();
        SingletonClassExample z = SingletonClassExample.getInstance();
        x.s = (x.s).toUpperCase(); 
        System.out.println(x.s+"\n"+y.s+"\n"+z.s);
        x.s = (y.s).toLowerCase(); 
        System.out.println("====\n"+x.s+"\n"+y.s+"\n"+z.s);
        
	}

}
