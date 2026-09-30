package C1;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class aw extends Pd.i implements Xd.l {
    public am alpha;
    public int purple;
    public final /* synthetic */ J2.i red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(J2.i iVar, Nd.c cVar) {
        super(2, cVar);
        this.red = iVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aw(this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aw) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:6:0x005c). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        am amVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        J2.i iVar = this.red;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    if (((AtomicInteger) ((Aa.m) iVar.silver).purple).decrementAndGet() == 0) {
                        return Unit.INSTANCE;
                    }
                    vf.ad.oscar(((vf.ab) iVar.alpha).charlie());
                    amVar = (am) iVar.purple;
                    xf.e eVar = (xf.e) iVar.red;
                    this.alpha = amVar;
                    this.purple = 1;
                    obj = eVar.india(this);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                amVar = this.alpha;
                ResultKt.alpha(obj);
                this.alpha = null;
                this.purple = 2;
            }
        } else {
            ResultKt.alpha(obj);
            if (((AtomicInteger) ((Aa.m) iVar.silver).purple).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            vf.ad.oscar(((vf.ab) iVar.alpha).charlie());
            amVar = (am) iVar.purple;
            xf.e eVar2 = (xf.e) iVar.red;
            this.alpha = amVar;
            this.purple = 1;
            obj = eVar2.india(this);
        }
    }
}
