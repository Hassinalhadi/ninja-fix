package com.clevertap.android.sdk.validation;

/* loaded from: classes3.dex */
public final class ValidationResult {
    private int errorCode;
    private String errorDesc;
    private Object object;

    public ValidationResult(int i4, String str) {
        this.errorCode = i4;
        this.errorDesc = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDesc() {
        return this.errorDesc;
    }

    public Object getObject() {
        return this.object;
    }

    public void setErrorCode(int i4) {
        this.errorCode = i4;
    }

    public void setErrorDesc(String str) {
        this.errorDesc = str;
    }

    public void setObject(Object obj) {
        this.object = obj;
    }

    public ValidationResult() {
        this.errorCode = 0;
    }
}
