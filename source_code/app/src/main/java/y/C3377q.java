package y;

import android.view.textclassifier.TextClassifier;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.f0;

/* renamed from: y.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3377q extends Pd.i implements Xd.l {
    public Ef.a alpha;
    public C3379s purple;
    public int red;
    public final /* synthetic */ C3379s silver;
    public final /* synthetic */ Pd.i teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3377q(C3379s c3379s, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = c3379s;
        this.teal = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3377q(this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3377q) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:
    
        if (r10.delta(r9) == r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [Ef.a] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r4v6, types: [Ef.a] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3379s c3379s;
        Ef.c cVar;
        ?? r12;
        Throwable th;
        TextClassifier textClassifier;
        boolean isDestroyed;
        Object bravo;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            ResultKt.alpha(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r12 = this.alpha;
                    try {
                        ResultKt.alpha(obj);
                        r12 = r12;
                        textClassifier = vg.al.kilo(obj);
                        cVar = r12;
                        cVar.foxtrot(null);
                        C3375o c3375o = new C3375o(textClassifier, this.teal, null);
                        this.alpha = null;
                        this.purple = null;
                        this.red = 3;
                        bravo = f0.bravo(200L, c3375o, this);
                        if (bravo == aVar) {
                            return aVar;
                        }
                        return bravo;
                    } catch (Throwable th2) {
                        th = th2;
                        ((Ef.c) r12).foxtrot(null);
                        throw th;
                    }
                }
                c3379s = this.purple;
                ?? r4 = this.alpha;
                ResultKt.alpha(obj);
                cVar = r4;
            } else {
                ResultKt.alpha(obj);
                c3379s = this.silver;
                cVar = c3379s.echo;
                this.alpha = cVar;
                this.purple = c3379s;
                this.red = 1;
            }
            textClassifier = c3379s.foxtrot;
            if (textClassifier != null) {
                isDestroyed = textClassifier.isDestroyed();
                if (isDestroyed) {
                }
                cVar.foxtrot(null);
                C3375o c3375o2 = new C3375o(textClassifier, this.teal, null);
                this.alpha = null;
                this.purple = null;
                this.red = 3;
                bravo = f0.bravo(200L, c3375o2, this);
                if (bravo == aVar) {
                }
            }
            C3376p c3376p = new C3376p(c3379s, null);
            this.alpha = cVar;
            this.purple = null;
            this.red = 2;
            Object bravo2 = f0.bravo(300L, c3376p, this);
            if (bravo2 != aVar) {
                r12 = cVar;
                obj = bravo2;
                textClassifier = vg.al.kilo(obj);
                cVar = r12;
                cVar.foxtrot(null);
                C3375o c3375o22 = new C3375o(textClassifier, this.teal, null);
                this.alpha = null;
                this.purple = null;
                this.red = 3;
                bravo = f0.bravo(200L, c3375o22, this);
                if (bravo == aVar) {
                }
            }
            return aVar;
        } catch (Throwable th3) {
            r12 = cVar;
            th = th3;
            ((Ef.c) r12).foxtrot(null);
            throw th;
        }
    }
}
