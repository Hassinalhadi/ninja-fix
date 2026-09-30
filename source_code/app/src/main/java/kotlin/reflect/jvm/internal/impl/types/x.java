package kotlin.reflect.jvm.internal.impl.types;

import bx.C0769g;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import pe.InterfaceC2332h;
import t6.Z1;

/* loaded from: classes2.dex */
public final class x implements ap, p000if.f {
    public y alpha;
    public final LinkedHashSet bravo;
    public final int charlie;

    public x(AbstractCollection typesToIntersect) {
        Intrinsics.echo(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.bravo = linkedHashSet;
        this.charlie = linkedHashSet.hashCode();
    }

    public final ae bravo() {
        al.purple.getClass();
        return ab.echo(al.red, this, CollectionsKt.emptyList(), false, Z1.alpha(this.bravo, "member scope for intersection type"), new C0769g(10, this));
    }

    public final String charlie(Function1 getProperTypeRelatedToStringify) {
        Intrinsics.echo(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.maroon(CollectionsKt.p(this.bravo, new A0.af(4, getProperTypeRelatedToStringify)), " & ", "{", "}", new bx.aq(2, getProperTypeRelatedToStringify), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return Intrinsics.areEqual(this.bravo, ((x) obj).bravo);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return this.charlie;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final AbstractC2120h juliet() {
        AbstractC2120h juliet = ((y) this.bravo.iterator().next()).green().juliet();
        Intrinsics.delta(juliet, "intersectedTypes.iterato…xt().constructor.builtIns");
        return juliet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final InterfaceC2332h kilo() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final Collection lima() {
        return this.bravo;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return false;
    }

    public final String toString() {
        return charlie(w.alpha);
    }
}
