package com.system.controller;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import static javax.servlet.RequestDispatcher.*;

@RestController
public class CustomErrorController extends HttpServlet /*implements ErrorController*/ {
    private static final String PATH = "/error";

//    @RequestMapping(value = PATH)
//    public String error() {
//        return "customError";
//    }
//
//    @Override
//    public String getErrorPath() {
//        return PATH;
//    }
//
    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html; charset=utf-8");
        try (PrintWriter writer = resp.getWriter()) {
            writer.write("<html><head><title>Error description</title></head><body>");
            writer.write("<h2>Error description</h2>");
            writer.write("<ul>");
            Arrays.asList(
                    ERROR_STATUS_CODE,
                    ERROR_EXCEPTION_TYPE,
                    ERROR_MESSAGE)
                    .forEach(e ->
                            writer.write("<li>" + e + ":" + req.getAttribute(e) + " </li>")
                    );
            writer.write("</ul>");
            writer.write("</html></body>");
        }
    }
}
