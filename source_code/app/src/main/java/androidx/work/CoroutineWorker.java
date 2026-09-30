package androidx.work;

import A2.e;
import A2.f;
import A2.g;
import A2.y;
import Nd.h;
import Y8.d;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.ad;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "LA2/y;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "A2/e", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CoroutineWorker extends y {
    public final WorkerParameters alpha;
    public final e bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.echo(appContext, "appContext");
        Intrinsics.echo(params, "params");
        this.alpha = params;
        this.bravo = e.purple;
    }

    public abstract Object alpha(g gVar);

    @Override // A2.y
    public final com.google.common.util.concurrent.e getForegroundInfoAsync() {
        return d.alpha(this.bravo.plus(ad.delta()), new f(this, null));
    }

    @Override // A2.y
    public final com.google.common.util.concurrent.e startWork() {
        e eVar = e.purple;
        h hVar = this.bravo;
        if (Intrinsics.areEqual(hVar, eVar)) {
            hVar = this.alpha.golf;
        }
        Intrinsics.delta(hVar, "if (coroutineContext != …rkerContext\n            }");
        return d.alpha(hVar.plus(ad.delta()), new g(this, null));
    }
}
