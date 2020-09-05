package com.xyz.blogapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.xyz.blogapp.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Integer> {

}
