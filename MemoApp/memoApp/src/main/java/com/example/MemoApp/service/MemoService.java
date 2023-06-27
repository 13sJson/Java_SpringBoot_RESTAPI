package com.example.MemoApp.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MemoApp.dto.MemoCreateDto;
import com.example.MemoApp.dto.MemoDeleteDto;
import com.example.MemoApp.dto.MemoSelectDto;
import com.example.MemoApp.dto.MemoUpdateDto;
import com.example.MemoApp.entity.MemoListEntity;
import com.example.MemoApp.entity.MemoSelectEntity;
import com.example.MemoApp.repository.MemoMapper;

@Service
public class MemoService {
	
	@Autowired
	private MemoMapper memoMapper;
	
	//全件取得
	public List<MemoListEntity> selectAll() {
		return memoMapper.selectAll();
	}
	
	//特定メモ取得
	public List<MemoSelectEntity> memoSelect(MemoSelectDto memoSelectDto) {
		return memoMapper.memoSelect(memoSelectDto);
	}
	
	//新規作成
	public int createMemo(MemoCreateDto memoCreateDto) {
		
		//新規作成時の現在時間を取り込み、dtoクラスに代入
		LocalDateTime now = LocalDateTime.now();
		memoCreateDto.setCreate_datetime(now);
		
		//最新時間 = 新規作成時間
		memoCreateDto.setNew_datetime(
				memoCreateDto.getCreate_datetime());
		
		//新規作成のためup_knd = 0
		memoCreateDto.setUp_knd(0);
		
		memoMapper.createMemo(memoCreateDto);
		return 0;
	}
	
	//更新（編集）
	/* 更新時に更新リストの更新を追加予定 
	 * 対象ＤＢ update_list
	 * */
	public int updateMemo(MemoUpdateDto memoUpdateDto) {
		
		//更新時の現在時間を取り込み、dtoクラスに代入
		LocalDateTime now = LocalDateTime.now();
		memoUpdateDto.setUpdate_datetime(now);
		
		//最新時間 ＝ 更新時間
		memoUpdateDto.setNew_datetime(
				memoUpdateDto.getUpdate_datetime());
		
		//更新時間のためup_knd = 1
		memoUpdateDto.setUp_knd(1);
		
		memoMapper.updateMemo(memoUpdateDto);
		
		return 0;	
	}
	
	//削除
	public int deleteMemo(MemoDeleteDto memoDeleteDto) {
		memoMapper.deleteMemo(memoDeleteDto);
		return 0;
	}
}
