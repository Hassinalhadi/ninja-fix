package w9;

import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.injections.modules.AppModule_ProvideAndroidAppFactory;
import java.util.Set;
import pe.AbstractC2327c;
import s6.AbstractC2763s0;

/* loaded from: classes2.dex */
public final class p extends AbstractC3244e {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.d f14006a;
    public final M9.b alpha;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f14007b;
    public final ApplicationContextModule bravo;
    public final dagger.internal.d bronze;
    public final Q9.e charlie;
    public final dagger.internal.d coral;
    public final dagger.internal.d crimson;
    public final dagger.internal.d cyan;
    public final Q9.a delta;
    public final dagger.internal.d e;
    public final Q9.d echo;
    public final dagger.internal.d emerald;
    public final Q9.f foxtrot;
    public final dagger.internal.d fuchsia;
    public final dagger.internal.d gold;
    public final dagger.internal.d gray;
    public final dagger.internal.d green;
    public final dagger.internal.d indigo;
    public final dagger.internal.d ivory;
    public final dagger.internal.d jade;
    public final dagger.internal.d lavender;
    public final dagger.internal.d lime;
    public final dagger.internal.d magenta;
    public final dagger.internal.d maroon;
    public final dagger.internal.d navy;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.d f14019o;
    public final dagger.internal.d ochre;
    public final dagger.internal.d olive;
    public final dagger.internal.d orange;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.d f14020p;
    public final dagger.internal.d peach;
    public final dagger.internal.d pink;
    public final dagger.internal.d plum;
    public final dagger.internal.d purple;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.d f14021q;

    /* renamed from: r, reason: collision with root package name */
    public final dagger.internal.d f14022r;

    /* renamed from: s, reason: collision with root package name */
    public final dagger.internal.d f14023s;
    public final dagger.internal.d silver;

    /* renamed from: t, reason: collision with root package name */
    public final dagger.internal.d f14024t;
    public final dagger.internal.d white;
    public final dagger.internal.d yellow;
    public final p golf = this;
    public final dagger.internal.d hotel = AbstractC2327c.uniform(this, 2);
    public final dagger.internal.d india = AbstractC2327c.uniform(this, 1);
    public final dagger.internal.d juliet = AbstractC2327c.uniform(this, 0);
    public final dagger.internal.d kilo = AbstractC2327c.uniform(this, 3);
    public final dagger.internal.d lima = AbstractC2327c.uniform(this, 6);
    public final dagger.internal.d mike = AbstractC2327c.uniform(this, 7);
    public final dagger.internal.d november = AbstractC2327c.uniform(this, 5);
    public final dagger.internal.d oscar = AbstractC2327c.uniform(this, 4);
    public final dagger.internal.d papa = AbstractC2327c.uniform(this, 8);
    public final dagger.internal.d quebec = AbstractC2327c.uniform(this, 9);
    public final dagger.internal.d romeo = AbstractC2327c.uniform(this, 10);
    public final dagger.internal.d sierra = AbstractC2327c.uniform(this, 11);
    public final dagger.internal.d tango = AbstractC2327c.uniform(this, 13);
    public final dagger.internal.d uniform = AbstractC2327c.uniform(this, 12);
    public final dagger.internal.d victor = AbstractC2327c.uniform(this, 15);
    public final dagger.internal.d whiskey = AbstractC2327c.uniform(this, 14);
    public final dagger.internal.d xray = AbstractC2327c.uniform(this, 16);
    public final dagger.internal.d yankee = AbstractC2327c.uniform(this, 17);
    public final dagger.internal.d zulu = AbstractC2327c.uniform(this, 18);
    public final dagger.internal.d amber = dagger.internal.a.bravo(new o(this, 19, 0));
    public final dagger.internal.d azure = AbstractC2327c.uniform(this, 20);
    public final dagger.internal.d beige = AbstractC2327c.uniform(this, 22);
    public final dagger.internal.d black = AbstractC2327c.uniform(this, 21);
    public final dagger.internal.d blue = AbstractC2327c.uniform(this, 24);
    public final dagger.internal.d red = AbstractC2327c.uniform(this, 49);
    public final dagger.internal.d teal = AbstractC2327c.uniform(this, 47);

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f14008c = AbstractC2327c.uniform(this, 55);

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f14009d = AbstractC2327c.uniform(this, 57);

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.d f14010f = AbstractC2327c.uniform(this, 58);

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.d f14011g = AbstractC2327c.uniform(this, 60);

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.d f14012h = AbstractC2327c.uniform(this, 61);

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.d f14013i = AbstractC2327c.uniform(this, 59);

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.d f14014j = AbstractC2327c.uniform(this, 62);

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.d f14015k = AbstractC2327c.uniform(this, 63);

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.d f14016l = AbstractC2327c.uniform(this, 64);

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.d f14017m = AbstractC2327c.uniform(this, 65);

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.d f14018n = AbstractC2327c.uniform(this, 67);

    public p(Q9.a aVar, ApplicationContextModule applicationContextModule, Q9.d dVar, M9.b bVar, Q9.e eVar, Q9.f fVar) {
        this.alpha = bVar;
        this.bravo = applicationContextModule;
        this.charlie = eVar;
        this.delta = aVar;
        this.echo = dVar;
        this.foxtrot = fVar;
        int i4 = 0;
        this.bronze = dagger.internal.a.bravo(new o(this, 23, i4));
        this.coral = dagger.internal.a.bravo(new o(this, 25, i4));
        this.crimson = dagger.internal.a.bravo(new o(this, 26, i4));
        this.cyan = dagger.internal.a.bravo(new o(this, 27, i4));
        this.emerald = dagger.internal.a.bravo(new o(this, 28, i4));
        this.fuchsia = dagger.internal.a.bravo(new o(this, 30, i4));
        this.gold = dagger.internal.a.bravo(new o(this, 29, i4));
        this.gray = dagger.internal.a.bravo(new o(this, 31, i4));
        this.green = dagger.internal.a.bravo(new o(this, 32, i4));
        this.indigo = dagger.internal.a.bravo(new o(this, 33, i4));
        this.ivory = dagger.internal.a.bravo(new o(this, 34, i4));
        this.jade = dagger.internal.a.bravo(new o(this, 35, i4));
        this.lavender = dagger.internal.a.bravo(new o(this, 39, i4));
        this.lime = dagger.internal.a.bravo(new o(this, 38, i4));
        this.magenta = dagger.internal.a.bravo(new o(this, 37, i4));
        this.maroon = dagger.internal.a.bravo(new o(this, 40, i4));
        this.navy = dagger.internal.a.bravo(new o(this, 41, i4));
        this.ochre = dagger.internal.a.bravo(new o(this, 42, i4));
        this.olive = dagger.internal.a.bravo(new o(this, 43, i4));
        this.orange = dagger.internal.a.bravo(new o(this, 36, i4));
        this.peach = dagger.internal.a.bravo(new o(this, 44, i4));
        this.pink = dagger.internal.a.bravo(new o(this, 45, i4));
        this.plum = dagger.internal.a.bravo(new o(this, 46, i4));
        this.purple = dagger.internal.a.bravo(new o(this, 50, i4));
        int i5 = 0;
        this.silver = dagger.internal.a.bravo(new o(this, 48, i5));
        this.white = dagger.internal.a.bravo(new o(this, 51, i5));
        this.yellow = dagger.internal.a.bravo(new o(this, 52, i5));
        this.f14006a = dagger.internal.a.bravo(new o(this, 53, i5));
        this.f14007b = dagger.internal.a.bravo(new o(this, 54, i5));
        this.e = dagger.internal.a.bravo(new o(this, 56, i5));
        int i10 = 0;
        this.f14019o = dagger.internal.a.bravo(new o(this, 66, i10));
        this.f14020p = dagger.internal.a.bravo(new o(this, 68, i10));
        this.f14021q = dagger.internal.a.bravo(new o(this, 69, i10));
        this.f14022r = dagger.internal.a.bravo(new o(this, 70, i10));
        this.f14023s = dagger.internal.a.bravo(new o(this, 71, i10));
        this.f14024t = dagger.internal.a.bravo(new o(this, 72, i10));
    }

    public final AndroidApp alpha() {
        return AppModule_ProvideAndroidAppFactory.bravo(this.delta, ApplicationContextModule_ProvideContextFactory.provideContext(this.bravo));
    }

    public final E9.b bravo() {
        E9.b provideImagePreparer = D9.a.alpha.provideImagePreparer(ApplicationContextModule_ProvideContextFactory.provideContext(this.bravo), (E9.d) this.green.get(), (E9.a) this.indigo.get(), (E9.c) this.ivory.get());
        AbstractC2763s0.delta(provideImagePreparer);
        return provideImagePreparer;
    }

    @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
    public final Set getDisableFragmentGetContextFix() {
        int i4 = com.google.common.collect.f.red;
        return com.google.common.collect.n.f8275c;
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
    public final ActivityRetainedComponentBuilder retainedComponentBuilder() {
        return new com.google.android.play.core.integrity.c(this.golf);
    }

    @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
    public final ServiceComponentBuilder serviceComponentBuilder() {
        return new com.google.android.play.core.integrity.k(this.golf);
    }
}
