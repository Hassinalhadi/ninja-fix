package dagger.hilt.android.migration;

import ae.o;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.view.View;
import androidx.fragment.app.ai;
import dagger.hilt.android.internal.migration.InjectedByHilt;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes2.dex */
public final class OptionalInjectCheck {
    private OptionalInjectCheck() {
    }

    private static boolean check(Object obj) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkArgument(obj instanceof InjectedByHilt, "'%s' is not an optionally injected android entry point. Check that you have annotated the class with both @AndroidEntryPoint and @OptionalInject.", obj.getClass());
        return ((InjectedByHilt) obj).wasInjectedByHilt();
    }

    public static boolean wasInjectedByHilt(o oVar) {
        return check(oVar);
    }

    public static boolean wasInjectedByHilt(BroadcastReceiver broadcastReceiver) {
        return check(broadcastReceiver);
    }

    public static boolean wasInjectedByHilt(ai aiVar) {
        return check(aiVar);
    }

    public static boolean wasInjectedByHilt(Service service) {
        return check(service);
    }

    public static boolean wasInjectedByHilt(View view) {
        return check(view);
    }
}
