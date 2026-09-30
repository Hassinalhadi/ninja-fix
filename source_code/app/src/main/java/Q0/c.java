package Q0;

import T.s;
import Tf.ah;
import Yb.C0333u0;
import a0.AbstractC0357k;
import a0.AbstractC0358l;
import a0.C0354h;
import a0.al;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Path;
import android.graphics.RectF;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import androidx.compose.runtime.C0585q;
import com.airbnb.lottie.compose.LottieConstants;
import com.app.network.network.models.TaskStatus;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import h9.z;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import s6.AbstractC2636d7;
import s6.Z6;
import t6.AbstractC3086y3;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    public static boolean alpha(T.q qVar, Function1 function1) {
        return ((Boolean) function1.invoke(qVar)).booleanValue();
    }

    public static void amber(StringBuilder sb2, String str, long j5, String str2) {
        sb2.append(str);
        sb2.append(j5);
        sb2.append(str2);
    }

    public static void azure(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static boolean beige(Bundle bundle, String str, String str2, String str3, String str4) {
        Intrinsics.echo(bundle, str);
        Intrinsics.echo(str2, str3);
        return bundle.containsKey(str4);
    }

    public static /* synthetic */ String black(int i4) {
        switch (i4) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static int bravo(d dVar, float f5) {
        float lavender = dVar.lavender(f5);
        if (Float.isInfinite(lavender)) {
            return LottieConstants.IterateForever;
        }
        return Math.round(lavender);
    }

    public static void bronze(C0333u0 c0333u0, int i4, TaskStatus status, String str, String str2, File file, String str3, int i5) {
        String str4;
        if ((i5 & 4) != 0) {
            str = null;
        }
        if ((i5 & 8) != 0) {
            str2 = null;
        }
        if ((i5 & 32) != 0) {
            file = null;
        }
        if ((i5 & 64) != 0) {
            str4 = null;
        } else {
            str4 = str3;
        }
        c0333u0.getClass();
        Intrinsics.echo(status, "status");
        int i10 = ProcessOrderActivityV2.f12378N0;
        c0333u0.alpha.orange(i4, status, str, str2, null, file, str4);
    }

    public static s charlie(s sVar, s sVar2) {
        if (sVar2 == T.p.alpha) {
            return sVar;
        }
        return new T.m(sVar, sVar2);
    }

    public static float delta(long j5, d dVar) {
        float charlie;
        float indigo;
        if (!q.alpha(p.bravo(j5), 4294967296L)) {
            j.bravo("Only Sp can convert to Px");
        }
        float[] fArr = R0.b.alpha;
        if (dVar.indigo() >= 1.03f) {
            R0.a alpha = R0.b.alpha(dVar.indigo());
            charlie = p.charlie(j5);
            if (alpha == null) {
                indigo = dVar.indigo();
            } else {
                return alpha.bravo(charlie);
            }
        } else {
            charlie = p.charlie(j5);
            indigo = dVar.indigo();
        }
        return indigo * charlie;
    }

    public static long echo(long j5, d dVar) {
        if (j5 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return Z6.alpha(dVar.gold(Float.intBitsToFloat((int) (j5 >> 32))), dVar.gold(Float.intBitsToFloat((int) (j5 & 4294967295L))));
    }

    public static float foxtrot(long j5, d dVar) {
        if (!q.alpha(p.bravo(j5), 4294967296L)) {
            j.bravo("Only Sp can convert to Px");
        }
        return dVar.lavender(dVar.quebec(j5));
    }

    public static long golf(long j5, d dVar) {
        if (j5 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float lavender = dVar.lavender(i.bravo(j5));
        float lavender2 = dVar.lavender(i.alpha(j5));
        return (Float.floatToRawIntBits(lavender) << 32) | (Float.floatToRawIntBits(lavender2) & 4294967295L);
    }

    public static long hotel(d dVar, float f5) {
        boolean z2;
        float indigo;
        float[] fArr = R0.b.alpha;
        if (dVar.indigo() >= 1.03f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return AbstractC2636d7.delta(f5 / dVar.indigo(), 4294967296L);
        }
        R0.a alpha = R0.b.alpha(dVar.indigo());
        if (alpha != null) {
            indigo = alpha.alpha(f5);
        } else {
            indigo = f5 / dVar.indigo();
        }
        return AbstractC2636d7.delta(indigo, 4294967296L);
    }

    public static void india(C0354h c0354h, Z.c cVar) {
        Path.Direction direction;
        al[] alVarArr = al.alpha;
        float f5 = cVar.alpha;
        boolean isNaN = Float.isNaN(f5);
        float f10 = cVar.delta;
        float f11 = cVar.charlie;
        float f12 = cVar.bravo;
        if (isNaN || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
            AbstractC0358l.bravo("Invalid rectangle, make sure no value is NaN");
        }
        if (c0354h.bravo == null) {
            c0354h.bravo = new RectF();
        }
        RectF rectF = c0354h.bravo;
        Intrinsics.checkNotNull(rectF);
        rectF.set(f5, f12, f11, f10);
        RectF rectF2 = c0354h.bravo;
        Intrinsics.checkNotNull(rectF2);
        int i4 = AbstractC0357k.$EnumSwitchMapping$0[0];
        if (i4 != 1) {
            if (i4 == 2) {
                direction = Path.Direction.CW;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            direction = Path.Direction.CCW;
        }
        c0354h.alpha.addRect(rectF2, direction);
    }

    public static void juliet(C0354h c0354h, Z.d dVar) {
        Path.Direction direction;
        al[] alVarArr = al.alpha;
        if (c0354h.bravo == null) {
            c0354h.bravo = new RectF();
        }
        RectF rectF = c0354h.bravo;
        Intrinsics.checkNotNull(rectF);
        float f5 = dVar.delta;
        rectF.set(dVar.alpha, dVar.bravo, dVar.charlie, f5);
        if (c0354h.charlie == null) {
            c0354h.charlie = new float[8];
        }
        float[] fArr = c0354h.charlie;
        Intrinsics.checkNotNull(fArr);
        long j5 = dVar.echo;
        fArr[0] = Float.intBitsToFloat((int) (j5 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j5 & 4294967295L));
        long j6 = dVar.foxtrot;
        fArr[2] = Float.intBitsToFloat((int) (j6 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j6 & 4294967295L));
        long j7 = dVar.golf;
        fArr[4] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        long j10 = dVar.hotel;
        fArr[6] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (4294967295L & j10));
        RectF rectF2 = c0354h.bravo;
        Intrinsics.checkNotNull(rectF2);
        float[] fArr2 = c0354h.charlie;
        Intrinsics.checkNotNull(fArr2);
        int i4 = AbstractC0357k.$EnumSwitchMapping$0[0];
        if (i4 != 1) {
            if (i4 == 2) {
                direction = Path.Direction.CW;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            direction = Path.Direction.CCW;
        }
        c0354h.alpha.addRoundRect(rectF2, fArr2, direction);
    }

    public static /* synthetic */ boolean kilo(int i4) {
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return false;
        }
        if (i4 == 4 || i4 == 5) {
            return true;
        }
        throw null;
    }

    public static float lima(float f5, float f10, float f11, float f12) {
        return ((f5 - f10) * f11) + f12;
    }

    public static String mike(long j5, String str, StringBuilder sb2) {
        sb2.append(j5);
        sb2.append(str);
        return sb2.toString();
    }

    public static String november(ah ahVar, String str) {
        return str + ahVar;
    }

    public static String oscar(C0585q c0585q, int i4, int i5, C0585q c0585q2, boolean z2) {
        c0585q.purple(i4);
        String bravo = AbstractC3086y3.bravo(c0585q2, i5);
        c0585q.quebec(z2);
        return bravo;
    }

    public static String papa(String str, String str2, String str3, String str4) {
        return (str + str2 + str3 + str4).toString();
    }

    public static String quebec(StringBuilder sb2, int i4, char c3) {
        sb2.append(i4);
        sb2.append(c3);
        return sb2.toString();
    }

    public static String romeo(StringBuilder sb2, boolean z2, String str) {
        sb2.append(z2);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder sierra(int i4, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i4);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder tango(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder uniform(String str, long j5, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j5);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder victor(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static Set whiskey(String str) {
        return ab.oscar(new Wf.n(str));
    }

    public static KotlinNothingValueException xray(String str) {
        AbstractC2264a.charlie(str);
        return new KotlinNothingValueException();
    }

    public static /* synthetic */ void yankee(int i4) {
        if (i4 != 0) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static /* synthetic */ void zulu(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            z.tango((ExecutorService) autoCloseable);
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
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }
}
