package dd;

import io.ktor.utils.io.ak;
import kotlin.jvm.internal.Intrinsics;
import od.InterfaceC2225b;
import pd.AbstractC2304b;
import s6.AbstractC2799w0;
import t6.AbstractC2991f2;

/* renamed from: dd.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1616g extends C1614e {
    public final byte[] white;
    public final boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616g(cd.c client, InterfaceC2225b interfaceC2225b, AbstractC2304b abstractC2304b, byte[] bArr) {
        super(client);
        Intrinsics.echo(client, "client");
        this.white = bArr;
        this.purple = new C1611b(this, interfaceC2225b);
        this.red = new C1617h(this, bArr, abstractC2304b);
        AbstractC2799w0.bravo(AbstractC2991f2.alpha(abstractC2304b), bArr.length, interfaceC2225b.uniform());
        this.yellow = true;
    }

    @Override // dd.C1614e
    public final boolean bravo() {
        return this.yellow;
    }

    @Override // dd.C1614e
    public final Object foxtrot() {
        return ak.alpha(this.white);
    }
}
