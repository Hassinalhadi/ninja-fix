package com.incognia.internal;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class nc extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final nc f10960b = new nc();

    public nc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!sQLiteDatabase.inTransaction()) {
            sQLiteDatabase.execSQL("VACUUM");
        }
        return Unit.INSTANCE;
    }
}
