package kd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pd.AbstractC2304b;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ io.ktor.utils.io.t purple;

    public /* synthetic */ k(io.ktor.utils.io.t tVar, int i4) {
        this.alpha = i4;
        this.purple = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC2304b replaceResponse = (AbstractC2304b) obj;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(replaceResponse, "$this$replaceResponse");
                return this.purple;
            default:
                return this.purple;
        }
    }
}
