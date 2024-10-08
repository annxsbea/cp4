package br.com.fiap.cp4.user.dto;

import br.com.fiap.cp4.user.User;

import java.time.LocalDateTime;

public record UserRequest(
        String name,
        String bio,
        String email,
        String password
) {
    public User toModel() {
        return User.builder()
                .name(name)
                .bio(bio)
                .email(email)
                .password(password)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }
}