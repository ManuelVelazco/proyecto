package sparks.sparks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
import freemarker.template.Configuration;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import static spark.Spark.get;

    public class HelloWorld {
        public static void main(String[] args) {
            Configuration conf = new Configuration();
            conf.setClassForTemplateLoading(HelloWorld.class, "/");

            get("/", (request, response) -> {
                Map<String, Object> attributes = new HashMap<>();
                attributes.put("message", "Hello World!");

                // The hello.ftl file is located in directory:
                // src/test/resources/spark/template/freemarker
                return new ModelAndView(attributes, "hello.ftl");
            }, new FreeMarkerEngine(conf));
        }
    }