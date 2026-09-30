package Pf;

import Nf.C0264w;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class o {
    public final C0264w alpha;
    public boolean bravo;

    public o(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        this.alpha = new C0264w(descriptor, new n(2, this, o.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0));
    }
}
