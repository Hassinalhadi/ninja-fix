package androidx.navigation.internal;

import Y1.w;
import androidx.compose.runtime.C0564b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;

    public /* synthetic */ i(String str, int i4) {
        this.alpha = i4;
        this.purple = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                String uriPattern = this.purple;
                Intrinsics.echo(uriPattern, "uriPattern");
                return new w(uriPattern, null, null);
            default:
                return C0564b.zulu(this.purple);
        }
    }
}
