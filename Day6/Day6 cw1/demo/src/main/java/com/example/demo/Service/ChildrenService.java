package com.example.demo.Service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Children;
import com.example.demo.Repository.ChildrenRepo;

@Service
public class ChildrenService {
    private ChildrenRepo childrenRepo;
   
    public ChildrenService(ChildrenRepo childrenRepo) {
        this.childrenRepo = childrenRepo;
    }
    public Children addChildren(Children children){
        return childrenRepo.save(children);
    }
    public List<Children> getChildren(){
        return childrenRepo.findAll();
    }
    public Page<Children> paginationChildren(int offset,int pagesize){
        return childrenRepo.findAll(PageRequest.of(offset,pagesize));
    }
     
    public Page<Children> pageSortChildren(int offset, int pagesize, String field)
    {
    PageRequest pageRequest = PageRequest.of(offset, pagesize, Sort.by(field));
    return childrenRepo.findAll(pageRequest);
    }

}
