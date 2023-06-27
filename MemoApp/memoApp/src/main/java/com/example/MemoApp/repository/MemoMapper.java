package com.example.MemoApp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.MemoApp.dto.MemoCreateDto;
import com.example.MemoApp.dto.MemoDeleteDto;
import com.example.MemoApp.dto.MemoSelectDto;
import com.example.MemoApp.dto.MemoUpdateDto;
import com.example.MemoApp.entity.MemoListEntity;
import com.example.MemoApp.entity.MemoSelectEntity;

@Mapper
public interface MemoMapper {
	
	//リスト取得
	public List<MemoListEntity> selectAll();
	
	//選択したMEMOの内容取得
	public List<MemoSelectEntity> memoSelect(MemoSelectDto memoSelectDto);
	
	//MEMO新規作成
	public void createMemo(MemoCreateDto memoCreateDto);
	
	//MEMO更新（編集）
	public void updateMemo(MemoUpdateDto memoUpdateDto);
	
	//MEMO削除
	public void deleteMemo(MemoDeleteDto memoDeleteDto);
}