package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.AbstractC1225k;
import com.fingerprintjs.android.fpjs_pro_internal.C0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1229l {
    public final D0 alpha;
    public final String bravo;
    public final K2 charlie;

    public C1229l(D0 d02, String str, K2 k22) {
        this.alpha = d02;
        this.bravo = str;
        this.charlie = k22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void alpha(List list) {
        N14263A23323 alpha = this.charlie.alpha(list);
        if (alpha instanceof component8) {
            byte[] bArr = (byte[]) ((component8) alpha).component9;
            ((az) this.alpha).bravo(this.bravo, bArr);
            return;
        }
        if (alpha instanceof setTopP6481) {
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized N14263A23323 bravo() {
        N14263A23323 alpha = ((az) this.alpha).alpha(this.bravo);
        if (alpha instanceof component8) {
            N14263A23323 bravo = this.charlie.bravo((byte[]) ((component8) alpha).component9);
            if (bravo instanceof component8) {
                return bravo;
            }
            if (bravo instanceof setTopP6481) {
                return new setTopP6481(AbstractC1225k.a.alpha);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (alpha instanceof setTopP6481) {
            C0 c02 = (C0) ((setTopP6481) alpha).vD14832N6715;
            if (Intrinsics.areEqual(c02, C0.b.alpha)) {
                return new component8(CollectionsKt.emptyList());
            }
            if (Intrinsics.areEqual(c02, C0.a.alpha)) {
                return new setTopP6481(AbstractC1225k.a.alpha);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
