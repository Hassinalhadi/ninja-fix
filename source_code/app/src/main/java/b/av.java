package b;

/* loaded from: classes3.dex */
public final class av implements a0.as {
    public static final av bravo = new av(0);
    public static final av charlie = new av(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ av(int i4) {
        this.alpha = i4;
    }

    @Override // a0.as
    public final a0.ao alpha(long j5, Q0.n nVar, Q0.d dVar) {
        switch (this.alpha) {
            case 0:
                float ochre = dVar.ochre(ae.alpha);
                return new a0.ai(new Z.c(0.0f, -ochre, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)) + ochre));
            default:
                float ochre2 = dVar.ochre(ae.alpha);
                return new a0.ai(new Z.c(-ochre2, 0.0f, Float.intBitsToFloat((int) (j5 >> 32)) + ochre2, Float.intBitsToFloat((int) (j5 & 4294967295L))));
        }
    }
}
