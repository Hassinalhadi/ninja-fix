package Z5;

import G6.q;
import O7.j;
import T5.o;
import V5.x;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.Arrays;
import m6.AbstractC2104e;
import s6.V4;

/* loaded from: classes2.dex */
public final class f extends com.google.android.gms.common.api.g {
    public static final com.google.android.gms.common.api.e india = new com.google.android.gms.common.api.e("ModuleInstall.API", new D6.b(4), new Object());

    public final q echo(l... lVarArr) {
        boolean z2;
        if (lVarArr.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.alpha("Please provide at least one OptionalModuleApi.", z2);
        for (l lVar : lVarArr) {
            x.india(lVar, "Requested API must not be null.");
        }
        ApiFeatureRequest o5 = ApiFeatureRequest.o(Arrays.asList(lVarArr), false);
        if (o5.alpha.isEmpty()) {
            return V4.echo(new ModuleAvailabilityResponse(0, true));
        }
        o bravo = o.bravo();
        bravo.echo = new Feature[]{AbstractC2104e.charlie};
        bravo.charlie = 27301;
        bravo.bravo = false;
        bravo.delta = new j(this, o5);
        return delta(0, bravo.alpha());
    }
}
