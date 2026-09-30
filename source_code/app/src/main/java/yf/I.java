package yf;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class I extends Pd.i implements Xd.m {
    public int alpha;
    public /* synthetic */ InterfaceC3440j purple;
    public /* synthetic */ int red;
    public final /* synthetic */ K silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k6, Nd.c cVar) {
        super(3, cVar);
        this.silver = k6;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        I i4 = new I(this.silver, (Nd.c) obj3);
        i4.purple = (InterfaceC3440j) obj;
        i4.red = intValue;
        return i4.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (vf.ad.november(Long.MAX_VALUE, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (vf.ad.november(0, r8) == r0) goto L32;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC3440j interfaceC3440j;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        K k6 = this.silver;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC3440j = this.purple;
                            ResultKt.alpha(obj);
                            EnumC3430C enumC3430C = EnumC3430C.red;
                            this.purple = null;
                            this.alpha = 5;
                        }
                    } else {
                        interfaceC3440j = this.purple;
                        ResultKt.alpha(obj);
                        k6.getClass();
                        this.purple = interfaceC3440j;
                        this.alpha = 4;
                    }
                } else {
                    interfaceC3440j = this.purple;
                    ResultKt.alpha(obj);
                    k6.getClass();
                    EnumC3430C enumC3430C2 = EnumC3430C.purple;
                    this.purple = interfaceC3440j;
                    this.alpha = 3;
                }
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            interfaceC3440j = this.purple;
            if (this.red > 0) {
                EnumC3430C enumC3430C3 = EnumC3430C.alpha;
                this.alpha = 1;
            } else {
                k6.getClass();
                this.purple = interfaceC3440j;
                this.alpha = 2;
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
