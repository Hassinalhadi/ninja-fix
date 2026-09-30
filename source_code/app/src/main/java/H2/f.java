package H2;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {
    public final L2.c alpha;
    public final Context bravo;
    public final Object charlie;
    public final LinkedHashSet delta;
    public Object echo;

    public f(Context context, L2.c cVar) {
        this.alpha = cVar;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.delta(applicationContext, "context.applicationContext");
        this.bravo = applicationContext;
        this.charlie = new Object();
        this.delta = new LinkedHashSet();
    }

    public abstract Object alpha();

    public final void bravo(Object obj) {
        synchronized (this.charlie) {
            Object obj2 = this.echo;
            if (obj2 != null && Intrinsics.areEqual(obj2, obj)) {
                return;
            }
            this.echo = obj;
            this.alpha.delta.execute(new A8.g(4, CollectionsKt.z(this.delta), this));
        }
    }

    public abstract void charlie();

    public abstract void delta();
}
