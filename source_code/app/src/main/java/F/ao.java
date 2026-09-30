package F;

import bz.C0778c;
import f.C1676m;
import f.InterfaceC1672i;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ao extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0778c purple;
    public final /* synthetic */ float red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ ap teal;
    public final /* synthetic */ InterfaceC1672i white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(C0778c c0778c, float f5, boolean z2, ap apVar, InterfaceC1672i interfaceC1672i, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0778c;
        this.red = f5;
        this.silver = z2;
        this.teal = apVar;
        this.white = interfaceC1672i;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new ao(this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ao) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r8.foxtrot(r7, r1) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (androidx.compose.material3.internal.y.alpha(r8, r4, r1, r7.white, r7) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1676m c1676m;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
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
                    float f11 = ((Q0.g) ((androidx.compose.runtime.t0) c0778c.echo).getValue()).alpha;
                    ap apVar = this.teal;
                    if (Q0.g.alpha(f11, apVar.bravo)) {
                        c1676m = new C1676m(0L);
                    } else if (Q0.g.alpha(f11, apVar.delta)) {
                        c1676m = new Object();
                    } else if (Q0.g.alpha(f11, apVar.charlie)) {
                        c1676m = new Object();
                    } else {
                        c1676m = null;
                    }
                    this.alpha = 2;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
