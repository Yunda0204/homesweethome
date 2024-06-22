package org.choongang.file.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;

@WebServlet("/file/download")
public class FileDownloadController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("D:/uploads/1.png");
//        File file2 = new File("D:/upload/2.png");
//        File file3 = new File("D:/upload/3.png");
        String contentType = Files.probeContentType(file.toPath());

        // 윈도우즈에서 한글 깨짐 문제 발생, 인코딩을 UTF-8 -> CPC949, EUC-KR, IS08859_1
        String fileName = new String(file.getName().getBytes(), "ISO8859_1");

        // 매우 중요함 Content-Disposition
        resp.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        // 매우 중요함
        resp.setContentType(contentType);
        // 매우 중요함
        resp.setHeader("Cache-Control", "must-revalidate");
        resp.setIntHeader("Expires", 0);
        // 매우 중요함
        resp.setContentLengthLong(file.length());
        // 매우 중요함


        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            OutputStream out = resp.getOutputStream();
            out.write(bis.readAllBytes());
        }
//        PrintWriter out = resp.getWriter();
//        out.print("ABC");
//        out.print("DEF");
    }
}
