package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import j8.EnumC1948e;

/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {
    private final EnumC1948e status;

    public FirebaseInstallationsException(EnumC1948e enumC1948e) {
        this.status = enumC1948e;
    }

    public EnumC1948e getStatus() {
        return this.status;
    }

    public FirebaseInstallationsException(String str, EnumC1948e enumC1948e) {
        super(str);
        this.status = enumC1948e;
    }

    public FirebaseInstallationsException(String str, EnumC1948e enumC1948e, Throwable th) {
        super(str, th);
        this.status = enumC1948e;
    }
}
