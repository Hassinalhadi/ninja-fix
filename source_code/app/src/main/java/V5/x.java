package V5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class x {
    public static final Object alpha = new Object();
    public static boolean bravo;
    public static int charlie;

    public static void alpha(String str, boolean z2) {
        if (z2) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void bravo(boolean z2) {
        if (z2) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void charlie(boolean z2, String str, Object... objArr) {
        if (z2) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void delta(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException(av.q.golf("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    public static void echo(String str) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void foxtrot(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void golf(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void hotel(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static void india(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void juliet(String str, boolean z2) {
        if (z2) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void kilo(boolean z2) {
        if (z2) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static boolean lima(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static ApiException mike(Status status) {
        if (status.red != null) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
