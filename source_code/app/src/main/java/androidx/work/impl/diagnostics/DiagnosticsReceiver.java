package androidx.work.impl.diagnostics;

import A2.ac;
import A2.z;
import B2.r;
import B2.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.List;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String alpha = z.golf("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            z echo = z.echo();
            String str = alpha;
            echo.alpha(str, "Requesting diagnostics");
            try {
                Intrinsics.echo(context, "context");
                w golf = w.golf(context);
                List juliet = ab.juliet((ac) new A2.ab(0, DiagnosticsWorker.class).bravo());
                if (!juliet.isEmpty()) {
                    new r(golf, null, 2, juliet).bravo();
                    return;
                }
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            } catch (IllegalStateException e) {
                z.echo().delta(str, "WorkManager is not initialized", e);
            }
        }
    }
}
