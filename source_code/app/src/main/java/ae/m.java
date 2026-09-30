package ae;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import f1.AbstractC1683c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends ah.h {
    public final /* synthetic */ o hotel;

    public m(o oVar) {
        this.hotel = oVar;
    }

    @Override // ah.h
    public final void bravo(int i4, ai.b contract, Object obj) {
        Bundle bundle;
        int i5;
        Intrinsics.echo(contract, "contract");
        o oVar = this.hotel;
        ai.a bravo = contract.bravo(oVar, obj);
        if (bravo != null) {
            new Handler(Looper.getMainLooper()).post(new l(i4, 0, this, bravo));
            return;
        }
        Intent alpha = contract.alpha(oVar, obj);
        if (alpha.getExtras() != null) {
            Bundle extras = alpha.getExtras();
            Intrinsics.checkNotNull(extras);
            if (extras.getClassLoader() == null) {
                alpha.setExtrasClassLoader(oVar.getClassLoader());
            }
        }
        if (alpha.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = alpha.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            alpha.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (Intrinsics.areEqual("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", alpha.getAction())) {
            String[] stringArrayExtra = alpha.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC1683c.echo(oVar, stringArrayExtra, i4);
            return;
        }
        if (Intrinsics.areEqual("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", alpha.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) alpha.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.checkNotNull(intentSenderRequest);
                i5 = i4;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i5 = i4;
            }
            try {
                oVar.startIntentSenderForResult(intentSenderRequest.alpha, i5, intentSenderRequest.purple, intentSenderRequest.red, intentSenderRequest.silver, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                new Handler(Looper.getMainLooper()).post(new l(i5, 1, this, e));
                return;
            }
        }
        oVar.startActivityForResult(alpha, i4, bundle2);
    }
}
