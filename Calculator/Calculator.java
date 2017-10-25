//package  ru.lesson.lessons;

public class Calculator {
	
	private int result;

	public void add(int...params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
//	public void div(int...args){
//		if(args.length>0) {
//
//		} else {
//
//		}
//	}

	public int getResult() {
		return this.result;
	}
	
	public void cleanResult() {
	this.result=0;
	}
}	


