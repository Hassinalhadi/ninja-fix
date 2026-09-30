package androidx.work;

import A2.a;
import A2.z;
import B2.w;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u2.b;

/* loaded from: classes3.dex */
public final class WorkManagerInitializer implements b {
    public static final String alpha = z.golf("WrkMgrInitializer");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r5.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (B2.w.mike != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        B2.w.mike = B2.y.bravo(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        B2.w.lima = B2.w.mike;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [A2.aa, java.lang.Object] */
    @Override // u2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object create(Context context) {
        z.echo().alpha(alpha, "Initializing WorkManager with default configuration.");
        a aVar = new a(new Object());
        Intrinsics.echo(context, "context");
        synchronized (w.november) {
            try {
                w wVar = w.lima;
                if (wVar != null && w.mike != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w.golf(context);
    }

    @Override // u2.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
