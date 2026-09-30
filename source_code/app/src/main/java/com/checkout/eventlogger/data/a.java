package com.checkout.eventlogger.data;

import Cf.e;
import Nd.h;
import com.google.gson.l;
import com.google.gson.m;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import vf.U;
import vf.aa;
import vf.ab;
import vf.ad;
import vf.ao;

/* loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0003a e = new C0003a();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f6550a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f6551b;

    /* renamed from: c, reason: collision with root package name */
    public final com.checkout.eventlogger.network.b.a f6552c;

    /* renamed from: d, reason: collision with root package name */
    public final d f6553d;

    /* renamed from: com.checkout.eventlogger.data.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0003a {
    }

    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements Function0<l> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6554a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public l invoke() {
            return new m().alpha();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends Lambda implements Function0<ab> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6555a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public ab invoke() {
            h plus = new aa("CheckoutLoggingService").plus(ad.foxtrot());
            e eVar = ao.alpha;
            return ad.charlie(plus.plus(Cf.d.purple).plus(U.alpha));
        }
    }

    public a(@NotNull com.checkout.eventlogger.network.b.a networkApi, @NotNull d logEventMapper) {
        Intrinsics.echo(networkApi, "networkApi");
        Intrinsics.echo(logEventMapper, "logEventMapper");
        this.f6552c = networkApi;
        this.f6553d = logEventMapper;
        this.f6550a = LazyKt.lazy(c.f6555a);
        this.f6551b = LazyKt.lazy(b.f6554a);
    }
}
