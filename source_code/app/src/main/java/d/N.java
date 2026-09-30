package d;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class N implements Q0.d {
    public final /* synthetic */ Q0.d alpha;
    public boolean purple;
    public boolean red;
    public final Ef.c silver = new Ef.c(false);

    public N(Q0.d dVar) {
        this.alpha = dVar;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.alpha.alpha();
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return this.alpha.beige(f5);
    }

    public final void charlie() {
        this.red = true;
        Ef.c cVar = this.silver;
        if (cVar.charlie()) {
            cVar.foxtrot(null);
        }
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return this.alpha.crimson(i4);
    }

    public final void delta() {
        this.purple = true;
        Ef.c cVar = this.silver;
        if (cVar.charlie()) {
            cVar.foxtrot(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object foxtrot(Pd.c cVar) {
        L l10;
        int i4;
        if (cVar instanceof L) {
            l10 = (L) cVar;
            int i5 = l10.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                l10.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = l10.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = l10.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    l10.red = 1;
                    if (this.silver.delta(l10) == aVar) {
                        return aVar;
                    }
                }
                this.purple = false;
                this.red = false;
                return Unit.INSTANCE;
            }
        }
        l10 = new L(this, cVar);
        Object obj2 = l10.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = l10.red;
        if (i4 == 0) {
        }
        this.purple = false;
        this.red = false;
        return Unit.INSTANCE;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return this.alpha.gold(f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object golf(Pd.c cVar) {
        M m4;
        int i4;
        if (cVar instanceof M) {
            m4 = (M) cVar;
            int i5 = m4.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                m4.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = m4.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = m4.red;
                Ef.c cVar2 = this.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (!this.purple && !this.red) {
                        m4.red = 1;
                        if (cVar2.delta(m4) == aVar) {
                            return aVar;
                        }
                    }
                    return Boolean.valueOf(this.purple);
                }
                cVar2.foxtrot(null);
                return Boolean.valueOf(this.purple);
            }
        }
        m4 = new M(this, cVar);
        Object obj2 = m4.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = m4.red;
        Ef.c cVar22 = this.silver;
        if (i4 == 0) {
        }
        cVar22.foxtrot(null);
        return Boolean.valueOf(this.purple);
    }

    @Override // Q0.d
    public final float indigo() {
        return this.alpha.indigo();
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return this.alpha.lavender(f5);
    }

    @Override // Q0.d
    public final long mike(long j5) {
        return this.alpha.mike(j5);
    }

    @Override // Q0.d
    public final int ochre(float f5) {
        return this.alpha.ochre(f5);
    }

    @Override // Q0.d
    public final float quebec(long j5) {
        return this.alpha.quebec(j5);
    }

    @Override // Q0.d
    public final long red(long j5) {
        return this.alpha.red(j5);
    }

    @Override // Q0.d
    public final float teal(long j5) {
        return this.alpha.teal(j5);
    }
}
