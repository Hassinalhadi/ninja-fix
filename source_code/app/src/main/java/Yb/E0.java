package Yb;

import k.C1990b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class E0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Integer red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ C1990b teal;
    public final /* synthetic */ Function0 white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(boolean z2, Integer num, int i4, C1990b c1990b, Function0 function0, Nd.c cVar) {
        super(2, cVar);
        this.purple = z2;
        this.red = num;
        this.silver = i4;
        this.teal = c1990b;
        this.white = function0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new E0(this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r5.teal.alpha(null, r5) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (vf.ad.november(80, r5) == r0) goto L22;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    this.white.invoke();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            if (this.purple && (num = this.red) != null && num.intValue() == this.silver) {
                this.alpha = 1;
            }
            return Unit.INSTANCE;
        }
        this.alpha = 2;
    }
}
