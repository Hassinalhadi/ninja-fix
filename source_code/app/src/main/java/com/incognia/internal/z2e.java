package com.incognia.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.clevertap.android.sdk.db.Column;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z2e extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f11883W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pwm f11884b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2e(Pwm pwm, Ref.ObjectRef objectRef) {
        super(1);
        this.f11884b = pwm;
        this.f11883W = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        String str = null;
        Cursor query = sQLiteDatabase.query(this.f11884b.f10962W.gmP(), null, null, null, null, null, null);
        Ref.ObjectRef objectRef = this.f11883W;
        Pwm pwm = this.f11884b;
        yL2 yl2 = yL2.f11857b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    String string = query.getString(query.getColumnIndexOrThrow(yL2.gmP));
                    try {
                        long j5 = query.getLong(query.getColumnIndexOrThrow(Column.ID));
                        arrayList.add(new XnD(Long.valueOf(j5), string, query.getLong(query.getColumnIndexOrThrow(yL2.sVU)), vkA.b(new JSONObject(ICR.b(query.getString(query.getColumnIndexOrThrow(yL2.f11858f9)))))));
                        str = string;
                    } catch (Throwable unused) {
                        str = string;
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                } catch (Throwable unused2) {
                }
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        query.close();
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.getFirst();
        pwm.b(sQLiteDatabase, (List) pair.getSecond());
        objectRef.alpha = list;
        return unit;
    }
}
