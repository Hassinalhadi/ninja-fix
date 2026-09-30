package je;

import ge.EnumC1782n;
import ge.InterfaceC1783o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2328d;
import pe.InterfaceC2345u;

/* loaded from: classes2.dex */
public final class av implements InterfaceC1783o {
    public static final /* synthetic */ ge.v[] white;
    public final r alpha;
    public final int purple;
    public final EnumC1782n red;
    public final T silver;
    public final T teal;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        white = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(av.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(av.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public av(r callable, int i4, EnumC1782n enumC1782n, Function0 function0) {
        Intrinsics.echo(callable, "callable");
        this.alpha = callable;
        this.purple = i4;
        this.red = enumC1782n;
        this.silver = V.kilo(null, function0);
        this.teal = V.kilo(null, new au(this, 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof av) {
            av avVar = (av) obj;
            if (Intrinsics.areEqual(this.alpha, avVar.alpha)) {
                if (this.purple == avVar.purple) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // ge.InterfaceC1770b
    public final List getAnnotations() {
        ge.v vVar = white[1];
        Object invoke = this.teal.invoke();
        Intrinsics.delta(invoke, "<get-annotations>(...)");
        return (List) invoke;
    }

    public final String getName() {
        se.aq aqVar;
        pe.aj golf = golf();
        if (golf instanceof se.aq) {
            aqVar = (se.aq) golf;
        } else {
            aqVar = null;
        }
        if (aqVar != null && !aqVar.lima().blue()) {
            Ne.f name = aqVar.getName();
            Intrinsics.delta(name, "valueParameter.name");
            if (!name.purple) {
                return name.bravo();
            }
        }
        return null;
    }

    public final pe.aj golf() {
        ge.v vVar = white[0];
        Object invoke = this.silver.invoke();
        Intrinsics.delta(invoke, "<get-descriptor>(...)");
        return (pe.aj) invoke;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.purple;
    }

    public final N oscar() {
        kotlin.reflect.jvm.internal.impl.types.y type = golf().getType();
        Intrinsics.delta(type, "descriptor.type");
        return new N(type, new au(this, 1));
    }

    public final boolean papa() {
        se.aq aqVar;
        pe.aj golf = golf();
        if (golf instanceof se.aq) {
            aqVar = (se.aq) golf;
        } else {
            aqVar = null;
        }
        if (aqVar != null) {
            return Ue.e.alpha(aqVar);
        }
        return false;
    }

    public final boolean quebec() {
        pe.aj golf = golf();
        if ((golf instanceof se.aq) && ((se.aq) golf).f13747c != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String bravo;
        Pe.t tVar = X.alpha;
        StringBuilder sb2 = new StringBuilder();
        int ordinal = this.red.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    sb2.append("parameter #" + this.purple + ' ' + getName());
                }
            } else {
                sb2.append("extension receiver parameter");
            }
        } else {
            sb2.append("instance parameter");
        }
        sb2.append(" of ");
        InterfaceC2328d tango = this.alpha.tango();
        if (tango instanceof pe.al) {
            bravo = X.charlie((pe.al) tango);
        } else if (tango instanceof InterfaceC2345u) {
            bravo = X.bravo((InterfaceC2345u) tango);
        } else {
            throw new IllegalStateException(("Illegal callable: " + tango).toString());
        }
        sb2.append(bravo);
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
