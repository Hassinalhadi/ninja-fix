package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class puj extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ SQLiteDatabase f11108W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7a f11109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puj(C7a c7a, SQLiteDatabase sQLiteDatabase) {
        super(0);
        this.f11109b = c7a;
        this.f11108W = sQLiteDatabase;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C7a c7a = this.f11109b;
        SQLiteDatabase sQLiteDatabase = this.f11108W;
        Iterator it = c7a.sVU.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(((Eh) it.next()).b());
        }
        C7a c7a2 = this.f11109b;
        SQLiteDatabase sQLiteDatabase2 = this.f11108W;
        Iterator it2 = c7a2.sVU.iterator();
        while (it2.hasNext()) {
            sQLiteDatabase2.execSQL(((Eh) it2.next()).f9());
        }
        return Unit.INSTANCE;
    }
}
