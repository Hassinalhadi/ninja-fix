package t0;

import android.view.View;
import delivery.samurai.android.R;
import kotlin.ResultKt;
import kotlin.Unit;
import yf.AbstractC3428A;

/* loaded from: classes3.dex */
public final class H0 extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ androidx.compose.runtime.Y purple;
    public final /* synthetic */ View red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(androidx.compose.runtime.Y y10, View view, Nd.c cVar) {
        super(2, cVar);
        this.purple = y10;
        this.red = view;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new H0(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((H0) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = Od.a.alpha;
        int i4 = this.alpha;
        androidx.compose.runtime.Y y10 = this.purple;
        View view = this.red;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                this.alpha = 1;
                Object oscar = AbstractC3428A.oscar(y10.tango, new Pd.i(2, null), this);
                if (oscar != obj2) {
                    oscar = Unit.INSTANCE;
                }
                if (oscar == obj2) {
                    return obj2;
                }
            }
            return Unit.INSTANCE;
        } finally {
            if (P0.bravo(view) == y10) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
