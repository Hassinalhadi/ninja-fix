package T0;

import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ j red;
    public final /* synthetic */ long silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z2, j jVar, long j5, Nd.c cVar) {
        super(2, cVar);
        this.purple = z2;
        this.red = jVar;
        this.silver = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    ((Q0.r) obj).getClass();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                ((Q0.r) obj).getClass();
            }
        } else {
            ResultKt.alpha(obj);
            j jVar = this.red;
            if (!this.purple) {
                this.alpha = 1;
                obj = jVar.alpha.alpha(0L, this.silver, this);
            } else {
                this.alpha = 2;
                obj = jVar.alpha.alpha(this.silver, 0L, this);
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
