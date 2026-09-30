package N9;

import android.content.Context;
import androidx.lifecycle.ac;
import av.q;
import io.getunleash.android.DefaultUnleash;
import io.getunleash.android.UnleashConfig;
import io.getunleash.android.cache.ToggleCache;
import io.getunleash.android.data.Payload;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.data.Variant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import vf.ab;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.au;
import yf.az;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class p implements q3.e {
    public final az alpha = AbstractC3428A.bravo(0, 1, null, 5);
    public final DefaultUnleash bravo;

    public p(Context context) {
        C3462a.alpha("UnleashFeatureFlags", 12, com.google.android.material.datepicker.j.kilo("Initializing | proxyUrl=https://eu.app.unleash-hosted.com/euee0008/api/frontend/ pollingInterval=", 60000L, "ms"), null);
        DefaultUnleash defaultUnleash = new DefaultUnleash(context, UnleashConfig.INSTANCE.newBuilder("samurai-android").proxyUrl("https://eu.app.unleash-hosted.com/euee0008/api/frontend/").clientKey("samurai-android:production.215caf13388411dae91ddb9f506326d1d6653f951fb89c31ab843219").getPollingStrategy().interval(60000L).build(), (UnleashContext) null, (ToggleCache) null, (List) null, (ac) null, (ab) null, 124, (DefaultConstructorMarker) null);
        this.bravo = defaultUnleash;
        io.getunleash.android.a.charlie(defaultUnleash, CollectionsKt.listOf(new n(this), new o(this)), null, null, 6, null);
    }

    @Override // q3.e
    public final void alpha(String userId, Ld.g gVar) {
        Intrinsics.echo(userId, "userId");
        C3462a.alpha("UnleashFeatureFlags", 12, "Context updated | userId=" + userId + " properties=" + gVar, null);
        UnleashContext.Builder userId2 = new UnleashContext.Builder(null, null, null, null, 15, null).userId(userId);
        Iterator it = ((Ld.h) gVar.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            userId2.addProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.bravo.setContextAsync(userId2.build());
    }

    @Override // q3.e
    public final void bravo() {
        C3462a.alpha("UnleashFeatureFlags", 12, "Context cleared", null);
        this.bravo.setContextAsync(new UnleashContext(null, null, null, null, 15, null));
    }

    @Override // q3.e
    public final Boolean charlie(String str) {
        Object m206constructorimpl;
        Boolean bool;
        DefaultUnleash defaultUnleash = this.bravo;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean isEnabled = defaultUnleash.isEnabled(str, true);
            if (isEnabled == defaultUnleash.isEnabled(str, false)) {
                bool = Boolean.valueOf(isEnabled);
            } else {
                bool = null;
            }
            m206constructorimpl = Result.m206constructorimpl(bool);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl == null) {
            obj = m206constructorimpl;
        } else {
            C3462a.alpha("UnleashFeatureFlags", 12, q.foxtrot("getBoolean(", str, ") failed: ", m207exceptionOrNullimpl.getMessage()), null);
        }
        return (Boolean) obj;
    }

    @Override // q3.e
    public final Long delta(String str) {
        String echo = echo(str);
        if (echo != null) {
            return r.uniform(echo);
        }
        return null;
    }

    @Override // q3.e
    public final String echo(String str) {
        Object m206constructorimpl;
        String str2;
        Payload payload;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Variant variant = this.bravo.getVariant(str);
            if (variant.getFeatureEnabled() && (payload = variant.getPayload()) != null) {
                str2 = payload.getValue();
            } else {
                str2 = null;
            }
            m206constructorimpl = Result.m206constructorimpl(str2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl == null) {
            obj = m206constructorimpl;
        } else {
            C3462a.alpha("UnleashFeatureFlags", 12, q.foxtrot("getString(", str, ") failed: ", m207exceptionOrNullimpl.getMessage()), null);
        }
        return (String) obj;
    }

    @Override // q3.e
    public final InterfaceC3439i foxtrot() {
        return new au(this.alpha);
    }
}
