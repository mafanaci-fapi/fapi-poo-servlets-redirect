package br.edu.fapi.poo.servlets.aluno.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.fapi.poo.servlets.aluno.model.Aluno;
import br.edu.fapi.poo.servlets.aluno.service.AlunoService;

@WebServlet(urlPatterns = "/cadastrarAluno")
public class CadastrarAlunoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private AlunoService alunoService = new AlunoService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleRequest(req, resp);
	}

	private void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String paramNome = req.getParameter("nome");
		String paramCurso = req.getParameter("curso");
		Aluno aluno = new Aluno();
		aluno.setNome(paramNome);
		aluno.setCurso(paramCurso);

		boolean resultado = alunoService.cadastrarAluno(aluno);
		req.setAttribute("aluno", aluno);
		if (resultado) {
			resp.sendRedirect("pages/aluno/cadastroResultadoSucesso.jsp");
		} else {
			resp.sendRedirect("pages/aluno/cadastroResultadoErro.jsp");
		}
	}

	public void setAlunoService(AlunoService alunoService) {
		this.alunoService = alunoService;
	}

}
