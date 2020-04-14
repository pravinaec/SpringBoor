package com.oracle.SpringBootLab1;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//We need to add the package what u want to scan in ComponentScan
@ComponentScan({"com.oracle.SpringBootLab1","com.oracle.services"})
public class SpringBootLab1Application {

     public static void main(String[] args) {
          ApplicationContext ctx = SpringApplication.run(SpringBootLab1Application.class, args);
          String[] beans=ctx.getBeanDefinitionNames();
//          Arrays.sort(beans);
//          for (String bean : beans) {
//               System.out.println(bean);
//               
//          }
     }

}
