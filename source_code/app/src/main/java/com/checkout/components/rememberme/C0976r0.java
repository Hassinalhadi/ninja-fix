package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveSharedFlowRepository;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.aw;

/* renamed from: com.checkout.components.rememberme.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0976r0 extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f6200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrimitiveSharedFlowRepository f6201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavControllerWrapper f6202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0976r0(PrimitiveSharedFlowRepository primitiveSharedFlowRepository, NavControllerWrapper navControllerWrapper, Nd.c cVar) {
        super(2, cVar);
        this.f6201b = primitiveSharedFlowRepository;
        this.f6202c = navControllerWrapper;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0976r0(this.f6201b, this.f6202c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new C0976r0(this.f6201b, this.f6202c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.f6200a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            aw flow = this.f6201b.getFlow();
            C0973q0 c0973q0 = new C0973q0(this.f6202c);
            this.f6200a = 1;
            if (flow.collect(c0973q0, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
