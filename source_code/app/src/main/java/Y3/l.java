package Y3;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class l {
    public static final char[] alpha = "0123456789abcdef".toCharArray();
    public static final char[] bravo = new char[64];
    public static volatile Handler charlie;

    public static void alpha() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean bravo(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int charlie(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + Constants.AES_PREFIX + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int delta(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = k.alpha[config.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2 && i4 != 3) {
                if (i4 != 4) {
                    return 4;
                }
                return 8;
            }
        }
        return i5;
    }

    public static ArrayList echo(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler foxtrot() {
        if (charlie == null) {
            synchronized (l.class) {
                try {
                    if (charlie == null) {
                        charlie = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return charlie;
    }

    public static int golf(int i4, int i5) {
        return (i5 * 31) + i4;
    }

    public static int hotel(int i4, Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return golf(hashCode, i4);
    }

    public static boolean india(int i4, int i5) {
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (i5 <= 0 && i5 != Integer.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }
}
