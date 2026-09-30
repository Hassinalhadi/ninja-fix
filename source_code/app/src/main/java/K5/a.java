package K5;

import android.os.Build;
import android.widget.Toast;
import bv.ah;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.incognia.internal.Lsv;
import com.incognia.internal.Vpb;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.R;
import t0.C2946x;
import t0.W;
import t6.V2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    private final void alpha() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                int i4 = AlarmManagerSchedulerBroadcastReceiver.alpha;
                return;
            case 1:
                try {
                    AndroidApp androidApp = AndroidApp.yellow;
                    Toast.makeText(V2.delta(), R.string.integrity_timestamp_check_device_time, 1).show();
                    return;
                } catch (RuntimeException e) {
                    K7.b.alpha().bravo("security: clock_skew_toast_failed err=".concat(e.getClass().getSimpleName()));
                    return;
                }
            case 2:
                try {
                    AndroidApp androidApp2 = AndroidApp.yellow;
                    Toast.makeText(V2.delta(), R.string.integrity_timestamp_check_device_time, 1).show();
                    return;
                } catch (RuntimeException e4) {
                    K7.b.alpha().bravo("security: stomp_clock_skew_toast_failed err=".concat(e4.getClass().getSimpleName()));
                    return;
                }
            case 3:
                return;
            case 4:
                Lsv.W();
                return;
            case 5:
                Vpb.b();
                return;
            default:
                ah ahVar = C2946x.f13853D0;
                synchronized (ahVar) {
                    try {
                        int i5 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = ahVar.alpha;
                            int i10 = ahVar.bravo;
                            while (i5 < i10) {
                                C2946x c2946x = (C2946x) objArr[i5];
                                boolean showLayoutBounds = c2946x.getShowLayoutBounds();
                                Class cls = C2946x.f13850A0;
                                c2946x.setShowLayoutBounds(W.hotel());
                                if (showLayoutBounds != c2946x.getShowLayoutBounds()) {
                                    C2946x.kilo(c2946x.getRoot());
                                }
                                i5++;
                            }
                        } else {
                            Object[] objArr2 = ahVar.alpha;
                            int i11 = ahVar.bravo;
                            while (i5 < i11) {
                                C2946x.kilo(((C2946x) objArr2[i5]).getRoot());
                                i5++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
