package databasequeries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import entidades.Cliente;
import entidades.Fornecedor;
import entidades.Produto;

public class QueryFornecedor {
	public static void consultaCliente(Connection conecta) {
		//Connection conecta = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			//conecta = Conexao.getConnection();
			st = conecta.createStatement();
			rs = st.executeQuery("Select * from Fornecedor");
			while (rs.next()) {
				System.out.println(rs.getString("CPF_CNPJ") +","+  rs.getString("Nome") + ", "
						+ rs.getString("Endereco") + ", " + rs.getString("Email") + ", " + rs.getString("Telefone"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}

			//	Conexao.closeConnection();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		
		}
	}
	/**
	 * RETORNA UM FORNECEDOR PELO CODIGO
	 */
	public static Fornecedor retornaFornecedor(Connection conecta,int cId) {
		Fornecedor modelforn = new Fornecedor();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conecta.createStatement();
			rs = st.executeQuery("SELECT nome, CPF_CNPJ, telefone, endereco, Email FROM fornecedor WHERE id ='"+ cId +"';"); 
			while(rs.next()) {
				modelforn = new Fornecedor(); 
				modelforn.setNome(rs.getString(1));
				modelforn.setCPF_CNPJ(rs.getString(2));
				modelforn.setTelefone(rs.getString(3));
				modelforn.setEndereco(rs.getString(4));
				modelforn.setEmail(rs.getString(5));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}
		return modelforn; 
	}
		
	
	/**
	 * @param conecta
	 * @param cpf_cnpj
	 * @return
	 * Retorna um fornecedor a partir de seu cpf_cnpj
	 */
	public static Fornecedor retornaFornecedorCPF_CNPJ(Connection conecta,String cpf_cnpj) {
		Fornecedor modelforn = new Fornecedor();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conecta.createStatement();
			rs = st.executeQuery("SELECT nome, CPF_CNPJ, telefone, endereco, email  FROM fornecedor WHERE CPF_CNPJ ='"+ cpf_cnpj +"';"); 
			while(rs.next()) {
				modelforn = new Fornecedor(); 
				modelforn.setNome(rs.getString(1));
				modelforn.setCPF_CNPJ(rs.getString(2));
				modelforn.setTelefone(rs.getString(3));
				modelforn.setEndereco(rs.getString(4));
				modelforn.setEmail(rs.getString(5));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}
		return modelforn; 
	}
	
	/**
	 * RETORNA UMA LISTA DE FORNECEDORES
	 */
	public static ArrayList<Fornecedor> retornarListaFornecedor(Connection conecta){
		ArrayList<Fornecedor> listaModelforn = new ArrayList<>();
		Fornecedor modelforn= new Fornecedor();
		Statement st = null;
		ResultSet rs = null;
		try {
			st= conecta.createStatement();
			rs = st.executeQuery("SELECT nome, CPF_CNPJ, telefone, endereco, email  FROM fornecedor WHERE nome;"); 
			while(rs.next()) {
				modelforn = new Fornecedor(); 
				modelforn.setNome(rs.getString(1));
				modelforn.setCPF_CNPJ(rs.getString(2));
				modelforn.setTelefone(rs.getString(3));
				modelforn.setEndereco(rs.getString(4));
				modelforn.setEmail(rs.getString(5));
				listaModelforn.add(modelforn);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
			
		}
		return listaModelforn;
	}
	/**
	 * INSERE UM Fornecedor NO BANCO DE DADOS
	 */
	public static boolean insereFornecedor(Connection conecta, Fornecedor modelforn) {
		
		PreparedStatement st = null;
		
		try {
			
			st=conecta.prepareStatement("INSERT INTO fornecedor" +"(cpf_cnpj, nome, endereco, telefone,email)" +"VALUES" + "(?,?,?,?,?)");
			
			st.setString(1, modelforn.getCPF_CNPJ());
			st.setString(2, modelforn.getNome());
			st.setString(3, modelforn.getEndereco());
			st.setString(4, modelforn.getTelefone());
			st.setString(4, modelforn.getEmail());
			
			
			st.executeUpdate();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			//Conexao.closeConnection();
			try {
				st.close();
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	/**
	 * ALTERA AS INFORMAÇÕES DESEJADAS DE UM FORNECEDOR NO BANCO DE DADOS
	 */
	public static boolean alteraCliente(Connection conecta,Fornecedor modelforn) {
		Statement st =null;
		
		try {
			st = conecta.createStatement();
			st.executeUpdate("UPDATE fornecedor SET estado = '"  + "', nome = '" + modelforn.getNome() + "', telefone = '" + modelforn.getTelefone() + "', endereço = '" + modelforn.getEndereco() + "', email = '" + modelforn.getEmail() + "' WHERE id = '" +modelforn.getCPF_CNPJ() +"'");
			
			
			
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * EXCLUI AS INFORMAÇÕES DE UM FORNECEDOR NO BANCO DE DADOS
	 */
	public static boolean excluirCliente(Connection conecta, int cId) {
		Statement st =null;
		
		try {
			st=conecta.createStatement();
			st.executeUpdate("DELETE FROM FORNECEDOR WHERE cpf_cnpj = '"+ cId +"'");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			
			try {
				st.close();
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}

