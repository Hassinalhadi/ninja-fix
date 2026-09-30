package I2;

import A2.z;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;
import j1.EnumC1927a;

/* loaded from: classes3.dex */
public abstract class b {
    public static ColorFilter alpha(int i4, Object obj) {
        return new BlendModeColorFilter(i4, (BlendMode) obj);
    }

    public static ContentCaptureSession bravo(View view) {
        return view.getContentCaptureSession();
    }

    public static AutofillId charlie(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j5) {
        return contentCaptureSession.newAutofillId(autofillId, j5);
    }

    public static ViewStructure delta(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j5) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j5);
    }

    public static void echo(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void foxtrot(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void golf(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void hotel(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Object india(EnumC1927a enumC1927a) {
        switch (enumC1927a.ordinal()) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static Insets juliet(int i4, int i5, int i10, int i11) {
        return Insets.of(i4, i5, i10, i11);
    }

    public static void kilo(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void lima(SystemForegroundService systemForegroundService, int i4, Notification notification, int i5) {
        systemForegroundService.startForeground(i4, notification, i5);
    }

    public static void mike(SystemForegroundService systemForegroundService, int i4, Notification notification, int i5) {
        try {
            systemForegroundService.startForeground(i4, notification, i5);
        } catch (ForegroundServiceStartNotAllowedException e) {
            z echo = z.echo();
            String str = SystemForegroundService.teal;
            if (echo.alpha <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e4) {
            z echo2 = z.echo();
            String str2 = SystemForegroundService.teal;
            if (echo2.alpha <= 5) {
                Log.w(str2, "Unable to start foreground service", e4);
            }
        }
    }
}
