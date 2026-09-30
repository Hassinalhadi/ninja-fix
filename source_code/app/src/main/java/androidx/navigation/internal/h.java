package androidx.navigation.internal;

import Y1.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ w purple;

    public /* synthetic */ h(w wVar, int i4) {
        this.alpha = i4;
        this.purple = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String key = (String) obj;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(key, "key");
                return Boolean.valueOf(!this.purple.charlie().contains(key));
            default:
                Intrinsics.echo(key, "key");
                return Boolean.valueOf(!this.purple.charlie().contains(key));
        }
    }
}
