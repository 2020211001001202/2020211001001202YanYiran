/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-03-22 15:13:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Register</title>\r\n");
      out.write("    <!-- CSS only -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("            <form class=\"form-signin\" action=\"register\" method=\"post\">\r\n");
      out.write("                <h2 class=\"form-signin-heading\">New User Registration!</h2>\r\n");
      out.write("                <div id=\"info\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <label>Username</label>\r\n");
      out.write("                <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\" placeholder=\"Enter one Username\" required autofocus><br>\r\n");
      out.write("                <label>password</label>\r\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" placeholder=\"Please input a password\" required><br>\r\n");
      out.write("                <label>Email</label>\r\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control\" placeholder=\"Please enter email address\" required ><br>\r\n");
      out.write("                <label>Gender</label>\r\n");
      out.write("                <input type=\"radio\" name=\"gender\" id=\"gender\"   required>Male\r\n");
      out.write("                <input type=\"radio\" name=\"gender\"    required>Female<br><br>\r\n");
      out.write("\r\n");
      out.write("                <label>Date of Birth</label>\r\n");
      out.write("                <input type=\"text\" name=\"birthday\" id=\"birthday\" class=\"form-control\" placeholder=\"Please enter birthday\" required><br>\r\n");
      out.write("\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" id=\"btn-reg\">register</button>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
