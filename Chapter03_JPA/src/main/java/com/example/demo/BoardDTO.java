package com.example.demo;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity //이 테이블은 mySQL의 board와 연결이 되어있음을 알려줌
@Table(name = "board")
@Data
public class BoardDTO {
	
	@Id //이 객체가 primary Key값임을 알려줌
	@Column(name="id", nullable = false, unique = true, length = 30) 
	private String id;
	// id varchar(30) not null unique
	
	@Column(name="name", nullable = false, length = 30)
	private String name;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="content")
	private String content;
	
	@CreationTimestamp //엔티티가 생성되는 시점의 시간 등록
	private Timestamp logtime;
	
}

/*
	create table board(
		id varchar(30) unique not null,
	)
*/