package sec03.verify.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService{
	private List<Board> list=new ArrayList<>();
	private Scanner scanner=new Scanner(System.in);
	private int counter;

	public BoardService(){
		

	}

	public void showMenu() {
		while(true) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("1.목록보기 | 2.상세보기 | 3.수정하기 | 4.삭제하기 | 5. 파일 저장 | 6.종료");
			System.out.println("-----------------------------------------------------------------------------");
			
			System.out.print("선택: ");
			String selectNo=scanner.nextLine();
			switch(selectNo) {
			case "1":showList();break;
			case "2":showDetail();break;
			case "3":modifyBoard();break;
			case "4":deleteBoard();break;
			case "5":saveFile();break;
			case "6":return;
			default: System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			}
		}
	}
	public void showList() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for(Board b : list) {
			System.out.println(b.getBno()+"\t"+b.getTitle()+"\t"+b.getWriter()+"\t"+sdf.format(b.getDate()));
		}
	}
	public void showDetail() {
		//search
		int index=searchIndex();
		if(index==-1){
			System.out.println("해당하는 글이 없습니다.");
			return;
		}

		//show detail
		Board target=list.get(index);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		System.out.println("글번호: "+target.getBno());
		System.out.println("글제목: "+target.getTitle());
		System.out.println("글내용: "+target.getContent());
		System.out.println("글쓴이: "+target.getWriter());
		System.out.println("게시일: "+sdf.format(target.getDate()));
	}
	public void modifyBoard() {
		//search
		int index=searchIndex();
		if(index==-1){
			System.out.println("해당하는 글이 없습니다.");
			return;
		}

		//show detail
		Board target=list.get(index);
		System.out.print("글제목> ");
		target.setTitle(scanner.nextLine());
		System.out.print("글내용> ");
		target.setTitle(scanner.nextLine());
	}
	public void deleteBoard() {
		//search
		int index=searchIndex();
		if(index==-1){
			System.out.println("해당하는 글이 없습니다.");
			return;
		}

		//show detail
		list.remove(index);
	}
	public void saveFile() {
		try {
			FileOutputStream fos=new FileOutputStream("C:/Temp/board.db");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
			oos.close();
			System.out.println("저장 완료.");
		}catch(IOException e) {
			System.out.println("error 발생: "+e.getMessage());
		}
	}

	
	public void loadFile() {
		try {
			FileInputStream fis=new FileInputStream ("C:/Temp/board.db");
			ObjectInputStream ois=new ObjectInputStream (fis);
			list=(List<Board>) ois.readObject();
			ois.close();
		}catch(IOException e) {
			System.out.println("error 발생: "+e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println("error 발생: "+e.getMessage());
		}
	}

	public int searchIndex(){
		int result=-1;
		System.out.print("글번호> ");
		Scanner scanner=new Scanner(System.in);
		int targetNo=Integer.parseInt(scanner.nextLine());
		for(Board b : list) {
			if(b.getBno()==targetNo){
				result=targetNo;
			}
		}
		return result;
	}
}