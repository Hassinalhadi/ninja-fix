package com.checkout.components.kmp.rememberme.data.remote;

import Of.i;
import Of.t;
import bz.h0;
import cd.c;
import cd.d;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeEnvironment;
import com.google.android.material.internal.s;
import jd.C1959a;
import jd.b;
import jd.h;
import jd.j;
import kd.aa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.L6;
import sd.e;
import sd.f;
import xd.C3337j;
import yd.AbstractC3419c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/data/remote/HttpClientFactory;", "", "Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;", "environment", "<init>", "(Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;)V", "Lfd/d;", "engine", "Lcd/c;", "create", "(Lfd/d;)Lcd/c;", "Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeEnvironment;", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpClientFactory {
    public static final int $stable = 0;

    @NotNull
    private final RememberMeEnvironment environment;

    public HttpClientFactory(@NotNull RememberMeEnvironment environment) {
        Intrinsics.echo(environment, "environment");
        this.environment = environment;
    }

    private static final Unit create$lambda$3(HttpClientFactory httpClientFactory, d HttpClient) {
        Intrinsics.echo(HttpClient, "$this$HttpClient");
        HttpClient.alpha(h.delta, new h0(15));
        if (httpClientFactory.environment == RememberMeEnvironment.SANDBOX) {
            HttpClient.alpha(aa.charlie, new h0(16));
        }
        HttpClient.foxtrot = true;
        return Unit.INSTANCE;
    }

    public static final Unit create$lambda$3$lambda$1(b install) {
        f sVar;
        Intrinsics.echo(install, "$this$install");
        t alpha = L6.alpha(new h0(14));
        int i4 = AbstractC3419c.alpha;
        e contentType = sd.b.alpha;
        Intrinsics.echo(contentType, "contentType");
        C3337j c3337j = new C3337j(alpha);
        if (contentType.zulu(contentType)) {
            sVar = j.alpha;
        } else {
            sVar = new s(15, contentType);
        }
        install.bravo.add(new C1959a(c3337j, contentType, sVar));
        return Unit.INSTANCE;
    }

    public static final Unit create$lambda$3$lambda$1$lambda$0(i Json) {
        Intrinsics.echo(Json, "$this$Json");
        Json.alpha = true;
        Json.delta = true;
        Json.charlie = true;
        return Unit.INSTANCE;
    }

    public static final Unit create$lambda$3$lambda$2(kd.i install) {
        Intrinsics.echo(install, "$this$install");
        install.charlie = new DebugLogger();
        install.echo = kd.e.silver;
        return Unit.INSTANCE;
    }

    @NotNull
    public final c create(@NotNull fd.d engine) {
        Intrinsics.echo(engine, "engine");
        d dVar = new d();
        create$lambda$3(this, dVar);
        return new c(engine, dVar);
    }
}
