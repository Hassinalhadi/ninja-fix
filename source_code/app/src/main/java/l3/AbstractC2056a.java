package l3;

import T3.b;
import a0.C0366t;
import a0.au;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.widget.EditText;
import g0.C1725e;
import g0.C1726f;
import g0.ah;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2056a {
    public static C1726f alpha;

    public static final C1726f alpha() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = ah.alpha;
        au auVar = new au(C0366t.bravo);
        b bVar = new b(2, false);
        bVar.juliet(19.0f, 6.41f);
        bVar.hotel(17.59f, 5.0f);
        bVar.hotel(12.0f, 10.59f);
        bVar.hotel(6.41f, 5.0f);
        bVar.hotel(5.0f, 6.41f);
        bVar.hotel(10.59f, 12.0f);
        bVar.hotel(5.0f, 17.59f);
        bVar.hotel(6.41f, 19.0f);
        bVar.hotel(12.0f, 13.41f);
        bVar.hotel(17.59f, 19.0f);
        bVar.hotel(19.0f, 17.59f);
        bVar.hotel(13.41f, 12.0f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public static boolean bravo(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static final boolean charlie(Context context) {
        Intrinsics.echo(context, "context");
        int i4 = Build.VERSION.SDK_INT;
        try {
            int i5 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
            if (i4 >= 28) {
                if (i5 != 0 && i5 != 2) {
                    return true;
                }
                return false;
            }
            if (i5 == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}
