package je;

import ge.InterfaceC1773e;
import java.lang.reflect.Array;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import s6.AbstractC2759r5;
import t6.AbstractC3062u;
import ve.AbstractC3192d;

/* loaded from: classes2.dex */
public final class N implements kotlin.jvm.internal.k {
    public static final /* synthetic */ ge.v[] teal;
    public final kotlin.reflect.jvm.internal.impl.types.y alpha;
    public final T purple;
    public final T red;
    public final T silver;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        teal = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(N.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(N.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public N(kotlin.reflect.jvm.internal.impl.types.y type, Function0 function0) {
        T t5;
        Intrinsics.echo(type, "type");
        this.alpha = type;
        if (function0 instanceof T) {
            t5 = (T) function0;
        } else {
            t5 = null;
        }
        if (t5 == null) {
            if (function0 != null) {
                t5 = V.kilo(null, function0);
            } else {
                t5 = null;
            }
        }
        this.purple = t5;
        this.red = V.kilo(null, new M(this, 1));
        this.silver = V.kilo(null, new Xa.f(this, function0));
    }

    @Override // ge.w
    public final boolean alpha() {
        return this.alpha.indigo();
    }

    @Override // ge.w
    public final List delta() {
        ge.v vVar = teal[1];
        Object invoke = this.silver.invoke();
        Intrinsics.delta(invoke, "<get-arguments>(...)");
        return (List) invoke;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n5 = (N) obj;
            if (Intrinsics.areEqual(this.alpha, n5.alpha) && Intrinsics.areEqual(foxtrot(), n5.foxtrot()) && Intrinsics.areEqual(delta(), n5.delta())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // ge.w
    public final InterfaceC1773e foxtrot() {
        ge.v vVar = teal[0];
        return (InterfaceC1773e) this.red.invoke();
    }

    @Override // ge.InterfaceC1770b
    public final List getAnnotations() {
        return a0.delta(this.alpha);
    }

    public final InterfaceC1773e golf(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        kotlin.reflect.jvm.internal.impl.types.y bravo;
        InterfaceC2332h kilo = yVar.green().kilo();
        if (kilo instanceof InterfaceC2330f) {
            Class juliet = a0.juliet((InterfaceC2330f) kilo);
            if (juliet != null) {
                if (juliet.isArray()) {
                    kotlin.reflect.jvm.internal.impl.types.as asVar = (kotlin.reflect.jvm.internal.impl.types.as) CollectionsKt.m(yVar.cyan());
                    if (asVar != null && (bravo = asVar.bravo()) != null) {
                        InterfaceC1773e golf = golf(bravo);
                        if (golf != null) {
                            return new C1986z(Array.newInstance((Class<?>) AbstractC3062u.bravo(AbstractC2759r5.alpha(golf)), 0).getClass());
                        }
                        throw new Q("Cannot determine classifier for array element type: " + this);
                    }
                    return new C1986z(juliet);
                }
                if (!kotlin.reflect.jvm.internal.impl.types.az.foxtrot(yVar)) {
                    Class cls = (Class) AbstractC3192d.bravo.get(juliet);
                    if (cls != null) {
                        juliet = cls;
                    }
                    return new C1986z(juliet);
                }
                return new C1986z(juliet);
            }
        } else {
            if (kilo instanceof pe.aq) {
                return new O(null, (pe.aq) kilo);
            }
            if (kilo instanceof ef.s) {
                throw new Error("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        InterfaceC1773e foxtrot = foxtrot();
        if (foxtrot != null) {
            i4 = foxtrot.hashCode();
        } else {
            i4 = 0;
        }
        return delta().hashCode() + ((hashCode + i4) * 31);
    }

    public final String toString() {
        Pe.t tVar = X.alpha;
        return X.delta(this.alpha);
    }
}
