package Q9;

import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.InterfaceC2956a;
import t3.InterfaceC2957b;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import vg.at;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LQ9/d;", "", "<init>", "()V", "Lvg/at;", "retrofit", "Lt3/a;", "getAuthService", "(Lvg/at;)Lt3/a;", "Lt3/b;", "getCaptainService", "(Lvg/at;)Lt3/b;", "Lt3/c;", "getOrdersService", "(Lvg/at;)Lt3/c;", "Lt3/g;", "getSupportService", "(Lvg/at;)Lt3/g;", "Lt3/f;", "getShiftService", "(Lvg/at;)Lt3/f;", "LE8/b;", "getRemoteConfigs", "()LE8/b;", "Lt3/i;", "getZonesService", "(Lvg/at;)Lt3/i;", "Lt3/h;", "provideTicketsService", "(Lvg/at;)Lt3/h;", "Lt3/e;", "provideRepositionService", "(Lvg/at;)Lt3/e;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InstallIn({SingletonComponent.class})
/* loaded from: classes2.dex */
public final class d {
    @NotNull
    public final InterfaceC2956a getAuthService(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(InterfaceC2956a.class);
        Intrinsics.delta(bravo, "create(...)");
        return (InterfaceC2956a) bravo;
    }

    @NotNull
    public final InterfaceC2957b getCaptainService(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(InterfaceC2957b.class);
        Intrinsics.delta(bravo, "create(...)");
        return (InterfaceC2957b) bravo;
    }

    @NotNull
    public final InterfaceC2958c getOrdersService(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(InterfaceC2958c.class);
        Intrinsics.delta(bravo, "create(...)");
        return (InterfaceC2958c) bravo;
    }

    @NotNull
    public final E8.b getRemoteConfigs() {
        E8.b echo = E8.b.echo();
        Intrinsics.delta(echo, "getInstance(...)");
        return echo;
    }

    @NotNull
    public final t3.f getShiftService(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(t3.f.class);
        Intrinsics.delta(bravo, "create(...)");
        return (t3.f) bravo;
    }

    @NotNull
    public final t3.g getSupportService(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(t3.g.class);
        Intrinsics.delta(bravo, "create(...)");
        return (t3.g) bravo;
    }

    @NotNull
    public final t3.i getZonesService(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(t3.i.class);
        Intrinsics.delta(bravo, "create(...)");
        return (t3.i) bravo;
    }

    @NotNull
    public final InterfaceC2960e provideRepositionService(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(InterfaceC2960e.class);
        Intrinsics.delta(bravo, "create(...)");
        return (InterfaceC2960e) bravo;
    }

    @NotNull
    public final t3.h provideTicketsService(@NotNull at retrofit) {
        Intrinsics.echo(retrofit, "retrofit");
        Object bravo = retrofit.bravo(t3.h.class);
        Intrinsics.delta(bravo, "create(...)");
        return (t3.h) bravo;
    }
}
