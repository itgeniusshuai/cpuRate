package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showCpuRate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.0.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/Highcharts/js/highcharts.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\twelect to chart;\r\n");
      out.write("\t<div id=\"cpuRate\" style=\"weight:800;height:400;margin:20 auto;\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("   var title = {\r\n");
      out.write("      text: '城市平均气温'   \r\n");
      out.write("   };\r\n");
      out.write("   var subtitle = {\r\n");
      out.write("      text: 'Source: runoob.com'\r\n");
      out.write("   };\r\n");
      out.write("   var xAxis = {\r\n");
      out.write("      categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',\r\n");
      out.write("         'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']\r\n");
      out.write("   };\r\n");
      out.write("   var yAxis = {\r\n");
      out.write("      title: {\r\n");
      out.write("         text: 'Temperature (\\xB0C)'\r\n");
      out.write("      },\r\n");
      out.write("      plotLines: [{\r\n");
      out.write("         value: 0,\r\n");
      out.write("         width: 1,\r\n");
      out.write("         color: '#808080'\r\n");
      out.write("      }]\r\n");
      out.write("   };   \r\n");
      out.write("\r\n");
      out.write("   var tooltip = {\r\n");
      out.write("      valueSuffix: '\\xB0C'\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   var legend = {\r\n");
      out.write("      layout: 'vertical',\r\n");
      out.write("      align: 'right',\r\n");
      out.write("      verticalAlign: 'middle',\r\n");
      out.write("      borderWidth: 0\r\n");
      out.write("   };\r\n");
      out.write("\r\n");
      out.write("   var series =  [\r\n");
      out.write("      {\r\n");
      out.write("         name: 'Tokyo',\r\n");
      out.write("         data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2,\r\n");
      out.write("            26.5, 23.3, 18.3, 13.9, 9.6]\r\n");
      out.write("      }, \r\n");
      out.write("      {\r\n");
      out.write("         name: 'New York',\r\n");
      out.write("         data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8,\r\n");
      out.write("            24.1, 20.1, 14.1, 8.6, 2.5]\r\n");
      out.write("      },\r\n");
      out.write("      {\r\n");
      out.write("         name: 'London',\r\n");
      out.write("         data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, \r\n");
      out.write("            16.6, 14.2, 10.3, 6.6, 4.8]\r\n");
      out.write("      }\r\n");
      out.write("   ];\r\n");
      out.write("\r\n");
      out.write("   var json = {};\r\n");
      out.write("\r\n");
      out.write("   json.title = title;\r\n");
      out.write("   json.subtitle = subtitle;\r\n");
      out.write("   json.xAxis = xAxis;\r\n");
      out.write("   json.yAxis = yAxis;\r\n");
      out.write("   json.tooltip = tooltip;\r\n");
      out.write("   json.legend = legend;\r\n");
      out.write("   json.series = series;\r\n");
      out.write("\r\n");
      out.write("   $('#cpuRate').highcharts(json);\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
