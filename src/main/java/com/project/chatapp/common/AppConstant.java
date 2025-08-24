package com.project.chatapp.common;

public class AppConstant {

    // General constants
    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymousUser";

    // Date format constants
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    // Pagination constants
    public static final int DEFAULT_PAGE_SIZE = 10;
    public static final int MAX_PAGE_SIZE = 50;
    public static final int DEFAULT_PAGE_NUMBER = 0;

    // Security constants
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_AUTHORIZATION = "Authorization";

    // API constants


    public static class ApiPrefix {

        public static final String API_VERSION = "v1";
        public static final String API_BASE_PATH = "/api/" + API_VERSION;
        // API prefix
        public static final String USER_PATH = API_BASE_PATH + "/users";
        public static final String CHAT_ROOM_PATH = API_BASE_PATH + "/chat-rooms";
        public static final String CHAT_MESSAGE_PATH = API_BASE_PATH + "/messages";
    }


}
