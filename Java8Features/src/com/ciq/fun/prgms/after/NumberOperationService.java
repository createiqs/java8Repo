package com.ciq.fun.prgms.after;

import java.util.ArrayList;
import java.util.List;

public class NumberOperationService {

	public List<Integer> executeOperation(List<Integer> inputOperation, Operation operation) {
		List<Integer> outputNumbers = new ArrayList<>();
		for (int number : inputOperation) {
			outputNumbers.add(operation.operate(number));
		}
		return outputNumbers;

	}

}
