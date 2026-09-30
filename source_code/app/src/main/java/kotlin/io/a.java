package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] charlie() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.delta(buf, "buf");
        return buf;
    }
}
