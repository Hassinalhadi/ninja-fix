package com.incognia.internal;

import g9.a;
import h9.C1823a;
import h9.C1824b;
import h9.C1833k;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class L8H implements Gg {

    /* renamed from: J, reason: collision with root package name */
    public final sr f9045J;
    public D5f PqK = aNe.f10097b;

    /* renamed from: V, reason: collision with root package name */
    public PIe f9046V;

    /* renamed from: W, reason: collision with root package name */
    public final yC1 f9047W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9048b;

    /* renamed from: f9, reason: collision with root package name */
    public final Ssq f9049f9;
    public final CN1 gmP;
    public final wyZ sVU;

    public L8H(pl2 pl2Var, yC1 yc1, Ssq ssq, wyZ wyz, W6 w62, CN1 cn1, sr srVar) {
        this.f9048b = pl2Var;
        this.f9047W = yc1;
        this.f9049f9 = ssq;
        this.sVU = wyz;
        this.gmP = cn1;
        this.f9045J = srVar;
    }

    public static final void W() {
        AtomicReference atomicReference = DDS.f8521b;
        DDS.b(RXl.f9550b);
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.PqK = tOI.f11377b;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f9048b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.PqK = b66.f10146b;
        njO.b(this, new a(5, this));
    }

    public final void gmP() {
        Lsv.b(new a4.u(27, this));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.PqK;
    }

    public static final void b(L8H l8h) {
        Object m206constructorimpl;
        l8h.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            ArrayList b2 = l8h.f9045J.b();
            if (!b2.isEmpty()) {
                Lsv.b(b2);
            }
            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (l8h.gmP.b()) {
            l8h.gmP();
        }
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(8, this, cj0));
    }

    public static final void b(L8H l8h, Function0 function0) {
        PIe pIe = l8h.f9046V;
        if (pIe != null) {
            Lsv.b(pIe);
        }
        l8h.f9046V = null;
        l8h.PqK = L4.f9041b;
        function0.invoke();
    }

    public final void b(Throwable th, boolean z2) {
        njO.b(this, new C1833k(this, th, z2, 0));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 com.incognia.internal.PIe, still in use, count: 2, list:
          (r3v0 com.incognia.internal.PIe) from 0x0059: MOVE (r10v0 com.incognia.internal.PIe) = (r3v0 com.incognia.internal.PIe)
          (r3v0 com.incognia.internal.PIe) from 0x004f: MOVE (r10v3 com.incognia.internal.PIe) = (r3v0 com.incognia.internal.PIe)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void b(com.incognia.internal.L8H r23, java.lang.Throwable r24, boolean r25) {
        /*
            r0 = r23
            com.incognia.internal.CN1 r1 = r0.gmP
            boolean r1 = r1.b()
            if (r1 != 0) goto Lb
            return
        Lb:
            com.incognia.internal.wyZ r1 = r0.sVU
            com.incognia.internal.P3H r1 = r1.b()
            com.incognia.internal.Ssq r2 = r0.f9049f9
            com.incognia.internal.r3 r2 = r2.b()
            com.incognia.internal.PIe r3 = new com.incognia.internal.PIe
            long r4 = java.lang.System.currentTimeMillis()
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            java.lang.String r6 = r6.getID()
            java.lang.String r7 = r24.getMessage()
            if (r7 != 0) goto L2d
            java.lang.String r7 = "Unknown error"
        L2d:
            java.lang.String r8 = s6.AbstractC2689j6.echo(r24)
            java.lang.String r11 = r1.f9382f9
            java.lang.String r12 = r1.f9381b
            java.lang.String r13 = r1.sVU
            java.lang.String r14 = r1.gmP
            java.lang.String r15 = r1.f9377J
            java.lang.String r9 = r1.PqK
            int r1 = r1.f9379V
            java.lang.String r17 = java.lang.String.valueOf(r1)
            r1 = 0
            if (r2 == 0) goto L4b
            java.lang.String r10 = r2.f11196R
            r18 = r10
            goto L4d
        L4b:
            r18 = r1
        L4d:
            if (r2 == 0) goto L59
            r10 = r3
            r19 = r4
            long r3 = r2.f11200b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L5d
        L59:
            r10 = r3
            r19 = r4
            r3 = r1
        L5d:
            if (r2 == 0) goto L61
            java.lang.String r1 = r2.DOu
        L61:
            com.incognia.internal.hc r2 = com.incognia.internal.hc.f10551b
            kotlin.Lazy r2 = com.incognia.internal.wGk.lK
            java.lang.Object r2 = r2.getValue()
            r21 = r2
            java.lang.String r21 = (java.lang.String) r21
            r22 = 524288(0x80000, float:7.34684E-40)
            r4 = r19
            r19 = r3
            r3 = r10
            r10 = 1
            r20 = r1
            r16 = r9
            r9 = r25
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r25 == 0) goto L84
            r0.b(r3)
            return
        L84:
            com.incognia.internal.Lsv.b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incognia.internal.L8H.b(com.incognia.internal.L8H, java.lang.Throwable, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 com.incognia.internal.PIe, still in use, count: 3, list:
          (r7v0 com.incognia.internal.PIe) from 0x00a1: MOVE (r31v1 com.incognia.internal.PIe) = (r7v0 com.incognia.internal.PIe)
          (r7v0 com.incognia.internal.PIe) from 0x009c: MOVE (r31v4 com.incognia.internal.PIe) = (r7v0 com.incognia.internal.PIe)
          (r7v0 com.incognia.internal.PIe) from 0x0091: MOVE (r31v5 com.incognia.internal.PIe) = (r7v0 com.incognia.internal.PIe)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void b(com.incognia.internal.L8H r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incognia.internal.L8H.b(com.incognia.internal.L8H, java.util.List):void");
    }

    public static final void b(boolean z2) {
        if (z2) {
            Lsv.b();
        }
    }

    public final void b(PIe pIe) {
        this.f9046V = pIe;
        this.f9047W.b(ab.juliet(pIe), IH0.f8893b, new A2.ao(29, this, pIe));
    }

    public static final void b(L8H l8h, PIe pIe, boolean z2) {
        njO.b(l8h, new C1833k(z2, pIe, l8h));
    }

    public static final void b(boolean z2, PIe pIe, L8H l8h) {
        if (!z2) {
            Lsv.b(pIe);
        }
        l8h.f9046V = null;
        new pl2(Pgh.f9443b, true).b(new C1823a(2));
    }
}
