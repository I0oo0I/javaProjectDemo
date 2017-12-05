package javaProjectDemo.demo1;

public class MyCaculator implements Caculator{

	@Override
	public Double add(Double number1, Double number2) {
		return number1 + number2;
	}

	@Override
	public Double substraction(Double number1, Double number2) {
		return number1 - number2;
	}

	@Override
	public Double multipate(Double number1, Double number2) {
		return number1 * number2;
	}

	@Override
	public Double division(Double number1, Double number2) {
		return null;
	}

}
