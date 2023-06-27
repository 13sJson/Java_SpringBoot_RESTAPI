package com.example.MemoApp.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@NotBlank
public class MemoUpdateDto {
	
	//NotNull
	private int memo_id;
	
	private String memo_knd;
	
	//NotNul
	private LocalDateTime create_datetime;
	
	//NotNull
	private String update_user;
	
	//現在時刻取得
	private LocalDateTime update_datetime;
	
	private String update_comment;
	
	private String title;
	
	private String memo;
	
	//自動取得 new_datetime = update_datetime
	private LocalDateTime new_datetime;
	
	//自動取得
	private int up_knd;
}
