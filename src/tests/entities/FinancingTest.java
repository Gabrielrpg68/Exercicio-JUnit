package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTest {
	
	@Test
	public void constructorShouldCreateObjectWhenLegalArguments() {
		Financing finance = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(100000.0, finance.getTotalAmount());
	}
	
	@Test
	public void constructorShouldNotCreateObjectWhenIllegalArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenLegalArguments() {
		Financing finance = new Financing(100000.0, 2000.0, 80);
		finance.setTotalAmount(80000.0);
		Assertions.assertEquals(80000.0, finance.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldNotUpdateValueWhenIllegalArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing finance = new Financing(100000.0, 2000.0, 80);
			finance.setTotalAmount(800000.0);
		});
	}
	
	
	
	
}
