package in.timemac.dictionary.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class ErrorControllerImpl implements ErrorController {
    private static final String PATH = "/error";

    @GetMapping(value = PATH)
    public String error() {
        return "Error Found";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
