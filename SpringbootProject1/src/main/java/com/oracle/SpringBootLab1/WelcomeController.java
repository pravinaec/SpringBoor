/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.SpringBootLab1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pravisin
 */
@RestController
public class WelcomeController {
     
     @RequestMapping("/")
    public String welcome(){
         return "Welcome to Spring Boot world";
         
    } 
    
    @Value("${spring.boot.msg1}")
    private String msgString;
    
    @RequestMapping("/msg")
    public String msgFromProperties(){
         return msgString;
         
    } 
    
    //not case sensitive    
    @Value("${spring.boot.msg}")
    private String msgStringYml;
    
    @RequestMapping("/errorType")
    public String msgFromPropertiesYml(){
         return msgStringYml;
         
    } 
}
