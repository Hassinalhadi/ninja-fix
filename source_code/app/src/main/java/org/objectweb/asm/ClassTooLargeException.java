package org.objectweb.asm;

import av.q;

/* loaded from: classes2.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final String className;
    private final int constantPoolCount;

    public ClassTooLargeException(String str, int i4) {
        super(q.echo("Class too large: ", str));
        this.className = str;
        this.constantPoolCount = i4;
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }
}
