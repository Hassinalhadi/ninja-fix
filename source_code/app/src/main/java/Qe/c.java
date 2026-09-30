package Qe;

import com.google.android.gms.internal.measurement.C1290a1;
import gf.InterfaceC1788c;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ap;
import pe.InterfaceC2321ad;
import pe.InterfaceC2326b;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2348x;
import pe.an;
import pe.aq;
import se.ab;

/* loaded from: classes2.dex */
public final class c implements InterfaceC1788c {
    public static final c alpha = new Object();

    public static /* synthetic */ void bravo(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static an foxtrot(InterfaceC2326b interfaceC2326b) {
        while (interfaceC2326b instanceof InterfaceC2328d) {
            InterfaceC2328d interfaceC2328d = (InterfaceC2328d) interfaceC2326b;
            if (interfaceC2328d.november() != 2) {
                break;
            }
            Collection overriddenDescriptors = interfaceC2328d.mike();
            Intrinsics.delta(overriddenDescriptors, "overriddenDescriptors");
            interfaceC2326b = (InterfaceC2328d) CollectionsKt.l(overriddenDescriptors);
            if (interfaceC2326b == null) {
                return null;
            }
        }
        return interfaceC2326b.echo();
    }

    @Override // gf.InterfaceC1788c
    public boolean alpha(ap apVar, ap apVar2) {
        if (apVar != null) {
            if (apVar2 != null) {
                return apVar.equals(apVar2);
            }
            bravo(1);
            throw null;
        }
        bravo(0);
        throw null;
    }

    public boolean charlie(InterfaceC2335k interfaceC2335k, InterfaceC2335k interfaceC2335k2, boolean z2) {
        if ((interfaceC2335k instanceof InterfaceC2330f) && (interfaceC2335k2 instanceof InterfaceC2330f)) {
            return Intrinsics.areEqual(((InterfaceC2330f) interfaceC2335k).tango(), ((InterfaceC2330f) interfaceC2335k2).tango());
        }
        if ((interfaceC2335k instanceof aq) && (interfaceC2335k2 instanceof aq)) {
            return delta((aq) interfaceC2335k, (aq) interfaceC2335k2, z2, b.alpha);
        }
        if ((interfaceC2335k instanceof InterfaceC2326b) && (interfaceC2335k2 instanceof InterfaceC2326b)) {
            InterfaceC2326b a6 = (InterfaceC2326b) interfaceC2335k;
            InterfaceC2326b b2 = (InterfaceC2326b) interfaceC2335k2;
            Intrinsics.echo(a6, "a");
            Intrinsics.echo(b2, "b");
            if (!Intrinsics.areEqual(a6, b2)) {
                if (Intrinsics.areEqual(a6.getName(), b2.getName())) {
                    if (!(a6 instanceof InterfaceC2348x) || !(b2 instanceof InterfaceC2348x) || ((InterfaceC2348x) a6).emerald() == ((InterfaceC2348x) b2).emerald()) {
                        if ((!Intrinsics.areEqual(a6.lima(), b2.lima()) || (z2 && Intrinsics.areEqual(foxtrot(a6), foxtrot(b2)))) && !e.oscar(a6) && !e.oscar(b2) && echo(a6, b2, a.alpha, z2)) {
                            k kVar = new k(new C1290a1(a6, b2, z2));
                            if (kVar.mike(a6, b2, null, true).charlie() != 1 || kVar.mike(b2, a6, null, true).charlie() != 1) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        if ((interfaceC2335k instanceof InterfaceC2321ad) && (interfaceC2335k2 instanceof InterfaceC2321ad)) {
            return Intrinsics.areEqual(((ab) ((InterfaceC2321ad) interfaceC2335k)).teal, ((ab) ((InterfaceC2321ad) interfaceC2335k2)).teal);
        }
        return Intrinsics.areEqual(interfaceC2335k, interfaceC2335k2);
    }

    public boolean delta(aq a6, aq b2, boolean z2, Xd.l equivalentCallables) {
        Intrinsics.echo(a6, "a");
        Intrinsics.echo(b2, "b");
        Intrinsics.echo(equivalentCallables, "equivalentCallables");
        if (!Intrinsics.areEqual(a6, b2)) {
            if (!Intrinsics.areEqual(a6.lima(), b2.lima()) && echo(a6, b2, equivalentCallables, z2) && a6.getIndex() == b2.getIndex()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean echo(InterfaceC2335k interfaceC2335k, InterfaceC2335k interfaceC2335k2, Xd.l lVar, boolean z2) {
        InterfaceC2335k lima = interfaceC2335k.lima();
        InterfaceC2335k lima2 = interfaceC2335k2.lima();
        if (!(lima instanceof InterfaceC2328d) && !(lima2 instanceof InterfaceC2328d)) {
            return charlie(lima, lima2, z2);
        }
        return ((Boolean) lVar.invoke(lima, lima2)).booleanValue();
    }
}
