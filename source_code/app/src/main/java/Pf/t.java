package Pf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class t extends b {
    public final Of.n foxtrot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Of.d json, Of.n value, String str) {
        super(json, str);
        Intrinsics.echo(json, "json");
        Intrinsics.echo(value, "value");
        this.foxtrot = value;
        this.alpha.add("primitive");
    }

    @Override // Pf.b
    public final Of.n blue(String tag) {
        Intrinsics.echo(tag, "tag");
        if (tag == "primitive") {
            return this.foxtrot;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // Pf.b
    public final Of.n lime() {
        return this.foxtrot;
    }

    @Override // Mf.a
    public final int sierra(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        return 0;
    }
}
