package d3;

import Jb.S;
import a2.C0393r;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t3.InterfaceC2956a;
import vf.ab;

/* loaded from: classes3.dex */
public final class j extends Pd.i implements Xd.l {
    public final /* synthetic */ k alpha;
    public final /* synthetic */ S purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, S s3, Nd.c cVar) {
        super(2, cVar);
        this.alpha = kVar;
        this.purple = s3;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new j(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2956a interfaceC2956a;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        k kVar = this.alpha;
        S s3 = this.purple;
        try {
            Result.Companion companion = Result.INSTANCE;
            interfaceC2956a = kVar.f12040f;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (interfaceC2956a != null) {
            Result.m206constructorimpl(interfaceC2956a.foxtrot(false).subscribe(new X9.f(16, new C0393r(26, kVar, s3)), new Fc.j(3, new com.clevertap.android.sdk.inapp.images.preload.a(9))));
            return Unit.INSTANCE;
        }
        Intrinsics.lima("authService");
        throw null;
    }
}
