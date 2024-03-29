package com.xrontech.spring.ecom.domain.user;

import com.xrontech.spring.ecom.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "email", unique = true, length = 100)
    private String email;
    @Column(name = "mobile", unique = true, length = 10)
    private String mobile;
    @Column(name = "password", length = 20)
    private String password;
    @Column(name = "verification_code", length = 10)
    private String verificationCode;
    @Column(name = "email_verified_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp emailVerifiedAt;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType = UserType.CUSTOMER;
    @Column(name = "profile_image_path", columnDefinition = "TEXT")
    private String profileImagePath;
    @Column(name = "status")
    private boolean status;
}