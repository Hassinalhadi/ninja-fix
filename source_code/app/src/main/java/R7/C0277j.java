package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.clevertap.android.sdk.network.api.CtApi;

/* renamed from: R7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0277j implements InterfaceC0733c {
    public static final C0277j alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("generator");
    public static final C0732b charlie = C0732b.charlie("identifier");
    public static final C0732b delta = C0732b.charlie("appQualitySessionId");
    public static final C0732b echo = C0732b.charlie("startedAt");
    public static final C0732b foxtrot = C0732b.charlie("endedAt");
    public static final C0732b golf = C0732b.charlie("crashed");
    public static final C0732b hotel = C0732b.charlie("app");
    public static final C0732b india = C0732b.charlie("user");
    public static final C0732b juliet = C0732b.charlie(CtApi.QUERY_PARAM_OS_KEY);
    public static final C0732b kilo = C0732b.charlie("device");
    public static final C0732b lima = C0732b.charlie("events");
    public static final C0732b mike = C0732b.charlie("generatorType");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        aj ajVar = (aj) ((n0) obj);
        interfaceC0734d.alpha(bravo, ajVar.alpha);
        interfaceC0734d.alpha(charlie, ajVar.bravo.getBytes(o0.alpha));
        interfaceC0734d.alpha(delta, ajVar.charlie);
        interfaceC0734d.foxtrot(echo, ajVar.delta);
        interfaceC0734d.alpha(foxtrot, ajVar.echo);
        interfaceC0734d.delta(golf, ajVar.foxtrot);
        interfaceC0734d.alpha(hotel, ajVar.golf);
        interfaceC0734d.alpha(india, ajVar.hotel);
        interfaceC0734d.alpha(juliet, ajVar.india);
        interfaceC0734d.alpha(kilo, ajVar.juliet);
        interfaceC0734d.alpha(lima, ajVar.kilo);
        interfaceC0734d.echo(mike, ajVar.lima);
    }
}
