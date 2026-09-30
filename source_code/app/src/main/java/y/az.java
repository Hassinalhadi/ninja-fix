package y;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class az extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C3379s purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ D0.am teal;
    public final /* synthetic */ C3344D white;
    public final /* synthetic */ I0.t yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(C3379s c3379s, String str, long j5, D0.am amVar, C3344D c3344d, I0.t tVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = c3379s;
        this.red = str;
        this.silver = j5;
        this.teal = amVar;
        this.white = c3344d;
        this.yellow = tVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new az(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((az) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046 A[RETURN] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        String str = this.red;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            this.alpha = 1;
            C3379s c3379s = this.purple;
            c3379s.getClass();
            if (str.length() != 0) {
                long j5 = this.silver;
                if (!D0.am.charlie(j5)) {
                    obj = vf.ad.blue(c3379s.alpha, new C3377q(c3379s, new C3378r(str, j5, c3379s, null), null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            obj = null;
            if (obj == aVar) {
            }
        }
        D0.am amVar = (D0.am) obj;
        if (amVar != null) {
            long j6 = amVar.alpha;
            I0.t tVar = this.yellow;
            long bravo = D0.ae.bravo(tVar.transformedToOriginal((int) (j6 >> 32)), tVar.transformedToOriginal((int) (j6 & 4294967295L)));
            if (!D0.am.alpha(bravo, this.teal)) {
                C3344D c3344d = this.white;
                if (Intrinsics.areEqual(c3344d.oscar().alpha.purple, str) && tVar == c3344d.bravo) {
                    c3344d.charlie.invoke(C3344D.golf(c3344d.oscar().alpha, bravo));
                    c3344d.whiskey = new D0.am(bravo);
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
