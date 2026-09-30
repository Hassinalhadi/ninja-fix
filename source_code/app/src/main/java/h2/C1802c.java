package h2;

import Pd.i;
import Xd.l;
import android.net.Uri;
import i2.e;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1802c extends i implements l {
    public int alpha;
    public final /* synthetic */ C1803d purple;
    public final /* synthetic */ Uri red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802c(C1803d c1803d, Uri uri, Nd.c cVar) {
        super(2, cVar);
        this.purple = c1803d;
        this.red = uri;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1802c(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1802c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            e eVar = this.purple.alpha;
            this.alpha = 1;
            if (eVar.india(this.red, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
