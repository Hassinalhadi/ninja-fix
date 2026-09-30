package q0;

import kotlin.jvm.functions.Function1;

/* renamed from: q0.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2366B implements Q0.d {
    public boolean alpha;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void charlie(AbstractC2366B abstractC2366B, AbstractC2367C abstractC2367C) {
        abstractC2366B.getClass();
        if (abstractC2367C instanceof s0.G) {
            ((s0.G) abstractC2367C).black(abstractC2366B.alpha);
        }
    }

    public static void hotel(AbstractC2366B abstractC2366B, AbstractC2367C abstractC2367C, int i4, int i5) {
        abstractC2366B.getClass();
        charlie(abstractC2366B, abstractC2367C);
        abstractC2367C.silver(Q0.k.charlie((i5 & 4294967295L) | (i4 << 32), abstractC2367C.teal), 0.0f, null);
    }

    public static void india(AbstractC2366B abstractC2366B, AbstractC2367C abstractC2367C, long j5) {
        abstractC2366B.getClass();
        charlie(abstractC2366B, abstractC2367C);
        abstractC2367C.silver(Q0.k.charlie(j5, abstractC2367C.teal), 0.0f, null);
    }

    public static void juliet(AbstractC2366B abstractC2366B, AbstractC2367C abstractC2367C, int i4, int i5) {
        long j5 = (i4 << 32) | (i5 & 4294967295L);
        if (abstractC2366B.foxtrot() != Q0.n.alpha && abstractC2366B.golf() != 0) {
            int golf = (abstractC2366B.golf() - abstractC2367C.alpha) - ((int) (j5 >> 32));
            charlie(abstractC2366B, abstractC2367C);
            abstractC2367C.silver(Q0.k.charlie((golf << 32) | (((int) (j5 & 4294967295L)) & 4294967295L), abstractC2367C.teal), 0.0f, null);
        } else {
            charlie(abstractC2366B, abstractC2367C);
            abstractC2367C.silver(Q0.k.charlie(j5, abstractC2367C.teal), 0.0f, null);
        }
    }

    public static void kilo(AbstractC2366B abstractC2366B, AbstractC2367C abstractC2367C, int i4, int i5) {
        C2368D c2368d = AbstractC2369E.alpha;
        long j5 = (i4 << 32) | (i5 & 4294967295L);
        if (abstractC2366B.foxtrot() != Q0.n.alpha && abstractC2366B.golf() != 0) {
            int golf = (abstractC2366B.golf() - abstractC2367C.alpha) - ((int) (j5 >> 32));
            charlie(abstractC2366B, abstractC2367C);
            abstractC2367C.silver(Q0.k.charlie((golf << 32) | (((int) (j5 & 4294967295L)) & 4294967295L), abstractC2367C.teal), 0.0f, c2368d);
        } else {
            charlie(abstractC2366B, abstractC2367C);
            abstractC2367C.silver(Q0.k.charlie(j5, abstractC2367C.teal), 0.0f, c2368d);
        }
    }

    public static void lima(AbstractC2366B abstractC2366B, AbstractC2367C abstractC2367C, int i4, int i5, Function1 function1, int i10) {
        if ((i10 & 8) != 0) {
            function1 = AbstractC2369E.alpha;
        }
        abstractC2366B.getClass();
        charlie(abstractC2366B, abstractC2367C);
        abstractC2367C.silver(Q0.k.charlie((i5 & 4294967295L) | (i4 << 32), abstractC2367C.teal), 0.0f, function1);
    }

    public static void november(AbstractC2366B abstractC2366B, AbstractC2367C abstractC2367C, long j5) {
        C2368D c2368d = AbstractC2369E.alpha;
        abstractC2366B.getClass();
        charlie(abstractC2366B, abstractC2367C);
        abstractC2367C.silver(Q0.k.charlie(j5, abstractC2367C.teal), 0.0f, c2368d);
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return Q0.c.hotel(this, gold(f5));
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    public float delta(C2398q c2398q) {
        return Float.NaN;
    }

    public abstract Q0.n foxtrot();

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    public abstract int golf();

    @Override // Q0.d
    public final float lavender(float f5) {
        return alpha() * f5;
    }

    @Override // Q0.d
    public final /* synthetic */ long mike(long j5) {
        return Q0.c.echo(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ int ochre(float f5) {
        return Q0.c.bravo(this, f5);
    }

    @Override // Q0.d
    public final /* synthetic */ float quebec(long j5) {
        return Q0.c.delta(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ long red(long j5) {
        return Q0.c.golf(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ float teal(long j5) {
        return Q0.c.foxtrot(j5, this);
    }
}
