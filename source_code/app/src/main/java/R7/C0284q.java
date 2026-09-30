package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.clevertap.android.sdk.variables.CTVariableUtils;

/* renamed from: R7.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0284q implements InterfaceC0733c {
    public static final C0284q alpha = new Object();
    public static final C0732b bravo = C0732b.charlie("pc");
    public static final C0732b charlie = C0732b.charlie("symbol");
    public static final C0732b delta = C0732b.charlie(CTVariableUtils.FILE);
    public static final C0732b echo = C0732b.charlie("offset");
    public static final C0732b foxtrot = C0732b.charlie("importance");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        ax axVar = (ax) ((a0) obj);
        interfaceC0734d.foxtrot(bravo, axVar.alpha);
        interfaceC0734d.alpha(charlie, axVar.bravo);
        interfaceC0734d.alpha(delta, axVar.charlie);
        interfaceC0734d.foxtrot(echo, axVar.delta);
        interfaceC0734d.echo(foxtrot, axVar.echo);
    }
}
