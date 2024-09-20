package br.com.fiap.cp4.post.dto;

import br.com.fiap.cp4.post.Post;
import br.com.fiap.cp4.user.User;

import java.time.LocalDateTime;

public record PostRequest(String text) {
    public Post toModel(User user) {
        return Post
                .builder()
                .text(text)
                .createdAt(LocalDateTime.now())
                .user(user)
                .build();
    }
}
