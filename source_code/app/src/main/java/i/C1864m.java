package i;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;

/* renamed from: i.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1864m extends G3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T.i f12758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T.j f12759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12760d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f12761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1874w f12762g;
    public final C1862k purple;
    public final androidx.compose.foundation.lazy.layout.z red;
    public final long silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.z white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864m(long j5, boolean z2, C1862k c1862k, androidx.compose.foundation.lazy.layout.z zVar, int i4, int i5, T.i iVar, T.j jVar, int i10, int i11, long j6, C1874w c1874w) {
        super(5);
        int i12;
        this.teal = z2;
        this.white = zVar;
        this.yellow = i4;
        this.f12757a = i5;
        this.f12758b = iVar;
        this.f12759c = jVar;
        this.f12760d = i10;
        this.e = i11;
        this.f12761f = j6;
        this.f12762g = c1874w;
        this.purple = c1862k;
        this.red = zVar;
        int i13 = LottieConstants.IterateForever;
        if (z2) {
            i12 = Q0.a.hotel(j5);
        } else {
            i12 = Integer.MAX_VALUE;
        }
        this.silver = Q0.b.bravo(i12, z2 ? i13 : Q0.a.golf(j5), 5);
    }

    public final C1868q X(int i4, long j5) {
        int i5;
        C1862k c1862k = this.purple;
        Object alpha = c1862k.alpha(i4);
        Object juliet = c1862k.bravo.juliet(i4);
        List M10 = M(this.red, i4, j5);
        if (i4 == this.yellow - 1) {
            i5 = 0;
        } else {
            i5 = this.f12757a;
        }
        int i10 = i5;
        return new C1868q(i4, M10, this.teal, this.f12758b, this.f12759c, this.white.purple.getLayoutDirection(), this.f12760d, this.e, i10, this.f12761f, alpha, juliet, this.f12762g.november, j5);
    }
}
