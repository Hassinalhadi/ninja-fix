package delivery.samurai.android.ui.captainsuniforms.viewmodel;

import Na.b;
import Oa.d;
import Ra.a;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import e3.InterfaceC1627a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.ad;
import yf.AbstractC3428A;
import yf.N;
import yf.av;

@HiltViewModel
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldelivery/samurai/android/ui/captainsuniforms/viewmodel/CaptainsUniformsViewModel;", "Lcom/app/base/BaseViewModel;", "", "Ldelivery/samurai/android/AndroidApp;", "app", "LNa/b;", "getUniformStoresUseCase", "Le3/a;", "userManager", "<init>", "(Ldelivery/samurai/android/AndroidApp;LNa/b;Le3/a;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CaptainsUniformsViewModel extends BaseViewModel {
    public final b alpha;
    public final InterfaceC1627a bravo;
    public final N charlie;
    public final av delta;
    public final N echo;
    public final av foxtrot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptainsUniformsViewModel(@NotNull AndroidApp app, @NotNull b getUniformStoresUseCase, @NotNull InterfaceC1627a userManager) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(getUniformStoresUseCase, "getUniformStoresUseCase");
        Intrinsics.echo(userManager, "userManager");
        this.alpha = getUniformStoresUseCase;
        this.bravo = userManager;
        N charlie = AbstractC3428A.charlie(d.alpha);
        this.charlie = charlie;
        this.delta = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(Boolean.FALSE);
        this.echo = charlie2;
        this.foxtrot = new av(charlie2);
        alpha(true);
    }

    public final void alpha(boolean z2) {
        ad.zulu(T.hotel(this), null, null, new a(z2, this, null), 3);
    }
}
