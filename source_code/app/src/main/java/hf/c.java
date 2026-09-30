package hf;

import K1.r;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import me.C2117e;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import pe.InterfaceC2349y;
import pe.ai;
import qe.C2471g;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class c implements InterfaceC2349y {
    public static final c alpha = new Object();
    public static final Ne.f purple = Ne.f.golf("<Error module>");
    public static final List red;
    public static final C2117e silver;

    /* JADX WARN: Type inference failed for: r0v0, types: [hf.c, java.lang.Object] */
    static {
        CollectionsKt.emptyList();
        red = CollectionsKt.emptyList();
        C2117e c2117e = C2117e.foxtrot;
        silver = C2117e.foxtrot;
    }

    @Override // pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2335k alpha() {
        return this;
    }

    @Override // pe.InterfaceC2349y
    public final ai amber(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // pe.InterfaceC2349y
    public final boolean bronze(InterfaceC2349y targetModule) {
        Intrinsics.echo(targetModule, "targetModule");
        return false;
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return C2471g.alpha;
    }

    @Override // pe.InterfaceC2335k
    public final Ne.f getName() {
        return purple;
    }

    @Override // pe.InterfaceC2349y
    public final AbstractC2120h juliet() {
        return silver;
    }

    @Override // pe.InterfaceC2349y
    public final Collection kilo(Ne.c fqName, Function1 nameFilter) {
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(nameFilter, "nameFilter");
        return CollectionsKt.emptyList();
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        return null;
    }

    @Override // pe.InterfaceC2349y
    public final List o() {
        return red;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return null;
    }

    @Override // pe.InterfaceC2349y
    public final Object silver(r capability) {
        Intrinsics.echo(capability, "capability");
        return null;
    }
}
