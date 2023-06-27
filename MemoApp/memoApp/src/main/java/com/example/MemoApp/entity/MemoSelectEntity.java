package com.example.MemoApp.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "memo")
public class MemoSelectEntity {
	
	@Id
	@Column(name = "MEMO_ID")
	private int memo_id;
	
	@Column(name = "MEMO_KND")
	private String memo_knd;

	@Column(name = "CREATE_USER")
	private String create_user;

	@Column(name = "CREATE_DATETIME")
	private LocalDate create_datetime;

	@Column(name = "UPDATE_USER")
	private String update_user;
	
	@Column(name = "UPDATE_DATETIME")
	private LocalDateTime update_datetime;
	
	@Column(name = "UPDATE_COMMENT")
	private String update_comment;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "MEMO")
	private String memo;
	
	@Column(name = "NEW_DATETIME")
    private LocalDateTime new_datetime;
	
	@Column(name = "UP_KND")
	private int up_knd;
}
