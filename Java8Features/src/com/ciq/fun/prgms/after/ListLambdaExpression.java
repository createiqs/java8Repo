package com.ciq.fun.prgms.after;

import java.util.List;

public class ListLambdaExpression {
	public static void main(String[] args) {
		List<Integer> inputNumbers = List.of(1, 2, 3, 4, 5);
		NumberOperationService service = new NumberOperationService();
		// type inference (int number)
//		Operation operation = (int number) -> number * 2;
//		Operation operation = ( int number) -> return  number * 2;
		Operation operation = number -> number * 2;
		List<Integer> outputNumbers = service.executeOperation(inputNumbers, operation);
		System.out.println(outputNumbers);

	}

}
