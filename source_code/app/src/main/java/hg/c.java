package hg;

import a0.C0366t;
import a0.au;
import com.google.android.gms.internal.measurement.C1361p1;
import g0.C1725e;
import g0.C1726f;
import g0.ah;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c {
    public static C1726f alpha;

    public static final C1726f alpha() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = ah.alpha;
        au auVar = new au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(12.0f, 2.0f);
        bVar.delta(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        bVar.lima(4.48f, 10.0f, 10.0f, 10.0f);
        bVar.lima(10.0f, -4.48f, 10.0f, -10.0f);
        bVar.kilo(17.52f, 2.0f, 12.0f, 2.0f);
        bVar.charlie();
        bVar.juliet(10.0f, 17.0f);
        bVar.india(-5.0f, -5.0f);
        bVar.india(1.41f, -1.41f);
        bVar.hotel(10.0f, 14.17f);
        bVar.india(7.59f, -7.59f);
        bVar.hotel(19.0f, 8.0f);
        bVar.india(-9.0f, 9.0f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public static String bravo(C1361p1 c1361p1) {
        StringBuilder sb2 = new StringBuilder(c1361p1.delta());
        for (int i4 = 0; i4 < c1361p1.delta(); i4++) {
            byte alpha2 = c1361p1.alpha(i4);
            if (alpha2 != 34) {
                if (alpha2 != 39) {
                    if (alpha2 != 92) {
                        switch (alpha2) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (alpha2 >= 32 && alpha2 <= 126) {
                                    sb2.append((char) alpha2);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((alpha2 >>> 6) & 3) + 48));
                                    sb2.append((char) (((alpha2 >>> 3) & 7) + 48));
                                    sb2.append((char) ((alpha2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
