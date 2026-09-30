package j8;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C1477x;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k8.C2019a;

/* renamed from: j8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1953j {
    public static final long bravo = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern charlie = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static C1953j delta;
    public final C1477x alpha;

    public C1953j(C1477x c1477x) {
        this.alpha = c1477x;
    }

    public final boolean alpha(C2019a c2019a) {
        if (!TextUtils.isEmpty(c2019a.charlie)) {
            long j5 = c2019a.foxtrot + c2019a.echo;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.alpha.getClass();
            if (j5 < timeUnit.toSeconds(System.currentTimeMillis()) + bravo) {
                return true;
            }
            return false;
        }
        return true;
    }
}
