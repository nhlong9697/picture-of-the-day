package com.picture.service;


import com.picture.model.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();

    Comment findOne(Long id);

    void save(Comment comment);

    void addLike(Long id);
}
