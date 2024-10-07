package com.myairline.airport.adapter.persistence.port;

import com.myairline.airport.adapter.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJPARepository extends JpaRepository<UserEntity, Long> {


    @Query("select u from UserEntity u where u.id = ?1 or u.userName = ?2 or u.passport = ?3 or u.age = ?4")
    Optional<UserEntity> findByIdAndUsernameAndPassport(
            @Nullable Long id,
            @Nullable String username,
            @Nullable String passport,
            @Nullable int age
    );




}
