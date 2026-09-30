package ef;

import Ie.y;
import Oe.v;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import pe.an;
import qe.InterfaceC2472h;
import se.AbstractC2870t;
import se.ak;

/* loaded from: classes2.dex */
public final class r extends ak implements InterfaceC1654b {
    public final Ge.g A;

    /* renamed from: w, reason: collision with root package name */
    public final y f12604w;

    /* renamed from: x, reason: collision with root package name */
    public final Ke.e f12605x;

    /* renamed from: y, reason: collision with root package name */
    public final G6.j f12606y;

    /* renamed from: z, reason: collision with root package name */
    public final Ke.f f12607z;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public r(pe.InterfaceC2335k r12, se.ak r13, qe.InterfaceC2472h r14, Ne.f r15, int r16, Ie.y r17, Ke.e r18, G6.j r19, Ke.f r20, Ge.g r21, pe.an r22) {
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
            r11.f12604w = r7
            r11.f12605x = r8
            r11.f12606y = r9
            r11.f12607z = r10
            r1 = r21
            r11.A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.r.<init>(pe.k, se.ak, qe.h, Ne.f, int, Ie.y, Ke.e, G6.j, Ke.f, Ge.g, pe.an):void");
    }

    @Override // se.ak, se.AbstractC2870t
    public final AbstractC2870t b0(int i4, Ne.f name, InterfaceC2335k newOwner, InterfaceC2345u interfaceC2345u, an anVar, InterfaceC2472h annotations) {
        Intrinsics.echo(newOwner, "newOwner");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        Intrinsics.echo(annotations, "annotations");
        ak akVar = (ak) interfaceC2345u;
        if (name == null) {
            name = getName();
            Intrinsics.delta(name, "name");
        }
        r rVar = new r(newOwner, akVar, annotations, name, i4, this.f12604w, this.f12605x, this.f12606y, this.f12607z, this.A, anVar);
        rVar.f13789o = this.f13789o;
        return rVar;
    }

    @Override // ef.InterfaceC1663k
    public final v beige() {
        return this.f12604w;
    }

    @Override // ef.InterfaceC1663k
    public final G6.j magenta() {
        return this.f12606y;
    }

    @Override // ef.InterfaceC1663k
    public final Ke.e plum() {
        return this.f12605x;
    }

    @Override // ef.InterfaceC1663k
    public final InterfaceC1662j teal() {
        return this.A;
    }
}
