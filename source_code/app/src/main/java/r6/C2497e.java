package r6;

/* renamed from: r6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2497e {
    public final Object alpha;
    public final Object bravo;
    public final Object charlie;

    public C2497e(Object obj, Object obj2, Object obj3) {
        this.alpha = obj;
        this.bravo = obj2;
        this.charlie = obj3;
    }

    public final IllegalArgumentException alpha() {
        Object obj = this.alpha;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.bravo);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.charlie);
        StringBuilder india = av.q.india("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        india.append(valueOf3);
        india.append("=");
        india.append(valueOf4);
        return new IllegalArgumentException(india.toString());
    }
}
