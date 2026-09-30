package androidx.emoji2.text;

import E5.j;
import K1.g;
import K1.k;
import K1.l;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.ac;
import androidx.lifecycle.al;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import u2.C3137a;
import u2.b;

/* loaded from: classes3.dex */
public class EmojiCompatInitializer implements b {
    public final void alpha(Context context) {
        Object obj;
        C3137a charlie = C3137a.charlie(context);
        charlie.getClass();
        synchronized (C3137a.echo) {
            try {
                obj = charlie.alpha.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = charlie.bravo(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ac lifecycle = ((al) obj).getLifecycle();
        lifecycle.alpha(new l(this, lifecycle));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K1.g, K1.u] */
    @Override // u2.b
    public final Object create(Context context) {
        ?? gVar = new g(new j(context));
        gVar.alpha = 1;
        if (k.kilo == null) {
            synchronized (k.juliet) {
                try {
                    if (k.kilo == null) {
                        k.kilo = new k(gVar);
                    }
                } finally {
                }
            }
        }
        alpha(context);
        return Boolean.TRUE;
    }

    @Override // u2.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
