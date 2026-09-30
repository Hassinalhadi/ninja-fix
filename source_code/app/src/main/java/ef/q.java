package ef;

import Ie.ag;
import Oe.v;
import kotlin.jvm.internal.Intrinsics;
import pe.C2339o;
import pe.InterfaceC2335k;
import pe.al;
import pe.an;
import qe.InterfaceC2472h;
import se.ah;

/* loaded from: classes2.dex */
public final class q extends ah implements InterfaceC1654b {

    /* renamed from: t, reason: collision with root package name */
    public final ag f12599t;

    /* renamed from: u, reason: collision with root package name */
    public final Ke.e f12600u;

    /* renamed from: v, reason: collision with root package name */
    public final G6.j f12601v;

    /* renamed from: w, reason: collision with root package name */
    public final Ke.f f12602w;

    /* renamed from: x, reason: collision with root package name */
    public final Ge.g f12603x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC2335k containingDeclaration, al alVar, InterfaceC2472h annotations, int i4, C2339o visibility, boolean z2, Ne.f name, int i5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, ag proto, Ke.e nameResolver, G6.j typeTable, Ke.f versionRequirementTable, Ge.g gVar) {
        super(containingDeclaration, alVar, annotations, i4, visibility, z2, name, i5, an.magenta, z10, z11, z14, z12, z13);
        Intrinsics.echo(containingDeclaration, "containingDeclaration");
        Intrinsics.echo(annotations, "annotations");
        com.google.android.material.datepicker.j.papa(i4, "modality");
        Intrinsics.echo(visibility, "visibility");
        Intrinsics.echo(name, "name");
        com.google.android.material.datepicker.j.papa(i5, "kind");
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(typeTable, "typeTable");
        Intrinsics.echo(versionRequirementTable, "versionRequirementTable");
        this.f12599t = proto;
        this.f12600u = nameResolver;
        this.f12601v = typeTable;
        this.f12602w = versionRequirementTable;
        this.f12603x = gVar;
    }

    @Override // se.ah
    public final ah b0(InterfaceC2335k newOwner, int i4, C2339o newVisibility, al alVar, int i5, Ne.f newName) {
        Intrinsics.echo(newOwner, "newOwner");
        com.google.android.material.datepicker.j.papa(i4, "newModality");
        Intrinsics.echo(newVisibility, "newVisibility");
        com.google.android.material.datepicker.j.papa(i5, "kind");
        Intrinsics.echo(newName, "newName");
        return new q(newOwner, alVar, getAnnotations(), i4, newVisibility, this.white, newName, i5, this.f13723g, this.f13724h, isExternal(), this.f13727k, this.f13725i, this.f12599t, this.f12600u, this.f12601v, this.f12602w, this.f12603x);
    }

    @Override // ef.InterfaceC1663k
    public final v beige() {
        return this.f12599t;
    }

    @Override // se.ah, pe.InterfaceC2348x
    public final boolean isExternal() {
        return Ke.d.black.echo(this.f12599t.silver).booleanValue();
    }

    @Override // ef.InterfaceC1663k
    public final G6.j magenta() {
        return this.f12601v;
    }

    @Override // ef.InterfaceC1663k
    public final Ke.e plum() {
        return this.f12600u;
    }

    @Override // ef.InterfaceC1663k
    public final InterfaceC1662j teal() {
        return this.f12603x;
    }
}
