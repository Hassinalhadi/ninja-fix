package p7;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.P0;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.util.IllegalFormatException;
import java.util.Locale;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class t {
    public final String alpha;

    public t(String str) {
        this.alpha = P0.azure(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String charlie(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = AbstractC2327c.xray(str2, " [", TextUtils.join(", ", objArr), Constants.AES_SUFFIX);
            }
        }
        return ad.amber(str, " : ", str2);
    }

    public final void alpha(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", charlie(this.alpha, str, objArr), remoteException);
        }
    }

    public final void bravo(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", charlie(this.alpha, str, objArr));
        }
    }
}
