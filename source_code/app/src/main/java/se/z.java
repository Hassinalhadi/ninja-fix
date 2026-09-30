package se;

import bx.C0769g;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import me.AbstractC2120h;
import pe.AbstractC2347w;
import pe.InterfaceC2325ah;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import pe.InterfaceC2349y;
import qe.C2471g;

/* loaded from: classes2.dex */
public final class z extends AbstractC2863m implements InterfaceC2349y {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2325ah f13798a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13799b;

    /* renamed from: c, reason: collision with root package name */
    public final ff.e f13800c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f13801d;
    public final ff.l red;
    public final AbstractC2120h silver;
    public final Map teal;
    public final ae white;
    public com.google.android.play.core.integrity.c yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Ne.f moduleName, ff.l lVar, AbstractC2120h abstractC2120h, int i4) {
        super(C2471g.alpha, moduleName);
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        Intrinsics.echo(moduleName, "moduleName");
        this.red = lVar;
        this.silver = abstractC2120h;
        if (moduleName.purple) {
            this.teal = tVar;
            ae.alpha.getClass();
            ae aeVar = (ae) silver(ac.bravo);
            this.white = aeVar == null ? ad.bravo : aeVar;
            this.f13799b = true;
            this.f13800c = lVar.charlie(new C0769g(17, this));
            this.f13801d = LazyKt.lazy(new me.k(this, 2));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }

    public final void Y() {
        if (this.f13799b) {
            return;
        }
        if (silver(AbstractC2347w.alpha) == null) {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
        throw new ClassCastException();
    }

    @Override // pe.InterfaceC2349y
    public final pe.ai amber(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        Y();
        return (pe.ai) this.f13800c.invoke(fqName);
    }

    @Override // pe.InterfaceC2349y
    public final boolean bronze(InterfaceC2349y targetModule) {
        Intrinsics.echo(targetModule, "targetModule");
        if (!Intrinsics.areEqual(this, targetModule)) {
            com.google.android.play.core.integrity.c cVar = this.yellow;
            Intrinsics.checkNotNull(cVar);
            cVar.getClass();
            if (CollectionsKt.bronze(kotlin.collections.u.alpha, targetModule) || o().contains(targetModule) || targetModule.o().contains(this)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // pe.InterfaceC2349y
    public final AbstractC2120h juliet() {
        return this.silver;
    }

    @Override // pe.InterfaceC2349y
    public final Collection kilo(Ne.c fqName, Function1 nameFilter) {
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(nameFilter, "nameFilter");
        Y();
        Y();
        return ((C2862l) this.f13801d.getValue()).kilo(fqName, nameFilter);
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        return null;
    }

    @Override // pe.InterfaceC2349y
    public final List o() {
        com.google.android.play.core.integrity.c cVar = this.yellow;
        if (cVar != null) {
            return (List) cVar.red;
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = getName().alpha;
        Intrinsics.delta(str, "name.toString()");
        sb2.append(str);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.coral(obj, this);
    }

    @Override // pe.InterfaceC2349y
    public final Object silver(K1.r capability) {
        Intrinsics.echo(capability, "capability");
        Object obj = this.teal.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // se.AbstractC2863m
    public final String toString() {
        String X10 = AbstractC2863m.X(this);
        if (this.f13799b) {
            return X10;
        }
        return X10.concat(" !isValid");
    }
}
