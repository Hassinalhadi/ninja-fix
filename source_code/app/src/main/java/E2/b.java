package E2;

import A2.aa;
import A2.z;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes3.dex */
public final class b {
    public static final String delta = z.golf("SystemJobInfoConverter");
    public final ComponentName alpha;
    public final aa bravo;
    public final boolean charlie;

    public b(Context context, aa aaVar, boolean z2) {
        this.bravo = aaVar;
        this.alpha = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.charlie = z2;
    }
}
