package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.al;
import h9.am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class fU implements Gg, tcn {
    public static final String DOu = (String) wGk.nsi.getValue();
    public static final String IB = (String) wGk.a2F.getValue();
    public static final String Qs = (String) wGk.f11619H.getValue();

    /* renamed from: J, reason: collision with root package name */
    public final ccL f10416J;

    /* renamed from: W, reason: collision with root package name */
    public final G5G f10419W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f10420b;

    /* renamed from: f9, reason: collision with root package name */
    public final KDK f10421f9;
    public final S0A gmP;
    public final K sVU;
    public D5f PqK = aNe.f10097b;

    /* renamed from: V, reason: collision with root package name */
    public boolean f10418V = W();
    public final ozT olU = new ozT(ocM.f11026b, gDl.f10467b, Qs);

    /* renamed from: R, reason: collision with root package name */
    public final KYK f10417R = new h9.q(1, this);

    public fU(pl2 pl2Var, W6 w62, G5G g5g, KDK kdk, K k6, S0A s0a, ccL ccl) {
        this.f10420b = pl2Var;
        this.f10419W = g5g;
        this.f10421f9 = kdk;
        this.sVU = k6;
        this.gmP = s0a;
        this.f10416J = ccl;
    }

    public static R0t DOu() {
        try {
            Integer f92 = QHn.f9492b.f9(IB);
            if (f92 == null) {
                return null;
            }
            int i4 = R0t.f9532W;
            return lW.b(f92.intValue());
        } catch (Throwable unused) {
            QHn.f9492b.b(IB);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, r1) == false) goto L21;
     */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void W(fU fUVar, R0t r0t) {
        fUVar.getClass();
        R0t DOu2 = DOu();
        r0t.getClass();
        if (DOu2 != null) {
            INC inc = INC.f8897f9;
            if (!Intrinsics.areEqual(DOu2, inc)) {
            }
        }
        ArrayList B = CollectionsKt.B(fUVar.R());
        B.add(new sh(r0t.f9533b, System.currentTimeMillis(), fUVar.sVU.b().b()));
        if (B.size() > ((JSONObject) fUVar.gmP.f9574b.get()).optInt(DOu, 10)) {
            B.remove(0);
        }
        ozT ozt = fUVar.olU;
        ozt.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = B.iterator();
        while (it.hasNext()) {
            jSONArray.put(ozt.f11042b.invoke(it.next()));
        }
        JSONObject put = new JSONObject().put(ozt.f11043f9, jSONArray);
        QHn.f9492b.b(Qs, put != null ? put.toString() : null);
        QHn.f9492b.b(IB, Integer.valueOf(r0t.f9533b));
    }

    public static final void f9(fU fUVar) {
        if (fUVar.f10418V) {
            fUVar.f10419W.b(fUVar.f10417R);
        }
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.PqK = tOI.f11377b;
    }

    @Override // com.incognia.internal.tcn
    public final void PqK() {
        njO.b(this, new al(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:2:0x0000, B:4:0x000f, B:7:0x001d, B:9:0x0029, B:12:0x003c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List R() {
        ArrayList arrayList;
        JSONArray optJSONArray;
        try {
            ozT ozt = this.olU;
            String gmP = QHn.f9492b.gmP(Qs);
            ozt.getClass();
            if (gmP != null && (optJSONArray = new JSONObject(gmP).optJSONArray(ozt.f11043f9)) != null) {
                arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(ozt.f11041W.invoke(optJSONArray.getJSONObject(i4)));
                }
                if (arrayList != null) {
                    return CollectionsKt.emptyList();
                }
                return arrayList;
            }
            arrayList = null;
            if (arrayList != null) {
            }
        } catch (Throwable unused) {
            QHn.f9492b.b(Qs);
            return CollectionsKt.emptyList();
        }
    }

    @Override // com.incognia.internal.tcn
    public final void V() {
        DF7.b(this);
    }

    @Override // com.incognia.internal.sX
    public final void b(S0A s0a) {
        DF7.W(this);
    }

    @Override // com.incognia.internal.tcn
    public final boolean gmP() {
        return this.f10418V;
    }

    @Override // com.incognia.internal.tcn
    public final void olU() {
        njO.b(this, new al(this, 0));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.PqK;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10420b;
    }

    @Override // com.incognia.internal.tcn
    public final void b(boolean z2) {
        this.f10418V = z2;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.PqK = b66.f10146b;
        njO.b(this, new al(this, 2));
    }

    public static final void b(fU fUVar, Function0 function0) {
        if (fUVar.f10418V) {
            fUVar.f10419W.W(fUVar.f10417R);
        }
        fUVar.PqK = L4.f9041b;
        function0.invoke();
    }

    public static final void b(fU fUVar, R0t r0t) {
        njO.b(fUVar, new am(2, fUVar, r0t));
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new am(0, this, cj0));
    }

    public static final void b(fU fUVar) {
        fUVar.f10419W.W(fUVar.f10417R);
    }

    public final void b(yi yiVar) {
        if (njO.b(this, new am(3, this, yiVar))) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        yiVar.b(Result.m206constructorimpl(ResultKt.createFailure(new KcS(IB))));
    }

    public final void b(FmN fmN) {
        if (njO.b(this, new am(1, this, fmN))) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        fmN.b(Result.m206constructorimpl(ResultKt.createFailure(new KcS(Qs))));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final void b(fU fUVar, Function1 function1) {
        JSONObject jSONObject;
        if (fUVar.f10421f9.b("android.permission.READ_PHONE_STATE")) {
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(new Result(Result.m206constructorimpl(fUVar.R())));
            List emptyList = CollectionsKt.emptyList();
            ozT ozt = fUVar.olU;
            ozt.getClass();
            if (emptyList != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = emptyList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(ozt.f11042b.invoke(it.next()));
                }
                jSONObject = new JSONObject().put(ozt.f11043f9, jSONArray);
            } else {
                jSONObject = null;
            }
            QHn.f9492b.b(Qs, jSONObject != null ? jSONObject.toString() : null);
            return;
        }
        Result.Companion companion2 = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new mn(Qs))), function1);
    }

    @Override // com.incognia.internal.tcn
    public final boolean W() {
        return this.f10416J.W(IB) || this.f10416J.W(Qs);
    }

    public static final void W(fU fUVar) {
        fUVar.f10419W.b(fUVar.f10417R);
    }

    public static final void W(fU fUVar, Function1 function1) {
        if (fUVar.f10421f9.b("android.permission.READ_PHONE_STATE")) {
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(DOu()), function1);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new mn(IB))), function1);
        }
    }
}
