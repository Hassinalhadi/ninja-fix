package Pf;

import Nf.U;
import Nf.X;
import Nf.a0;
import Nf.d0;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public abstract class ad {
    public static final Set alpha = ArraysKt.g(new SerialDescriptor[]{X.bravo, a0.bravo, U.bravo, d0.bravo});

    public static final boolean alpha(SerialDescriptor serialDescriptor) {
        Intrinsics.echo(serialDescriptor, "<this>");
        if (serialDescriptor.isInline() && alpha.contains(serialDescriptor)) {
            return true;
        }
        return false;
    }
}
