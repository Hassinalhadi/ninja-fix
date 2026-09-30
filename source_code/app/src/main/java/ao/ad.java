package ao;

import a0.AbstractC0362p;
import a0.AbstractC0367u;
import a0.C0352f;
import a0.C0354h;
import a0.C0355i;
import a0.C0366t;
import a0.InterfaceC0364r;
import a0.ao;
import a0.au;
import android.graphics.Paint;
import androidx.camera.core.impl.Z;
import androidx.compose.runtime.C0585q;
import bz.InterfaceC0783h;
import com.clevertap.android.sdk.Logger;
import com.google.android.gms.internal.measurement.C1365q1;
import com.google.android.gms.measurement.internal.Z0;
import com.google.maps.android.BuildConfig;
import f.C1674k;
import java.util.Iterator;
import java.util.Random;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import s0.C2549i;
import s0.an;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ad {
    public static String alpha(Z z2) {
        return (String) z2.quebec(bf.j.crimson);
    }

    public static String amber(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String azure(StringBuilder sb2, float f5, char c3) {
        sb2.append(f5);
        sb2.append(c3);
        return sb2.toString();
    }

    public static StringBuilder beige(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static NoWhenBranchMatchedException black(C0585q c0585q, int i4, boolean z2) {
        c0585q.purple(i4);
        c0585q.quebec(z2);
        return new NoWhenBranchMatchedException();
    }

    public static void blue(int i4, C0585q c0585q, int i5, C2549i c2549i) {
        c0585q.f(Integer.valueOf(i4));
        c0585q.bravo(Integer.valueOf(i5), c2549i);
    }

    public static String bravo(Z z2, String str) {
        return (String) z2.plum(bf.j.crimson, str);
    }

    public static void bronze(long j5, String str, StringBuilder sb2) {
        sb2.append((Object) C0366t.india(j5));
        sb2.append(str);
    }

    public static boolean charlie(InterfaceC0783h interfaceC0783h, long j5) {
        if (j5 >= interfaceC0783h.bravo()) {
            return true;
        }
        return false;
    }

    public static void coral(J2.t tVar, long j5) {
        tVar.mike().november();
        tVar.yankee(j5);
    }

    public static void crimson(Z0 z02) {
        z02.u().W();
        z02.foxtrot();
    }

    public static /* synthetic */ void cyan(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static long delta(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static int echo(int i4) {
        switch (i4) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i4) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static void emerald(JSONException jSONException, StringBuilder sb2) {
        sb2.append(jSONException.getLocalizedMessage());
        Logger.v(sb2.toString());
    }

    public static /* synthetic */ void foxtrot(c0.d dVar, long j5, float f5, float f10, long j6, long j7, float f11, c0.h hVar, int i4) {
        float f12;
        if ((i4 & 64) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f11;
        }
        dVar.white(j5, f5, f10, j6, j7, f12, hVar);
    }

    public static int fuchsia(int i4, int i5, int i10) {
        return com.google.android.gms.internal.mlkit_vision_barcode_bundled.aa.romeo(i4) + i5 + i10;
    }

    public static int gold(int i4, int i5, int i10, int i11) {
        return C1365q1.romeo(i4) + i5 + i10 + i11;
    }

    public static /* synthetic */ void golf(c0.d dVar, long j5, float f5, long j6, c0.e eVar, int i4) {
        if ((i4 & 4) != 0) {
            j6 = dVar.orange();
        }
        long j7 = j6;
        if ((i4 & 16) != 0) {
            eVar = c0.g.alpha;
        }
        dVar.uniform(j5, f5, j7, eVar);
    }

    public static String gray(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int green(int i4, int i5, int i10, int i11) {
        return com.google.android.gms.internal.mlkit_vision_barcode_bundled.aa.romeo(i4) + i5 + i10 + i11;
    }

    public static void hotel(c0.d dVar, C0352f c0352f, long j5, long j6, float f5, AbstractC0367u abstractC0367u, int i4, int i5) {
        long j7;
        float f10;
        int i10;
        if ((i5 & 16) != 0) {
            j7 = j5;
        } else {
            j7 = j6;
        }
        if ((i5 & 32) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f5;
        }
        if ((i5 & 512) != 0) {
            i10 = 1;
        } else {
            i10 = i4;
        }
        dVar.azure(c0352f, 0L, j5, j7, f10, abstractC0367u, i10);
    }

    public static void india(an anVar, au auVar, long j5, long j6, float f5, float f10, int i4) {
        if ((i4 & 64) != 0) {
            f10 = 1.0f;
        }
        c0.b bVar = anVar.alpha;
        InterfaceC0364r interfaceC0364r = bVar.alpha.charlie;
        Be.e eVar = bVar.silver;
        if (eVar == null) {
            eVar = ao.golf();
            eVar.yankee(1);
            bVar.silver = eVar;
        }
        auVar.alpha(f10, bVar.purple.oscar(), eVar);
        if (!Intrinsics.areEqual((AbstractC0367u) eVar.delta, null)) {
            eVar.papa(null);
        }
        if (eVar.alpha != 3) {
            eVar.november(3);
        }
        Paint paint = (Paint) eVar.bravo;
        if (paint.getStrokeWidth() != f5) {
            eVar.xray(f5);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) eVar.bravo).setStrokeMiter(4.0f);
        }
        if (eVar.india() != 0) {
            eVar.victor(0);
        }
        if (eVar.juliet() != 0) {
            eVar.whiskey(0);
        }
        if (!Intrinsics.areEqual((C0355i) eVar.echo, null)) {
            eVar.romeo(null);
        }
        if (!paint.isFilterBitmap()) {
            eVar.quebec(1);
        }
        interfaceC0364r.alpha(j5, j6, eVar);
    }

    public static /* synthetic */ String indigo(int i4) {
        switch (i4) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String ivory(int i4) {
        switch (i4) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return BuildConfig.TRAVIS;
        }
    }

    public static /* synthetic */ void juliet(c0.d dVar, long j5, long j6, long j7, float f5, int i4, int i5) {
        int i10;
        if ((i5 & 16) != 0) {
            i10 = 0;
        } else {
            i10 = i4;
        }
        dVar.whiskey(j5, j6, j7, f5, i10);
    }

    public static /* synthetic */ void kilo(c0.d dVar, C0354h c0354h, AbstractC0362p abstractC0362p, float f5, c0.h hVar, int i4) {
        int i5;
        if ((i4 & 4) != 0) {
            f5 = 1.0f;
        }
        float f10 = f5;
        c0.e eVar = hVar;
        if ((i4 & 8) != 0) {
            eVar = c0.g.alpha;
        }
        c0.e eVar2 = eVar;
        if ((i4 & 32) != 0) {
            i5 = 3;
        } else {
            i5 = 0;
        }
        dVar.olive(c0354h, abstractC0362p, f10, eVar2, i5);
    }

    public static /* synthetic */ void lima(c0.d dVar, C0354h c0354h, long j5, float f5, c0.h hVar, int i4) {
        if ((i4 & 4) != 0) {
            f5 = 1.0f;
        }
        dVar.echo(c0354h, j5, f5, hVar);
    }

    public static /* synthetic */ void mike(an anVar, AbstractC0362p abstractC0362p, long j5, long j6, float f5, c0.e eVar, int i4) {
        float f10;
        c0.e eVar2;
        if ((i4 & 2) != 0) {
            j5 = 0;
        }
        long j7 = j5;
        if ((i4 & 4) != 0) {
            j6 = delta(anVar.bravo(), j7);
        }
        long j10 = j6;
        if ((i4 & 8) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f5;
        }
        if ((i4 & 16) != 0) {
            eVar2 = c0.g.alpha;
        } else {
            eVar2 = eVar;
        }
        anVar.foxtrot(abstractC0362p, j7, j10, f10, eVar2);
    }

    public static /* synthetic */ void november(c0.d dVar, long j5, long j6, long j7, float f5, c0.h hVar, int i4) {
        long j10;
        long j11;
        float f10;
        c0.e eVar;
        int i5;
        if ((i4 & 2) != 0) {
            j10 = 0;
        } else {
            j10 = j6;
        }
        if ((i4 & 4) != 0) {
            j11 = delta(dVar.bravo(), j10);
        } else {
            j11 = j7;
        }
        if ((i4 & 8) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f5;
        }
        if ((i4 & 16) != 0) {
            eVar = c0.g.alpha;
        } else {
            eVar = hVar;
        }
        if ((i4 & 64) != 0) {
            i5 = 3;
        } else {
            i5 = 0;
        }
        dVar.emerald(j5, j10, j11, f10, eVar, i5);
    }

    public static /* synthetic */ void oscar(an anVar, au auVar, long j5, long j6, long j7, c0.e eVar, int i4) {
        long j10;
        c0.e eVar2;
        if ((i4 & 2) != 0) {
            j5 = 0;
        }
        long j11 = j5;
        if ((i4 & 4) != 0) {
            j10 = delta(anVar.bravo(), j11);
        } else {
            j10 = j6;
        }
        if ((i4 & 32) != 0) {
            eVar2 = c0.g.alpha;
        } else {
            eVar2 = eVar;
        }
        anVar.golf(auVar, j11, j10, j7, 1.0f, eVar2);
    }

    public static /* synthetic */ void papa(c0.d dVar, long j5, long j6, long j7, long j10, c0.e eVar, int i4) {
        long j11;
        c0.e eVar2;
        if ((i4 & 2) != 0) {
            j11 = 0;
        } else {
            j11 = j6;
        }
        if ((i4 & 16) != 0) {
            eVar2 = c0.g.alpha;
        } else {
            eVar2 = eVar;
        }
        dVar.zulu(j5, j11, j7, j10, eVar2);
    }

    public static /* synthetic */ int quebec(int i4) {
        switch (i4) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int romeo() {
        return new Random().nextInt();
    }

    public static int sierra(float f5, int i4, int i5) {
        return (Float.floatToIntBits(f5) + i4) * i5;
    }

    public static int tango(int i4) {
        return new Random().nextInt(i4);
    }

    public static int uniform(int i4, int i5, int i10) {
        return C1365q1.romeo(i4) + i5 + i10;
    }

    public static int victor(int i4, int i5, int i10, int i11) {
        return ((i4 - i5) - i10) % i11;
    }

    public static int whiskey(int i4, int i5, long j5) {
        return (kotlin.p.alpha(j5) + i4) * i5;
    }

    public static C1674k xray(C0585q c0585q) {
        C1674k c1674k = new C1674k();
        c0585q.f(c1674k);
        return c1674k;
    }

    public static ClassCastException yankee(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String zulu(int i4, String str) {
        return str + i4;
    }
}
