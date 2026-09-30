package com.incognia.internal;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class FH implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8663W = LazyKt.lazy(UbY.f9719b);

    /* renamed from: b, reason: collision with root package name */
    public final xkd f8664b;

    public FH(xkd xkdVar) {
        this.f8664b = xkdVar;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8663W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:5:0x0005, B:20:0x0044), top: B:4:0x0005 }] */
    @Override // com.incognia.internal.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        xkd xkdVar;
        Boolean bool;
        Ssq ssq;
        String str;
        byte[] bArr;
        int b2;
        r3 r3Var;
        List list;
        PackageInfo b4;
        try {
            Result.Companion companion = Result.INSTANCE;
            xkdVar = this.f8664b;
            bool = null;
            try {
                ssq = xkdVar.f11814b;
                str = ssq.olU;
                try {
                    b2 = OFM.f9292b.b();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if ((Intrinsics.areEqual(str, ssq.olU) || ssq.f9628f9) && (b4 = Uck.b(ssq.f9626W, str, b2)) != null) {
            ssq.sVU.getClass();
            r3Var = H2T.b(b4, null);
            if (r3Var != null && (list = r3Var.PqK) != null) {
                bArr = ((Signature) list.get(0)).toByteArray();
                if (bArr != null) {
                    bool = xkdVar.f11814b.b(bArr);
                }
                m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f8663W.getValue(), bool, new pFh(new Y7G(bool))));
                Bo7.b(m206constructorimpl, wa2);
            }
            bArr = null;
            if (bArr != null) {
            }
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f8663W.getValue(), bool, new pFh(new Y7G(bool))));
            Bo7.b(m206constructorimpl, wa2);
        }
        r3Var = null;
        if (r3Var != null) {
            bArr = ((Signature) list.get(0)).toByteArray();
            if (bArr != null) {
            }
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f8663W.getValue(), bool, new pFh(new Y7G(bool))));
            Bo7.b(m206constructorimpl, wa2);
        }
        bArr = null;
        if (bArr != null) {
        }
        m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f8663W.getValue(), bool, new pFh(new Y7G(bool))));
        Bo7.b(m206constructorimpl, wa2);
    }
}
