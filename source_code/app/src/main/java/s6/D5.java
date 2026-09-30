package s6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.measurement.internal.C1471u;
import com.zendesk.service.HttpConstants;
import i1.C1884e;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class D5 {
    public D5() {
        new ConcurrentHashMap();
    }

    public static void foxtrot(String str, String str2, Object obj) {
        String india = india(str);
        if (Log.isLoggable(india, 3)) {
            Log.d(india, String.format(str2, obj));
        }
    }

    public static void golf(String str, String str2, Exception exc) {
        String india = india(str);
        if (Log.isLoggable(india, 6)) {
            Log.e(india, str2, exc);
        }
    }

    public static String india(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public abstract Typeface alpha(Context context, C1884e c1884e, Resources resources, int i4);

    public abstract Typeface bravo(Context context, p1.h[] hVarArr, int i4);

    public Typeface charlie(int i4, Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface delta(Context context, InputStream inputStream) {
        File echo = E5.echo(context);
        if (echo == null) {
            return null;
        }
        try {
            if (!E5.charlie(echo, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(echo.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            echo.delete();
        }
    }

    public Typeface echo(Context context, Resources resources, int i4, String str, int i5) {
        File echo = E5.echo(context);
        if (echo == null) {
            return null;
        }
        try {
            if (!E5.bravo(echo, resources, i4)) {
                return null;
            }
            return Typeface.createFromFile(echo.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            echo.delete();
        }
    }

    public p1.h hotel(p1.h[] hVarArr, int i4) {
        int i5;
        boolean z2;
        int i10;
        new C1471u(10);
        if ((i4 & 1) == 0) {
            i5 = HttpConstants.HTTP_BAD_REQUEST;
        } else {
            i5 = 700;
        }
        if ((i4 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        p1.h hVar = null;
        int i11 = LottieConstants.IterateForever;
        for (p1.h hVar2 : hVarArr) {
            int abs = Math.abs(hVar2.charlie - i5) * 2;
            if (hVar2.delta == z2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            int i12 = abs + i10;
            if (hVar == null || i11 > i12) {
                hVar = hVar2;
                i11 = i12;
            }
        }
        return hVar;
    }
}
