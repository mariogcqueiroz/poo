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
import entidades.Produto;

/**
 * Retorna os clientes no banco
 */
public class QueryCliente {
	public static void consultaCliente(Connection conecta) {
		//Connection conecta = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			//conecta = Conexao.getConnection();
			st = conecta.createStatement();
			rs = st.executeQuery("Select * from CLIENTE");
			while (rs.next()) {
				System.out.println(rs.getString("CPF") +","+  rs.getString("Nome") + ", "
						+ rs.getString("Telefone") + ", " + rs.getString("Endereco"));
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
	 * RETORNA UM CLIENTE PELO CODIGO
	 */
	public static Cliente retornaCliente(Connection conecta,int cId) {
		Cliente modelCliente = new Cliente();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conecta.createStatement();
			rs = st.executeQuery("SELECT nome, CPF_CNPJ, telefone, endereco FROM cliente WHERE id ='"+ cId +"';"); 
			while(rs.next()) {
				modelCliente = new Cliente(); 
				modelCliente.setNome(rs.getString(1));
				modelCliente.setCPF_CNPJ(rs.getString(2));
				modelCliente.setTelefone(rs.getString(3));
				modelCliente.setEndereco(rs.getString(4));
				
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
		return modelCliente; 
	}
		
	
	/**
	 * @param conecta
	 * @param cpf_cnpj
	 * @return
	 * retorna um cliente a partir de seu cpf_cnpj
	 */
	public static Cliente retornaClienteCPF_CNPJ(Connection conecta,String cpf_cnpj) {
		Cliente modelCliente = new Cliente();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conecta.createStatement();
			rs = st.executeQuery("SELECT nome, CPF_CNPJ, telefone, endereco WHERE nome ='"+ cpf_cnpj +"';"); 
			while(rs.next()) {
				modelCliente = new Cliente(); 
				modelCliente.setNome(rs.getString(1));
				modelCliente.setCPF_CNPJ(rs.getString(2));
				modelCliente.setTelefone(rs.getString(3));
				modelCliente.setEndereco(rs.getString(4));
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
		return modelCliente; 
	}
	
	/**
	 * RETORNA UMA LISTA DE CLIENTES
	 */
	public static ArrayList<Cliente> retornarListaClientes(Connection conecta){
		ArrayList<Cliente> listaModelClientes = new ArrayList<>();
		Cliente modelCliente= new Cliente();
		Statement st = null;
		ResultSet rs = null;
		try {
			st= conecta.createStatement();
			rs = st.executeQuery("SELECT nome, CPF_CNPJ, telefone, endereco FROM cliente;"); 
			while(rs.next()) {
				modelCliente = new Cliente(); 
				modelCliente.setNome(rs.getString(1));
				modelCliente.setCPF_CNPJ(rs.getString(2));
				modelCliente.setTelefone(rs.getString(3));
				modelCliente.setEndereco(rs.getString(4));
				listaModelClientes.add(modelCliente);
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
		return listaModelClientes;
	}
	/**
	 * INSERE UM CLIENTE NO BANCO DE DADOS
	 */
	public static boolean insereCliente(Connection conecta, Cliente modelCliente) {
		
		PreparedStatement st = null;
		
		try {
			
			st=conecta.prepareStatement("INSERT INTO cliente" +"(cpf_cnpj, nome, endereco, telefone)" +"VALUES" + "(?,?,?,?)");
			
			st.setString(1, modelCliente.getCPF_CNPJ());
			st.setString(2, modelCliente.getNome());
			st.setString(3, modelCliente.getEndereco());
			st.setString(4, modelCliente.getTelefone());
			
			
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
	 * ALTERA AS INFORMAÇÕES DESEJADAS DE UM CLIENTE NO BANCO DE DADOS
	 */
	public static boolean alteraCliente(Connection conecta,Cliente modelCliente) {
		Statement st =null;
		
		try {
			st = conecta.createStatement();
			st.executeUpdate("UPDATE cliente SET estado = '"  + "', nome = '" + modelCliente.getNome() + "', telefone = '" + modelCliente.getTelefone() + "', endereço = '" + modelCliente.getEndereco() + "' WHERE id = '" +modelCliente.getCPF_CNPJ() +"'");
			
			
			
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	/**
	 * EXCLUI AS INFORMAÇÕES DE UM CLIENTE NO BANCO DE DADOS
	 */
	public static boolean excluirCliente(Connection conecta, int cId) {
		Statement st =null;
		
		try {
			st=conecta.createStatement();
			st.executeUpdate("DELETE FROM cliente WHERE cpf_cnpj = '"+ cId +"'");
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
