package io.getunleash.android;

import android.content.Context;
import androidx.lifecycle.G;
import androidx.lifecycle.ac;
import androidx.lifecycle.al;
import io.getunleash.android.util.UnleashLogger;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import vf.C3221z;
import vf.a0;
import vf.ab;
import vf.ad;
import vf.ao;
import vf.r;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/content/Context;", "androidContext", "Landroidx/lifecycle/ac;", "getLifecycle", "(Landroid/content/Context;)Landroidx/lifecycle/ac;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "unleashExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getUnleashExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lvf/r;", "job", "Lvf/r;", "Lvf/ab;", "unleashScope", "Lvf/ab;", "getUnleashScope", "()Lvf/ab;", "unleashandroidsdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultUnleashKt {

    @NotNull
    private static final r job;

    @NotNull
    private static final CoroutineExceptionHandler unleashExceptionHandler;

    @NotNull
    private static final ab unleashScope;

    static {
        DefaultUnleashKt$special$$inlined$CoroutineExceptionHandler$1 defaultUnleashKt$special$$inlined$CoroutineExceptionHandler$1 = new DefaultUnleashKt$special$$inlined$CoroutineExceptionHandler$1(C3221z.alpha);
        unleashExceptionHandler = defaultUnleashKt$special$$inlined$CoroutineExceptionHandler$1;
        a0 foxtrot = ad.foxtrot();
        job = foxtrot;
        unleashScope = ad.charlie(ao.alpha.plus(foxtrot).plus(defaultUnleashKt$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ac getLifecycle(Context context) {
        if (context instanceof al) {
            UnleashLogger.d$default(UnleashLogger.INSTANCE, "Unleash", "Using lifecycle from Android context", null, 4, null);
            return ((al) context).getLifecycle();
        }
        UnleashLogger.d$default(UnleashLogger.INSTANCE, "Unleash", "Using lifecycle from ProcessLifecycleOwner", null, 4, null);
        G g2 = G.f3128b;
        return G.f3128b.white;
    }

    @NotNull
    public static final CoroutineExceptionHandler getUnleashExceptionHandler() {
        return unleashExceptionHandler;
    }

    @NotNull
    public static final ab getUnleashScope() {
        return unleashScope;
    }
}
