package Ra;

import Nd.c;
import Oa.d;
import Oa.e;
import Pd.i;
import Xd.l;
import delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.k;
import vf.ab;
import yf.N;

/* loaded from: classes2.dex */
public final class a extends i implements l {
    public int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ CaptainsUniformsViewModel red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z2, CaptainsUniformsViewModel captainsUniformsViewModel, c cVar) {
        super(2, cVar);
        this.purple = z2;
        this.red = captainsUniformsViewModel;
    }

    @Override // Pd.a
    public final c create(Object obj, c cVar) {
        return new a(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ab) obj, (c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object alpha;
        Object eVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        CaptainsUniformsViewModel captainsUniformsViewModel = this.red;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                alpha = ((Result) obj).alpha;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            if (this.purple) {
                N n5 = captainsUniformsViewModel.charlie;
                d dVar = d.alpha;
                n5.getClass();
                n5.juliet(null, dVar);
            } else {
                N n10 = captainsUniformsViewModel.echo;
                Boolean bool = Boolean.TRUE;
                n10.getClass();
                n10.juliet(null, bool);
            }
            Na.b bVar = captainsUniformsViewModel.alpha;
            this.alpha = 1;
            alpha = bVar.alpha(this);
            if (alpha == aVar) {
                return aVar;
            }
        }
        Result.Companion companion = Result.INSTANCE;
        if (!(alpha instanceof k)) {
            List list = (List) alpha;
            N n11 = captainsUniformsViewModel.charlie;
            if (list.isEmpty()) {
                eVar = Oa.b.alpha;
            } else {
                eVar = new e(list);
            }
            n11.getClass();
            n11.juliet(null, eVar);
            Boolean bool2 = Boolean.FALSE;
            N n12 = captainsUniformsViewModel.echo;
            n12.getClass();
            n12.juliet(null, bool2);
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(alpha);
        if (m207exceptionOrNullimpl != null) {
            Oa.c cVar = new Oa.c(captainsUniformsViewModel.onHandleError(m207exceptionOrNullimpl));
            N n13 = captainsUniformsViewModel.charlie;
            n13.getClass();
            n13.juliet(null, cVar);
            Boolean bool3 = Boolean.FALSE;
            N n14 = captainsUniformsViewModel.echo;
            n14.getClass();
            n14.juliet(null, bool3);
        }
        return Unit.INSTANCE;
    }
}
