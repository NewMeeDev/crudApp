/**
 * 
 */
package com.mneumann1.crudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mneumann1.crudApp.model.UserModel;

/**
 * @author MNEUMANN1
 *
 */

@Repository
public class UserRepo extends JpaRepository<UserModel, Long> {

}
