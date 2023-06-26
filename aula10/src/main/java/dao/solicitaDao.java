package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.component.html.HtmlDataTable;

import factory.ConnectionFactory;
import model.solicitacao;



public class solicitaDao {

	private HtmlDataTable dataTable;
	List<solicitacao> listaSolicita = new ArrayList<>();
	private Connection connection;

	public solicitaDao() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public void adicionaUsuario(solicitacao solicita) {
                System.out.println("entrou dao");
		String sql = "INSERT INTO solicitacao(data,instituicao,curso,qtdVaga,campoEstagio,periodo)VALUES(?,?,?,?,?,?)";
		try {
                     System.out.println("entrou try");
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, solicita.getData());
                        stmt.setString(2, solicita.getInstituicao());
			stmt.setString(3, solicita.getCurso());
			stmt.setString(4, solicita.getQtdVaga());
                        stmt.setString(5, solicita.getCampoEstagio());
			stmt.setString(6, solicita.getPeriodo());
			
			

			stmt.execute();
			stmt.close();

		} catch (Exception u) {
			throw new RuntimeException(u);
		}
	}

	public List<solicitacao> listar() {

		

		Connection connection = new ConnectionFactory().getConnection();
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			pstm = connection.prepareStatement("select * from cadstraraluno");
			rs = pstm.executeQuery();
			
			while(rs.next()) {			
				solicitacao solicita = new solicitacao();
				solicita.setData(rs.getString("Data"));
				solicita.setCurso(rs.getString("Curso"));
				solicita.setQtdVaga(rs.getString("qtdVaga"));
				solicita.setPeriodo(rs.getString("Periodo"));
				solicita.setCampoEstagio(rs.getString("CampoEstagio"));
				solicita.setInstituicao(rs.getString("Instituicao"));
				
				listaSolicita.add(solicita); 
				
			}
			
			
		} catch (SQLException e) {
			 throw new RuntimeException(e);
		}
		finally {
			
		}

		return listaSolicita;
	}

    public void add(solicitacao Solicitacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}
