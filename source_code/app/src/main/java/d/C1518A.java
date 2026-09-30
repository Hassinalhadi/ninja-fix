package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: d.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1518A extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ xf.e red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518A(xf.e eVar, Nd.c cVar) {
        super(2, cVar);
        this.red = eVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1518A c1518a = new C1518A(this.red, cVar);
        c1518a.purple = obj;
        return c1518a;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1518A) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        vf.I i4;
        Throwable th;
        Od.a aVar = Od.a.alpha;
        int i5 = this.alpha;
        if (i5 != 0) {
            if (i5 == 1) {
                i4 = (vf.I) this.purple;
                try {
                    ResultKt.alpha(obj);
                } catch (Throwable th2) {
                    th = th2;
                    i4.foxtrot(null);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            vf.Y zulu = vf.ad.zulu((vf.ab) this.purple, null, null, new Pd.i(2, null), 3);
            try {
                xf.e eVar = this.red;
                this.purple = zulu;
                this.alpha = 1;
                Object india = eVar.india(this);
                if (india == aVar) {
                    return aVar;
                }
                i4 = zulu;
                obj = india;
            } catch (Throwable th3) {
                i4 = zulu;
                th = th3;
                i4.foxtrot(null);
                throw th;
            }
        }
        ay ayVar = (ay) obj;
        i4.foxtrot(null);
        return ayVar;
    }
}
