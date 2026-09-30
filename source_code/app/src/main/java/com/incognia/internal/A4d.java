package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class A4d extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ SQLiteDatabase f8336W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7a f8337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4d(C7a c7a, SQLiteDatabase sQLiteDatabase) {
        super(0);
        this.f8337b = c7a;
        this.f8336W = sQLiteDatabase;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C7a c7a = this.f8337b;
        SQLiteDatabase sQLiteDatabase = this.f8336W;
        Iterator it = c7a.sVU.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(((Eh) it.next()).f9());
        }
        return Unit.INSTANCE;
    }
}
