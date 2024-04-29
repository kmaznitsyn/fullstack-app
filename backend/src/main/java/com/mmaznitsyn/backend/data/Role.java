package com.mmaznitsyn.backend.data;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "roles")
@Getter
@Setter
public class Role extends Identifier {

    private String role;


}
