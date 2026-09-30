package com.incognia.internal;

import android.content.Context;
import com.incognia.internal.Zno;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Zno {

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f10066W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10067b;

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10065f9 = (String) wGk.FJ0.getValue();
    public static final String sVU = (String) wGk.f11657U.getValue();
    public static final String gmP = (String) wGk.AS.getValue();

    /* renamed from: J, reason: collision with root package name */
    public static final String f10062J = (String) wGk.V6t.getValue();
    public static final String PqK = (String) wGk.vcp.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final String f10064V = (String) wGk.f11679at.getValue();
    public static final String olU = (String) wGk.v6n.getValue();

    /* renamed from: R, reason: collision with root package name */
    public static final String f10063R = (String) wGk.eym.getValue();
    public static final String DOu = (String) wGk.lqg.getValue();
    public static final String IB = (String) wGk.f11701la.getValue();
    public static final String Qs = (String) wGk.f11635Mf.getValue();

    public Zno(Context context, pl2 pl2Var) {
        this.f10067b = context;
        this.f10066W = pl2Var;
    }

    public final void b(final long j5, final Integer num, final List list) {
        this.f10066W.b(new d7p() { // from class: h9.ad
            @Override // com.incognia.internal.d7p
            public final void run() {
                Zno.b(Zno.this, j5, num, list);
            }
        });
    }

    public static final void b(Zno zno, long j5, Integer num, List list) {
        int intValue;
        zno.getClass();
        kT kTVar = QHn.f9492b;
        String str = f10065f9;
        M39 m39 = (M39) kTVar.b(bFB.f10165b, str);
        Integer num2 = null;
        List list2 = m39 != null ? m39.f9098f9 : null;
        Integer valueOf = m39 != null ? Integer.valueOf(m39.f9096W) : null;
        if (valueOf == null) {
            M39 b2 = zno.b();
            if (b2 != null) {
                num2 = Integer.valueOf(b2.f9096W);
            }
        } else {
            num2 = valueOf;
        }
        if (num != null) {
            intValue = num.intValue();
        } else {
            intValue = num2 != null ? num2.intValue() : 0;
        }
        if (list == null) {
            list = list2;
        }
        kTVar.b(str, new M39(j5, intValue, list), sb.f11307b);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(2:37|(1:39)(2:40|(1:42)(2:43|44)))|4|5|6|(9:8|(1:10)(1:34)|11|12|13|14|(4:16|(1:18)(1:30)|19|(4:21|(1:23)(1:27)|24|25)(1:28))|31|(0)(0))|35|12|13|14|(0)|31|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:14:0x005e, B:16:0x0064, B:18:0x0068, B:19:0x0075, B:30:0x006f), top: B:13:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M39 b() {
        String str;
        Long l10;
        Integer num;
        Object b2;
        int intValue;
        Object b4;
        long longValue;
        vQ vQVar = new vQ(this.f10067b, f10063R);
        vQ vQVar2 = new vQ(this.f10067b, DOu);
        vQ vQVar3 = new vQ(this.f10067b, IB);
        bdh b6 = new d9U(vQVar2, vQVar3, vQVar).b();
        if (Intrinsics.areEqual(b6, GmL.f8809W)) {
            str = f10062J;
        } else if (Intrinsics.areEqual(b6, Q7W.f9485W)) {
            str = gmP;
            vQVar2 = vQVar3;
        } else {
            if (Intrinsics.areEqual(b6, odR.f11028W)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        try {
            b4 = vQVar2.b(str, PqK);
        } catch (Throwable unused) {
        }
        if (b4 != null) {
            if (b4 instanceof String) {
                longValue = Long.parseLong((String) b4);
            } else {
                longValue = ((Long) b4).longValue();
            }
            l10 = Long.valueOf(longValue);
            b2 = vQVar2.b(olU, f10064V);
            if (b2 != null) {
                if (b2 instanceof String) {
                    intValue = Integer.parseInt((String) b2);
                } else {
                    intValue = ((Integer) b2).intValue();
                }
                num = Integer.valueOf(intValue);
                if (l10 == null) {
                    return null;
                }
                return new M39(num != null ? num.intValue() : 0, l10.longValue());
            }
            num = null;
            if (l10 == null) {
            }
        }
        l10 = null;
        b2 = vQVar2.b(olU, f10064V);
        if (b2 != null) {
        }
        num = null;
        if (l10 == null) {
        }
    }
}
