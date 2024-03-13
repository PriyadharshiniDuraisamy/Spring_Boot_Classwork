package com.example.demo.Controller;


import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.AddressModel;

@RestController
public class addressController {
    @RequestMapping("//path")
    public AddressModel getAddrss() {
        AddressModel a=new AddressModel("123" ,"Main St");
        return a;
       
    }
    
}