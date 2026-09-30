package s6;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.m6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2716m6 {
    public final /* synthetic */ int alpha = 1;

    public static final void alpha(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC2689j6.charlie(th, th2);
            }
        }
    }

    public int hashCode() {
        switch (this.alpha) {
            case 1:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                String kilo = kotlin.jvm.internal.u.alpha.bravo(getClass()).kilo();
                Intrinsics.checkNotNull(kilo);
                return kilo;
            default:
                return super.toString();
        }
    }
}
