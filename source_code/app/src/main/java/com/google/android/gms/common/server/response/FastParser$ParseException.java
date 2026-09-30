package com.google.android.gms.common.server.response;

/* loaded from: classes2.dex */
public class FastParser$ParseException extends Exception {
    public FastParser$ParseException(String str) {
        super(str);
    }

    public FastParser$ParseException(String str, Throwable th) {
        super("Error instantiating inner object", th);
    }

    public FastParser$ParseException(Throwable th) {
        super(th);
    }
}
