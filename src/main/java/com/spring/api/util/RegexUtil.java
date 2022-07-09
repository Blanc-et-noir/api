package com.spring.api.util;

public class RegexUtil {
	public final static String USER_ID_REGEX = "^[a-zA-Z]{1}[a-zA-Z0-9_]{7,15}$";
	public final static String USER_PW_REGEX = "[a-zA-Z0-9_]{8,16}$";
	public final static String USER_PHONE_REGEX = "\\d{3}-\\d{4}-\\d{4}";
	public final static String UUID_REGEX = "[0-9a-fA-F]{8}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{4}\\-[0-9a-fA-F]{12}";
	public final static String USER_NAME_REGEX = "^[��-�R]{2,5}$";
	public final static String BOOK_TRANSLATOR_NAME_REGEX = "^[a-zA-Z��-�R]{1,20}";
	public final static String BOOK_AUTHOR_NAME_REGEX = "^[a-zA-Z��-�R]{1,20}";
	public final static String BOOK_ISBN_REGEX = "^[0-9]{13,13}";
	public final static String BOOK_PUBLISHER_NAME_REGEX = "^[a-zA-Z��-�R]{1,20}";
	public final static String DATE_REGEX = "^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))$";
	
	public final static int QUESTION_ANSWER_MAXBYTES = 512;
	public final static int BOOK_NAME_MAXBYTES = 120;
	public final static int BOOK_TYPE_CONTENT_MAXBYTES = 60;
	public final static int MESSAGE_CONTENT_MAXBYTES = 900;
	public final static int MESSAGE_TITLE_MAXBYTES = 300;
	
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