package se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.C2339o;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2333i;
import pe.InterfaceC2335k;
import pe.InterfaceC2338n;
import pe.InterfaceC2345u;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class an extends AbstractC2870t implements am {

    /* renamed from: z, reason: collision with root package name */
    public static final ac f13740z;

    /* renamed from: w, reason: collision with root package name */
    public final ff.l f13741w;

    /* renamed from: x, reason: collision with root package name */
    public final ef.s f13742x;

    /* renamed from: y, reason: collision with root package name */
    public C2859i f13743y;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, se.ac] */
    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(an.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        f13740z = new Object();
    }

    public an(ff.l lVar, ef.s sVar, C2859i c2859i, am amVar, InterfaceC2472h interfaceC2472h, int i4, pe.an anVar) {
        super(i4, Ne.h.echo, sVar, amVar, anVar, interfaceC2472h);
        this.f13741w = lVar;
        this.f13742x = sVar;
        qa.j jVar = new qa.j(3, this, c2859i);
        lVar.getClass();
        new ff.h(lVar, jVar);
        this.f13743y = c2859i;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2328d
    public final InterfaceC2328d A(InterfaceC2330f newOwner, int i4, C2339o visibility) {
        Intrinsics.echo(newOwner, "newOwner");
        com.google.android.material.datepicker.j.papa(i4, "modality");
        Intrinsics.echo(visibility, "visibility");
        com.google.android.material.datepicker.j.papa(2, "kind");
        C2869s f02 = f0(ax.bravo);
        f02.purple = newOwner;
        f02.red = i4;
        f02.silver = visibility;
        f02.white = 2;
        f02.f13764f = false;
        InterfaceC2338n c02 = f02.f13775q.c0(f02);
        Intrinsics.charlie(c02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (am) c02;
    }

    @Override // se.AbstractC2870t
    public final AbstractC2870t b0(int i4, Ne.f fVar, InterfaceC2335k newOwner, InterfaceC2345u interfaceC2345u, pe.an anVar, InterfaceC2472h annotations) {
        Intrinsics.echo(newOwner, "newOwner");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        Intrinsics.echo(annotations, "annotations");
        if (i4 != 1) {
        }
        return new an(this.f13741w, this.f13742x, this.f13743y, this, annotations, 1, anVar);
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2326b
    public final kotlin.reflect.jvm.internal.impl.types.y getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.y yVar = this.yellow;
        Intrinsics.checkNotNull(yVar);
        return yVar;
    }

    @Override // se.AbstractC2870t, se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final am alpha() {
        InterfaceC2345u alpha = super.alpha();
        Intrinsics.charlie(alpha, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (am) alpha;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u, pe.ap
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final an delta(ax substitutor) {
        Intrinsics.echo(substitutor, "substitutor");
        InterfaceC2345u delta = super.delta(substitutor);
        Intrinsics.charlie(delta, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        an anVar = (an) delta;
        kotlin.reflect.jvm.internal.impl.types.y yVar = anVar.yellow;
        Intrinsics.checkNotNull(yVar);
        C2859i delta2 = this.f13743y.Y().delta(ax.delta(yVar));
        if (delta2 == null) {
            return null;
        }
        anVar.f13743y = delta2;
        return anVar;
    }

    @Override // se.AbstractC2864n, pe.InterfaceC2335k
    public final InterfaceC2333i lima() {
        return this.f13742x;
    }

    @Override // pe.InterfaceC2334j
    public final boolean yankee() {
        return this.f13743y.f13752w;
    }

    @Override // pe.InterfaceC2334j
    public final InterfaceC2330f zulu() {
        InterfaceC2330f zulu = this.f13743y.zulu();
        Intrinsics.delta(zulu, "underlyingConstructorDescriptor.constructedClass");
        return zulu;
    }

    @Override // se.AbstractC2864n, pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        return this.f13742x;
    }
}
