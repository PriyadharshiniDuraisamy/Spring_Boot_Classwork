package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Children;
import com.example.demo.Service.ChildrenService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ChildrenController {
    private ChildrenService childrenService;
    
    public ChildrenController(ChildrenService childrenService) {
        this.childrenService = childrenService;
    }

    @PostMapping("/child")
    public ResponseEntity<Children> addChildren(@RequestBody Children children) {
        Children addChild=childrenService.addChildren(children);

        return new ResponseEntity<>(addChild,HttpStatus.CREATED);
    }

    @GetMapping("/childrens")
    public ResponseEntity<List<Children>> getChildren() {
        List<Children> g=childrenService.getChildren();
        return new ResponseEntity<>(g,HttpStatus.OK);
    }
    
     @GetMapping("/api/children/{offset}/{pagesize}")
    public ResponseEntity<Page<Children>> getPaginationChildren(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize) 
    {
        Page<Children> children=childrenService.paginationChildren(offset,pagesize);
        if(children!=null){
            return new ResponseEntity<>(children,HttpStatus.OK);
        }
        return new ResponseEntity<>(children,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    
    public ResponseEntity<Page<Children>> getpageSortChildren(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize, @PathVariable("field") String field) 
    {
        Page<Children> sort = childrenService.pageSortChildren(offset, pagesize, field);
        if(sort != null) {
            return new ResponseEntity<>(sort, HttpStatus.OK);
        }
        return new ResponseEntity<>(sort, HttpStatus.NOT_FOUND);
    }
}


