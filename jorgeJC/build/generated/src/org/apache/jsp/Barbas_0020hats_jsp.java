package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Barbas_0020hats_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Catálogo - Jarillo Hats</title>\n");
      out.write("    <style>\n");
      out.write("        /* Estilos del catálogo */\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #222222;\n");
      out.write("            color: #f1c40f;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            font-size: 1.6em;\n");
      out.write("            background: linear-gradient(135deg, #333333, #f39c12);\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px 30px;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.3);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header h1 {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .product-container {\n");
      out.write("            display: flex;\n");
      out.write("            flex-wrap: wrap;\n");
      out.write("            gap: 20px;\n");
      out.write("            padding: 30px;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            background-color: #222222;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .product-box {\n");
      out.write("            background-color: #333333;\n");
      out.write("            width: 220px;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            text-align: center;\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("            transition: transform 0.3s ease, box-shadow 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .product-box:hover {\n");
      out.write("            transform: translateY(-10px);\n");
      out.write("            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.3);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .product-box img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: auto;\n");
      out.write("            border-radius: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .product-box h3 {\n");
      out.write("            color: #f1c40f;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .view-product-button {\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #f1c40f;\n");
      out.write("            color: #222222;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .view-product-button:hover {\n");
      out.write("            background-color: #e67e22;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Encabezado -->\n");
      out.write("    <header>\n");
      out.write("        <h1>Jarillo Hats</h1>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- Catálogo de productos -->\n");
      out.write("    <div class=\"product-container\">\n");
      out.write("        ");

            // Configuración de conexión a MySQL
            String url = "jdbc:mysql://localhost:3306/tienda"; // Cambia a la URL de tu servidor
            String user = "root"; // Cambia por tu usuario
            String password = ""; // Cambia por tu contraseña

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                stmt = conn.createStatement();
                String sql = "SELECT id, nombre, imagen_url, precio FROM productos";
                rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    String imagenUrl = rs.getString("imagen_url");
                    double precio = rs.getDouble("precio");
        
      out.write("\n");
      out.write("                    <div class=\"product-box\" data-id=\"");
      out.print( id );
      out.write("\">\n");
      out.write("                        <img src=\"");
      out.print( imagenUrl );
      out.write("\" alt=\"");
      out.print( nombre );
      out.write("\">\n");
      out.write("                        <h3>");
      out.print( nombre );
      out.write("</h3>\n");
      out.write("                        <p>Precio: $");
      out.print( precio );
      out.write("</p>\n");
      out.write("                        <a href=\"javascript:void(0)\" class=\"view-product-button\" onclick=\"addToCart('");
      out.print( id );
      out.write("', '");
      out.print( nombre );
      out.write("', ");
      out.print( precio );
      out.write(")\">Agregar al carrito</a>\n");
      out.write("                    </div>\n");
      out.write("        ");

                }
            } catch (Exception e) {
                out.println("<p>Error al conectar con la base de datos: " + e.getMessage() + "</p>");
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Script para carrito -->\n");
      out.write("    <script>\n");
      out.write("        let cart = [];\n");
      out.write("        function addToCart(id, name, price) {\n");
      out.write("            const index = cart.findIndex(item => item.id == id);\n");
      out.write("            if (index !== -1) {\n");
      out.write("                cart[index].quantity += 1;\n");
      out.write("            } else {\n");
      out.write("                cart.push({ id, name, price, quantity: 1 });\n");
      out.write("            }\n");
      out.write("            alert(`Producto agregado: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
