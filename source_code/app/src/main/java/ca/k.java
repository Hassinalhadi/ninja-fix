package ca;

import g3.ae;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.text.StringsKt;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class k extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ n silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j5, Nd.c cVar, n nVar) {
        super(2, cVar);
        this.red = j5;
        this.silver = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        k kVar = new k(this.red, cVar, this.silver);
        kVar.purple = obj;
        return kVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ab abVar = (ab) this.purple;
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
            this.purple = abVar;
            this.alpha = 1;
            if (ad.november(this.red, this) == aVar) {
                return aVar;
            }
        }
        if (!ad.xray(abVar)) {
            return Unit.INSTANCE;
        }
        n nVar = this.silver;
        ae aeVar = nVar.echo;
        String str2 = null;
        if (aeVar != null) {
            str = aeVar.alpha();
        } else {
            str = null;
        }
        g3.ad adVar = nVar.foxtrot;
        if (adVar != null) {
            str2 = adVar.alpha();
        }
        if (str != null && !StringsKt.gray(str) && str2 != null && !StringsKt.gray(str2)) {
            nVar.bravo(str, str2);
            return Unit.INSTANCE;
        }
        nVar.kilo();
        return Unit.INSTANCE;
    }
}
