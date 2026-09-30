package J8;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class D {
    public final Context alpha;

    public D(Context appContext) {
        Intrinsics.echo(appContext, "appContext");
        this.alpha = appContext;
    }
}
