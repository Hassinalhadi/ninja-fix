package com.incognia.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class rYa extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r9 f11236b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rYa(r9 r9Var) {
        super(1);
        this.f11236b = r9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xkS xks = (xkS) obj;
        D5f d5f = this.f11236b.sVU;
        d5f.getClass();
        if (!(d5f instanceof L4)) {
            String str = r9.IB;
            if (xks.b(str)) {
                this.f11236b.f11210f9.b(new Nh(i2C.f10602W));
                List list = (List) this.f11236b.gmP.get(str);
                if (list != null) {
                    list.add(xks.f11812W);
                }
            }
            String str2 = r9.Qs;
            if (xks.b(str2)) {
                this.f11236b.f11210f9.b(new Nh(LUA.f9060W));
                List list2 = (List) this.f11236b.gmP.get(str2);
                if (list2 != null) {
                    list2.add(xks.f11812W);
                }
            }
        } else {
            String str3 = r9.IB;
            if (xks.b(str3)) {
                xks.f11812W.getClass();
                oBS.b(str3);
            }
            String str4 = r9.Qs;
            if (xks.b(str4)) {
                xks.f11812W.getClass();
                oBS.b(str4);
            }
        }
        return Unit.INSTANCE;
    }
}
