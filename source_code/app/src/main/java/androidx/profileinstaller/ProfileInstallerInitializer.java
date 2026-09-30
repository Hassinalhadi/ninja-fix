package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.appcompat.app.k;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.gms.measurement.internal.C1477x;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import u2.b;

/* loaded from: classes3.dex */
public class ProfileInstallerInitializer implements b {
    @Override // u2.b
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1477x(10);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: j2.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                Handler handler;
                ProfileInstallerInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new k(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new C1477x(10);
    }

    @Override // u2.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
