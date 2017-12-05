package javaProjectDemo.demo1;

public interface Caculator {

	public static final String [] METHOD = {"+", "-", "*", "/"};
	
	public Double add(Double number1, Double number2);
	
	public Double substraction(Double number1, Double number2);
	
	public Double multipate(Double number1, Double number2);
	
	public Double division(Double number1, Double number2);
}
