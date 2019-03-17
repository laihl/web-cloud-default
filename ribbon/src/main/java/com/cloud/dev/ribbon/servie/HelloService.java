package com.cloud.dev.ribbon.servie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${server.port}")
    private String port;

    public String hellowService(String name){

        String forObject ="ribbon:"+port +" ========" ;
        try{
             forObject += restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
        }catch (Throwable e){
            forObject += "<br>error:"+e.getMessage();
        }
        return forObject;
    }

}
