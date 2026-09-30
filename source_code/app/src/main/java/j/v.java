package j;

import androidx.compose.foundation.lazy.layout.am;
import androidx.compose.foundation.lazy.layout.ap;
import b.M;
import com.zendesk.service.HttpConstants;
import d.K;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class v implements am {
    public final /* synthetic */ t alpha;

    public v(t tVar) {
        this.alpha = tVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final int alpha() {
        long golf;
        t tVar = this.alpha;
        if (tVar.golf().quebec == K.alpha) {
            golf = tVar.golf().golf() & 4294967295L;
        } else {
            golf = tVar.golf().golf() >> 32;
        }
        return (int) golf;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final float bravo() {
        int alpha = this.alpha.delta.alpha();
        return (alpha * HttpConstants.HTTP_INTERNAL_ERROR) + r0.delta.bravo();
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final int charlie() {
        t tVar = this.alpha;
        return (-tVar.golf().november) + tVar.golf().romeo;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final float delta() {
        t tVar = this.alpha;
        int alpha = tVar.delta.alpha();
        int bravo = tVar.delta.bravo();
        if (tVar.delta()) {
            return (alpha * HttpConstants.HTTP_INTERNAL_ERROR) + bravo + 100;
        }
        return (alpha * HttpConstants.HTTP_INTERNAL_ERROR) + bravo;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final Object echo(int i4, ap apVar) {
        J2.l lVar = t.whiskey;
        t tVar = this.alpha;
        tVar.getClass();
        Object bravo = tVar.bravo(M.alpha, new s(tVar, i4, null), apVar);
        Od.a aVar = Od.a.alpha;
        if (bravo != aVar) {
            bravo = Unit.INSTANCE;
        }
        if (bravo == aVar) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final A0.b foxtrot() {
        return new A0.b(-1, -1);
    }
}
