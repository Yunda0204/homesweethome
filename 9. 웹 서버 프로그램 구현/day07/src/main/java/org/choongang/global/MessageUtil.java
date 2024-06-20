package org.choongang.global;

import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;

import java.io.IOException;
import java.io.PrintWriter;

public class MessageUtil {
    // 정적 메서드
    public static void alertError(Exception e, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        if (e instanceof CommonException commonException) {
            resp.setStatus(commonException.getStatus());
        }
        resp.setStatus(e.getStatus());
        PrintWriter out = resp.getWriter();
        out.printf("<script>alert('%s');</script>", e.getMessage());
    }
}
