package com.mmaznitsyn.backend.data;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Basic identifier class for all entities.
 */
@Getter
@Setter
public class Identifier {

    @Id
    private String id;
}
