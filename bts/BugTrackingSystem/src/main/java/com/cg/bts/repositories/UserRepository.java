package com.cg.bts.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.bts.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  
}
























/*package com.cg.bugtracking.dao;

import com.cg.bugtracking.bean.User;

public interface IUserRepository {
	public User createUser(User user);
	public User login(User user);
	public User logout(User user);

}*/
