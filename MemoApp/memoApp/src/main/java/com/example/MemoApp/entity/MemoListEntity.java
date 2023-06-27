package com.example.MemoApp.entity;

//import java.time.LocalDateTime;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "memo")
public class MemoListEntity {
	
		@Id
		@Column(name = "MEMO_ID")
		private int memo_id;
		
		@Column(name = "MEMO_KND")
		private String memo_knd;
		
		@Column(name = "CREATE_USER")
		private String create_user;
		
		@Column(name = "CREATE_DATETIME")
		private LocalDateTime create_datetime;
		
		//実装するときは更新者がいる場合はリストに作成者ではなく、更新者を表示させる。
		@Column(name = "UPDATE_USER")
		private String update_user;
		
		@Column(name = "UPDATE_DATETIME")
		private LocalDateTime update_datetime;
		
		@Column(name = "TITLE")
		private String title;
		
		/*ソートをする際に使用 
		 * create_datetimeが入り、update_datetimeがある場合はupdate_datetimeが入る
		 */
		@Column(name = "NEW_DATETIME")
		private LocalDateTime new_datetime;
		
		//更新の有無 有 = 1 無 = 0
		@Column(name = "UP_KND")
		private int up_knd;
}
