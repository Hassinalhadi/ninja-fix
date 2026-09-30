package t;

import Pd.i;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import u.InterfaceC3133g;
import vf.ab;
import y.as;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2879e extends i implements l {
    public int alpha;
    public final /* synthetic */ C2880f purple;
    public final /* synthetic */ InterfaceC3133g red;
    public final /* synthetic */ C2878d silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2879e(C2880f c2880f, InterfaceC3133g interfaceC3133g, C2878d c2878d, Nd.c cVar) {
        super(2, cVar);
        this.purple = c2880f;
        this.red = interfaceC3133g;
        this.silver = c2878d;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2879e(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2879e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r4.red.alpha(r4.silver, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r5.invoke(r4) == r0) goto L17;
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
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            as asVar = this.purple.red;
            if (asVar != null) {
                this.alpha = 1;
            }
        }
        this.alpha = 2;
    }
}
