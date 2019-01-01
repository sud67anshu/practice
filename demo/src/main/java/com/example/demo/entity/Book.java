package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "book",
uniqueConstraints = {@UniqueConstraint(columnNames = {"book_name"}, name="UK_BOOK_NAME"),
		@UniqueConstraint(columnNames = {"book_code"}, name="UK_BOOK_CODE")})
@Getter @Setter
@ToString
public class Book {

	@GeneratedValue
	@Column(name="id")
	@Id
	Long id;
	
	@Column(name="book_name", nullable=false, length=45)
	String bookName;
	
	@Column(name="book_code", nullable=false, length=10)
	String bookCode;
	
	@Column(name="date")
	Date date;
	
	@Column(name="mrp")
	Double mrp;
	
	@Version
	@Column(name="version_number")
	long versionNumber;
	
}
