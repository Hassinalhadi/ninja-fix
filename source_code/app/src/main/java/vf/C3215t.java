package vf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: vf.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3215t {
    public static final /* synthetic */ AtomicIntegerFieldUpdater bravo = AtomicIntegerFieldUpdater.newUpdater(C3215t.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable alpha;

    public C3215t(Throwable th, boolean z2) {
        this.alpha = th;
        this._handled$volatile = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.alpha + ']';
    }
}
