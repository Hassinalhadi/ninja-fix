package qd;

import com.google.android.gms.measurement.internal.r;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qd.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2463a {
    public static final r alpha = new r(15);
    public static final r bravo = new r(15);
    public static final r charlie = new r(15);
    public static final r delta = new r(15);
    public static final r echo = new r(15);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Throwable alpha(Throwable th) {
        Intrinsics.echo(th, "<this>");
        Throwable th2 = th;
        while (true) {
            if (th2 instanceof CancellationException) {
                CancellationException cancellationException = (CancellationException) th2;
                if (Intrinsics.areEqual(th2, cancellationException.getCause())) {
                    break;
                }
                th2 = cancellationException.getCause();
            } else {
                if (th2 == null) {
                    break;
                }
                return th2;
            }
        }
    }
}
