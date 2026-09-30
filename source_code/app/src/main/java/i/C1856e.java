package i;

import androidx.compose.foundation.lazy.layout.am;
import androidx.compose.foundation.lazy.layout.ap;
import com.zendesk.service.HttpConstants;
import d.K;
import kotlin.Unit;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1856e implements am {
    public final /* synthetic */ C1874w alpha;
    public final /* synthetic */ boolean bravo;

    public C1856e(C1874w c1874w, boolean z2) {
        this.alpha = c1874w;
        this.bravo = z2;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final int alpha() {
        long golf;
        C1874w c1874w = this.alpha;
        if (c1874w.golf().oscar == K.alpha) {
            golf = c1874w.golf().golf() & 4294967295L;
        } else {
            golf = c1874w.golf().golf() >> 32;
        }
        return (int) golf;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final float bravo() {
        int alpha = this.alpha.echo.alpha();
        return (alpha * HttpConstants.HTTP_INTERNAL_ERROR) + r0.echo.bravo();
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final int charlie() {
        C1874w c1874w = this.alpha;
        return (-c1874w.golf().lima) + c1874w.golf().papa;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final float delta() {
        C1874w c1874w = this.alpha;
        int alpha = c1874w.echo.alpha();
        int bravo = c1874w.echo.bravo();
        if (c1874w.delta()) {
            return (alpha * HttpConstants.HTTP_INTERNAL_ERROR) + bravo + 100;
        }
        return (alpha * HttpConstants.HTTP_INTERNAL_ERROR) + bravo;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final Object echo(int i4, ap apVar) {
        Object india = C1874w.india(this.alpha, i4, apVar);
        if (india == Od.a.alpha) {
            return india;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.am
    public final A0.b foxtrot() {
        boolean z2 = this.bravo;
        C1874w c1874w = this.alpha;
        if (z2) {
            return new A0.b(c1874w.golf().november, 1);
        }
        return new A0.b(1, c1874w.golf().november);
    }
}
