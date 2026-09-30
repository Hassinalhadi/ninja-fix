package d;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class ai extends Pd.i implements Xd.l {
    public Ref.ObjectRef alpha;
    public Ref.ObjectRef purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ aj teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, Nd.c cVar) {
        super(2, cVar);
        this.teal = ajVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        ai aiVar = new ai(this.teal, cVar);
        aiVar.silver = obj;
        return aiVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((ai) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r3.i(r7, r6) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (d.aj.e(r3, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        if (d.aj.e(r3, r6) != r0) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Path cross not found for [B:30:0x00c8, B:27:0x00b1], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c3 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ca -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d7 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e5 -> B:7:0x0027). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.ab abVar;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        vf.ab abVar2;
        vf.ab abVar3;
        AbstractC1558v abstractC1558v;
        Object obj2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        aj ajVar = this.teal;
        switch (i4) {
            case 0:
                ResultKt.alpha(obj);
                abVar = (vf.ab) this.silver;
                if (vf.ad.xray(abVar)) {
                    objectRef = new Ref.ObjectRef();
                    xf.e eVar = ajVar.yellow;
                    if (eVar != null) {
                        this.silver = abVar;
                        this.alpha = objectRef;
                        this.purple = objectRef;
                        this.red = 1;
                        obj = eVar.india(this);
                        if (obj != aVar) {
                            objectRef2 = objectRef;
                            abstractC1558v = (AbstractC1558v) obj;
                            objectRef.alpha = abstractC1558v;
                            obj2 = objectRef2.alpha;
                            if (obj2 instanceof C1556t) {
                                this.silver = abVar;
                                this.alpha = objectRef2;
                                this.purple = null;
                                this.red = 2;
                                if (aj.f(ajVar, (C1556t) obj2, this) != aVar) {
                                    objectRef3 = objectRef2;
                                    abVar2 = abVar;
                                    ah ahVar = new ah(objectRef3, ajVar, null);
                                    this.silver = abVar2;
                                    this.alpha = objectRef3;
                                    this.red = 3;
                                    break;
                                }
                            }
                            if (vf.ad.xray(abVar)) {
                                return Unit.INSTANCE;
                            }
                        }
                        return aVar;
                    }
                    objectRef2 = objectRef;
                    abstractC1558v = null;
                    objectRef.alpha = abstractC1558v;
                    obj2 = objectRef2.alpha;
                    if (obj2 instanceof C1556t) {
                    }
                    if (vf.ad.xray(abVar)) {
                    }
                }
            case 1:
                objectRef = this.purple;
                objectRef2 = this.alpha;
                abVar = (vf.ab) this.silver;
                ResultKt.alpha(obj);
                abstractC1558v = (AbstractC1558v) obj;
                objectRef.alpha = abstractC1558v;
                obj2 = objectRef2.alpha;
                if (obj2 instanceof C1556t) {
                }
                if (vf.ad.xray(abVar)) {
                }
                break;
            case 2:
                objectRef3 = this.alpha;
                abVar2 = (vf.ab) this.silver;
                ResultKt.alpha(obj);
                ah ahVar2 = new ah(objectRef3, ajVar, null);
                this.silver = abVar2;
                this.alpha = objectRef3;
                this.red = 3;
                break;
            case 3:
                objectRef3 = this.alpha;
                abVar2 = (vf.ab) this.silver;
                try {
                    ResultKt.alpha(obj);
                } catch (CancellationException unused) {
                    abVar3 = abVar2;
                    this.silver = abVar3;
                    this.alpha = null;
                    this.red = 6;
                    break;
                }
                abVar = abVar2;
                try {
                } catch (CancellationException unused2) {
                    abVar3 = abVar;
                    this.silver = abVar3;
                    this.alpha = null;
                    this.red = 6;
                }
                Object obj3 = objectRef3.alpha;
                if (obj3 instanceof C1557u) {
                    Intrinsics.charlie(obj3, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                    this.silver = abVar;
                    this.alpha = null;
                    this.red = 4;
                    if (aj.g(ajVar, (C1557u) obj3, this) == aVar) {
                        return aVar;
                    }
                    if (vf.ad.xray(abVar)) {
                    }
                } else {
                    if (obj3 instanceof r) {
                        this.silver = abVar;
                        this.alpha = null;
                        this.red = 5;
                        break;
                    }
                    if (vf.ad.xray(abVar)) {
                    }
                }
                break;
            case 4:
                abVar3 = (vf.ab) this.silver;
                try {
                    ResultKt.alpha(obj);
                } catch (CancellationException unused3) {
                    this.silver = abVar3;
                    this.alpha = null;
                    this.red = 6;
                    break;
                }
                abVar = abVar3;
                if (vf.ad.xray(abVar)) {
                }
                break;
            case 5:
                abVar3 = (vf.ab) this.silver;
                ResultKt.alpha(obj);
                abVar = abVar3;
                if (vf.ad.xray(abVar)) {
                }
                break;
            case 6:
                abVar3 = (vf.ab) this.silver;
                ResultKt.alpha(obj);
                abVar = abVar3;
                if (vf.ad.xray(abVar)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
