package y3;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.appcompat.widget.P0;
import av.q;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.s;
import okhttp3.internal.ws.RealWebSocket;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3395a {
    public static String alpha(long j5) {
        if (j5 >= 1048576) {
            return String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1048576.0d)}, 1));
        }
        if (j5 >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1024.0d)}, 1));
        }
        return j5 + " bytes";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.s, java.lang.Object] */
    public static boolean bravo(Bitmap bitmap, File file, long j5, int i4, int i5) {
        long j6;
        boolean z2;
        ?? r10;
        Bitmap bitmap2;
        int i10;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        String alpha = alpha(j5);
        StringBuilder hotel = q.hotel(width, height, "   [squeeze] Starting: ", "x", ", target=");
        hotel.append(alpha);
        Log.d("ImageCompression", hotel.toString());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.alpha = bitmap;
        ?? obj = new Object();
        obj.alpha = 85;
        ?? obj2 = new Object();
        boolean z10 = false;
        if (!charlie(file, obj2, obj, objectRef)) {
            Log.e("ImageCompression", "   [squeeze] Initial save failed");
            return false;
        }
        while (file.length() > j5 && (i10 = obj.alpha) > i4) {
            obj.alpha = i10 - 10;
            if (!charlie(file, obj2, obj, objectRef)) {
                Log.e("ImageCompression", "   [squeeze] Quality reduction save failed at quality=" + obj.alpha);
                return false;
            }
        }
        Bitmap bitmap3 = null;
        while (file.length() > j5 && ((Bitmap) objectRef.alpha).getWidth() > i5 && ((Bitmap) objectRef.alpha).getHeight() > i5) {
            if (bitmap3 != null) {
                if (Intrinsics.areEqual(bitmap3, bitmap) || bitmap3.isRecycled()) {
                    bitmap3 = null;
                }
                if (bitmap3 != null) {
                    bitmap3.recycle();
                }
            }
            bitmap3 = (Bitmap) objectRef.alpha;
            int width2 = (int) (bitmap3.getWidth() * 0.85d);
            int height2 = (int) (((Bitmap) objectRef.alpha).getHeight() * 0.85d);
            boolean z11 = z10;
            StringBuilder hotel2 = q.hotel(((Bitmap) objectRef.alpha).getWidth(), ((Bitmap) objectRef.alpha).getHeight(), "   [squeeze] Scaling down: ", "x", " -> ");
            hotel2.append(width2);
            hotel2.append("x");
            hotel2.append(height2);
            Log.d("ImageCompression", hotel2.toString());
            objectRef.alpha = Bitmap.createScaledBitmap((Bitmap) objectRef.alpha, width2, height2, true);
            if (!charlie(file, obj2, obj, objectRef)) {
                Log.e("ImageCompression", "   [squeeze] Dimension reduction save failed");
                if (!Intrinsics.areEqual(objectRef.alpha, bitmap) && !((Bitmap) objectRef.alpha).isRecycled()) {
                    ((Bitmap) objectRef.alpha).recycle();
                }
                return z11;
            }
            z10 = z11;
        }
        boolean z12 = z10;
        if (bitmap3 != null) {
            if (!Intrinsics.areEqual(bitmap3, bitmap) && !bitmap3.isRecycled()) {
                bitmap2 = bitmap3;
            } else {
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
        }
        if (file.exists()) {
            j6 = file.length();
        } else {
            j6 = 0;
        }
        if (j6 <= j5) {
            z2 = true;
        } else {
            z2 = z12;
        }
        if (z2) {
            if (i11 > 0) {
                r10 = (int) ((1.0d - ((((Bitmap) objectRef.alpha).getHeight() * ((Bitmap) objectRef.alpha).getWidth()) / i11)) * 100);
            } else {
                r10 = z12;
            }
            String alpha2 = alpha(j6);
            int width3 = ((Bitmap) objectRef.alpha).getWidth();
            int height3 = ((Bitmap) objectRef.alpha).getHeight();
            StringBuilder green = P0.green("   [squeeze] ✅ SUCCESS: ", alpha2, " (", "% pixel reduction, ", r10);
            green.append(width3);
            green.append("x");
            green.append(height3);
            green.append(")");
            Log.d("ImageCompression", green.toString());
            return z2;
        }
        String alpha3 = alpha(j6);
        String alpha4 = alpha(j5);
        String alpha5 = alpha(j6 - j5);
        StringBuilder india = q.india("   [squeeze] ❌ FAILED: ", alpha3, " > ", alpha4, " (exceeded by ");
        india.append(alpha5);
        india.append(")");
        Log.e("ImageCompression", india.toString());
        return z2;
    }

    public static final boolean charlie(File file, s sVar, s sVar2, Ref.ObjectRef objectRef) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((Bitmap) objectRef.alpha).compress(Bitmap.CompressFormat.JPEG, sVar2.alpha, fileOutputStream);
                fileOutputStream.close();
                long length = file.length();
                int i4 = sVar.alpha + 1;
                sVar.alpha = i4;
                Log.d("ImageCompression", "   [squeeze] Iteration " + i4 + ": quality=" + sVar2.alpha + ", size=" + alpha(length) + ", dims=" + ((Bitmap) objectRef.alpha).getWidth() + "x" + ((Bitmap) objectRef.alpha).getHeight());
                return true;
            } finally {
            }
        } catch (Exception e) {
            Log.e("ImageCompression", "   [squeeze] Save failed: " + e.getMessage(), e);
            return false;
        }
    }
}
