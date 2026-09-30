package com.incognia.internal;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class ife implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f10630W = LazyKt.lazy(VXC.f9778b);

    /* renamed from: b, reason: collision with root package name */
    public final G5G f10631b;

    public ife(G5G g5g) {
        this.f10631b = g5g;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10630W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:(5:1|2|3|4|5)|(27:7|8|9|10|(23:12|13|14|15|16|(18:18|19|20|21|22|(13:24|25|26|27|28|29|30|31|32|33|34|35|36)|46|26|27|28|29|30|31|32|33|34|35|36)|50|20|21|22|(0)|46|26|27|28|29|30|31|32|33|34|35|36)|54|14|15|16|(0)|50|20|21|22|(0)|46|26|27|28|29|30|31|32|33|34|35|36)|58|8|9|10|(0)|54|14|15|16|(0)|50|20|21|22|(0)|46|26|27|28|29|30|31|32|33|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r8.f8757W.b(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        r7.f8757W.b(r0, r6);
        r7 = r6;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006c, code lost:
    
        r6.f8757W.b(r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0050, code lost:
    
        r5.f8757W.b(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0034, code lost:
    
        r4.f8757W.b(r0, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:10:0x0024, B:12:0x002c), top: B:9:0x0024, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #6 {all -> 0x004f, blocks: (B:16:0x0040, B:18:0x0048), top: B:15:0x0040, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #4 {all -> 0x006b, blocks: (B:22:0x005c, B:24:0x0064), top: B:21:0x005c, outer: #5 }] */
    @Override // com.incognia.internal.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        Integer num;
        ArrayList arrayList;
        boolean z2;
        ArrayList arrayList2;
        boolean z10;
        ArrayList arrayList3;
        boolean z11;
        ArrayList arrayList4;
        String networkCountryIso;
        String simCountryIso;
        String networkOperatorName;
        String simOperatorName;
        try {
            Result.Companion companion = Result.INSTANCE;
            G5G g5g = this.f10631b;
            g5g.getClass();
            num = null;
            try {
                simOperatorName = g5g.PqK.getSimOperatorName();
            } catch (Throwable th) {
                g5g.f8757W.b(th, false);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        if (simOperatorName != null) {
            arrayList = RnB.b(simOperatorName);
            G5G g5g2 = this.f10631b;
            g5g2.getClass();
            networkOperatorName = g5g2.PqK.getNetworkOperatorName();
            if (networkOperatorName != null) {
                z2 = false;
                arrayList2 = RnB.b(networkOperatorName);
                G5G g5g3 = this.f10631b;
                g5g3.getClass();
                simCountryIso = g5g3.PqK.getSimCountryIso();
                if (simCountryIso != null) {
                    z10 = z2;
                    arrayList3 = RnB.b(simCountryIso);
                    G5G g5g4 = this.f10631b;
                    g5g4.getClass();
                    networkCountryIso = g5g4.PqK.getNetworkCountryIso();
                    if (networkCountryIso != null) {
                        z11 = z10;
                        arrayList4 = RnB.b(networkCountryIso);
                        G5G g5g5 = this.f10631b;
                        g5g5.getClass();
                        String networkOperator = g5g5.PqK.getNetworkOperator();
                        boolean z12 = z11;
                        String str = networkOperator;
                        G5G g5g6 = this.f10631b;
                        g5g6.getClass();
                        num = Integer.valueOf(g5g6.PqK.getPhoneType());
                        m206constructorimpl = Result.m206constructorimpl(new EyM((String) wGk.f11722s.getValue(), new Ye8(arrayList, arrayList2, arrayList3, arrayList4, str, num, this.f10631b.gmP())));
                        Bo7.b(m206constructorimpl, wa2);
                    }
                    z11 = z10;
                    arrayList4 = null;
                    G5G g5g52 = this.f10631b;
                    g5g52.getClass();
                    String networkOperator2 = g5g52.PqK.getNetworkOperator();
                    boolean z122 = z11;
                    String str2 = networkOperator2;
                    G5G g5g62 = this.f10631b;
                    g5g62.getClass();
                    num = Integer.valueOf(g5g62.PqK.getPhoneType());
                    m206constructorimpl = Result.m206constructorimpl(new EyM((String) wGk.f11722s.getValue(), new Ye8(arrayList, arrayList2, arrayList3, arrayList4, str2, num, this.f10631b.gmP())));
                    Bo7.b(m206constructorimpl, wa2);
                }
                z10 = z2;
                arrayList3 = null;
                G5G g5g42 = this.f10631b;
                g5g42.getClass();
                networkCountryIso = g5g42.PqK.getNetworkCountryIso();
                if (networkCountryIso != null) {
                }
                z11 = z10;
                arrayList4 = null;
                G5G g5g522 = this.f10631b;
                g5g522.getClass();
                String networkOperator22 = g5g522.PqK.getNetworkOperator();
                boolean z1222 = z11;
                String str22 = networkOperator22;
                G5G g5g622 = this.f10631b;
                g5g622.getClass();
                num = Integer.valueOf(g5g622.PqK.getPhoneType());
                m206constructorimpl = Result.m206constructorimpl(new EyM((String) wGk.f11722s.getValue(), new Ye8(arrayList, arrayList2, arrayList3, arrayList4, str22, num, this.f10631b.gmP())));
                Bo7.b(m206constructorimpl, wa2);
            }
            z2 = false;
            arrayList2 = null;
            G5G g5g32 = this.f10631b;
            g5g32.getClass();
            simCountryIso = g5g32.PqK.getSimCountryIso();
            if (simCountryIso != null) {
            }
            z10 = z2;
            arrayList3 = null;
            G5G g5g422 = this.f10631b;
            g5g422.getClass();
            networkCountryIso = g5g422.PqK.getNetworkCountryIso();
            if (networkCountryIso != null) {
            }
            z11 = z10;
            arrayList4 = null;
            G5G g5g5222 = this.f10631b;
            g5g5222.getClass();
            String networkOperator222 = g5g5222.PqK.getNetworkOperator();
            boolean z12222 = z11;
            String str222 = networkOperator222;
            G5G g5g6222 = this.f10631b;
            g5g6222.getClass();
            num = Integer.valueOf(g5g6222.PqK.getPhoneType());
            m206constructorimpl = Result.m206constructorimpl(new EyM((String) wGk.f11722s.getValue(), new Ye8(arrayList, arrayList2, arrayList3, arrayList4, str222, num, this.f10631b.gmP())));
            Bo7.b(m206constructorimpl, wa2);
        }
        arrayList = null;
        G5G g5g22 = this.f10631b;
        g5g22.getClass();
        networkOperatorName = g5g22.PqK.getNetworkOperatorName();
        if (networkOperatorName != null) {
        }
        z2 = false;
        arrayList2 = null;
        G5G g5g322 = this.f10631b;
        g5g322.getClass();
        simCountryIso = g5g322.PqK.getSimCountryIso();
        if (simCountryIso != null) {
        }
        z10 = z2;
        arrayList3 = null;
        G5G g5g4222 = this.f10631b;
        g5g4222.getClass();
        networkCountryIso = g5g4222.PqK.getNetworkCountryIso();
        if (networkCountryIso != null) {
        }
        z11 = z10;
        arrayList4 = null;
        G5G g5g52222 = this.f10631b;
        g5g52222.getClass();
        String networkOperator2222 = g5g52222.PqK.getNetworkOperator();
        boolean z122222 = z11;
        String str2222 = networkOperator2222;
        G5G g5g62222 = this.f10631b;
        g5g62222.getClass();
        num = Integer.valueOf(g5g62222.PqK.getPhoneType());
        m206constructorimpl = Result.m206constructorimpl(new EyM((String) wGk.f11722s.getValue(), new Ye8(arrayList, arrayList2, arrayList3, arrayList4, str2222, num, this.f10631b.gmP())));
        Bo7.b(m206constructorimpl, wa2);
    }
}
