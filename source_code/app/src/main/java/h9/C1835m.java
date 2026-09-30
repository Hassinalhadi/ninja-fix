package h9;

import com.incognia.internal.Lsv;
import com.incognia.internal.Vpb;
import java.lang.Thread;

/* renamed from: h9.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1835m implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int alpha;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.alpha) {
            case 0:
                Lsv.b(thread, th);
                return;
            default:
                Vpb.b(thread, th);
                return;
        }
    }
}
