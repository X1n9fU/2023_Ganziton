package com.luckyseven.greendrive.Repository;

import com.luckyseven.greendrive.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUserId(String userId);
    Optional<User> findByPhoneNo(String phoneNo);
    Optional<User> findByPhoneNoAndName(String phoneNo, String name);
}