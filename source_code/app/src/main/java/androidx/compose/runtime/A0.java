package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A0 extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ Nd.h red;
    public final /* synthetic */ yf.L silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(Nd.h hVar, yf.L l10, Nd.c cVar) {
        super(2, cVar);
        this.red = hVar;
        this.silver = l10;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        A0 a02 = new A0(this.red, this.silver, cVar);
        a02.purple = obj;
        return a02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((A0) create((K) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r5.collect(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (vf.ad.blue(r4, r1, r6) == r0) goto L17;
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
            K k6 = (K) this.purple;
            Nd.i iVar = Nd.i.alpha;
            Nd.h hVar = this.red;
            boolean areEqual = Intrinsics.areEqual(hVar, iVar);
            yf.L l10 = this.silver;
            if (areEqual) {
                R1.a aVar2 = new R1.a(k6, 2);
                this.alpha = 1;
            } else {
                z0 z0Var = new z0(l10, k6, null);
                this.alpha = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
