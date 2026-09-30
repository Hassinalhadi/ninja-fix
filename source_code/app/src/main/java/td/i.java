package td;

import io.ktor.utils.io.ag;
import io.ktor.utils.io.ao;
import io.ktor.utils.io.ar;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class i extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Hf.a red;
    public final /* synthetic */ ao silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Hf.a aVar, ao aoVar, Nd.c cVar) {
        super(2, cVar);
        this.red = aVar;
        this.silver = aoVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        i iVar = new i(this.red, this.silver, cVar);
        iVar.purple = obj;
        return iVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ar) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((io.ktor.utils.io.m) r11).india(r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (new io.ktor.utils.io.q(r10.silver, r10.red, r7, 8193).delta(true, r10) == r0) goto L15;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ar arVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arVar = (ar) this.purple;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            arVar = (ar) this.purple;
            ag agVar = arVar.alpha;
            this.purple = arVar;
            this.alpha = 1;
            Hf.a aVar2 = n.alpha;
        }
        ag agVar2 = arVar.alpha;
        this.purple = null;
        this.alpha = 2;
    }
}
