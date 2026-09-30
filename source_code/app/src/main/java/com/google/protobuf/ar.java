package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ar {
    public static final ar charlie = new ar();
    public final ConcurrentHashMap bravo = new ConcurrentHashMap();
    public final ac alpha = new ac();

    public final au alpha(Class cls) {
        au quebec;
        Class cls2;
        Charset charset = AbstractC1517u.alpha;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.bravo;
            au auVar = (au) concurrentHashMap.get(cls);
            if (auVar == null) {
                ac acVar = this.alpha;
                acVar.getClass();
                Class cls3 = av.alpha;
                if (!AbstractC1513p.class.isAssignableFrom(cls) && (cls2 = av.alpha) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
                at alpha = ((ab) acVar.alpha).alpha(cls);
                if ((alpha.delta & 2) == 2) {
                    boolean isAssignableFrom = AbstractC1513p.class.isAssignableFrom(cls);
                    aj ajVar = alpha.alpha;
                    if (isAssignableFrom) {
                        quebec = new am(av.charlie, AbstractC1507j.alpha, ajVar);
                    } else {
                        B b2 = av.bravo;
                        C1506i c1506i = AbstractC1507j.bravo;
                        if (c1506i != null) {
                            quebec = new am(b2, c1506i, ajVar);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                } else if (AbstractC1513p.class.isAssignableFrom(cls)) {
                    if (av.q.mike(alpha.alpha()) != 1) {
                        quebec = al.quebec(alpha, ao.bravo, aa.bravo, av.charlie, AbstractC1507j.alpha, ah.bravo);
                    } else {
                        quebec = al.quebec(alpha, ao.bravo, aa.bravo, av.charlie, null, ah.bravo);
                    }
                } else if (av.q.mike(alpha.alpha()) != 1) {
                    an anVar = ao.alpha;
                    y yVar = aa.alpha;
                    B b4 = av.bravo;
                    C1506i c1506i2 = AbstractC1507j.bravo;
                    if (c1506i2 != null) {
                        quebec = al.quebec(alpha, anVar, yVar, b4, c1506i2, ah.alpha);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    quebec = al.quebec(alpha, ao.alpha, aa.alpha, av.bravo, null, ah.alpha);
                }
                au auVar2 = (au) concurrentHashMap.putIfAbsent(cls, quebec);
                if (auVar2 != null) {
                    return auVar2;
                }
                return quebec;
            }
            return auVar;
        }
        throw new NullPointerException("messageType");
    }
}
