package z9;

import android.content.Context;
import e3.InterfaceC1628b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l {
    public final InterfaceC1628b alpha;
    public final Context bravo;

    public l(InterfaceC1628b remoteConfig, Context context) {
        Intrinsics.echo(remoteConfig, "remoteConfig");
        Intrinsics.echo(context, "context");
        this.alpha = remoteConfig;
        this.bravo = context;
    }
}
