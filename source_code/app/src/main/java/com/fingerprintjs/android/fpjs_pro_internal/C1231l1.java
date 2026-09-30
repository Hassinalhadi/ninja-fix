package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.copy$D8871;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1231l1 {
    public final C1229l alpha;

    public C1231l1(C1229l c1229l) {
        this.alpha = c1229l;
    }

    public final synchronized void alpha(C1252q2 c1252q2) {
        try {
            N14263A23323 bravo = bravo();
            if (bravo instanceof component8) {
                bravo = new component8(CollectionsKt.a((List) ((component8) bravo).component9, kotlin.collections.ab.juliet(c1252q2)));
            } else if (!(bravo instanceof setTopP6481)) {
                throw new NoWhenBranchMatchedException();
            }
            if (bravo instanceof component8) {
                this.alpha.alpha((List) ((component8) bravo).component9);
            } else if (bravo instanceof setTopP6481) {
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized N14263A23323 bravo() {
        N14263A23323 bravo = this.alpha.bravo();
        if (bravo instanceof component8) {
            return bravo;
        }
        if (bravo instanceof setTopP6481) {
            return new setTopP6481(copy$D8871.a.charlie);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final synchronized void charlie() {
        this.alpha.alpha(CollectionsKt.emptyList());
    }
}
