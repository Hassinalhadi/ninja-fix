package zf;

import kotlin.jvm.internal.Intrinsics;
import yf.AbstractC3428A;
import yf.L;
import yf.az;

/* loaded from: classes2.dex */
public final class ad extends az implements L {
    @Override // yf.L
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f14161a;
            Intrinsics.checkNotNull(objArr);
            valueOf = Integer.valueOf(((Number) AbstractC3428A.echo(objArr, (this.f14162b + ((int) ((november() + this.f14164d) - this.f14162b))) - 1)).intValue());
        }
        return valueOf;
    }

    public final void uniform(int i4) {
        synchronized (this) {
            Object[] objArr = this.f14161a;
            Intrinsics.checkNotNull(objArr);
            alpha(Integer.valueOf(((Number) AbstractC3428A.echo(objArr, (this.f14162b + ((int) ((november() + this.f14164d) - this.f14162b))) - 1)).intValue() + i4));
        }
    }
}
