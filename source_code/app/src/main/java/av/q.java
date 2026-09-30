package av;

import androidx.camera.core.impl.C0510h;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.U;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class q {
    public static final /* synthetic */ int[] alpha = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static /* synthetic */ int alpha(int i4, int i5) {
        if (i4 == 0 || i5 == 0) {
            throw null;
        }
        return i4 - i5;
    }

    public static /* synthetic */ boolean bravo(int i4, int i5) {
        if (i4 != 0) {
            return i4 == i5;
        }
        throw null;
    }

    public static T charlie(ArrayList arrayList, T t5) {
        arrayList.add(t5);
        return new T();
    }

    public static String delta(int i4, String str, String str2) {
        return str + i4 + str2;
    }

    public static String echo(String str, String str2) {
        return str + str2;
    }

    public static String foxtrot(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String golf(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder hotel(int i4, int i5, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i4);
        sb2.append(str2);
        sb2.append(i5);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder india(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void juliet(int i4, U u4, long j5, T t5) {
        t5.alpha(new C0510h(i4, u4, j5));
    }

    public static /* synthetic */ boolean kilo(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String lima(int i4) {
        switch (i4) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int mike(int i4) {
        if (i4 != 0) {
            return i4 - 1;
        }
        throw null;
    }

    public static /* synthetic */ String november(int i4) {
        switch (i4) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return BuildConfig.TRAVIS;
        }
    }

    public static /* synthetic */ String oscar(int i4) {
        switch (i4) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return BuildConfig.TRAVIS;
        }
    }

    public static /* synthetic */ int[] papa(int i4) {
        int[] iArr = new int[i4];
        System.arraycopy(alpha, 0, iArr, 0, i4);
        return iArr;
    }
}
