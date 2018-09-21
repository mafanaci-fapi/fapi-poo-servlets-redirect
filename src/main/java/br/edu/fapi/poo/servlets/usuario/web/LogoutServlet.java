package br.edu.fapi.poo.servlets.usuario.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Redirecionamento do lado do cliente.
//		req.getSession().removeAttribute("usuario.logado");
//		resp.sendRedirect("WEB-IN/Fpages/logout/logout.jsp");
		
//		Redirecionamento do lado do servidor.
//		O cliente nem sabe o que está acontecendo.
		resp.sendRedirect("pages/logout/logout.jsp");
	}

}
