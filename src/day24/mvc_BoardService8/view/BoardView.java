package day24.mvc_BoardService8.view;

import day24.mvc_BoardService8.controllor.BoardControllor;

import java.util.Scanner;

public class BoardView {

    Scanner scanner = new Scanner(System.in);

    public void mainPage(){
        while (true){
            System.out.print("1.게시물등록 2.게시물출력 : ");
            int choose = scanner.nextInt();
            if( choose == 1 ) {
                boardWrite();
            }
            else if( choose == 2){
                boardPrint();
            }
        }
    }

    // view가 해야하는 역할 : 입력과 출력만 한다 ( 관례적인 약속 )
    //1. 게시물 등록 함수
    void boardWrite() {
        System.out.print("게시물 내용 :");   String content = scanner.nextLine();
        System.out.print("게시물 작성자: ");  String writer = scanner.next();
        System.out.print("게시물 비밀번호 : "); int pwd = scanner.nextInt();
        //2. 입력받은 값을 컨트롤러에게 전달
        BoardControllor boardControllor = new BoardControllor();
        boolean result = boardControllor.boardWrite(content, writer, pwd);
        //3. 컨트롤러에게 전달후 결과를 받아 출력하기
        if( result ){
            System.out.println("게시물 등록 성공"); }
        else {
            System.out.println("게시물 등록 실패");
    }

    //2.게시물 출력 함수
    void boardPrint() {



    }


}
