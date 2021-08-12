package jdbc.oracle.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class PhoneBookApp2 {

	public static void main(String[] args) {
		PhoneBook();
//		listprint();
//		insert();
//		delete();
//		search();
		
	}
	
	
	private static void search() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("검색어:");
		String keyword = scanner.next();
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		List<PhoneBookVO> list = dao.search(keyword);
		Iterator<PhoneBookVO> it = list.iterator();
		
		while(it.hasNext()) {
			PhoneBookVO vo = it.next();
			System.out.printf("%d\t%s\t%d\t%d%n",
					vo.getPhoneBookId(),
					vo.getPhoneBookName(),
					vo.getPhoneBookHp(),
					vo.getPhoneBookTel());
		}
		scanner.close();
		
	}
	
	
	
	
	
	private static void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("넘버:");
		long Id = scanner.nextLong();
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		boolean success = dao.delete(Id);
		
		System.out.println("PhoneBook DELETE:" + (success ? "성공": "실패"));
		scanner.close();
	}
	

	
	
	private static void insert() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("번호: "); 
        Long id = scanner.nextLong();
		
		System.out.print("이름:");
		String name = scanner.nextLine();
		System.out.print("핸드폰:");
		String hp = scanner.nextLine();
		System.out.print("집전화:");
		String tel = scanner.nextLine();
		
		PhoneBookVO vo = new PhoneBookVO(id, name, hp, tel);
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		boolean success = dao.insert(vo);
		
		System.out.println("PhoneBook INSERT:" + 
				(success ? "성공": "실패"));
		scanner.close();
	}

	
	
	private static void listprint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴번호:");
		
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		List<PhoneBookVO> list = dao.getList();
		Iterator<PhoneBookVO> it = list.iterator();
		
		while(it.hasNext()) {
			PhoneBookVO vo = it.next();
			
			System.out.printf("%n%d\t%s\t%d\t%d%n",
					vo.getPhoneBookId(),
					vo.getPhoneBookName(),
					vo.getPhoneBookHp(),
					vo.getPhoneBookTel());
		}
		System.out.println("------------------------------------------");
	}
		

	
	
		private static void PhoneBook() {
			
			// 화면 출력
			System.out.println("**********************************************");	
			System.out.println("*              전화번호 관리 프로그램              *");
			System.out.println("**********************************************");
			System.out.println("1.리스트 | 2.등록 | 3.삭제 | 4.검색 | 5.종료");
			System.out.println("------------------------------------------");


				
			}

	}
