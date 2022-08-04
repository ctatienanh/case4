package com.example.producttestcase4.service;

import com.example.producttestcase4.model.Comment;
import com.example.producttestcase4.model.Product;
import com.example.producttestcase4.repository.IComment;
import com.example.producttestcase4.repository.Iproduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    IComment iComment;

    public Page<Comment> getall(Pageable pageable) {
        return iComment.findAll(pageable);
    }

    public Comment finall(long id) {
        return iComment.findById(id).get();
    }

    public void create(Comment comment) {
        iComment.save(comment);
    }

    public void delete(long id) {
        iComment.deleteById(id);
    }

}
