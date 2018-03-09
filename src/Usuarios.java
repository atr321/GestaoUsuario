

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 * Servlet implementation class Usuarios
 */
@WebServlet("/Usuarios")
public class Usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//pegar o writer do response
		//PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		int cpf = Integer.parseInt(request.getParameter("cpf"));
		String data = request.getParameter("data");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title> Resposta </title></head>");
		out.println("<body><h1>Usuário : " + nome + " " + sobrenome);
		out.println("</h1><h2>Cadastrado Com Sucesso " + "</h2></body></html>");
		
		//out.println("<html><head><title>Gestão de Usuario</title></head><body></body></html>");
	}

}
