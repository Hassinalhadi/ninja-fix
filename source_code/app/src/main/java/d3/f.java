package d3;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2956a;
import vf.ab;

/* loaded from: classes3.dex */
public final class f extends Pd.i implements Xd.l {
    public final /* synthetic */ k alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = kVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2956a interfaceC2956a;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        k kVar = this.alpha;
        try {
            Result.Companion companion = Result.INSTANCE;
            interfaceC2956a = kVar.f12040f;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (interfaceC2956a != null) {
            Result.m206constructorimpl(interfaceC2956a.foxtrot(kVar.f12037b).subscribe(new X9.f(15, new C1585a(kVar, 2)), new Fc.j(2, new com.clevertap.android.sdk.inapp.images.preload.a(8))));
            return Unit.INSTANCE;
        }
        Intrinsics.lima("authService");
        throw null;
    }
}
