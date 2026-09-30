package Y8;

import V5.x;
import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class a {
    public static final V5.g charlie = new V5.g("StreamingFormatChecker", "");
    public final LinkedList alpha = new LinkedList();
    public long bravo = -1;

    public final void alpha(X8.a aVar) {
        if (aVar.golf == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            LinkedList linkedList = this.alpha;
            linkedList.add(Long.valueOf(elapsedRealtime));
            if (linkedList.size() > 5) {
                linkedList.removeFirst();
            }
            if (linkedList.size() == 5) {
                Long l10 = (Long) linkedList.peekFirst();
                x.hotel(l10);
                if (elapsedRealtime - l10.longValue() < 5000) {
                    long j5 = this.bravo;
                    if (j5 == -1 || elapsedRealtime - j5 >= TimeUnit.SECONDS.toMillis(5L)) {
                        this.bravo = elapsedRealtime;
                        V5.g gVar = charlie;
                        if (Log.isLoggable(gVar.alpha, 5)) {
                            Log.w("StreamingFormatChecker", gVar.bravo("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                        }
                    }
                }
            }
        }
    }
}
