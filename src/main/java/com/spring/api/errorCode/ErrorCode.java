package com.spring.api.errorCode;

import com.spring.api.util.RegexUtil;

public enum ErrorCode {
	//공개키 유효하지않음
	INVALID_PUBLICKEY(400,"해당 공개키는 유효하지 않습니다."),
	
	//정보 불일치
	USER_PW_NOT_MATCHED(400,"해당 사용자 PW가 일치하지 않습니다."),
	QUESTION_ANSWER_NOT_MATCHED(400,"해당 사용자 비밀번호 찾기 질문의 답이 일치하지 않습니다."),
	
	//입력값이 정규식에 맞지 않음
	AUTHOR_NAME_NOT_MATCHED_TO_REGEX(400,"해당 도서 저자의 이름 형식이 올바르지 않습니다."),
	BOOK_ISBN_NOT_MATCHED_TO_REGEX(400,"해당 도서의 ISBN 형식이 올바르지 않습니다."),
	BOOK_QUANTITY_NOT_MATCHED_TO_REGEX(400,"해당 도서 재고의 형식이 올바르지 않습니다."),
	PUBLISHER_NAME_NOT_MATCHED_TO_REGEX(400,"해당 도서 출판사의 이름 형식이 올바르지 않습니다."),
	TRANSLATOR_NAME_NOT_MATCHED_TO_REGEX(400,"해당 도서 번역자의 이름 형식이 올바르지 않습니다."),
	USER_ID_NOT_MATCHED_TO_REGEX(400,"해당 사용자 ID의 형식이 올바르지 않습니다."),
	USER_NAME_NOT_MATCHED_TO_REGEX(400,"해당 사용자 이름의 형식이 올바르지 않습니다."),
	USER_PHONE_NOT_MATCHED_TO_REGEX(400,"해당 사용자 전화번호의 형식이 올바르지 않습니다."),
	USER_PW_NOT_MATCHED_TO_REGEX(400,"해당 사용자 PW 형식이 올바르지 않습니다."),
	UUID_NOT_MATCHED_TO_REGEX(400,"해당 UUID 형식이 올바르지 않습니다."),
	
	//기본키 중복
	DUPLICATE_USER_ID(400,"해당 ISBN의 정보를 갖는 도서가 이미 존재합니다."),
	DUPLICATE_USER_PHONE(400,"해당 사용자 ID는 이미 사용중입니다."),
	DUPLICATE_BOOK_ISBN(400,"해당 사용자 전화번호는 이미 사용중입니다."),
	
	//없는 값
	NOT_FOUND_BOOK_TYPE(400,"해당 도서 장르가 존재하지 않습니다."),
	NOT_FOUND_USER(400,"해당 사용자 ID로 가입한 회원정보가 존재하지 않습니다."),
	
	//바이트초과
	BOOK_NAME_EXCEEDED_LIMIT_ON_MAXBYTES(400,"도서 제목이 "+RegexUtil.QUESTION_ANSWER_MAXBYTES+"바이트를 초과했습니다."),
	QUESTION_ANSWER_EXCEEDED_LIMIT_ON_MAXBYTES(400,"비밀번호 찾기 질문의 답이 "+RegexUtil.QUESTION_ANSWER_MAXBYTES+"바이트를 초과했습니다."),
	
	//너무 많거나 적음
	TOO_FEW_AUTHORS(400,"해당 도서에 등록할 저자의 수가 너무 적습니다."),
	TOO_MANY_AUTHORS(400,"해당 도서에 등록할 저자의 수가 너무 많습니다."),
	TOO_FEW_BOOK_QUANTITY(400,"해당 도서의 재고가 너무 적습니다."),
	
	//권한없음
	NOT_AUTHORIZED(403,"해당 작업을 요청할 권한이 없습니다."),
	
	//솔트값 변경
	NOT_CHANGEABLE_USER_SALT(400,"사용자 PW, 비밀번호 찾기 질문, 비밀번호 찾기 질문의 답은 동시에 변경되어야 합니다."),
	
	//내부오류
	INTERNAL_SERVER_ERROR(500,"서버 내부에서 오류가 발생했습니다.");
	
	private int ERROR_CODE;
	private String ERROR_MESSAGE;
	
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	public void setERROR_CODE(int eRROR_CODE) {
		ERROR_CODE = eRROR_CODE;
	}

	public String getERROR_MESSAGE() {
		return ERROR_MESSAGE;
	}

	public void setERROR_MESSAGE(String eRROR_MESSAGE) {
		ERROR_MESSAGE = eRROR_MESSAGE;
	}

	ErrorCode(int ERROR_CODE, String ERROR_MESSAGE){
		this.ERROR_CODE = ERROR_CODE;
		this.ERROR_MESSAGE = ERROR_MESSAGE;
	}
}
