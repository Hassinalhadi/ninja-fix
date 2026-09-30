package com.incognia.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract class nfR {

    /* renamed from: W, reason: collision with root package name */
    public final Eh f10962W;

    /* renamed from: b, reason: collision with root package name */
    public final C7a f10963b;

    public nfR(C7a c7a, Eh eh) {
        this.f10963b = c7a;
        this.f10962W = eh;
    }

    public final boolean b(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
        return !contentValues.keySet().isEmpty() && sQLiteDatabase.insert(this.f10962W.gmP(), null, contentValues) >= 0;
    }

    public final void b(SQLiteDatabase sQLiteDatabase, List list) {
        if (list.isEmpty()) {
            return;
        }
        sQLiteDatabase.execSQL("DELETE FROM " + this.f10962W.gmP() + " WHERE " + this.f10962W.sVU() + " IN (" + CollectionsKt.maroon(list, Constants.SEPARATOR_COMMA, null, null, FbQ.f8715b, 30) + ");", list.toArray(new Object[0]));
    }
}
