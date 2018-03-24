
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OlimpiadaDAO 
{
	public void criar(Olimpiada olimpiada) 
	{
		String sqlInsert = "INSERT INTO olimpiada(ano, tipo) VALUES (?, ?, ?)";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, olimpiada.getTipo());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery); ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					olimpiada.setAno(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualiza(Olimpiada olimpiada) {
		String sqlUpdate = "UPDATE olimpiada SET nome=?, populacao=?, area=? WHERE id=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, olimpiada.getTipo());
			stm.setInt(4, olimpiada.getAno());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Olimpiada olimpiada) {
		String sqlDelete = "DELETE FROM olimpiada WHERE id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, olimpiada.getAno());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void carregar(Olimpiada olimpiada) {
		String sqlSelect = "SELECT ano, tipo FROM olimpiada WHERE olimpiada.id = ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, olimpiada.getAno());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					olimpiada.setTipo(rs.getString("nome"));

				} else {
					olimpiada.setAno(-1);
					olimpiada.setTipo(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}

	}
		

}


