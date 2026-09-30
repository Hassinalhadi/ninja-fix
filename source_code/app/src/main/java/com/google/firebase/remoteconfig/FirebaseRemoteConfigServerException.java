package com.google.firebase.remoteconfig;

import E8.c;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int i4, String str) {
        super(str);
        this.httpStatusCode = i4;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int i4, String str, Throwable th) {
        super(str, th);
        this.httpStatusCode = i4;
    }

    public FirebaseRemoteConfigServerException(String str, c cVar) {
        super(str, cVar);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i4, String str, c cVar) {
        super(str, cVar);
        this.httpStatusCode = i4;
    }

    public FirebaseRemoteConfigServerException(String str, Throwable th, c cVar) {
        super(str, th, cVar);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i4, String str, Throwable th, c cVar) {
        super(str, th, cVar);
        this.httpStatusCode = i4;
    }
}
