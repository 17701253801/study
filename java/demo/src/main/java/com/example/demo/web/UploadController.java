package com.example.demo.web;

import org.springframework.web.bind.annotation.DeleteMapping;
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

    @DeleteMapping("/user/delete/{id}")
    public Person delete(@PathVariable String id) {
        Person p = new Person();
        p.setIdNo("123123213");
        p.setName("zhangsan");
        p.setSex("0");
        return p;
    }

}

class Person {
    String name;
    String sex;
    String idNo;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the idNo
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * @param idNo the idNo to set
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

}
