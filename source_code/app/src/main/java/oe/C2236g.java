package oe;

import ge.v;
import java.util.Collection;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import pe.InterfaceC2330f;
import re.InterfaceC2519c;
import s6.K4;
import se.C2861k;
import se.z;

/* renamed from: oe.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2236g implements InterfaceC2519c {
    public static final C2234e delta;
    public static final /* synthetic */ v[] echo;
    public static final Ne.c foxtrot;
    public static final Ne.f golf;
    public static final Ne.b hotel;
    public final z alpha;
    public final Function1 bravo;
    public final ff.i charlie;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oe.e] */
    static {
        kotlin.jvm.internal.v vVar = u.alpha;
        echo = new v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(C2236g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        delta = new Object();
        foxtrot = me.n.juliet;
        Ne.e eVar = me.m.charlie;
        Ne.f foxtrot2 = eVar.foxtrot();
        Intrinsics.delta(foxtrot2, "cloneable.shortName()");
        golf = foxtrot2;
        hotel = Ne.b.juliet(eVar.golf());
    }

    public C2236g(ff.l lVar, z zVar) {
        C2235f computeContainingDeclaration = C2235f.alpha;
        Intrinsics.echo(computeContainingDeclaration, "computeContainingDeclaration");
        this.alpha = zVar;
        this.bravo = computeContainingDeclaration;
        this.charlie = lVar.bravo(new Xa.f(25, this, lVar));
    }

    @Override // re.InterfaceC2519c
    public final boolean alpha(Ne.c packageFqName, Ne.f name) {
        Intrinsics.echo(packageFqName, "packageFqName");
        Intrinsics.echo(name, "name");
        if (Intrinsics.areEqual(name, golf) && Intrinsics.areEqual(packageFqName, foxtrot)) {
            return true;
        }
        return false;
    }

    @Override // re.InterfaceC2519c
    public final Collection bravo(Ne.c packageFqName) {
        Intrinsics.echo(packageFqName, "packageFqName");
        if (Intrinsics.areEqual(packageFqName, foxtrot)) {
            return ab.oscar((C2861k) K4.alpha(this.charlie, echo[0]));
        }
        return kotlin.collections.u.alpha;
    }

    @Override // re.InterfaceC2519c
    public final InterfaceC2330f charlie(Ne.b classId) {
        Intrinsics.echo(classId, "classId");
        if (Intrinsics.areEqual(classId, hotel)) {
            return (C2861k) K4.alpha(this.charlie, echo[0]);
        }
        return null;
    }
}
