package exemplo.composicao;

import java.util.ArrayList;
import java.util.List;

class Principal
{
    public static void main (String[] args)
    {
         
        //Criando os objetos da claasse livro
    	
        Livro b1 = new Livro("EffectiveJ Java", "Joshua Bloch");
        Livro b2 = new Livro("Thinking in Java", "Bruce Eckel");
        Livro b3 = new Livro("Java: The Complete Reference", "Herbert Schildt");
         
        //Criando a lista que contem os livro
        
        List<Livro> Livros = new ArrayList<Livro>();
        Livros.add(b1);
        Livros.add(b2);
        Livros.add(b3);
         
        Biblioteca Biblioteca = new Biblioteca(Livros);
         
        List<Livro> bks = Biblioteca.getTotalLivroNaBiblioteca();
        for(Livro bk : bks){
             
            System.out.println("Title : " + bk.titulo + " and "
            +" Author : " + bk.autor);
        }
    }
}
