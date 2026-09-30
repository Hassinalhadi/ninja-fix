package androidx.compose.runtime;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class V extends Pd.i implements Xd.l {
    public B2.s alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ Y silver;
    public final /* synthetic */ X teal;
    public final /* synthetic */ at white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Y y10, X x4, at atVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = y10;
        this.teal = x4;
        this.white = atVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        V v4 = new V(this.silver, this.teal, this.white, cVar);
        v4.red = obj;
        return v4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yf.N n5;
        N.b bVar;
        N.b bravo;
        vf.I i4;
        Throwable th;
        B2.s sVar;
        Y y10;
        yf.N n10;
        N.b bVar2;
        N.b delta;
        yf.N n11;
        N.b bVar3;
        N.b delta2;
        Od.a aVar = Od.a.alpha;
        int i5 = this.purple;
        if (i5 != 0) {
            if (i5 == 1) {
                sVar = this.alpha;
                i4 = (vf.I) this.red;
                try {
                    ResultKt.alpha(obj);
                } catch (Throwable th2) {
                    th = th2;
                    sVar.charlie();
                    y10 = this.silver;
                    synchronized (y10.bravo) {
                        try {
                            if (y10.charlie == i4) {
                                y10.charlie = null;
                            }
                            y10.azure();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    yf.N n12 = Y.yankee;
                    as asVar = this.silver.xray;
                    do {
                        n10 = Y.yankee;
                        bVar2 = (N.b) ((K.e) n10.getValue());
                        delta = bVar2.delta(asVar);
                        if (bVar2 == delta) {
                            break;
                        }
                    } while (!n10.hotel(bVar2, delta));
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            vf.I sierra = vf.ad.sierra(((vf.ab) this.red).charlie());
            Y.yankee(this.silver, sierra);
            B2.s india = r6.u.india(new Ac.k(28, this.silver));
            as asVar2 = this.silver.xray;
            try {
                do {
                    n5 = Y.yankee;
                    bVar = (N.b) ((K.e) n5.getValue());
                    bravo = bVar.bravo(asVar2);
                    if (bVar != bravo) {
                    }
                    break;
                } while (!n5.hotel(bVar, bravo));
                break;
                List xray = Y.xray(this.silver);
                int size = xray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C0590w) xray.get(i10)).tango();
                }
                U u4 = new U(this.teal, this.white, null);
                this.red = sierra;
                this.alpha = india;
                this.purple = 1;
                if (vf.ad.mike(u4, this) == aVar) {
                    return aVar;
                }
                i4 = sierra;
                sVar = india;
            } catch (Throwable th4) {
                i4 = sierra;
                th = th4;
                sVar = india;
                sVar.charlie();
                y10 = this.silver;
                synchronized (y10.bravo) {
                }
            }
        }
        sVar.charlie();
        Y y11 = this.silver;
        synchronized (y11.bravo) {
            try {
                if (y11.charlie == i4) {
                    y11.charlie = null;
                }
                y11.azure();
            } catch (Throwable th5) {
                throw th5;
            }
        }
        yf.N n13 = Y.yankee;
        as asVar3 = this.silver.xray;
        do {
            n11 = Y.yankee;
            bVar3 = (N.b) ((K.e) n11.getValue());
            delta2 = bVar3.delta(asVar3);
            if (bVar3 == delta2) {
                break;
            }
        } while (!n11.hotel(bVar3, delta2));
        return Unit.INSTANCE;
    }
}
