package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class aw {
    public static final aw charlie = new aw();
    public final ConcurrentHashMap bravo = new ConcurrentHashMap();
    public final C1495m alpha = new C1495m();

    public final A alpha(Class cls) {
        A yankee;
        Class cls2;
        ab.alpha(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.bravo;
        A a6 = (A) concurrentHashMap.get(cls);
        if (a6 == null) {
            C1495m c1495m = this.alpha;
            c1495m.getClass();
            Class cls3 = B.alpha;
            if (!x.class.isAssignableFrom(cls) && (cls2 = B.alpha) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            ay alpha = ((aj) c1495m.alpha).alpha(cls);
            if ((alpha.delta & 2) == 2) {
                boolean isAssignableFrom = x.class.isAssignableFrom(cls);
                ao aoVar = alpha.alpha;
                if (isAssignableFrom) {
                    yankee = new ar(B.delta, r.alpha, aoVar);
                } else {
                    C c3 = B.bravo;
                    q qVar = r.bravo;
                    if (qVar != null) {
                        yankee = new ar(c3, qVar, aoVar);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
            } else if (x.class.isAssignableFrom(cls)) {
                if ((alpha.delta & 1) == 1) {
                    yankee = aq.yankee(alpha, at.bravo, ah.bravo, B.delta, r.alpha, am.bravo);
                } else {
                    yankee = aq.yankee(alpha, at.bravo, ah.bravo, B.delta, null, am.bravo);
                }
            } else if ((alpha.delta & 1) == 1) {
                as asVar = at.alpha;
                af afVar = ah.alpha;
                C c4 = B.bravo;
                q qVar2 = r.bravo;
                if (qVar2 != null) {
                    yankee = aq.yankee(alpha, asVar, afVar, c4, qVar2, am.alpha);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                yankee = aq.yankee(alpha, at.alpha, ah.alpha, B.charlie, null, am.alpha);
            }
            A a8 = (A) concurrentHashMap.putIfAbsent(cls, yankee);
            if (a8 != null) {
                return a8;
            }
            return yankee;
        }
        return a6;
    }
}
