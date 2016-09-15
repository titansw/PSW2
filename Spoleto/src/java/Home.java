/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ra21506739
 */
public class Home extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Home</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bem vindo ao spoleto</h1>");

            Pedido pedido = null;

            HttpSession sessao = request.getSession();

            if (sessao.isNew()) {
                pedido = new Pedido();
                sessao.setAttribute("ped", pedido);
            } else {
                pedido = (Pedido) sessao.getAttribute("ped");
            }

            if (pedido.getMolho() == null) {
                out.println("<h2><a href=\"Molhos.html\">Escolha um Molho</a></h2>");

            } else {
                out.println("<h2>Molho escolhido: <br>" + pedido.getMolho() + "<a href=\"Molhos.html\">(Trocar)</a></h2>");
            }

            out.println("<h2><a href=\"Massa\">Escolha uma Massa</a></h2>");

            if (pedido.getIngredientes() == null) {
                out.println("<h2><a href=\"Ingredientes.html\">Escolha Ingredientes</a></h2>");
            } else {
                out.println("<h2>Ingredientes escolhidos:</h2>");
                for (String i : pedido.getIngredientes()) {
                    out.println("<h3>" + i + "</h3>");
                }
                out.println("<h2><a href=\"Ingredientes.html\">Trocar</a></h2>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
