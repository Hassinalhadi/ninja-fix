package r;

import Nd.c;
import Pd.h;
import Xd.l;
import d.O0;
import d.ak;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m0.af;
import m0.r;
import s6.G7;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2478b extends h implements l {
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ Function1 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2478b(Function1 function1, c cVar) {
        super(2, cVar);
        this.silver = function1;
    }

    @Override // Pd.a
    public final c create(Object obj, c cVar) {
        C2478b c2478b = new C2478b(this.silver, cVar);
        c2478b.red = obj;
        return c2478b;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2478b) create((af) obj, (c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        af afVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    r rVar = (r) obj;
                    if (rVar != null) {
                        rVar.alpha();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afVar = (af) this.red;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            afVar = (af) this.red;
            this.red = afVar;
            this.purple = 1;
            obj = G7.alpha(afVar, this);
        }
        r rVar2 = (r) obj;
        rVar2.alpha();
        this.silver.invoke(new Z.b(rVar2.charlie));
        this.red = null;
        this.purple = 2;
        ak akVar = O0.alpha;
        obj = O0.hotel(afVar, m0.l.purple, this);
    }
}
