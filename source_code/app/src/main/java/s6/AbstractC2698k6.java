package s6;

import ge.InterfaceC1772d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: s6.k6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2698k6 {
    public static final InterfaceC1772d alpha(SerialDescriptor serialDescriptor) {
        Intrinsics.echo(serialDescriptor, "<this>");
        if (serialDescriptor instanceof Lf.b) {
            return ((Lf.b) serialDescriptor).bravo;
        }
        if (serialDescriptor instanceof Nf.J) {
            return alpha(((Nf.J) serialDescriptor).alpha);
        }
        return null;
    }

    public static final double bravo(long j5) {
        return ((j5 >>> 11) * 2048) + (j5 & 2047);
    }

    public static final String charlie(int i4, long j5) {
        if (j5 >= 0) {
            AbstractC2743p6.alpha(i4);
            String l10 = Long.toString(j5, i4);
            Intrinsics.delta(l10, "toString(...)");
            return l10;
        }
        long j6 = i4;
        long j7 = ((j5 >>> 1) / j6) << 1;
        long j10 = j5 - (j7 * j6);
        if (j10 >= j6) {
            j10 -= j6;
            j7++;
        }
        AbstractC2743p6.alpha(i4);
        String l11 = Long.toString(j7, i4);
        Intrinsics.delta(l11, "toString(...)");
        AbstractC2743p6.alpha(i4);
        String l12 = Long.toString(j10, i4);
        Intrinsics.delta(l12, "toString(...)");
        return l11.concat(l12);
    }
}
