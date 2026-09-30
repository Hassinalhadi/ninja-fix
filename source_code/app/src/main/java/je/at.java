package je;

import java.util.Collection;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2617b6;
import ve.AbstractC3192d;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class at extends af {
    public final Class purple;
    public final U red;

    public at(Class jClass) {
        Intrinsics.echo(jClass, "jClass");
        this.purple = jClass;
        this.red = new U(new ao(this, 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof at) {
            if (Intrinsics.areEqual(this.purple, ((at) obj).purple)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d
    public final Class golf() {
        return this.purple;
    }

    public final int hashCode() {
        return this.purple.hashCode();
    }

    @Override // je.af
    public final Collection quebec() {
        return CollectionsKt.emptyList();
    }

    @Override // je.af
    public final Collection romeo(Ne.f fVar) {
        ar arVar = (ar) this.red.invoke();
        arVar.getClass();
        ge.v vVar = ar.golf[1];
        Object invoke = arVar.delta.invoke();
        Intrinsics.delta(invoke, "<get-scope>(...)");
        return ((Xe.n) invoke).charlie(fVar, EnumC3339b.purple);
    }

    @Override // je.af
    public final pe.al sierra(int i4) {
        ar arVar = (ar) this.red.invoke();
        arVar.getClass();
        ge.v vVar = ar.golf[3];
        Triple triple = (Triple) arVar.foxtrot.invoke();
        if (triple != null) {
            Me.g gVar = (Me.g) triple.first;
            Ie.ac acVar = (Ie.ac) triple.second;
            Me.f fVar = (Me.f) triple.third;
            Oe.n packageLocalVariable = Le.k.november;
            Intrinsics.delta(packageLocalVariable, "packageLocalVariable");
            Ie.ag agVar = (Ie.ag) AbstractC2617b6.delta(acVar, packageLocalVariable, i4);
            if (agVar != null) {
                Ie.aw awVar = acVar.yellow;
                Intrinsics.delta(awVar, "packageProto.typeTable");
                return (pe.al) a0.foxtrot(this.purple, agVar, gVar, new G6.j(awVar), fVar, as.alpha);
            }
            return null;
        }
        return null;
    }

    public final String toString() {
        return "file class " + AbstractC3192d.alpha(this.purple).bravo();
    }

    @Override // je.af
    public final Class uniform() {
        ar arVar = (ar) this.red.invoke();
        arVar.getClass();
        ge.v vVar = ar.golf[2];
        Class cls = (Class) arVar.echo.invoke();
        if (cls == null) {
            return this.purple;
        }
        return cls;
    }

    @Override // je.af
    public final Collection victor(Ne.f fVar) {
        ar arVar = (ar) this.red.invoke();
        arVar.getClass();
        ge.v vVar = ar.golf[1];
        Object invoke = arVar.delta.invoke();
        Intrinsics.delta(invoke, "<get-scope>(...)");
        return ((Xe.n) invoke).foxtrot(fVar, EnumC3339b.purple);
    }
}
