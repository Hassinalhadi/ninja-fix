package com.incognia.internal;

import h9.C1834l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qK extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ MP f11140W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Me f11141b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ Lambda f11142f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qK(Me me2, MP mp, Function0 function0) {
        super(1);
        this.f11141b = me2;
        this.f11140W = mp;
        this.f11142f9 = (Lambda) function0;
    }

    public final void b(Object obj) {
        Me me2 = this.f11141b;
        me2.f9155f9.b(new C1834l(obj, me2, this.f11140W, this.f11142f9, 4));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    public static final void b(Object obj, Me me2, MP mp, Function0 function0) {
        List emptyList;
        if (Result.m207exceptionOrNullimpl(obj) == null) {
            List list = (List) obj;
            u0 u0Var = me2.f9149R;
            u0Var.getClass();
            if (!list.isEmpty()) {
                int i4 = 0;
                if (!((JSONObject) u0Var.f11434b.f9574b.get()).optBoolean(u0.f11432W, false)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        String str = ((C3K) obj2).f8434b;
                        if (Intrinsics.areEqual(str, u0.sVU) || Intrinsics.areEqual(str, u0.gmP) || Intrinsics.areEqual(str, u0.f11430J) || Intrinsics.areEqual(str, u0.PqK)) {
                            arrayList.add(obj2);
                        }
                    }
                    list = CollectionsKt.p(arrayList, new qTq());
                } else {
                    long optLong = ((JSONObject) u0Var.f11434b.f9574b.get()).optLong(u0.f11433f9, 50L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (!kotlin.text.r.quebec(((C3K) obj3).f8434b, u0.f11431V, false)) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list) {
                        C3K c3k = (C3K) obj4;
                        if (kotlin.text.r.quebec(c3k.f8434b, u0.f11431V, false) && c3k.sVU != null) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int size = arrayList3.size();
                    while (i4 < size) {
                        Object obj5 = arrayList3.get(i4);
                        i4++;
                        if (((C3K) obj5).sVU.longValue() <= optLong) {
                            arrayList4.add(obj5);
                        } else {
                            arrayList5.add(obj5);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            Long l10 = ((C3K) it.next()).f8433W;
                            if (l10 != null) {
                                arrayList6.add(l10);
                            }
                        }
                        Long l11 = (Long) CollectionsKt.red(arrayList6);
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Long l12 = ((C3K) it2.next()).f8435f9;
                            if (l12 != null) {
                                arrayList7.add(l12);
                            }
                        }
                        Long l13 = (Long) CollectionsKt.plum(arrayList7);
                        Iterator it3 = arrayList4.iterator();
                        long j5 = 0;
                        while (it3.hasNext()) {
                            Long l14 = ((C3K) it3.next()).sVU;
                            j5 += l14 != null ? l14.longValue() : 0L;
                        }
                        emptyList = ab.juliet(new C3K(u0.olU, l11, l13, Long.valueOf(j5)));
                    } else {
                        emptyList = CollectionsKt.emptyList();
                    }
                    list = CollectionsKt.p(CollectionsKt.a(CollectionsKt.a(arrayList2, arrayList5), emptyList), new rL());
                }
            }
            me2.b(mp, list);
            function0.invoke();
            return;
        }
        String str2 = Me.f9140K;
        me2.b(mp, (List) null);
        function0.invoke();
    }
}
