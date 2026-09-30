package vf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: vf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3201e {
    public static final /* synthetic */ AtomicIntegerFieldUpdater bravo = AtomicIntegerFieldUpdater.newUpdater(C3201e.class, "notCompletedCount$volatile");
    public final ag[] alpha;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C3201e(ag[] agVarArr) {
        this.alpha = agVarArr;
        this.notCompletedCount$volatile = agVarArr.length;
    }
}
