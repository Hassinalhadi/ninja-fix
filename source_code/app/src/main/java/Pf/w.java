package Pf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class w extends b {
    public final Of.f foxtrot;
    public final int golf;
    public int hotel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Of.d json, Of.f value) {
        super(json, null);
        Intrinsics.echo(json, "json");
        Intrinsics.echo(value, "value");
        this.foxtrot = value;
        this.golf = value.alpha.size();
        this.hotel = -1;
    }

    @Override // Pf.b
    public final Of.n blue(String tag) {
        Intrinsics.echo(tag, "tag");
        return (Of.n) this.foxtrot.alpha.get(Integer.parseInt(tag));
    }

    @Override // Pf.b
    public final String jade(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return String.valueOf(i4);
    }

    @Override // Pf.b
    public final Of.n lime() {
        return this.foxtrot;
    }

    @Override // Mf.a
    public final int sierra(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        int i4 = this.hotel;
        if (i4 < this.golf - 1) {
            int i5 = i4 + 1;
            this.hotel = i5;
            return i5;
        }
        return -1;
    }
}
