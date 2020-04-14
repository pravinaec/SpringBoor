/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pravisin
 */
@RestController
public class PrifileTestController {
     @Value("${msg}")
     private String msg;
     
     @RequestMapping("/msg")
     public String message(){
          return msg;
     }
     
    }
