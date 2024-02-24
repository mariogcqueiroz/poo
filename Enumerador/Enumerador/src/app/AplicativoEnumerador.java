package app;

import tipos.Cores;
import tipos.EstadoMatriculaAluno;


public class AplicativoEnumerador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cores minhaCor = Cores.VERMELHO;
		Cores corEscolhida = Cores.AZUL;
		
		EstadoMatriculaAluno estadoMatriculaAlunos = EstadoMatriculaAluno.MATRICULADO;
		
		if(Cores.AZUL == corEscolhida.AZUL) {
			System.out.println("Escolhi AZUL!!");
		}
		
		System.out.println(minhaCor.ordinal());
		
		for (Cores todasCores : Cores.values()) {
		      System.out.println(todasCores + " Ordem:" +todasCores.ordinal());
		}
		
		for (EstadoMatriculaAluno todosEstadosMat : EstadoMatriculaAluno.values()) {
		      System.out.println(todosEstadosMat + " Ordem:" +todosEstadosMat.ordinal());
		}

	}
}
