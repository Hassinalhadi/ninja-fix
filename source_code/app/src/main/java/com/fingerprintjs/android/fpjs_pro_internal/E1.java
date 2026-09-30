package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.B1;
import com.fingerprintjs.android.fpjs_pro_internal.Q1;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class E1 implements OnSuccessListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    public /* synthetic */ E1(int i4, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public final void onSuccess(Object obj) {
        Function1 function1 = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = F1.silver + 17;
                F1.red = i4 % 128;
                int i5 = i4 % 2;
                function1.invoke(obj);
                if (i5 == 0) {
                    return;
                } else {
                    throw null;
                }
            case 1:
                int i10 = Q1.a.purple;
                Q1.a.red = ((i10 & 53) + (i10 | 53)) % 128;
                function1.invoke(obj);
                int i11 = Q1.a.red;
                Q1.a.purple = ((i11 ^ 119) + ((i11 & 119) << 1)) % 128;
                return;
            default:
                B1.delta(new Object[]{(B1.a) function1, obj}, -527042818, N0.D8871(), N0.D8871(), N0.D8871(), N0.D8871(), 527042819);
                return;
        }
    }
}
