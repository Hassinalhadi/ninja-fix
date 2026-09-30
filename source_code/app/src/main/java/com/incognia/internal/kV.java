package com.incognia.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class kV extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Pwm f10766W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XnD f10767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kV(XnD xnD, Pwm pwm) {
        super(1);
        this.f10767b = xnD;
        this.f10766W = pwm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        yL2 yl2 = yL2.f11857b;
        XnD xnD = this.f10767b;
        ContentValues contentValues = new ContentValues();
        try {
            String str = yL2.f11858f9;
            String str2 = vkA.f11577b;
            contentValues.put(str, ICR.W(vkA.b(xnD.sVU).toString()));
            contentValues.put(yL2.gmP, xnD.f9950W);
            contentValues.put(yL2.sVU, Long.valueOf(xnD.f9952f9));
        } catch (Throwable unused) {
        }
        this.f10766W.b(sQLiteDatabase, contentValues);
        return Unit.INSTANCE;
    }
}
