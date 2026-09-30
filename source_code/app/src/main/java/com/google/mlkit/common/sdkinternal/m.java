package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.measurement.internal.C1475w;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class m {
    public static final I7.b bravo;
    public final Context alpha;

    static {
        I7.a bravo2 = I7.b.bravo(m.class);
        bravo2.alpha(I7.j.charlie(i.class));
        bravo2.alpha(I7.j.charlie(Context.class));
        bravo2.foxtrot = new C1475w(8);
        bravo = bravo2.bravo();
    }

    public m(Context context) {
        this.alpha = context;
    }

    public final synchronized String alpha() {
        String string = this.alpha.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.alpha.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
