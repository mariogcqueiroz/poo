package model;

public class NegativeNumberException extends Exception {

	private static final long serialVersionUID = 1792779464678786023L;

	public NegativeNumberException() {
		super("O número não pode ser negativo.");
	}
}
