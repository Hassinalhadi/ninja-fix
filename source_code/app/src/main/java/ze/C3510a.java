package ze;

import Lb.W;
import Qe.k;
import Qe.l;
import cf.InterfaceC0854j;
import java.util.Collection;
import java.util.LinkedHashSet;
import pe.InterfaceC2328d;

/* renamed from: ze.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3510a extends l {
    public final /* synthetic */ InterfaceC0854j bravo;
    public final /* synthetic */ LinkedHashSet charlie;
    public final /* synthetic */ boolean delta;

    public C3510a(InterfaceC0854j interfaceC0854j, LinkedHashSet linkedHashSet, boolean z2) {
        this.bravo = interfaceC0854j;
        this.charlie = linkedHashSet;
        this.delta = z2;
    }

    public static /* synthetic */ void alpha(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "overridden";
                    }
                } else {
                    objArr[0] = "member";
                }
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3 && i4 != 4) {
                objArr[2] = "addFakeOverride";
            } else {
                objArr[2] = "setOverriddenDescriptors";
            }
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Qe.l
    public final void bravo(InterfaceC2328d interfaceC2328d) {
        if (interfaceC2328d != null) {
            k.romeo(interfaceC2328d, new W(9, this));
            this.charlie.add(interfaceC2328d);
        } else {
            alpha(0);
            throw null;
        }
    }

    @Override // Qe.l
    public final void delta(InterfaceC2328d interfaceC2328d, InterfaceC2328d interfaceC2328d2) {
        if (interfaceC2328d2 != null) {
            return;
        }
        alpha(2);
        throw null;
    }

    @Override // Qe.l
    public final void papa(InterfaceC2328d interfaceC2328d, Collection collection) {
        if (interfaceC2328d != null) {
            if (this.delta && interfaceC2328d.november() != 2) {
                return;
            }
            interfaceC2328d.r(collection);
            return;
        }
        alpha(3);
        throw null;
    }
}
