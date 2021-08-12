package jdbc.oracle.dao;

import java.util.List;

public interface PhoneBookDAO {
	public List<PhoneBookVO> getList();	//	1.리스트
	public boolean insert(PhoneBookVO vo);	//	2.등록
	public boolean delete(Long id);	//	3.삭제
	public List<PhoneBookVO> search(String keyword);	//	4.검색 목록
	public PhoneBookVO get(Long id);	//	정보 확인
	
	

}


