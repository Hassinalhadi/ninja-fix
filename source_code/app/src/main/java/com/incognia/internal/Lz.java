package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Lz extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pwm f9095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lz(Pwm pwm) {
        super(1);
        this.f9095b = pwm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((SQLiteDatabase) obj).delete(this.f9095b.f10962W.gmP(), null, null);
        return Unit.INSTANCE;
    }
}
