package H3;

import B8.h;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.engine.w;

/* loaded from: classes3.dex */
public final class c extends h {
    public l delta;

    @Override // B8.h
    public final int delta(Object obj) {
        w wVar = (w) obj;
        if (wVar == null) {
            return 1;
        }
        return wVar.getSize();
    }

    @Override // B8.h
    public final void echo(Object obj, Object obj2) {
        w wVar = (w) obj2;
        l lVar = this.delta;
        if (lVar != null && wVar != null) {
            lVar.echo.romeo(wVar, true);
        }
    }

    public final void hotel(int i4) {
        long j5;
        if (i4 >= 40) {
            golf(0L);
        } else {
            if (i4 < 20 && i4 != 15) {
                return;
            }
            synchronized (this) {
                j5 = this.alpha;
            }
            golf(j5 / 2);
        }
    }
}
