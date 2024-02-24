package exemplo.composicao;

import java.util.List;

class Biblioteca
{
 
	
	
	//Composi��o n�o tem sentido biblioteca sem livros!!
    // reference to refer to list of books.
    private final List<Livro> books;
     
    Biblioteca (List<Livro> books)
    {
        this.books = books;
    }
     
    public List<Livro> getTotalLivroNaBiblioteca(){
         
       return books; 
    }
     
}