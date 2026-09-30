package t7;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import pe.AbstractC2327c;
import s7.InterfaceC2834a;
import s7.j;
import z7.C3468B;
import z7.C3475g;
import z7.E;
import z7.H;
import z7.J;
import z7.ac;
import z7.n;
import z7.r;
import z7.v;

/* loaded from: classes2.dex */
public abstract class a {
    static {
        d[] dVarArr = {new d(0, InterfaceC2834a.class)};
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < 1; i4++) {
            d dVar = dVarArr[i4];
            boolean containsKey = hashMap.containsKey(dVar.alpha);
            Class cls = dVar.alpha;
            if (!containsKey) {
                hashMap.put(cls, dVar);
            } else {
                throw new IllegalArgumentException(AbstractC2327c.whiskey(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        Class cls2 = dVarArr[0].alpha;
        Collections.unmodifiableMap(hashMap);
        d[] dVarArr2 = {new d(3, InterfaceC2834a.class)};
        HashMap hashMap2 = new HashMap();
        d dVar2 = dVarArr2[0];
        boolean containsKey2 = hashMap2.containsKey(dVar2.alpha);
        Class cls3 = dVar2.alpha;
        if (!containsKey2) {
            hashMap2.put(cls3, dVar2);
            Class cls4 = dVarArr2[0].alpha;
            Collections.unmodifiableMap(hashMap2);
            d[] dVarArr3 = {new d(4, InterfaceC2834a.class)};
            HashMap hashMap3 = new HashMap();
            d dVar3 = dVarArr3[0];
            boolean containsKey3 = hashMap3.containsKey(dVar3.alpha);
            Class cls5 = dVar3.alpha;
            if (!containsKey3) {
                hashMap3.put(cls5, dVar3);
                Class cls6 = dVarArr3[0].alpha;
                Collections.unmodifiableMap(hashMap3);
                d[] dVarArr4 = {new d(2, InterfaceC2834a.class)};
                HashMap hashMap4 = new HashMap();
                d dVar4 = dVarArr4[0];
                boolean containsKey4 = hashMap4.containsKey(dVar4.alpha);
                Class cls7 = dVar4.alpha;
                if (!containsKey4) {
                    hashMap4.put(cls7, dVar4);
                    Class cls8 = dVarArr4[0].alpha;
                    Collections.unmodifiableMap(hashMap4);
                    d[] dVarArr5 = {new d(6, InterfaceC2834a.class)};
                    HashMap hashMap5 = new HashMap();
                    d dVar5 = dVarArr5[0];
                    boolean containsKey5 = hashMap5.containsKey(dVar5.alpha);
                    Class cls9 = dVar5.alpha;
                    if (!containsKey5) {
                        hashMap5.put(cls9, dVar5);
                        Class cls10 = dVarArr5[0].alpha;
                        Collections.unmodifiableMap(hashMap5);
                        d[] dVarArr6 = {new d(7, InterfaceC2834a.class)};
                        HashMap hashMap6 = new HashMap();
                        d dVar6 = dVarArr6[0];
                        boolean containsKey6 = hashMap6.containsKey(dVar6.alpha);
                        Class cls11 = dVar6.alpha;
                        if (!containsKey6) {
                            hashMap6.put(cls11, dVar6);
                            Class cls12 = dVarArr6[0].alpha;
                            Collections.unmodifiableMap(hashMap6);
                            d[] dVarArr7 = {new d(5, InterfaceC2834a.class)};
                            HashMap hashMap7 = new HashMap();
                            d dVar7 = dVarArr7[0];
                            boolean containsKey7 = hashMap7.containsKey(dVar7.alpha);
                            Class cls13 = dVar7.alpha;
                            if (!containsKey7) {
                                hashMap7.put(cls13, dVar7);
                                Class cls14 = dVarArr7[0].alpha;
                                Collections.unmodifiableMap(hashMap7);
                                d[] dVarArr8 = {new d(8, InterfaceC2834a.class)};
                                HashMap hashMap8 = new HashMap();
                                d dVar8 = dVarArr8[0];
                                boolean containsKey8 = hashMap8.containsKey(dVar8.alpha);
                                Class cls15 = dVar8.alpha;
                                if (!containsKey8) {
                                    hashMap8.put(cls15, dVar8);
                                    Class cls16 = dVarArr8[0].alpha;
                                    Collections.unmodifiableMap(hashMap8);
                                    int i5 = H.CONFIG_NAME_FIELD_NUMBER;
                                    try {
                                        alpha();
                                        return;
                                    } catch (GeneralSecurityException e) {
                                        throw new ExceptionInInitializerError(e);
                                    }
                                }
                                throw new IllegalArgumentException(AbstractC2327c.whiskey(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                            }
                            throw new IllegalArgumentException(AbstractC2327c.whiskey(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    throw new IllegalArgumentException(AbstractC2327c.whiskey(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                throw new IllegalArgumentException(AbstractC2327c.whiskey(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            throw new IllegalArgumentException(AbstractC2327c.whiskey(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, s7.h] */
    public static void alpha() {
        int i4 = 7;
        int i5 = 6;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        x7.b.alpha();
        j.echo(new f(C3475g.class, new d[]{new d(0, InterfaceC2834a.class)}, 0), true);
        j.echo(new f(n.class, new d[]{new d(2, InterfaceC2834a.class)}, 1), true);
        j.echo(new f(r.class, new d[]{new d(3, InterfaceC2834a.class)}, 2), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            j.echo(new f(v.class, new d[]{new d(4, InterfaceC2834a.class)}, i12), true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        j.echo(new f(ac.class, new d[]{new d(5, InterfaceC2834a.class)}, i11), true);
        j.echo(new f(C3468B.class, new d[]{new d(6, InterfaceC2834a.class)}, i10), true);
        j.echo(new f(E.class, new d[]{new d(7, InterfaceC2834a.class)}, i5), true);
        j.echo(new f(J.class, new d[]{new d(8, InterfaceC2834a.class)}, i4), true);
        j.foxtrot(new Object());
    }
}
