package com.incognia.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class tkE extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ AK f11420W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkE(ArrayList arrayList, AK ak) {
        super(1);
        this.f11421b = arrayList;
        this.f11420W = ak;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList arrayList = this.f11421b;
        AK ak = this.f11420W;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            xK xKVar = (xK) obj2;
            hJ hJVar = hJ.f10535b;
            ContentValues contentValues = new ContentValues();
            try {
                contentValues.put(hJ.f10536f9, ICR.W(xKVar.sVU.W().toString()));
                contentValues.put(hJ.gmP, xKVar.f11788W);
                contentValues.put(hJ.sVU, Long.valueOf(xKVar.f11790f9));
            } catch (Throwable unused) {
            }
            ak.b(sQLiteDatabase, contentValues);
        }
        return Unit.INSTANCE;
    }
}
