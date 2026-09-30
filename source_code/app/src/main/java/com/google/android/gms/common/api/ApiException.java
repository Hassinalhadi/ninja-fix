package com.google.android.gms.common.api;

/* loaded from: classes2.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i4 = status.alpha;
        String str = status.purple;
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.alpha;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.purple;
    }
}
