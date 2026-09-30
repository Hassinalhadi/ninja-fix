package me;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.ae;

/* renamed from: me.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2118f implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC2120h purple;

    public /* synthetic */ C2118f(AbstractC2120h abstractC2120h, int i4) {
        this.alpha = i4;
        this.purple = abstractC2120h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC2120h abstractC2120h = this.purple;
        switch (this.alpha) {
            case 0:
                return Arrays.asList(abstractC2120h.kilo().amber(n.juliet), abstractC2120h.kilo().amber(n.lima), abstractC2120h.kilo().amber(n.mike), abstractC2120h.kilo().amber(n.kilo));
            default:
                EnumMap enumMap = new EnumMap(j.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (j jVar : j.values()) {
                    String bravo = jVar.alpha.bravo();
                    if (bravo != null) {
                        ae oscar = abstractC2120h.juliet(bravo).oscar();
                        if (oscar != null) {
                            String bravo2 = jVar.purple.bravo();
                            if (bravo2 != null) {
                                ae oscar2 = abstractC2120h.juliet(bravo2).oscar();
                                if (oscar2 != null) {
                                    enumMap.put((EnumMap) jVar, (j) oscar2);
                                    hashMap.put(oscar, oscar2);
                                    hashMap2.put(oscar2, oscar);
                                } else {
                                    AbstractC2120h.alpha(47);
                                    throw null;
                                }
                            } else {
                                AbstractC2120h.alpha(46);
                                throw null;
                            }
                        } else {
                            AbstractC2120h.alpha(47);
                            throw null;
                        }
                    } else {
                        abstractC2120h.getClass();
                        AbstractC2120h.alpha(46);
                        throw null;
                    }
                }
                return new C2119g(enumMap, hashMap, hashMap2);
        }
    }
}
