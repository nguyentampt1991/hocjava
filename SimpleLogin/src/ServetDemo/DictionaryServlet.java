package ServetDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DictionaryServlet
 */
@WebServlet("/DictionaryServlet")
public class DictionaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DictionaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
       Map<String, String> dictionary = new HashMap<>();
       dictionary.put("hello", "xin chào");
       dictionary.put("how", "Thế nào");
       dictionary.put("book", "Sách");
       dictionary.put("computer", "Máy tính");
       String seach = request.getParameter("txtSeach");
       PrintWriter writer = response.getWriter();
       writer.println("<html>");
       String result = dictionary.get(seach);
       if(result != null) {
    	   writer.println("Word" + seach);
    	   writer.println("result" + result);
       }else
       {
    	   writer.println("not found");
       }
       writer.println("</html>");
       writer.println("<html>");
       

	}

}
