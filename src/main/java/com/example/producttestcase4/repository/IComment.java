package com.example.producttestcase4.repository;

import com.example.producttestcase4.model.Category;
import com.example.producttestcase4.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IComment extends PagingAndSortingRepository<Comment, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM product.comment where id_phone= :idPhone;")
    List<Comment> findAllByIDP(Long idPhone);
}
