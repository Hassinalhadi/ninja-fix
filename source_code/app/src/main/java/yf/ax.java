package yf;

import kotlin.jvm.internal.Intrinsics;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class ax implements vf.aq {
    public final az alpha;
    public final long purple;
    public final Object red;
    public final C3207k silver;

    public ax(az azVar, long j5, Object obj, C3207k c3207k) {
        this.alpha = azVar;
        this.purple = j5;
        this.red = obj;
        this.silver = c3207k;
    }

    @Override // vf.aq
    public final void dispose() {
        az azVar = this.alpha;
        synchronized (azVar) {
            if (this.purple < azVar.november()) {
                return;
            }
            Object[] objArr = azVar.f14161a;
            Intrinsics.checkNotNull(objArr);
            if (AbstractC3428A.echo(objArr, this.purple) != this) {
                return;
            }
            AbstractC3428A.golf(objArr, this.purple, AbstractC3428A.alpha);
            azVar.india();
        }
    }
}
