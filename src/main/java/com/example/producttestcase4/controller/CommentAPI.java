package com.example.producttestcase4.controller;

import com.example.producttestcase4.model.Comment;
import com.example.producttestcase4.model.Product;
import com.example.producttestcase4.service.CommentService;
import com.example.producttestcase4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin("*")
public class CommentAPI {
    @Autowired
    CommentService commentService;

    @GetMapping
    public Page<Comment> getall(@RequestParam(defaultValue = "0") int page) {
        return commentService.getall(PageRequest.of(page,4));
    }

    @GetMapping("/{id}")
    public List<Comment> finnall(@PathVariable long id){
        return commentService.findIdPhone(id);
    }

    @PostMapping
    public void create(@RequestBody Comment comment){
        commentService.create(comment);
    }

    @PutMapping
    public void edit(@RequestBody Comment comment){
        commentService.create(comment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        commentService.delete(id);
    }

}
