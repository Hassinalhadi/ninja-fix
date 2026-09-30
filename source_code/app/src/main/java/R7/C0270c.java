package R7;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.clevertap.android.sdk.Constants;

/* renamed from: R7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0270c implements InterfaceC0733c {
    public static final C0270c alpha = new Object();
    public static final C0732b bravo = C0732b.charlie(Constants.KEY_KEY);
    public static final C0732b charlie = C0732b.charlie("value");

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        af afVar = (af) ((Q) obj);
        interfaceC0734d.alpha(bravo, afVar.alpha);
        interfaceC0734d.alpha(charlie, afVar.bravo);
    }
}
