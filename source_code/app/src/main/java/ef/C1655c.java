package ef;

import Oe.v;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import pe.InterfaceC2334j;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import pe.an;
import qe.InterfaceC2472h;
import se.AbstractC2870t;
import se.C2859i;

/* renamed from: ef.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1655c extends C2859i implements InterfaceC1654b {
    public final Ke.f A;
    public final Ge.g B;

    /* renamed from: x, reason: collision with root package name */
    public final Ie.l f12580x;

    /* renamed from: y, reason: collision with root package name */
    public final Ke.e f12581y;

    /* renamed from: z, reason: collision with root package name */
    public final G6.j f12582z;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1655c(pe.InterfaceC2330f r12, pe.InterfaceC2334j r13, qe.InterfaceC2472h r14, boolean r15, int r16, Ie.l r17, Ke.e r18, G6.j r19, Ke.f r20, Ge.g r21, pe.an r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.Intrinsics.echo(r12, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.echo(r14, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            com.google.android.material.datepicker.j.papa(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.echo(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.echo(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.echo(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.Intrinsics.echo(r10, r0)
            if (r22 != 0) goto L38
            pe.ao r0 = pe.an.magenta
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f12580x = r7
            r11.f12581y = r8
            r11.f12582z = r9
            r11.A = r10
            r1 = r21
            r11.B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.C1655c.<init>(pe.f, pe.j, qe.h, boolean, int, Ie.l, Ke.e, G6.j, Ke.f, Ge.g, pe.an):void");
    }

    @Override // se.C2859i, se.AbstractC2870t
    public final /* bridge */ /* synthetic */ AbstractC2870t b0(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, an anVar, InterfaceC2472h interfaceC2472h) {
        return q0(interfaceC2335k, interfaceC2345u, i4, interfaceC2472h, anVar);
    }

    @Override // ef.InterfaceC1663k
    public final v beige() {
        return this.f12580x;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2348x
    public final boolean isExternal() {
        return false;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u
    public final boolean isInline() {
        return false;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u
    public final boolean isSuspend() {
        return false;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u
    public final boolean jade() {
        return false;
    }

    @Override // se.C2859i
    /* renamed from: k0 */
    public final /* bridge */ /* synthetic */ C2859i b0(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, an anVar, InterfaceC2472h interfaceC2472h) {
        return q0(interfaceC2335k, interfaceC2345u, i4, interfaceC2472h, anVar);
    }

    @Override // ef.InterfaceC1663k
    public final G6.j magenta() {
        return this.f12582z;
    }

    @Override // ef.InterfaceC1663k
    public final Ke.e plum() {
        return this.f12581y;
    }

    public final C1655c q0(InterfaceC2335k newOwner, InterfaceC2345u interfaceC2345u, int i4, InterfaceC2472h annotations, an anVar) {
        Intrinsics.echo(newOwner, "newOwner");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        Intrinsics.echo(annotations, "annotations");
        C1655c c1655c = new C1655c((InterfaceC2330f) newOwner, (InterfaceC2334j) interfaceC2345u, annotations, this.f13752w, i4, this.f12580x, this.f12581y, this.f12582z, this.A, this.B, anVar);
        c1655c.f13789o = this.f13789o;
        return c1655c;
    }

    @Override // ef.InterfaceC1663k
    public final InterfaceC1662j teal() {
        return this.B;
    }
}
