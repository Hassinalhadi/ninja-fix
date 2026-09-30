package t6;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.checkout.components.kmp.rememberme.utils.Constants;
import com.google.maps.android.BuildConfig;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import s6.AbstractC2689j6;

/* renamed from: t6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3018l {
    public static final void alpha(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (autoCloseable instanceof ExecutorService) {
                    h9.z.tango((ExecutorService) autoCloseable);
                    return;
                }
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                }
                if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                    return;
                } else {
                    if (autoCloseable instanceof ContentProviderClient) {
                        ((ContentProviderClient) autoCloseable).release();
                        return;
                    }
                    throw new IllegalArgumentException();
                }
            }
            try {
                Q0.c.zulu(autoCloseable);
            } catch (Throwable th2) {
                AbstractC2689j6.charlie(th, th2);
            }
        }
    }

    public static String bravo(String str, Object... objArr) {
        int indexOf;
        String sb2;
        int i4 = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                sb2 = BuildConfig.TRAVIS;
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder victor = Q0.c.victor("<", str2, " threw ");
                    victor.append(e.getClass().getName());
                    victor.append(">");
                    sb2 = victor.toString();
                }
            }
            objArr[i5] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i10 = 0;
        while (i4 < objArr.length && (indexOf = str.indexOf(Constants.EMBOLDEN_PLACEHOLDER, i10)) != -1) {
            sb3.append((CharSequence) str, i10, indexOf);
            sb3.append(objArr[i4]);
            i10 = indexOf + 2;
            i4++;
        }
        sb3.append((CharSequence) str, i10, str.length());
        if (i4 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i4]);
            for (int i11 = i4 + 1; i11 < objArr.length; i11++) {
                sb3.append(", ");
                sb3.append(objArr[i11]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
