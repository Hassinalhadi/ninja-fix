package Xe;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import of.AbstractC2254i;
import pe.InterfaceC2332h;
import se.ak;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public abstract class o implements n {
    @Override // Xe.p
    public Collection alpha(f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        return CollectionsKt.emptyList();
    }

    @Override // Xe.n
    public Set bravo() {
        Collection alpha = alpha(f.papa, AbstractC2254i.alpha);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : alpha) {
            if (obj instanceof ak) {
                Ne.f name = ((ak) obj).getName();
                Intrinsics.delta(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Xe.n
    public Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        return CollectionsKt.emptyList();
    }

    @Override // Xe.n
    public Set delta() {
        return null;
    }

    @Override // Xe.n
    public Set echo() {
        Collection alpha = alpha(f.quebec, AbstractC2254i.alpha);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : alpha) {
            if (obj instanceof ak) {
                Ne.f name = ((ak) obj).getName();
                Intrinsics.delta(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Xe.n
    public Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        return CollectionsKt.emptyList();
    }

    @Override // Xe.p
    public InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        return null;
    }
}
