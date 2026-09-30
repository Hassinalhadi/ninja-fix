package C9;

import Jb.e0;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import d3.k;
import delivery.samurai.android.R;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import q3.g;
import t6.AbstractC2966a2;

/* loaded from: classes2.dex */
public final class c {
    public final k alpha;
    public final g bravo;

    public c(k activity, g featureFlagProvider) {
        Intrinsics.echo(activity, "activity");
        Intrinsics.echo(featureFlagProvider, "featureFlagProvider");
        this.alpha = activity;
        this.bravo = featureFlagProvider;
    }

    public final void alpha(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m206constructorimpl(Boolean.valueOf(new Yc.a(this.alpha, this.bravo).alpha(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void bravo(String str, String str2) {
        k kVar = this.alpha;
        if (!kVar.isFinishing() && !kVar.isDestroyed() && !kVar.getSupportFragmentManager().jade() && kVar.getSupportFragmentManager().blue("PrepareHeadingDialog") == null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            e0 e0Var = new e0();
            Bundle bundle = new Bundle();
            bundle.putString(Constants.KEY_TITLE, str);
            bundle.putString("body", str2);
            e0Var.setArguments(bundle);
            e0Var.romeo(kVar.getSupportFragmentManager(), "PrepareHeadingDialog");
        }
    }

    public final void charlie(String str) {
        Integer tango;
        Object m206constructorimpl;
        k kVar = this.alpha;
        if (str != null && (tango = r.tango(str)) != null) {
            int intValue = tango.intValue();
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(AbstractC2966a2.alpha(kVar));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (m206constructorimpl instanceof kotlin.k) {
                m206constructorimpl = null;
            }
            Y1.r rVar = (Y1.r) m206constructorimpl;
            if (rVar == null) {
                kVar.tango();
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("TICKET_ID", intValue);
                rVar.charlie(R.id.nav_ticket_details, bundle, null);
                Result.m206constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m206constructorimpl(ResultKt.createFailure(th2));
            }
            kVar.tango();
            return;
        }
        kVar.tango();
    }
}
