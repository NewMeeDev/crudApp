/**
 * 
 */
package com.mneumann1.crudApp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author MNEUMANN1
 *
 */

@Entity
@Table(name="user")
public class UserModel {
	
	Long id;
	
	String name;
	String address;
	String email;
	String mobile;
	
	LocalDate dob;
	
	
	

}
