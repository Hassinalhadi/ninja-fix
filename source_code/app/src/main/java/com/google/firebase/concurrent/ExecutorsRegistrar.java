package com.google.firebase.concurrent;

import E8.h;
import H7.a;
import H7.c;
import H7.d;
import I7.b;
import I7.l;
import I7.p;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import s6.F5;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final l alpha = new l(new h(3));
    public static final l bravo = new l(new h(4));
    public static final l charlie = new l(new h(5));
    public static final l delta = new l(new h(6));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(a.class, ScheduledExecutorService.class);
        p[] pVarArr = {new p(a.class, ExecutorService.class), new p(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            F5.bravo(pVar2, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new A8.a(16), hashSet3);
        p pVar3 = new p(H7.b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(H7.b.class, ExecutorService.class), new p(H7.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar3);
        for (p pVar4 : pVarArr2) {
            F5.bravo(pVar4, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new A8.a(17), hashSet6);
        p pVar5 = new p(c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(c.class, ExecutorService.class), new p(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar5);
        for (p pVar6 : pVarArr3) {
            F5.bravo(pVar6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new A8.a(18), hashSet9);
        I7.a alpha2 = b.alpha(new p(d.class, Executor.class));
        alpha2.foxtrot = new A8.a(19);
        return Arrays.asList(bVar, bVar2, bVar3, alpha2.bravo());
    }
}
