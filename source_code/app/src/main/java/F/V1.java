package F;

import bz.C0778c;
import f.InterfaceC1672i;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class V1 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0778c purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ InterfaceC1672i teal;
    public final /* synthetic */ androidx.compose.runtime.ax white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(C0778c c0778c, float f5, boolean z2, InterfaceC1672i interfaceC1672i, androidx.compose.runtime.ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0778c;
        this.red = f5;
        this.silver = z2;
        this.teal = interfaceC1672i;
        this.white = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new V1(this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((V1) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r8.foxtrot(r7, r1) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (androidx.compose.material3.internal.y.alpha(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        InterfaceC1672i interfaceC1672i = this.teal;
        androidx.compose.runtime.ax axVar = this.white;
        if (i4 != 0) {
            if (i4 != 1 && i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            C0778c c0778c = this.purple;
            float f5 = ((Q0.g) ((androidx.compose.runtime.t0) c0778c.echo).getValue()).alpha;
            float f10 = this.red;
            if (!Q0.g.alpha(f5, f10)) {
                if (!this.silver) {
                    Q0.g gVar = new Q0.g(f10);
                    this.alpha = 1;
                } else {
                    InterfaceC1672i interfaceC1672i2 = (InterfaceC1672i) axVar.getValue();
                    this.alpha = 2;
                }
            }
            return Unit.INSTANCE;
        }
        axVar.setValue(interfaceC1672i);
        return Unit.INSTANCE;
    }
}
