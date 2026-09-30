package R9;

import D0.ak;
import Q0.n;
import S.ac;
import Xd.m;
import Yb.C0316l0;
import android.util.Log;
import androidx.compose.foundation.layout.C0558y;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.S;
import androidx.compose.runtime.ad;
import bv.ag;
import com.airbnb.lottie.compose.LottieConstants;
import com.checkout.components.kmp.rememberme.view.otp.OTPTextFieldViewKt;
import com.checkout.components.ui.picker.PickerContentViewKt;
import d.K;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import i.InterfaceC1869r;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.ao;
import n.at;
import n.c0;
import n.e0;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.ar;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ a(Object obj, int i4, Object obj2, Object obj3, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
        this.silver = obj2;
        this.teal = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        P p4;
        C0558y c0558y;
        int alpha;
        int i4;
        ak akVar;
        boolean z2;
        int i5 = this.purple;
        Object obj2 = this.teal;
        Object obj3 = this.silver;
        Object obj4 = this.red;
        switch (this.alpha) {
            case 0:
                ((Boolean) obj).getClass();
                AtomicBoolean atomicBoolean = k.bravo;
                if (k.bravo((ProcessOrderActivityV2) obj4)) {
                    Log.i("LocationFlow", "FRESH_LOC_ALLOW action=PRE_COMPLETE taskId=" + i5 + " taskType=" + ((String) obj3) + " legacy=true");
                    ((C0316l0) obj2).invoke();
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                AbstractC2367C[] abstractC2367CArr = (AbstractC2367C[]) obj4;
                int length = abstractC2367CArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    AbstractC2367C abstractC2367C = abstractC2367CArr[i10];
                    int i12 = i11 + 1;
                    Intrinsics.checkNotNull(abstractC2367C);
                    Object yankee = abstractC2367C.yankee();
                    if (yankee instanceof P) {
                        p4 = (P) yankee;
                    } else {
                        p4 = null;
                    }
                    S s3 = (S) obj3;
                    s3.getClass();
                    if (p4 != null) {
                        c0558y = p4.charlie;
                    } else {
                        c0558y = null;
                    }
                    if (c0558y != null) {
                        alpha = c0558y.foxtrot(i5 - abstractC2367C.purple, n.alpha);
                    } else {
                        alpha = s3.bravo.alpha(0, i5 - abstractC2367C.purple);
                    }
                    AbstractC2366B.hotel(abstractC2366B, abstractC2367C, ((int[]) obj2)[i11], alpha);
                    i10++;
                    i11 = i12;
                }
                return Unit.INSTANCE;
            case 2:
                if (obj != ((ad) obj4)) {
                    if (obj instanceof ac) {
                        int i13 = ((P.f) obj3).alpha - i5;
                        ag agVar = (ag) obj2;
                        int delta = agVar.delta(obj);
                        if (delta >= 0) {
                            i4 = agVar.charlie[delta];
                        } else {
                            i4 = LottieConstants.IterateForever;
                        }
                        agVar.hotel(Math.min(i13, i4), obj);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("A derived state calculation cannot read itself");
            case 3:
                return OTPTextFieldViewKt.bravo((Xd.l) obj4, i5, (List) obj3, (List) obj2, (String) obj);
            case 4:
                return PickerContentViewKt.charlie((List) obj4, (Function1) obj3, (m) obj2, i5, (InterfaceC1869r) obj);
            default:
                AbstractC2366B abstractC2366B2 = (AbstractC2366B) obj;
                ao aoVar = (ao) obj4;
                int i14 = aoVar.purple;
                e0 e0Var = (e0) aoVar.silver.invoke();
                if (e0Var != null) {
                    akVar = e0Var.alpha;
                } else {
                    akVar = null;
                }
                if (((ar) obj3).getLayoutDirection() == n.purple) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AbstractC2367C abstractC2367C2 = (AbstractC2367C) obj2;
                Z.c lima = at.lima(abstractC2366B2, i14, aoVar.red, akVar, z2, abstractC2367C2.alpha);
                K k6 = K.purple;
                int i15 = abstractC2367C2.alpha;
                c0 c0Var = aoVar.alpha;
                c0Var.bravo(k6, lima, i5, i15);
                AbstractC2366B.juliet(abstractC2366B2, abstractC2367C2, Math.round(-c0Var.alpha()), 0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.purple = i4;
    }

    public /* synthetic */ a(AbstractC2367C[] abstractC2367CArr, S s3, int i4, int[] iArr) {
        this.alpha = 1;
        this.red = abstractC2367CArr;
        this.silver = s3;
        this.purple = i4;
        this.teal = iArr;
    }
}
