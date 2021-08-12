package jdbc.oracle.dao;

import java.util.List;

public interface PhoneBookDAO {
	public List<PhoneBookVO> getList();	//	전체 리스트
	public List<PhoneBookVO> search(String keyword);	//	검색 목록
	public PhoneBookVO get(Long id);	//	정보 확인
	public boolean insert(PhoneBookVO vo);	//	등록
	public boolean delete(Long id);	//	삭제

}