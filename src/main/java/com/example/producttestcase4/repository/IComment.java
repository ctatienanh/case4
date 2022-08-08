package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.Category;
import com.example.producttestcase4.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IComment extends PagingAndSortingRepository<Comment, Long> {
}
