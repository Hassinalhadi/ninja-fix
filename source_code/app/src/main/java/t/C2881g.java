package t;

import Pd.i;
import Xd.l;
import kotlin.ResultKt;
import kotlin.Unit;
import u.InterfaceC3133g;
import vf.ab;
import y.at;
import y.au;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2881g extends i implements l {
    public Throwable alpha;
    public int purple;
    public final /* synthetic */ C2882h red;
    public final /* synthetic */ InterfaceC3133g silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2881g(C2882h c2882h, InterfaceC3133g interfaceC3133g, Nd.c cVar) {
        super(2, cVar);
        this.red = c2882h;
        this.silver = interfaceC3133g;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C2881g(this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C2881g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r8.invoke(r7) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r8.alpha(r6, r7) == r0) goto L37;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        C2882h c2882h = this.red;
        try {
        } catch (Throwable th2) {
            au auVar = c2882h.teal;
            if (auVar != null) {
                this.alpha = th2;
                this.purple = 4;
                if (auVar.invoke(this) != aVar) {
                    th = th2;
                }
            } else {
                throw th2;
            }
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = this.alpha;
                        ResultKt.alpha(obj);
                        throw th;
                    }
                    ResultKt.alpha(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.alpha(obj);
                au auVar2 = c2882h.teal;
                if (auVar2 != null) {
                    this.purple = 3;
                }
                return Unit.INSTANCE;
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            at atVar = c2882h.silver;
            if (atVar != null) {
                this.purple = 1;
                if (atVar.invoke(this) == aVar) {
                    return aVar;
                }
            }
        }
        InterfaceC3133g interfaceC3133g = this.silver;
        this.purple = 2;
    }
}
