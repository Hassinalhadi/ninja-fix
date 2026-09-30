package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.Q1;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class A1 implements OnFailureListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ E0 purple;

    public /* synthetic */ A1(E0 e02, int i4) {
        this.alpha = i4;
        this.purple = e02;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        E0 e02 = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = B1.purple;
                B1.red = (((i4 | 121) << 1) - (i4 ^ 121)) % 128;
                ((G0) e02).alpha(null);
                B1.purple = (B1.red + 65) % 128;
                return;
            case 1:
                F1.alpha(new Object[]{e02, exc}, 1617057226, H0.vD14832N6715(), H0.vD14832N6715(), H0.vD14832N6715(), -1617057226, H0.vD14832N6715());
                return;
            default:
                Q1.a.delta(new Object[]{e02, exc}, C1208f2.vD14832N6715(), -1205674381, 1205674382, C1208f2.vD14832N6715(), C1208f2.vD14832N6715(), C1208f2.vD14832N6715());
                return;
        }
    }
}
