package interfaces;

import exceptions.AcendeException;

public interface Lampada {
	void acende() throws AcendeException;
	void apaga();
	void mostraEstado();
}
