package cf;

import Ie.aq;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;

/* renamed from: cf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0853i implements InterfaceC0855k, InterfaceC0854j {
    public static final C0853i bravo = new Object();
    public static final C0853i charlie = new Object();
    public static final C0853i delta = new Object();

    public static /* synthetic */ void delta(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i4 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int echo(Ie.aa aaVar) {
        int i4;
        if (aaVar == null) {
            i4 = -1;
        } else {
            i4 = t.$EnumSwitchMapping$0[aaVar.ordinal()];
        }
        if (i4 != 1) {
            if (i4 == 2) {
                return 3;
            }
            if (i4 == 3) {
                return 4;
            }
            if (i4 == 4) {
                return 2;
            }
        }
        return 1;
    }

    @Override // cf.InterfaceC0855k
    public kotlin.reflect.jvm.internal.impl.types.y alpha(aq proto, String flexibleId, ae lowerBound, ae upperBound) {
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(flexibleId, "flexibleId");
        Intrinsics.echo(lowerBound, "lowerBound");
        Intrinsics.echo(upperBound, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // cf.InterfaceC0854j
    public void bravo(InterfaceC2328d interfaceC2328d) {
        if (interfaceC2328d != null) {
            return;
        }
        delta(2);
        throw null;
    }

    @Override // cf.InterfaceC0854j
    public void charlie(InterfaceC2330f interfaceC2330f, ArrayList arrayList) {
        if (interfaceC2330f != null) {
            return;
        }
        delta(0);
        throw null;
    }
}
