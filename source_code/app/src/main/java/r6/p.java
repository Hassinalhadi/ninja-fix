package r6;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ com.google.mlkit.common.sdkinternal.m purple;

    public /* synthetic */ p(com.google.mlkit.common.sdkinternal.m mVar, int i4) {
        this.alpha = i4;
        this.purple = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                return this.purple.alpha();
            case 1:
                return this.purple.alpha();
            default:
                return this.purple.alpha();
        }
    }
}
