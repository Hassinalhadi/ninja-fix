package q0;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class S extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2398q[] purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(C2398q[] c2398qArr, int i4) {
        super(2);
        this.alpha = i4;
        this.purple = c2398qArr;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                return Float.valueOf(AbstractC2375K.delta((AbstractC2366B) obj, true, this.purple, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC2375K.delta((AbstractC2366B) obj, false, this.purple, ((Number) obj2).floatValue()));
        }
    }
}
