package com.mmaznitsyn.backend.data;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collation = "users")
public class User extends Identifier {

    @NonNull
    @Indexed(unique = true)
    private String username;

    @NonNull
    private String password;

    @NonNull
    @Indexed(unique = true)
    private String email;

    private Integer age;

    private Gender gender;

    @DBRef
    private Set<Role> roles = new HashSet<>(3);

    @NonNull
    private LocalDate birthDate;

    private boolean online;


}
