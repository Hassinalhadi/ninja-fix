package okhttp3.logging.internal;

import Tf.k;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTf/k;", "", "isProbablyUtf8", "(LTf/k;)Z", "logging-interceptor"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IsProbablyUtf8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [Tf.k, java.lang.Object] */
    public static final boolean isProbablyUtf8(@NotNull k kVar) {
        ?? obj;
        int i4;
        Intrinsics.echo(kVar, "<this>");
        try {
            obj = new Object();
            long j5 = kVar.purple;
            long j6 = 64;
            if (j5 <= 64) {
                j6 = j5;
            }
            kVar.golf(0L, obj, j6);
        } catch (EOFException unused) {
        }
        for (i4 = 0; i4 < 16; i4++) {
            if (!obj.hotel()) {
                int indigo = obj.indigo();
                if (Character.isISOControl(indigo) && !Character.isWhitespace(indigo)) {
                    return false;
                }
            } else {
                return true;
            }
        }
        return true;
    }
}
