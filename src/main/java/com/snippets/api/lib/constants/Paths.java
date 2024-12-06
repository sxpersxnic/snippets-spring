package com.snippets.api.lib.constants;

public class Paths {
    public static final String AUTH_CONTROLLER = "/auth";
    public static final String USER_CONTROLLER = "/users";
    public static final String PROFILE_CONTROLLER = "/profiles";
    public static final String TAG_CONTROLLER = "/tags";
    public static final String SNIPPET_CONTROLLER = "/snippets";

    public static final String SIGN_UP = AUTH_CONTROLLER + "/signup";
    public static final String SIGN_IN = AUTH_CONTROLLER + "/signin";

    public static final String USER_GET = USER_CONTROLLER + "/get/{id}";
    public static final String PROFILE_GET = PROFILE_CONTROLLER + "/get/{id}";
    public static final String TAG_GET = TAG_CONTROLLER + "/get/{id}";
    public static final String SNIPPET_GET = SNIPPET_CONTROLLER + "/get/{id}";

    public static final String USER_POST = USER_CONTROLLER + "/post";
    public static final String PROFILE_POST = PROFILE_CONTROLLER + "/post";
    public static final String TAG_POST = TAG_CONTROLLER + "/post";
    public static final String SNIPPET_POST = SNIPPET_CONTROLLER + "/post";

    public static final String USER_PATCH = USER_CONTROLLER + "/patch/{id}";
    public static final String PROFILE_PATCH = PROFILE_CONTROLLER + "/patch/{id}";
    public static final String TAG_PATCH = TAG_CONTROLLER + "/patch/{id}";
    public static final String SNIPPET_PATCH = SNIPPET_CONTROLLER + "/patch/{id}";

    public static final String USER_DELETE = USER_CONTROLLER + "/delete/{id}";
    public static final String PROFILE_DELETE = PROFILE_CONTROLLER + "/delete/{id}";
    public static final String TAG_DELETE = TAG_CONTROLLER + "/delete/{id}";
    public static final String SNIPPET_DELETE = SNIPPET_CONTROLLER + "/delete/{id}";
}
