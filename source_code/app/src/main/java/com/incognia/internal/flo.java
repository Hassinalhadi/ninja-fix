package com.incognia.internal;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class flo implements P0 {

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10433f9 = (String) wGk.mU4.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10434W = LazyKt.lazy(aKD.f10094b);

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f10435b;

    public flo(Ssq ssq) {
        this.f10435b = ssq;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10434W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        Ssq ssq;
        String str;
        String str2;
        int b2;
        r3 r3Var;
        List list;
        PackageInfo b4;
        try {
            Result.Companion companion = Result.INSTANCE;
            ssq = this.f10435b;
            str = f10433f9;
            ssq.getClass();
            str2 = null;
            try {
                b2 = OFM.f9292b.b();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if ((Intrinsics.areEqual(str, ssq.olU) || ssq.f9628f9) && (b4 = Uck.b(ssq.f9626W, str, b2)) != null) {
            ssq.sVU.getClass();
            r3Var = H2T.b(b4, null);
            if (r3Var != null && (list = r3Var.PqK) != null) {
                byte[] byteArray = ((Signature) list.get(0)).toByteArray();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(byteArray);
                str2 = cT.f9(2, messageDigest.digest());
            }
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) wGk.k8u.getValue(), str2, new Hnm(new ZAg(str2))));
            Bo7.b(m206constructorimpl, wa2);
        }
        r3Var = null;
        if (r3Var != null) {
            byte[] byteArray2 = ((Signature) list.get(0)).toByteArray();
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
            messageDigest2.update(byteArray2);
            str2 = cT.f9(2, messageDigest2.digest());
        }
        m206constructorimpl = Result.m206constructorimpl(new P7R((String) wGk.k8u.getValue(), str2, new Hnm(new ZAg(str2))));
        Bo7.b(m206constructorimpl, wa2);
    }
}
