package androidx.compose.foundation.layout;

/* renamed from: androidx.compose.foundation.layout.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0536b implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T.j purple;

    public /* synthetic */ C0536b(T.j jVar, int i4) {
        this.alpha = i4;
        this.purple = jVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                return Integer.valueOf(this.purple.alpha(0, ((Integer) obj).intValue()));
            default:
                return new Q0.k((this.purple.alpha(0, (int) (((Q0.m) obj).alpha & 4294967295L)) & 4294967295L) | (0 << 32));
        }
    }
}
