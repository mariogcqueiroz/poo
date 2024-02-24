package lamp;

public class LampadaNatal implements Lampada{
	private Cor cor;

    public LampadaNatal(Cor cor) {
        this.cor = cor;
    }

   
    public void ligar() {
        System.out.println("Lampada de Natal ligada. Cor: " + cor);
    }

   
    public void desligar() {
        System.out.println("Lampada de Natal desligada");
    }
    
}

