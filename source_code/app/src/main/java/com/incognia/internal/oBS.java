package com.incognia.internal;

import g9.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class oBS extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final oBS f11002b = new oBS();

    public oBS() {
        super(1);
    }

    public static final void W(String str) {
        ArrayList arrayList = BA2.sVU;
        CollectionsKt.d(arrayList, new a6w(str));
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = BA2.gmP;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                try {
                    ((Function0) obj).invoke();
                } catch (Exception unused) {
                }
            }
            BA2.gmP.clear();
        }
    }

    public static void b(String str) {
        BA2.f8399b.b(new a(18, str));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((String) obj);
        return Unit.INSTANCE;
    }
}
