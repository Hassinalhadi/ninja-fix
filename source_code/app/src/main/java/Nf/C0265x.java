package Nf;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* renamed from: Nf.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0265x extends B {
    public final Lf.k lima;
    public final Lazy mike;

    public C0265x(String str, int i4) {
        super(str, null, i4);
        this.lima = Lf.k.bravo;
        this.mike = LazyKt.lazy(new Jb.av(i4, str, this));
    }

    @Override // Nf.B
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof SerialDescriptor)) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (serialDescriptor.november() == Lf.k.bravo) {
                    if (!Intrinsics.areEqual(this.alpha, serialDescriptor.oscar()) || !Intrinsics.areEqual(az.bravo(this), az.bravo(serialDescriptor))) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // Nf.B
    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode();
        Lf.h hVar = new Lf.h(this);
        int i5 = 1;
        while (hVar.hasNext()) {
            int i10 = i5 * 31;
            String str = (String) hVar.next();
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            i5 = i10 + i4;
        }
        return (hashCode * 31) + i5;
    }

    @Override // Nf.B, kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2716m6 november() {
        return this.lima;
    }

    @Override // Nf.B
    public final String toString() {
        return CollectionsKt.maroon(new Lf.i(0, this), ", ", this.alpha.concat("("), ")", null, 56);
    }

    @Override // Nf.B, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor uniform(int i4) {
        return ((SerialDescriptor[]) this.mike.getValue())[i4];
    }
}
