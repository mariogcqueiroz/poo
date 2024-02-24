package databasequeries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import entidades.Venda;

/**
 * retorna as vendas do banco
 */
public class QueryVenda {
	public static void consultaVenda(Connection conecta) {
		Statement st = null;
		ResultSet rs = null;
		try {
		st = conecta.createStatement();
		rs = st.executeQuery("Select * from VENDA");
				while (rs.next()) {
					System.out.println(rs.getInt("Codigo")+rs.getString("Data_Hora") + rs.getString("Tipo_Pgto") 
					 +  rs.getString("FK_CAIXA_Codigo"));
					
				}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
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
	}
	/**
	 * @param conecta
	 * @param codvenda
	 * @return
	 * retorna uma venda a partir de seu codigo
	 */
	public static Venda retornaVenda(Connection conecta, int codvenda) {
		Venda modelVenda = new Venda();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conecta.createStatement();
			rs= st.executeQuery("SELECT codigo,preco_total,data,fk_codcliente,desconto,preco_final FROM venda WHERE codigo ='"+ codvenda +"';");
			while(rs.next()){
				modelVenda.setCodigo(rs.getInt(1));
				modelVenda.setValor_Total(rs.getFloat(2));
				modelVenda.setData_Hora(rs.getString(3));;
				modelVenda.setTipo_Pgto(rs.getString(4));
				modelVenda.setFK_CAIXA_Codigo(rs.getInt(5));
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
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
		return modelVenda;
	}
	
	
	
	/**
	 * @param conecta
	 * @return
	 * Retorna uma lista de vendas
	 */
	public static ArrayList<Venda> retornarListaVendas(Connection conecta){
		ArrayList<Venda> listaModelVendas = new ArrayList<>();
		Venda modelVenda = new Venda();
		Statement st = null;
		ResultSet rs = null;
		try {
			st= conecta.createStatement();
			rs = st.executeQuery("SELECT codigo,valor_total,data,data_hora,fk_codcliente,Tipo_pgto FROM venda;"); 
			while(rs.next()) {
				modelVenda.setCodigo(rs.getInt(1));
				modelVenda.setValor_Total(rs.getFloat(2));
				modelVenda.setData_Hora(rs.getString(3));
				modelVenda.setFK_CAIXA_Codigo(rs.getInt(4));
				modelVenda.setTipo_Pgto(rs.getString(5));
		
				listaModelVendas.add(modelVenda);
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
		return listaModelVendas;
	}
	
	
	
	
	/**
	 * @param conecta
	 * @param modelVenda
	 * @return
	 * Insere uma venda no banco de dados
	 */
	public static boolean insereVenda (Connection conecta, Venda modelVenda){
		
		PreparedStatement st = null;
		
		
		try {
		
			st=conecta.prepareStatement("INSERT INTO venda" + "(codigo,data_hora,fk_caixa_codigo,valor_total,tipo_pgto)" + "VALUES" + "(?,?,?,?,?) ");
			
			
			
			st.setString(1,modelVenda.getData_Hora());
			st.setFloat(2,modelVenda.getValor_Total());
			st.setInt(3, modelVenda.getFK_CAIXA_Codigo());
			st.setInt(4, modelVenda.getCodigo());
			st.setString(5, modelVenda.getTipo_Pgto());
			
			st.executeUpdate();
			return true;
			
			
		}
		catch(SQLException e ) {
			
			e.printStackTrace();	
			return false;
		} 
		finally {
			
			try {
				st.close();
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
}
