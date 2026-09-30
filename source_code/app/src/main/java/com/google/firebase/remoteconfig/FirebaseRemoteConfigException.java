package com.google.firebase.remoteconfig;

import E8.c;
import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    private final c code;

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.code = c.alpha;
    }

    public c getCode() {
        return this.code;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.code = c.alpha;
    }

    public FirebaseRemoteConfigException(String str, c cVar) {
        super(str);
        this.code = cVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, c cVar) {
        super(str, th);
        this.code = cVar;
    }
}
