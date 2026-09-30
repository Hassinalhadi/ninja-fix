package R1;

import Pd.i;
import Xd.l;
import androidx.compose.runtime.K;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;
import yf.L;

/* loaded from: classes3.dex */
public final class c extends i implements l {
    public int alpha;
    public final /* synthetic */ L purple;
    public final /* synthetic */ K red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(L l10, K k6, Nd.c cVar) {
        super(2, cVar);
        this.purple = l10;
        this.red = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.collect(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (vf.ad.blue(r7, r1, r6) == r0) goto L17;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1 && i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            Nd.i iVar = Nd.i.alpha;
            boolean areEqual = Intrinsics.areEqual(iVar, iVar);
            K k6 = this.red;
            L l10 = this.purple;
            if (areEqual) {
                a aVar2 = new a(k6, 0);
                this.alpha = 1;
            } else {
                b bVar = new b(l10, k6, null);
                this.alpha = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
