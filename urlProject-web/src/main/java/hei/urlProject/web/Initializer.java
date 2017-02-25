package hei.urlProject.web;

import hei.urlProject.core.config.AppConfig;
import hei.urlProject.core.config.DBConfig;
import hei.urlProject.web.config.WSConfig;
import hei.urlProject.web.config.WebConfig;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

public class Initializer  extends AbstractAnnotationConfigDispatcherServletInitializer{



        @Override
        public void onStartup(ServletContext servletContext) throws ServletException {
            super.onStartup(servletContext);
            //ServletRegistration.Dynamic servlet = servletContext.addServlet("cxfServlet", new CXFServlet());
            Dynamic servlet = servletContext.addServlet("cxfServlet",new CXFServlet());
            servlet.setLoadOnStartup(1);
            servlet.addMapping("/api/*");
        }


        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class<?>[] { AppConfig.class, DBConfig.class, WSConfig.class };
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class<?>[] {WebConfig.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] { "/" };
        }
    }


