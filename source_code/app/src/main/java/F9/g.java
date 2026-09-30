package F9;

import H9.k;
import J2.n;
import Xd.l;
import android.content.Context;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;
import vf.ao;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ n purple;
    public final /* synthetic */ File red;
    public final /* synthetic */ File silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, File file, File file2, Nd.c cVar) {
        super(2, cVar);
        this.purple = nVar;
        this.red = file;
        this.silver = file2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, H9.j] */
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
            n nVar = this.purple;
            E9.a aVar2 = (E9.a) nVar.red;
            Context context = (Context) nVar.alpha;
            this.alpha = 1;
            Cf.e eVar = ao.alpha;
            Cf.d dVar = Cf.d.purple;
            File file = this.silver;
            obj = ad.blue(dVar, new d(this.red, (f) aVar2, context, file, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        File file2 = (File) obj;
        if (file2 == null) {
            return new k(new Object());
        }
        return new H9.l(file2);
    }
}
