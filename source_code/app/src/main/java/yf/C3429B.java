package yf;

import vf.C3207k;
import zf.AbstractC3511a;

/* renamed from: yf.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3429B extends zf.c {
    public long alpha;
    public C3207k bravo;

    @Override // zf.c
    public final boolean alpha(AbstractC3511a abstractC3511a) {
        az azVar = (az) abstractC3511a;
        if (this.alpha >= 0) {
            return false;
        }
        long j5 = azVar.f14162b;
        if (j5 < azVar.f14163c) {
            azVar.f14163c = j5;
        }
        this.alpha = j5;
        return true;
    }

    @Override // zf.c
    public final Nd.c[] bravo(AbstractC3511a abstractC3511a) {
        long j5 = this.alpha;
        this.alpha = -1L;
        this.bravo = null;
        return ((az) abstractC3511a).tango(j5);
    }
}
