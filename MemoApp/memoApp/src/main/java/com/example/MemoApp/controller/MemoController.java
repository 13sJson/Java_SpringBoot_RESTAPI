package com.example.MemoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MemoApp.dto.MemoCreateDto;
import com.example.MemoApp.dto.MemoDeleteDto;
import com.example.MemoApp.dto.MemoSelectDto;
import com.example.MemoApp.dto.MemoUpdateDto;
//import com.example.MemoApp.entity.Memo;
import com.example.MemoApp.entity.MemoListEntity;
import com.example.MemoApp.entity.MemoSelectEntity;
import com.example.MemoApp.service.MemoService;

@RestController
public class MemoController {
	
	public int sts;									/* status   */
	
	@Autowired
	MemoService memoService;
	
	//MemoList取得
	@GetMapping(value = "/home")
	public List<MemoListEntity> memoHome(
			@RequestBody MemoListEntity memoListEntity){
		List<MemoListEntity> memoList = memoService.selectAll();
		return memoList;
	}
	
	//メモ詳細 更新履歴取得
	@GetMapping(value = "/home/memo/{memo_id}")
	public List<MemoSelectEntity> memoSelect(
			@RequestBody MemoSelectDto memoSelectDto) {
		List<MemoSelectEntity> memoSelect = memoService.memoSelect(memoSelectDto);
		return memoSelect;
	}
	
    /* MEMO新規作成
     * 戻り値: 0.... 正常
     *         1.... Error
     */
	@PostMapping(value = "/home/create")
	public int createMemo(@RequestBody MemoCreateDto memoCreateDto) {
		sts = 0;
		
		sts = memoService.createMemo(memoCreateDto);
		return sts;
	}
	
	@PutMapping(value = "/home/update")
	public int updateMemo(@RequestBody MemoUpdateDto memoUpdateDto) {
		sts = 0;
		
		sts = memoService.updateMemo(memoUpdateDto);
		return sts;
	}
	
	@DeleteMapping(value = "/home/delete")
	public int deleteMemo(@RequestBody MemoDeleteDto memoDeleteDto) {
		sts = 0;
		
		sts = memoService.deleteMemo(memoDeleteDto);
		return sts;
	}
}
