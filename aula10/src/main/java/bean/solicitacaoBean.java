package bean;



import dao.solicitaDao;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import model.solicitacao;




@Named(value = "solicitacaoBean")
@SessionScoped
public class solicitacaoBean implements Serializable{
    
    public solicitacaoBean(){
        
    }
	
	public void cadastra() {
        solicitacao Solicitacao = new solicitacao();
        solicitaDao dao = new solicitaDao();
		
        System.out.println("entrou Bean");
	HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        
        String data = request.getParameter("solicitacaoBean:data");
        String curso = request.getParameter("solicitacaoBean:curso");
        String qtdVaga = request.getParameter("solicitacaoBean:qtdVaga");
        String periodo = request.getParameter("solicitacaoBean:periodo");
        String campoEstagio = request.getParameter("solicitacaoBean:campoEstagio");
        String instituicao = request.getParameter("solicitacaoBean:intituicao");
        
        Solicitacao.setData(data);
        Solicitacao.setCurso(curso);
        Solicitacao.setQtdVaga(qtdVaga);
        Solicitacao.setPeriodo(periodo);
        Solicitacao.setCampoEstagio(campoEstagio);
        Solicitacao.setInstituicao(instituicao);
        
        
        dao.adicionaUsuario(Solicitacao);
        

	}

}
