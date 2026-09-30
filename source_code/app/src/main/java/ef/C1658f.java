package ef;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import pe.C2341q;
import pe.InterfaceC2328d;
import se.AbstractC2870t;

/* renamed from: ef.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1658f extends Qe.l {
    public final /* synthetic */ int bravo;
    public final /* synthetic */ AbstractCollection charlie;

    public /* synthetic */ C1658f(AbstractCollection abstractCollection, int i4) {
        this.bravo = i4;
        this.charlie = abstractCollection;
    }

    public static /* synthetic */ void alpha(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            if (i4 != 2) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i4 != 1 && i4 != 2) {
            objArr[2] = "addFakeOverride";
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Qe.l
    public final void bravo(InterfaceC2328d fakeOverride) {
        switch (this.bravo) {
            case 0:
                Intrinsics.echo(fakeOverride, "fakeOverride");
                Qe.k.romeo(fakeOverride, null);
                ((ArrayList) this.charlie).add(fakeOverride);
                return;
            default:
                if (fakeOverride != null) {
                    Qe.k.romeo(fakeOverride, null);
                    ((LinkedHashSet) this.charlie).add(fakeOverride);
                    return;
                } else {
                    alpha(0);
                    throw null;
                }
        }
    }

    @Override // Qe.l
    public final void delta(InterfaceC2328d interfaceC2328d, InterfaceC2328d fromCurrent) {
        switch (this.bravo) {
            case 0:
                Intrinsics.echo(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof AbstractC2870t) {
                    ((AbstractC2870t) fromCurrent).g0(C2341q.alpha, interfaceC2328d);
                    return;
                }
                return;
            default:
                if (fromCurrent != null) {
                    return;
                }
                alpha(2);
                throw null;
        }
    }
}
