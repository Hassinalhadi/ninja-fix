package delivery.samurai.android.ui.homev2;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m3.d;
import org.jetbrains.annotations.NotNull;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldelivery/samurai/android/ui/homev2/ConnectionDiagnosticsViewModelV2;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "app", "Lm3/d;", "connectionDiagnostics", "<init>", "(Landroid/app/Application;Lm3/d;)V", "Jb/z", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConnectionDiagnosticsViewModelV2 extends AndroidViewModel {
    public final d alpha;
    public final az bravo;
    public final az charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public ConnectionDiagnosticsViewModelV2(@NotNull Application app, @NotNull d connectionDiagnostics) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(connectionDiagnostics, "connectionDiagnostics");
        this.alpha = connectionDiagnostics;
        ?? auVar = new au();
        this.bravo = auVar;
        this.charlie = auVar;
    }
}
