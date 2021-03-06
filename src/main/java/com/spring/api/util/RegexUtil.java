package com.spring.api.util;

//정규식에 부합하는지 판단할때 사용할 유틸 클래스
public class RegexUtil {
	//사용자 아이디는 8~16자의 영어 또는 숫자로 구성해야함
	public final static String USER_ID_REGEX = "^[a-zA-Z]{1}[a-zA-Z0-9_]{7,15}$";
	//사용자 비밀번호는 영어 또는 숫자로 8~16자로 구성해야함
	public final static String USER_PW_REGEX = "[a-zA-Z0-9_]{8,16}$";
	//사용자 전화번호 형식은 000-0000-0000이어야함
	public final static String USER_PHONE_REGEX = "\\d{3}-\\d{4}-\\d{4}";
	//UUID형식은 8-4-4-4-12 자리의 영어 또는 숫자로 구성되어야함
	public final static String UUID_REGEX = "[0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}";
	//사용자 이름은 2~5자리의 한글이어야함
	public final static String USER_NAME_REGEX = "^[가-힣]{2,5}$";
	//번역자의 이름은 영어 또는 한글로 1~20자여야함
	public final static String BOOK_TRANSLATOR_NAME_REGEX = "^[a-zA-Z가-힣]{1,20}";
	//작가 이름은 영어 또는 한글로 1~20자여야함
	public final static String BOOK_AUTHOR_NAME_REGEX = "^[a-zA-Z가-힣]{1,20}";
	//도서 ISBN코드는 -없이 숫자로만 13자리여야함
	public final static String BOOK_ISBN_REGEX = "^[0-9]{13,13}";
	//출판사 이름은 1~20자리의 영어 또는 한글이어야함
	public final static String BOOK_PUBLISHER_NAME_REGEX = "^[a-zA-Z가-힣]{1,20}";
	//날짜형식은 YYYY-MM-DD형태여야함
	public final static String DATE_REGEX = "^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))$";
	
	//비밀번호 찾기 질문의 답은 512바이트이하여야함
	public final static int QUESTION_ANSWER_MAXBYTES = 512;
	//도서 이름은 120바이트 이하여야함
	public final static int BOOK_NAME_MAXBYTES = 120;
	//도서 장르명은 60바이트 이하여야함
	public final static int BOOK_TYPE_CONTENT_MAXBYTES = 60;
	//메세지 내용은 900바이트 이하여야함
	public final static int MESSAGE_CONTENT_MAXBYTES = 900;
	//메세지 제목은 300바이트 이하여야함
	public final static int MESSAGE_TITLE_MAXBYTES = 300;
	
	//해당 문자열이 특정 수치 이하의 바이트 크기를 갖는지 판단하는 메소드
	//null이거나 특정 바이트 이상이라면 false 아니라면 true임
	public static boolean checkBytes(String str, final int maxLength) {
		if(str==null) {
			return false;
		}
		if(str.getBytes().length<=maxLength) {
			return true;
		}else {
			return false;
		}
	}
	
	//해당 문자열이 정규식에 부합하는지 판단하는 메소드
	public static boolean checkRegex(String str, String regex) {
		if(str == null) {
			return false;
		}else if(str.matches(regex)) {
			return true;
		}else {
			return false;
		}
	}
}