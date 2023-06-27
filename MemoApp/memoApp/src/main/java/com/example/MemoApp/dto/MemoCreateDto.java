package com.example.MemoApp.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@NotBlank
public class MemoCreateDto {
	
	private String memo_knd;
	
	private String create_user;
	
	private LocalDateTime create_datetime;
	
	private String title;
	
	private String memo;
	
	private LocalDateTime new_datetime;
	
	private int up_knd;
}
