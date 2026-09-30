package com.incognia.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class C7a extends SQLiteOpenHelper {

    /* renamed from: J, reason: collision with root package name */
    public final AtomicInteger f8438J;

    /* renamed from: W, reason: collision with root package name */
    public final W6 f8439W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8440b;

    /* renamed from: f9, reason: collision with root package name */
    public final String f8441f9;
    public final Dn gmP;
    public final List sVU;

    public C7a(Context context, W6 w62, String str, List list, Dn dn) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f8440b = context;
        this.f8439W = w62;
        this.f8441f9 = str;
        this.sVU = list;
        this.gmP = dn;
        this.f8438J = new AtomicInteger(0);
    }

    public final void W(Function1 function1) {
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            try {
                SQLiteDatabase b2 = b();
                b(b2, new x6x(function1, b2));
                this.f8438J.decrementAndGet();
            } catch (Throwable th) {
                b(th);
            }
        }
    }

    public final void b(Function1 function1) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            return;
        }
        try {
            function1.invoke(b());
            this.f8438J.decrementAndGet();
        } catch (Throwable th) {
            b(th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            b(sQLiteDatabase, new A4d(this, sQLiteDatabase));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        if (sQLiteDatabase != null) {
            b(sQLiteDatabase, new puj(this, sQLiteDatabase));
        }
    }

    public final void b(SQLiteDatabase sQLiteDatabase, Function0 function0) {
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
            function0.invoke();
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Throwable th) {
            try {
                b(th);
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public final SQLiteDatabase b() {
        int i4;
        this.f8438J.incrementAndGet();
        int i5 = 0;
        while (i5 < 6) {
            try {
                return getWritableDatabase();
            } finally {
                if (i5 != i4) {
                }
            }
        }
        return null;
    }

    public final void b(Throwable th) {
        this.f8438J.set(0);
        try {
            close();
            this.f8440b.deleteDatabase(this.f8441f9);
            this.gmP.b(th);
        } catch (Throwable th2) {
            this.gmP.b(th2);
        }
    }
}
