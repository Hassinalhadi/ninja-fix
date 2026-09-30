package org.objectweb.asm;

import av.q;

/* loaded from: classes2.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final String className;
    private final int codeSize;
    private final String descriptor;
    private final String methodName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MethodTooLargeException(String str, String str2, String str3, int i4) {
        super(r0.toString());
        StringBuilder india = q.india("Method too large: ", str, ".", str2, " ");
        india.append(str3);
        this.className = str;
        this.methodName = str2;
        this.descriptor = str3;
        this.codeSize = i4;
    }

    public String getClassName() {
        return this.className;
    }

    public int getCodeSize() {
        return this.codeSize;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getMethodName() {
        return this.methodName;
    }
}
