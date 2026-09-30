package E0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import z0.C3456e;
import z0.C3459h;

/* loaded from: classes3.dex */
public final class h {
    public int alpha;
    public float bravo;
    public final Object charlie;

    public h(int i4, C3456e c3456e) {
        this.alpha = i4;
        this.charlie = c3456e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float alpha(boolean z2, boolean z10, boolean z11, int i4) {
        boolean z12;
        int i5;
        float india;
        int i10 = 1;
        r rVar = (r) this.charlie;
        if (z2) {
            int delta = o.delta(rVar.foxtrot, i4, z2);
            int lineStart = rVar.foxtrot.getLineStart(delta);
            int foxtrot = rVar.foxtrot(delta);
            if (i4 == lineStart || i4 == foxtrot) {
                z12 = true;
                int i11 = i4 * 4;
                if (!z11) {
                    if (z12) {
                        i10 = 0;
                    }
                } else if (z12) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                i5 = i11 + i10;
                if (this.alpha != i5) {
                    return this.bravo;
                }
                if (z11) {
                    india = rVar.hotel(i4, z2);
                } else {
                    india = rVar.india(i4, z2);
                }
                if (z10) {
                    this.alpha = i5;
                    this.bravo = india;
                }
                return india;
            }
        }
        z12 = false;
        int i112 = i4 * 4;
        if (!z11) {
        }
        i5 = i112 + i10;
        if (this.alpha != i5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bravo(float f5, Pd.c cVar) {
        C3459h c3459h;
        int i4;
        if (cVar instanceof C3459h) {
            c3459h = (C3459h) cVar;
            int i5 = c3459h.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3459h.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c3459h.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c3459h.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Float f10 = new Float(f5);
                    c3459h.red = 1;
                    obj = ((C3456e) this.charlie).invoke(f10, c3459h);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                this.bravo += ((Number) obj).floatValue();
                return Unit.INSTANCE;
            }
        }
        c3459h = new C3459h(this, cVar);
        Object obj2 = c3459h.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c3459h.red;
        if (i4 == 0) {
        }
        this.bravo += ((Number) obj2).floatValue();
        return Unit.INSTANCE;
    }

    public h(r rVar) {
        this.charlie = rVar;
        this.alpha = -1;
    }
}
