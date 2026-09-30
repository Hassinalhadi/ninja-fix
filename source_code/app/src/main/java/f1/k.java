package f1;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k extends com.google.android.gms.measurement.internal.r {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f12619a;
    public static HandlerThread yellow;
    public final int red;
    public SparseIntArray[] silver;
    public final ArrayList teal;
    public final j white;

    public k() {
        super(9);
        this.silver = new SparseIntArray[9];
        this.teal = new ArrayList();
        this.white = new j(this);
        this.red = 1;
    }

    @Override // com.google.android.gms.measurement.internal.r
    public final void charlie(Activity activity) {
        if (yellow == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            yellow = handlerThread;
            handlerThread.start();
            f12619a = new Handler(yellow.getLooper());
        }
        for (int i4 = 0; i4 <= 8; i4++) {
            SparseIntArray[] sparseIntArrayArr = this.silver;
            if (sparseIntArrayArr[i4] == null && (this.red & (1 << i4)) != 0) {
                sparseIntArrayArr[i4] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.white, f12619a);
        this.teal.add(new WeakReference(activity));
    }

    @Override // com.google.android.gms.measurement.internal.r
    public final SparseIntArray[] delta() {
        return this.silver;
    }

    @Override // com.google.android.gms.measurement.internal.r
    public final SparseIntArray[] echo(Activity activity) {
        ArrayList arrayList = this.teal;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.white);
        return this.silver;
    }

    @Override // com.google.android.gms.measurement.internal.r
    public final SparseIntArray[] foxtrot() {
        SparseIntArray[] sparseIntArrayArr = this.silver;
        this.silver = new SparseIntArray[9];
        return sparseIntArrayArr;
    }
}
