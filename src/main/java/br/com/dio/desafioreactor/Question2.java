package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users) {
        return Mono.justOrEmpty(users)
                .map(list -> list.stream()
                        .filter(Objects::nonNull)
                        .filter(User::isAdmin)
                        .count()
                )
                .defaultIfEmpty(0L);

//        return Mono.just(users.stream()
//                .filter(User::isAdmin)
//                .count());
    }

}
