package com.incognia.internal;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class bFl extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nfR f10167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bFl(nfR nfr) {
        super(1);
        this.f10167b = nfr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        long queryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, this.f10167b.f10962W.gmP()) / 2;
        nfR nfr = this.f10167b;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT " + nfr.f10962W.sVU() + " FROM " + nfr.f10962W.gmP() + " ORDER BY " + nfr.f10962W.W() + " ASC LIMIT ?;", new String[]{String.valueOf(queryNumEntries)});
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow(nfr.f10962W.sVU());
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(columnIndexOrThrow));
            }
            Unit unit = Unit.INSTANCE;
            rawQuery.close();
            if (!arrayList.isEmpty()) {
                sQLiteDatabase.execSQL("DELETE FROM " + nfr.f10962W.gmP() + " WHERE " + nfr.f10962W.sVU() + " IN (" + CollectionsKt.maroon(arrayList, Constants.SEPARATOR_COMMA, null, null, bxC.f10216b, 30) + ");", arrayList.toArray(new String[0]));
            }
            return unit;
        } finally {
        }
    }
}
