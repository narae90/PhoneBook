import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Phone2 {
	public static void main(String[] args)  {
		boolean run = true;
		String name = null;
		String hp = null;
		String tel = null;
		String line;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);


			
			// 메인 출력 화면
		System.out.println("**********************************************");	
		System.out.println("*              전화번호 관리 프로그램              *");
		System.out.println("**********************************************");
			
		while(run) {
			System.out.println("1.리스트 | 2.등록 | 3.삭제 | 4.검색 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("메뉴번호 : ");
			
			int num = sc.nextInt();
			
			
			switch(num) {
			case 1 :
				list(); // 리스트
				break;
			case 2:
				insert(); // 등록
				break;
			case 3:
				delete(); // 삭제
				break;
			case 4:
				search(); // 검색
				break;
			case 5 :
				System.out.println("**********************************************");
				System.out.println("*                  감사합니다.                  *");
				System.out.println("**********************************************");
				run = false;
				break;
	        default:
	            System.out.println("\n[다시입력해주세요]\n");
	            break;
			} // switch 문 닫기
		} // while 문 닫기
	} //메인 닫기


		private static void list() {
			System.out.println("<1.리스트>\n");		
			try {
				File f = new File("src/list.txt");
				BufferedReader br = new BufferedReader(new FileReader(f));
				String line2;
				while ((line2 = br.readLine()) != null) {
					System.out.println(line2);
				}
				br.close();
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		
	}


		private static void insert() {
			Scanner sc = new Scanner(System.in);
			String[] add = new String[3];				
			System.out.println("<2.등록>");				
			System.out.print(">이름 : ");			
			add[0] = sc.next();				
			System.out.print(">핸드폰 : ");
			add[1] = sc.next();
			System.out.print(">집전화 : ");
			add[2] = sc.next();
			
			try {
                BufferedWriter bw = new BufferedWriter
                		(new FileWriter("src/list.txt", true));
                
                
                bw.write(add[0]+ "\t" + add[1]+"\t"+add[2] + "\n");
                bw.flush();
             	bw.close();
             } catch (FileNotFoundException e) {
            	 e.printStackTrace();
             } catch(IOException e) {
            	 e.printStackTrace();
             } catch (Exception e) {
            	 e.printStackTrace();
			}
				System.out.println("\n[등록되었습니다.]\n");
			
		}
		
		
		
		private static void delete() {
			Scanner sc = new Scanner(System.in);
			System.out.println("<3.삭제>");
			System.out.println(">번호 : ");
			String dummy = "";
			int del = 0;
			String line;
			del = sc.nextInt();
			
			try {
				File f = new File("src/list.txt");
				BufferedReader br = new BufferedReader(new FileReader(f));
				for(int i= 0; i<del -1; i++) {
					line = br.readLine();
					dummy +=(line + "\r\n");
				}
				String delData = br.readLine();
				while ((line = br.readLine()) != null) {
                	dummy += (line + "\r\n");
			}
                FileWriter fw = new FileWriter("src/list.txt");
                fw.write(dummy);
                fw.close();
                br.close();
            } catch (FileNotFoundException e) {
           	 e.printStackTrace();
            } catch(IOException e) {
           	 e.printStackTrace();
            } catch (Exception e) {
           	 e.printStackTrace();
           	 }			 
			System.out.println("삭제되었습니다.\n");
		}
		
		private static void search() {
			String find;
			String line;
			String line4 = "";
			System.out.println("<4.검색>");
			System.out.println(">이름 : ");
			
			Scanner sc = new Scanner(System.in);
			find = sc.next();
			try {
	             File f = new File("src/list.txt");
	             BufferedReader br = new BufferedReader(new FileReader(f)); 
	             while ((line = br.readLine()) != null) {
	            	 if (line.indexOf(find) != -1) {
	            		 line4 = line;
	            		 
	            	 }
	             }
	             System.out.println(line4);
	            } catch (FileNotFoundException e) {
	           	 e.printStackTrace();
	            } catch(IOException e) {
	           	 e.printStackTrace();
	            } catch (Exception e) {
	           	 e.printStackTrace();
	            }
		}
} // 클래스 닫기 끝
