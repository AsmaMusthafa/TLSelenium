package week3day2abstractionCA;
/**Assignment 1 on Abstraction
Interface :Language
 Methods   :Java()
 Interface :TestTool
 Methods   :Selenium()
 AbstractClass :MultipleLangauge
  Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
  Implement all the methods of interface and abstract class in Automation class
 */
public class Automation extends MultipleLangauge implements Language, TestTool{

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.ruby();
		String python = auto.python("web");
		System.out.println("Python supports "+python);
		auto.Java();
		auto.selenium();

	}

	@Override
	void ruby() {
		System.out.println("Ruby is dynamic and open source programming language");
		
	}

	public void selenium() {
		System.out.println("Selenium is an open source testing tool");
		
	}

	public void Java() {
		System.out.println("Java supports security");
		
	}

}
