package m0;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;
import kotlin.ResultKt;
import s0.AbstractC2555o;
import s6.J6;
import t0.C0;
import vf.C3207k;
import vf.Y;

/* loaded from: classes3.dex */
public final class af implements Q0.d, Nd.c {
    public final /* synthetic */ ah alpha;
    public final C3207k purple;
    public C3207k red;
    public l silver = l.purple;
    public final Nd.i teal = Nd.i.alpha;
    public final /* synthetic */ ah white;

    public af(ah ahVar, C3207k c3207k) {
        this.white = ahVar;
        this.alpha = ahVar;
        this.purple = c3207k;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.alpha.alpha();
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return this.alpha.beige(f5);
    }

    public final Object charlie(l lVar, Pd.a aVar) {
        C3207k c3207k = new C3207k(1, J6.delta(aVar));
        c3207k.tango();
        this.silver = lVar;
        this.red = c3207k;
        Object sierra = c3207k.sierra();
        Od.a aVar2 = Od.a.alpha;
        return sierra;
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return this.alpha.crimson(i4);
    }

    public final long foxtrot() {
        ah ahVar = this.white;
        ahVar.getClass();
        long golf = Q0.c.golf(AbstractC2555o.golf(ahVar).f13300s.delta(), ahVar);
        long j5 = ahVar.f12964c;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (golf >> 32)) - ((int) (j5 >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (golf & 4294967295L)) - ((int) (j5 & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return this.teal;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / this.alpha.alpha();
    }

    public final C0 golf() {
        ah ahVar = this.white;
        ahVar.getClass();
        return AbstractC2555o.golf(ahVar).f13300s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [vf.I] */
    /* JADX WARN: Type inference failed for: r7v4, types: [vf.I] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Xd.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object india(long j5, Xd.l lVar, Pd.c cVar) {
        ac acVar;
        int i4;
        C3207k c3207k;
        try {
            if (cVar instanceof ac) {
                acVar = (ac) cVar;
                int i5 = acVar.silver;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    acVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = acVar.purple;
                    Od.a aVar = Od.a.alpha;
                    i4 = acVar.silver;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            Y y10 = acVar.alpha;
                            ResultKt.alpha(obj);
                            j5 = y10;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        if (j5 <= 0 && (c3207k = this.red) != null) {
                            Result.Companion companion = Result.INSTANCE;
                            c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j5))));
                        }
                        Y zulu = vf.ad.zulu(this.white.getCoroutineScope(), null, null, new ad(j5, this, null), 3);
                        acVar.alpha = zulu;
                        acVar.silver = 1;
                        obj = lVar.invoke(this, acVar);
                        j5 = zulu;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return obj;
                }
            }
            if (i4 == 0) {
            }
            return obj;
        } finally {
            j5.foxtrot(CancelTimeoutCancellationException.INSTANCE);
        }
        acVar = new ac(this, cVar);
        Object obj2 = acVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = acVar.silver;
    }

    @Override // Q0.d
    public final float indigo() {
        return this.alpha.indigo();
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return this.alpha.alpha() * f5;
    }

    @Override // Q0.d
    public final long mike(long j5) {
        ah ahVar = this.alpha;
        ahVar.getClass();
        return Q0.c.echo(j5, ahVar);
    }

    @Override // Q0.d
    public final int ochre(float f5) {
        ah ahVar = this.alpha;
        ahVar.getClass();
        return Q0.c.bravo(ahVar, f5);
    }

    @Override // Q0.d
    public final float quebec(long j5) {
        ah ahVar = this.alpha;
        ahVar.getClass();
        return Q0.c.delta(j5, ahVar);
    }

    @Override // Q0.d
    public final long red(long j5) {
        ah ahVar = this.alpha;
        ahVar.getClass();
        return Q0.c.golf(j5, ahVar);
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        ah ahVar = this.white;
        synchronized (ahVar.yellow) {
            ahVar.white.lima(this);
        }
        this.purple.resumeWith(obj);
    }

    @Override // Q0.d
    public final float teal(long j5) {
        ah ahVar = this.alpha;
        ahVar.getClass();
        return Q0.c.foxtrot(j5, ahVar);
    }
}
