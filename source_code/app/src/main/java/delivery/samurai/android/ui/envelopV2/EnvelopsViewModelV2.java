package delivery.samurai.android.ui.envelopV2;

import Gb.q;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r3.C2492a;
import t3.InterfaceC2957b;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/envelopV2/EnvelopsViewModelV2;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/b;", "captainService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/b;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnvelopsViewModelV2 extends BaseViewModel {
    public final InterfaceC2957b alpha;
    public final az bravo;
    public final az charlie;
    public int delta;
    public String echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public EnvelopsViewModelV2(@NotNull AndroidApp app, @NotNull InterfaceC2957b captainService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(captainService, "captainService");
        this.alpha = captainService;
        ?? auVar = new au();
        this.bravo = auVar;
        this.charlie = auVar;
        new LinkedHashMap();
    }

    public final void alpha(String str) {
        this.delta = 0;
        this.echo = str;
        this.bravo.postValue(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(this, null, new q(null, this, str), 1, null);
    }
}
