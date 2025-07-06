package com.learning.user.entity;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.OffsetDateTime;

@Data
@Document
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isDeleted;
    private boolean isActive;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime deletedAt;

}
