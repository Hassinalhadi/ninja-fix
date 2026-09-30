package bz;

import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: bz.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0781f extends Pd.i implements Xd.l {
    public xf.b alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ xf.i silver;
    public final /* synthetic */ C0778c teal;
    public final /* synthetic */ androidx.compose.runtime.ax white;
    public final /* synthetic */ androidx.compose.runtime.ax yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0781f(xf.i iVar, C0778c c0778c, androidx.compose.runtime.ax axVar, androidx.compose.runtime.ax axVar2, Nd.c cVar) {
        super(2, cVar);
        this.silver = iVar;
        this.teal = c0778c;
        this.white = axVar;
        this.yellow = axVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0781f c0781f = new C0781f(this.silver, this.teal, this.white, this.yellow, cVar);
        c0781f.red = obj;
        return c0781f;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0781f) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xf.b it;
        vf.ab abVar;
        Object obj2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        xf.i iVar = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                it = this.alpha;
                abVar = (vf.ab) this.red;
                ResultKt.alpha(obj);
                if (((Boolean) obj).booleanValue()) {
                    Object delta = it.delta();
                    Object alpha = xf.l.alpha(iVar.alpha());
                    if (alpha == null) {
                        obj2 = delta;
                    } else {
                        obj2 = alpha;
                    }
                    androidx.compose.runtime.ax axVar = this.yellow;
                    vf.ad.zulu(abVar, null, null, new C0780e(obj2, this.teal, this.white, axVar, null), 3);
                    this.red = abVar;
                    this.alpha = it;
                    this.purple = 1;
                    obj = it.charlie(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            vf.ab abVar2 = (vf.ab) this.red;
            it = iVar.iterator();
            abVar = abVar2;
            this.red = abVar;
            this.alpha = it;
            this.purple = 1;
            obj = it.charlie(this);
            if (obj == aVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }
}
