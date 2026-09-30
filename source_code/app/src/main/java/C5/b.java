package C5;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.net.URL;

/* loaded from: classes3.dex */
public final class b {
    public int alpha;
    public long bravo;
    public Object charlie;

    public b(long j5, Exception exc) {
        this.bravo = SystemClock.elapsedRealtime() - j5;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.alpha = 2;
            this.charlie = exc;
            return;
        }
        if (exc instanceof InitializationException) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.charlie = exc;
            if (exc instanceof CameraUnavailableException) {
                this.alpha = 2;
                return;
            } else if (exc instanceof IllegalArgumentException) {
                this.alpha = 1;
                return;
            } else {
                this.alpha = 0;
                return;
            }
        }
        this.alpha = 0;
        this.charlie = exc;
    }

    public b(int i4, URL url, long j5) {
        this.alpha = i4;
        this.charlie = url;
        this.bravo = j5;
    }
}
