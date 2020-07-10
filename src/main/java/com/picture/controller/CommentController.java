package com.picture.controller;

import com.picture.model.Comment;
import com.picture.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @GetMapping("/")
    public ModelAndView showComments() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Comment> comments = commentService.findAll();
        modelAndView.addObject("comments",comments);
        modelAndView.addObject("newComment", new Comment());
        return modelAndView;
    }

    @PostMapping("/like")
    public String addLike(@RequestParam(value = "commentId") Long id) {
        commentService.addLike(id);
        return "redirect:/";
    }

    @PostMapping("/create")
    public String addComment(@ModelAttribute(value = "newComment") Comment comment,
                             BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            commentService.save(comment);
        }
        return "redirect:/";
    }
}
