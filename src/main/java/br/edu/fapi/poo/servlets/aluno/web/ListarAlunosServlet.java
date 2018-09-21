package br.edu.fapi.poo.servlets.aluno.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.fapi.poo.servlets.aluno.model.Aluno;
import br.edu.fapi.poo.servlets.aluno.service.AlunoService;

@WebServlet(urlPatterns = "/listarAlunos")
public class ListarAlunosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private AlunoService alunoService = new AlunoService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Aluno> alunos = alunoService.listarTodos();
		req.setAttribute("alunos", alunos);

		resp.sendRedirect("pages/aluno/listaAluno.jsp");
	}

}