package com.example.MemoApp.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MemoSelectDto {
	
	private int memo_id;
	
	private LocalDateTime create_datetime;
}
