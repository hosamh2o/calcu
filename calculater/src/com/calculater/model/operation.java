package com.calculater.model;

public class operation {

	public double calcul(String operator, int number1, int number2) {
		double result = 0;
		try {
					if(operator == "add") {
						result = number1+number2;
					}
					else if(operator == "subt") {
						result = number1 - number2;
					}
					else if(operator == "subt") {
						result = number1 * number2;
					}
					else{
						result = number1 / number2;
					}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
