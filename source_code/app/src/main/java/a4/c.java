package a4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class c extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ e purple;
    public final /* synthetic */ Bitmap red;
    public final /* synthetic */ Fe.c silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Bitmap bitmap, Fe.c cVar, Nd.c cVar2) {
        super(2, cVar2);
        this.purple = eVar;
        this.red = bitmap;
        this.silver = cVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            Rect rect = l.alpha;
            e eVar = this.purple;
            Context context = eVar.alpha;
            Bitmap bitmap = this.red;
            Uri victor = l.victor(context, bitmap, eVar.f2612j, eVar.f2613k, eVar.f2614l);
            bitmap.recycle();
            C0403a c0403a = new C0403a(victor, null, this.silver.purple, 5);
            this.alpha = 1;
            if (e.alpha(eVar, c0403a, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
