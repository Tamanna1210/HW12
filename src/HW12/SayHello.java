package HW12;

public class SayHello {
	String hello(String country) {
		String language=null;
		
		switch(country) {
		case "usa":
			language="hello";
			break;
			
		case "mexico":
			language="hola";
			break;
		case"japan":
			language="Konnichiwa";
			break;
		case"italy":
			language="Salve";
			break;
			
		}
		return language;
	}
	public static void main(String[] args) {
		SayHello say=new SayHello();
		String ans=say.hello("japan");
		System.out.println(ans);
	}
}
