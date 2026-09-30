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
public final class c0O extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f10220W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AK f10221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0O(AK ak, Ref.ObjectRef objectRef) {
        super(1);
        this.f10221b = ak;
        this.f10220W = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = null;
        Cursor query = ((SQLiteDatabase) obj).query(this.f10221b.f10962W.gmP(), null, null, null, null, null, null);
        Ref.ObjectRef objectRef = this.f10220W;
        AK ak = this.f10221b;
        ak.getClass();
        hJ hJVar = hJ.f10535b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    String string = query.getString(query.getColumnIndexOrThrow(hJ.gmP));
                    try {
                        long j5 = query.getLong(query.getColumnIndexOrThrow(Column.ID));
                        long j6 = query.getLong(query.getColumnIndexOrThrow(hJ.sVU));
                        JSONObject jSONObject = new JSONObject(ICR.b(query.getString(query.getColumnIndexOrThrow(hJ.f10536f9))));
                        Long valueOf = Long.valueOf(j5);
                        String str2 = XD.f9900J;
                        arrayList.add(new xK(valueOf, string, j6, yw.b(jSONObject)));
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
        List list2 = (List) pair.getSecond();
        if (!list2.isEmpty()) {
            ak.f10963b.b(new x(ak, list2));
        }
        objectRef.alpha = list;
        return unit;
    }
}
