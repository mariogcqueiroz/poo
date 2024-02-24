package databasequeries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

import entidades.Caixa;

public class QueryCaixa {
	/**
	 * @param conecta
	 * Realiza a conexão, listando a tabela caixa
	 */
	public static void consultaVenda(Connection conecta) {
		Statement st = null;
		ResultSet rs = null;
		try {
		st = conecta.createStatement();
		rs = st.executeQuery("Select * from CAIXA");
				while (rs.next()) {
					System.out.println(rs.getInt("Codigo")+ rs.getString("Tipo_Pgto") 
					 +  rs.getInt("FK_CAIXA_Codigo"));
					System.out.println(rs.getDate("Data_Hora"));
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
	 * @param codcx
	 * @return
	 * 	Retorna os dados lançados em caixa a partir de seu codigo
	 */
	public static Caixa retornaCaixa(Connection conecta, int codcx) {
		Caixa modelcx = new Caixa();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conecta.createStatement();
			rs= st.executeQuery("SELECT codigo,Data_abertura,data_fechamento,saldo_final,saldo_inicial FROM caixa WHERE codigo ='"+ codcx +"';");
			while(rs.next()){
				modelcx.setCodigo(rs.getInt(1));
				modelcx.setData_Abertura(rs.getDate(2));
				modelcx.setData_Fechamento(rs.getDate(3));;
				modelcx.setSaldo_Final(rs.getFloat(4));
				modelcx.setSaldo_Inicial(rs.getFloat(5));
				
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
		return modelcx;
	}
	
	
	
	/**
	 * @param conecta
	 * @return
	 * retorna a lista de caixas lançados
	 */
	public static ArrayList<Caixa> retornarListaCaixas(Connection conecta){
		ArrayList<Caixa> listaModelcx = new ArrayList<>();
		Caixa modelcx = new Caixa();
		Statement st = null;
		ResultSet rs = null;
		try {
			st= conecta.createStatement();
			rs = st.executeQuery("SELECT codigo,Data_abertura,data_fechamento,saldo_final,saldo_inicial FROM venda;"); 
			while(rs.next()) {
				modelcx.setCodigo(rs.getInt(1));
				modelcx.setData_Abertura(rs.getDate(2));
				modelcx.setData_Fechamento(rs.getDate(3));;
				modelcx.setSaldo_Final(rs.getFloat(4));
				modelcx.setSaldo_Inicial(rs.getFloat(5));
		
				listaModelcx.add(modelcx);
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
		return listaModelcx;
	}
	
	
	
	
	/**
	 * @param conecta
	 * @param modelcx
	 * @return
	 * Realiza a inserção de um caixa no anco de dados
	 */
	public static boolean insereCaixa(Connection conecta, Caixa modelcx){
		
		PreparedStatement st = null;
		
		
		try {
		
			st=conecta.prepareStatement("INSERT INTO caixa" + "(codigo,data_fechamento,Data_abertura,saldo_final,saldo_inicial)" + "VALUES" + "(?,?,?,?,?) ");
			
			
			
			st.setInt(1,modelcx.getCodigo());
			st.setDate(2,modelcx.getData_Fechamento());
			st.setDate(3, modelcx.getData_Abertura());
			st.setFloat(4, modelcx.getSaldo_Final());
			st.setFloat(5, modelcx.getSaldo_Inicial());
			
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
