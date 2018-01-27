package com.kent.jenkins.testspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author Kent.Wang
 * Date 2018/1/27
 */
@RestController
@RequestMapping("")
public class HelloController {

    @RequestMapping("")
    public void index(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
