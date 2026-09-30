package Xe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.ap;
import s6.AbstractC2779t7;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class t implements n {
    public final n bravo;
    public final Lazy charlie;
    public final ax delta;
    public HashMap echo;
    public final Lazy foxtrot;

    public t(n workerScope, ax givenSubstitutor) {
        Intrinsics.echo(workerScope, "workerScope");
        Intrinsics.echo(givenSubstitutor, "givenSubstitutor");
        this.bravo = workerScope;
        this.charlie = LazyKt.lazy(new s(1, givenSubstitutor));
        av foxtrot = givenSubstitutor.foxtrot();
        Intrinsics.delta(foxtrot, "givenSubstitutor.substitution");
        this.delta = new ax(AbstractC2779t7.bravo(foxtrot));
        this.foxtrot = LazyKt.lazy(new s(0, this));
    }

    @Override // Xe.p
    public final Collection alpha(f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        return (Collection) this.foxtrot.getValue();
    }

    @Override // Xe.n
    public final Set bravo() {
        return this.bravo.bravo();
    }

    @Override // Xe.n
    public final Collection charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        return hotel(this.bravo.charlie(name, enumC3339b));
    }

    @Override // Xe.n
    public final Set delta() {
        return this.bravo.delta();
    }

    @Override // Xe.n
    public final Set echo() {
        return this.bravo.echo();
    }

    @Override // Xe.n
    public final Collection foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        return hotel(this.bravo.foxtrot(name, enumC3339b));
    }

    @Override // Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        InterfaceC2332h golf = this.bravo.golf(name, location);
        if (golf != null) {
            return (InterfaceC2332h) india(golf);
        }
        return null;
    }

    public final Collection hotel(Collection collection) {
        if (this.delta.alpha.echo()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        int i4 = 3;
        if (size >= 3) {
            i4 = (size / 3) + size + 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i4);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(india((InterfaceC2335k) it.next()));
        }
        return linkedHashSet;
    }

    public final InterfaceC2335k india(InterfaceC2335k interfaceC2335k) {
        ax axVar = this.delta;
        if (axVar.alpha.echo()) {
            return interfaceC2335k;
        }
        if (this.echo == null) {
            this.echo = new HashMap();
        }
        HashMap hashMap = this.echo;
        Intrinsics.checkNotNull(hashMap);
        Object obj = hashMap.get(interfaceC2335k);
        if (obj == null) {
            if (interfaceC2335k instanceof ap) {
                obj = ((ap) interfaceC2335k).delta(axVar);
                if (obj != null) {
                    hashMap.put(interfaceC2335k, obj);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC2335k + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC2335k).toString());
            }
        }
        return (InterfaceC2335k) obj;
    }
}
