package pg;

import ge.InterfaceC1772d;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public abstract class a {
    public static final ConcurrentHashMap alpha = new ConcurrentHashMap();

    public static final String alpha(InterfaceC1772d interfaceC1772d) {
        Intrinsics.echo(interfaceC1772d, "<this>");
        ConcurrentHashMap concurrentHashMap = alpha;
        String str = (String) concurrentHashMap.get(interfaceC1772d);
        if (str == null) {
            String name = AbstractC3062u.bravo(interfaceC1772d).getName();
            concurrentHashMap.put(interfaceC1772d, name);
            return name;
        }
        return str;
    }
}
