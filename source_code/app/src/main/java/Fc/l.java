package Fc;

import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.ui.splash.AuthViewModel;

/* loaded from: classes2.dex */
public final class l extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ AuthViewModel purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AuthViewModel authViewModel, Nd.c cVar) {
        super(cVar);
        this.purple = authViewModel;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        return AuthViewModel.access$fetchPlayIntegrityHeaders(this.purple, null, this);
    }
}
