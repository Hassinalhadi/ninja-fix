package j;

import androidx.compose.foundation.lazy.layout.z;
import g.AbstractC1719b;
import java.util.List;

/* loaded from: classes3.dex */
public final class j extends G3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12873b;
    public final C1924g purple;
    public final z red;
    public final int silver;
    public final /* synthetic */ z teal;
    public final /* synthetic */ t white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C1924g c1924g, z zVar, int i4, t tVar, int i5, int i10, long j5) {
        super(5);
        this.teal = zVar;
        this.white = tVar;
        this.yellow = i5;
        this.f12872a = i10;
        this.f12873b = j5;
        this.purple = c1924g;
        this.red = zVar;
        this.silver = i4;
    }

    public final m X(int i4, int i5, int i10, int i11, long j5) {
        int india;
        C1924g c1924g = this.purple;
        Object alpha = c1924g.alpha(i4);
        Object juliet = c1924g.bravo.juliet(i4);
        List M10 = M(this.red, i4, j5);
        if (Q0.a.foxtrot(j5)) {
            india = Q0.a.juliet(j5);
        } else {
            if (!Q0.a.echo(j5)) {
                AbstractC1719b.alpha("does not have fixed height");
            }
            india = Q0.a.india(j5);
        }
        int i12 = india;
        Q0.n layoutDirection = this.teal.purple.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.s sVar = this.white.mike;
        return new m(i4, alpha, i12, i11, layoutDirection, this.yellow, this.f12872a, M10, this.f12873b, juliet, sVar, j5, i5, i10);
    }
}
