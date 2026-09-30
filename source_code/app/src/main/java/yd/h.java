package yd;

import Xd.l;
import io.ktor.utils.io.ag;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ j red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ KSerializer teal;
    public final /* synthetic */ Charset white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Object obj, KSerializer kSerializer, Charset charset, Nd.c cVar) {
        super(2, cVar);
        this.red = jVar;
        this.silver = obj;
        this.teal = kSerializer;
        this.white = charset;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        h hVar = new h(this.red, this.silver, this.teal, this.white, cVar);
        hVar.purple = obj;
        return hVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ag) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            ag agVar = (ag) this.purple;
            Object obj2 = this.silver;
            Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
            KSerializer kSerializer = this.teal;
            Intrinsics.charlie(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            this.alpha = 1;
            if (j.alpha(this.red, (InterfaceC3439i) obj2, kSerializer, this.white, agVar, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
