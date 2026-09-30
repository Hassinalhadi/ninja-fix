package com.incognia.internal;

import Xd.l;
import g9.a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class TCP {

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f9645W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9646b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lambda f9647f9;
    public int sVU;

    /* renamed from: J, reason: collision with root package name */
    public final AtomicBoolean f9644J = new AtomicBoolean(false);
    public final AtomicBoolean PqK = new AtomicBoolean(false);
    public final d7p gmP = new a(11, this);

    /* JADX WARN: Multi-variable type inference failed */
    public TCP(pl2 pl2Var, ArrayList arrayList, l lVar) {
        this.f9646b = pl2Var;
        this.f9645W = arrayList;
        this.f9647f9 = (Lambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Xd.l, kotlin.jvm.internal.Lambda] */
    public static final void b(TCP tcp) {
        boolean z2;
        if (!tcp.f9644J.get()) {
            int i4 = tcp.sVU + 1;
            tcp.sVU = i4;
            if (i4 >= tcp.f9645W.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            tcp.f9647f9.invoke(Integer.valueOf(tcp.sVU), Boolean.valueOf(z2));
            if (!z2) {
                d7p d7pVar = tcp.gmP;
                if (d7pVar != null) {
                    tcp.f9646b.b(((Number) tcp.f9645W.get(tcp.sVU)).longValue(), d7pVar);
                    return;
                }
                return;
            }
            tcp.PqK.compareAndSet(false, true);
        }
    }
}
