package d8;

import b8.InterfaceC0733c;
import b8.InterfaceC0735e;
import b8.InterfaceC0736f;
import c8.InterfaceC0830a;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d implements InterfaceC0830a {
    public static final C1593b white;
    public static final C1593b yellow;
    public final HashMap alpha;
    public final HashMap purple;
    public final C1592a red;
    public boolean silver;
    public static final C1592a teal = new C1592a(0);

    /* renamed from: a, reason: collision with root package name */
    public static final C1594c f12062a = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [d8.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [d8.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d8.c, java.lang.Object] */
    static {
        final int i4 = 0;
        white = new InterfaceC0735e() { // from class: d8.b
            @Override // b8.InterfaceC0731a
            public final void alpha(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        ((InterfaceC0736f) obj2).bravo((String) obj);
                        return;
                    default:
                        ((InterfaceC0736f) obj2).charlie(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i5 = 1;
        yellow = new InterfaceC0735e() { // from class: d8.b
            @Override // b8.InterfaceC0731a
            public final void alpha(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        ((InterfaceC0736f) obj2).bravo((String) obj);
                        return;
                    default:
                        ((InterfaceC0736f) obj2).charlie(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.alpha = hashMap;
        HashMap hashMap2 = new HashMap();
        this.purple = hashMap2;
        this.red = teal;
        this.silver = false;
        hashMap2.put(String.class, white);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, yellow);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f12062a);
        hashMap.remove(Date.class);
    }

    @Override // c8.InterfaceC0830a
    public final InterfaceC0830a alpha(Class cls, InterfaceC0733c interfaceC0733c) {
        this.alpha.put(cls, interfaceC0733c);
        this.purple.remove(cls);
        return this;
    }
}
