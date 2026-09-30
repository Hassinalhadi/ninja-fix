package Jc;

import Dc.q;
import androidx.compose.ui.platform.ComposeView;
import delivery.samurai.android.ui.suspension.SuspensionFragment;
import delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ SuspensionFragment purple;
    public final /* synthetic */ ComposeView red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SuspensionFragment suspensionFragment, ComposeView composeView, Nd.c cVar) {
        super(2, cVar);
        this.purple = suspensionFragment;
        this.red = composeView;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new d(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
        return Od.a.alpha;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            SuspensionViewModel quebec = this.purple.quebec();
            q qVar = new q(this.red, 2);
            this.alpha = 1;
            if (quebec.india.alpha.collect(qVar, this) == aVar) {
                return aVar;
            }
        }
        throw new KotlinNothingValueException();
    }
}
