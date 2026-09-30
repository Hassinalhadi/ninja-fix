package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import u2.C3137a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lu2/b;", "Landroidx/lifecycle/al;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProcessLifecycleInitializer implements u2.b {
    @Override // u2.b
    public final Object create(Context context) {
        Intrinsics.echo(context, "context");
        C3137a charlie = C3137a.charlie(context);
        Intrinsics.delta(charlie, "getInstance(...)");
        if (charlie.bravo.contains(ProcessLifecycleInitializer.class)) {
            if (!ai.alpha.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.charlie(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new ah());
            }
            G g2 = G.f3128b;
            g2.getClass();
            g2.teal = new Handler();
            g2.white.foxtrot(aa.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.charlie(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new F(g2));
            return g2;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }

    @Override // u2.b
    public final List dependencies() {
        return CollectionsKt.emptyList();
    }
}
