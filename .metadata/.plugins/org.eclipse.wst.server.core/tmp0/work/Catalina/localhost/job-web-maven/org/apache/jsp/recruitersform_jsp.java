/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2019-05-24 05:39:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recruitersform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<!-- Material Design Bootstrap -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.8/css/mdb.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<title>RecruitersForm</title>\r\n");
      out.write("<style>\r\n");
      out.write("#Recruiters {\r\n");
      out.write("margin-left: 10em;\r\n");
      out.write("}\r\n");
      out.write("h2 {\r\n");
      out.write("\tfont-family: 'Kaushan Script', cursive;\r\n");
      out.write("\tpadding-right: 5rem;\r\n");
      out.write("\tpadding-left: 10rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3 {\r\n");
      out.write("\tfont-family: 'Kaushan Script', cursive;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("li3 {\r\n");
      out.write("\tpadding-left: 14rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\tpadding-right: 2rem;\r\n");
      out.write("}\r\n");
      out.write("li1 {\r\n");
      out.write("\tpadding-right: 2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"mb-1 navbar navbar-expand-lg navbar-dark info-color\">\r\n");
      out.write("\t<h2>Joodle jobs</h2>\r\n");
      out.write("\t<div class=\"collapse navbar-collapse\" id=\"navbar\">\r\n");
      out.write("\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#\">Post Vacancy\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">(current)</span>\r\n");
      out.write("\t\t\t</a></li>\r\n");
      out.write("\t\t   <li1 class=\"nav-item\"> <a class=\"nav-link\" href=\"AppliedServlet\">Applied list</a></li1>\r\n");
      out.write("\t\t   <li2 class=\"nav-item\"> <a class=\"nav-link\" href=\"ShortListedServlet\">Shortlisted</a></li2>\r\n");
      out.write("\t\t\t\t<li3 class=\"nav-item\"> <a class=\"nav-link\" href=\"index.jsp\"><i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-sign-out\"></i> Logout</a></li3>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("<main class=\"pt-5 mx-lg-5\"> \r\n");
      out.write("\t<div class=\"row wow fadeIn\" id=\"Recruiters\">\r\n");
      out.write("\t\t<div class=\"col-md-9 mb-4\">\r\n");
      out.write("\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t<form action=\"AddVacancyServlet\" method=\"post\"\r\n");
      out.write("\t\t\t\t\tonSubmit=\"alert('Vacancy details has been updated sucessfully.');\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Update Vacancy</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputName\" class=\"col-sm-2 col-form-label\">Recruiters Name</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputName\" name=\"Name\" title=\"4-25 Characters,A-Z,a-z,space is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[A-Za-z- ]{4,25}\" required maxlength=\"25\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Recruiters Name\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputPosition\" class=\"col-sm-2 col-form-label\">Recruiters Position</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputPosition\" name=\"Position\" title=\"2-40 Characters,A-Z,a-z,space is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[A-Za-z- ]{2,25}\" required maxlength=\"40\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Recruiters Position\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputCompany\" class=\"col-sm-2 col-form-label\">Company Name</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputCname\" name=\"Cname\" title=\"3-50 Characters,A-Z,a-z,space is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[A-Za-z- ]{3,50}\" required maxlength=\"50\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Company Name\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputLocation\" class=\"col-sm-2 col-form-label\">Location</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputLocation\" name=\"Location\" title=\"3-30 Characters,A-Z,a-z,space is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[A-Za-z- ]{3,30}\" required maxlength=\"30\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Location\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputSkills\" class=\"col-sm-2 col-form-label\">Skills Required</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputSkills\" name=\"Skills\" title=\"1-30 Characters,A-Z,a-z,.,_ is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[a-zA-Z-_., ]{1,20}\" required maxlength=\"30\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Skills Required\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputVposition\" class=\"col-sm-2 col-form-label\">Vacancy Position</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputVposition\" name=\"Vposition\" title=\"4-30 Characters,a-z,.,, is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[a-zA-Z-., ]{1,20}\" required maxlength=\"30\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Vacancy Position\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputVnumber\" class=\"col-sm-2 col-form-label\">Vacancy Available</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputVnumber\" name=\"Vaccancy\" title=\"1-30 Characters,0-9 is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[0-50]{1,30}\" required maxlength=\"30\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Vacancy Available\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputVnumber\" class=\"col-sm-2 col-form-label\">About Company</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputVnumber\" name=\"About\" title=\"4-100 Characters,A-Z,a-z,0-9 is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[a-zA-Z0-9-.,/ ]{4,100}\" required maxlength=\"100\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"About Company\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputVnumber\" class=\"col-sm-2 col-form-label\">Criteria</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputVnumber\" name=\"Criteria\" title=\"4-70 Characters,a-z,0-9 is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[a-zA-Z0-9-., /]{4,70}\" required maxlength=\"70\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Criteria\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputVnumber\" class=\"col-sm-2 col-form-label\">Perks</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"inputVnumber\" name=\"Perks\" title=\"4-70 Characters,A-Z,a-z,0-9 is only allowed\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpattern=\"[a-zA-Z0-9-., /]{4,70}\" required maxlength=\"70\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Perks\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Update\r\n");
      out.write("\t\t\t\t\t\t\t\t\t Vacancy</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${add}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}