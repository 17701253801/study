package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class UploadController {
    @PostMapping("/file")
    public void upload(@RequestParam("file") MultipartFile file) {
        System.out.println(file.getName() + "    " + file.getOriginalFilename());
        System.out.println(file.getContentType() + "    " + file.getSize());
    }

    @GetMapping("/test")
    public String test() {
        return "Success!";
    }

    @GetMapping("/user/{id}")
    public String testRestfull(@PathVariable String id) {
        return id;
    }

    @PutMapping("/user/put/{name}")
    public String getPut(@PathVariable String name) {
        return name;
    }

}
