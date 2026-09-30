package A0;

import androidx.compose.runtime.C0585q;
import com.google.maps.android.BuildConfig;
import e8.C1633a;
import ge.InterfaceC1780l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class z {
    public static O0.o alpha(O0.o oVar, O0.o oVar2) {
        boolean z2 = oVar2 instanceof O0.b;
        if (z2 && (oVar instanceof O0.b)) {
            O0.b bVar = (O0.b) oVar2;
            float f5 = bVar.bravo;
            if (Float.isNaN(f5)) {
                f5 = ((O0.b) oVar).bravo;
            }
            return new O0.b(bVar.alpha, f5);
        }
        if (z2 && !(oVar instanceof O0.b)) {
            return oVar2;
        }
        if (!z2 && (oVar instanceof O0.b)) {
            return oVar;
        }
        return oVar2.charlie(new B2.q(16, oVar));
    }

    public static final boolean bravo(int i4) {
        if (i4 != 3 && i4 != 4 && i4 != 6) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ int charlie(int i4) {
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                i5 = 3;
                if (i4 != 3) {
                    if (i4 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i5;
    }

    public static /* synthetic */ boolean delta(int i4) {
        if (i4 == 1 || i4 == 2) {
            return false;
        }
        if (i4 == 3 || i4 == 4) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ long echo(int i4) {
        if (i4 == 1) {
            return 1099511627776L;
        }
        if (i4 == 2) {
            return 1073741824L;
        }
        if (i4 == 3) {
            return 1048576L;
        }
        if (i4 == 4) {
            return RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }
        if (i4 == 5) {
            return 1L;
        }
        throw null;
    }

    public static int foxtrot(int i4, int i5, int i10, int i11) {
        return (i4 * i5) + i10 + i11;
    }

    public static InterfaceC1780l golf(Class cls, String str, String str2, int i4, kotlin.jvm.internal.v vVar) {
        return vVar.foxtrot(new kotlin.jvm.internal.l(cls, str, str2, i4));
    }

    public static ClassCastException hotel(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String india(long j5, String str) {
        return str + j5;
    }

    public static String juliet(String str, int i4, int i5, String str2) {
        return str + i4 + str2 + i5;
    }

    public static String kilo(StringBuilder sb2, String str) {
        return str + ((Object) sb2);
    }

    public static StringBuilder lima(String str, String str2, String str3, String str4, int i4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i4);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static HashMap mike(Class cls, C1633a c1633a) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c1633a);
        return hashMap;
    }

    public static Map november(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void oscar(int i4, HashMap hashMap, String str, int i5, String str2) {
        hashMap.put(str, Integer.valueOf(i4));
        hashMap.put(str2, Integer.valueOf(i5));
    }

    public static void papa(C0585q c0585q, boolean z2, boolean z10, boolean z11) {
        c0585q.quebec(z2);
        c0585q.quebec(z10);
        c0585q.quebec(z11);
    }

    public static /* synthetic */ String quebec(int i4) {
        switch (i4) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return BuildConfig.TRAVIS;
        }
    }

    public static /* synthetic */ String romeo(int i4) {
        switch (i4) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return BuildConfig.TRAVIS;
        }
    }
}
