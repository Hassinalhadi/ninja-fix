package delivery.samurai.android.ui.reposition.presentation;

import android.app.Application;
import com.app.base.BaseViewModel;
import com.zendesk.service.HttpConstants;
import dagger.hilt.android.lifecycle.HiltViewModel;
import fe.C1713e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rc.InterfaceC2515a;
import retrofit2.HttpException;
import tc.AbstractC3112q;
import tc.C3109n;
import tc.C3110o;
import tc.C3111p;
import yf.AbstractC3428A;
import yf.N;
import yf.av;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldelivery/samurai/android/ui/reposition/presentation/RepositionViewModel;", "Lcom/app/base/BaseViewModel;", "Landroid/app/Application;", "app", "Lrc/a;", "repository", "<init>", "(Landroid/app/Application;Lrc/a;)V", "tc/q", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RepositionViewModel extends BaseViewModel {
    public final InterfaceC2515a alpha;
    public final N bravo;
    public final av charlie;
    public final N delta;
    public final av echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositionViewModel(@NotNull Application app, @NotNull InterfaceC2515a repository) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(repository, "repository");
        this.alpha = repository;
        N charlie = AbstractC3428A.charlie(C3111p.alpha);
        this.bravo = charlie;
        this.charlie = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(null);
        this.delta = charlie2;
        this.echo = new av(charlie2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [fe.g, fe.e] */
    public static final void alpha(RepositionViewModel repositionViewModel, Exception exc, AbstractC3112q abstractC3112q) {
        HttpException httpException;
        Integer num;
        String onHandleError = repositionViewModel.onHandleError(exc);
        if (exc instanceof HttpException) {
            httpException = (HttpException) exc;
        } else {
            httpException = null;
        }
        if (httpException != null) {
            num = Integer.valueOf(httpException.code());
        } else {
            num = null;
        }
        N n5 = repositionViewModel.bravo;
        if (num != null && new C1713e(HttpConstants.HTTP_BAD_REQUEST, 499, 1).alpha(num.intValue())) {
            C3109n c3109n = new C3109n(onHandleError);
            n5.getClass();
            n5.juliet(null, c3109n);
        } else if (abstractC3112q instanceof C3110o) {
            repositionViewModel.delta.india(onHandleError);
            n5.india(abstractC3112q);
        } else {
            C3109n c3109n2 = new C3109n(onHandleError);
            n5.getClass();
            n5.juliet(null, c3109n2);
        }
    }
}
