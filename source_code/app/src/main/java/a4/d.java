package a4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ao;

/* loaded from: classes3.dex */
public final class d extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ e red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Nd.c cVar) {
        super(2, cVar);
        this.red = eVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        d dVar = new d(this.red, cVar);
        dVar.purple = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (a4.e.alpha(r3, r4, r21) != r2) goto L31;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Fe.c echo;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        e eVar = this.red;
        try {
        } catch (Exception e) {
            C0403a c0403a = new C0403a(null, e, 1, 3);
            this.alpha = 2;
        }
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
            vf.ab abVar = (vf.ab) this.purple;
            if (vf.ad.xray(abVar)) {
                Uri uri = eVar.red;
                if (uri != null) {
                    Rect rect = l.alpha;
                    echo = l.charlie(eVar.alpha, uri, eVar.teal, eVar.white, eVar.yellow, eVar.f2604a, eVar.f2605b, eVar.f2606c, eVar.f2607d, eVar.e, eVar.f2608f, eVar.f2609g, eVar.f2610h);
                } else {
                    Bitmap bitmap = eVar.silver;
                    if (bitmap != null) {
                        Rect rect2 = l.alpha;
                        echo = l.echo(bitmap, eVar.teal, eVar.white, eVar.f2605b, eVar.f2606c, eVar.f2607d, eVar.f2609g, eVar.f2610h);
                    } else {
                        C0403a c0403a2 = new C0403a(null, null, 1, 6);
                        this.alpha = 1;
                        if (e.alpha(eVar, c0403a2, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                Bitmap uniform = l.uniform((Bitmap) echo.red, eVar.e, eVar.f2608f, eVar.f2611i);
                Cf.e eVar2 = ao.alpha;
                vf.ad.zulu(abVar, Cf.d.purple, null, new c(eVar, uniform, echo, null), 2);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
