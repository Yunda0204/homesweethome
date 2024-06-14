package board.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serial;

public class LifeCycleServlet extends HttpServlet {
        @Serial
        private static final long serialVersionUID = 1L ;

        public void init(ServletConfig config) throws ServletException {
            System.out.println("init called") ;
            super.init() ;
        }

        public void destroy() {
            System.out.println("destroy called") ;
            super.destroy() ;
        }

        protected void service(HttpServletRequest request,
                               HttpServletResponse response) throws ServletException, IOException {
            System.out.println("service called") ;
            super.service(request, response) ;
        }

        protected void doGet(HttpServletRequest request,
                             HttpServletResponse response) throws ServletException, IOException {
            System.out.println("doGet called") ;
        }

        protected void doPost(HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException {
            System.out.println("doPost called") ;
        }
    }

