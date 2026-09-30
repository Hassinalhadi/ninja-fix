package K3;

import Aa.m;
import E3.h;
import E3.i;
import J3.o;
import J3.p;
import J3.q;
import J3.r;
import com.bumptech.glide.load.data.k;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class a implements r {
    public static final h bravo = h.alpha(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final m alpha;

    public a(m mVar) {
        this.alpha = mVar;
    }

    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, i iVar) {
        J3.h hVar = (J3.h) obj;
        m mVar = this.alpha;
        if (mVar != null) {
            p alpha = p.alpha(hVar);
            o oVar = (o) mVar.purple;
            Object alpha2 = oVar.alpha(alpha);
            ArrayDeque arrayDeque = p.bravo;
            synchronized (arrayDeque) {
                arrayDeque.offer(alpha);
            }
            J3.h hVar2 = (J3.h) alpha2;
            if (hVar2 == null) {
                oVar.foxtrot(p.alpha(hVar), hVar);
            } else {
                hVar = hVar2;
            }
        }
        return new q(hVar, new k(hVar, ((Integer) iVar.charlie(bravo)).intValue()));
    }

    @Override // J3.r
    public final /* bridge */ /* synthetic */ boolean bravo(Object obj) {
        return true;
    }
}
