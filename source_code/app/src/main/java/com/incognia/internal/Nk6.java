package com.incognia.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class Nk6 {

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f9244b;

    public Nk6(Context context, String str, bt1 bt1Var) {
        this.f9244b = context.getSharedPreferences(str, 0);
    }

    public final String W(String str) {
        Object m206constructorimpl;
        String string;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            string = this.f9244b.getString(f9(str), null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (string != null) {
            String b2 = ICR.b(string);
            if (b2 != null) {
                string = b2;
            }
            m206constructorimpl = Result.m206constructorimpl(string);
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) == null) {
                obj = m206constructorimpl;
            } else {
                b(str);
            }
            return (String) obj;
        }
        return (String) obj;
    }

    public final void b(String str, Object obj) {
        try {
            Result.Companion companion = Result.INSTANCE;
            String f92 = f9(str);
            String obj2 = obj != null ? obj.toString() : null;
            String W5 = obj2 != null ? ICR.W(obj2) : null;
            if (W5 != null) {
                obj2 = W5;
            }
            SharedPreferences.Editor edit = this.f9244b.edit();
            if (obj2 == null) {
                edit.remove(f92);
            } else {
                edit.putString(f92, obj2);
            }
            edit.apply();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final String f9(String str) {
        String b2 = U9J.b(str);
        if (b2 == null) {
            return str;
        }
        return b2;
    }

    public final void b(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences.Editor edit = this.f9244b.edit();
            edit.remove(f9(str));
            edit.apply();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void b() {
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences.Editor edit = this.f9244b.edit();
            edit.clear();
            edit.apply();
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void b(Set set) {
        try {
            Result.Companion companion = Result.INSTANCE;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(f9((String) it.next()));
            }
            Set<String> keySet = this.f9244b.getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (!linkedHashSet.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                SharedPreferences.Editor edit = this.f9244b.edit();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    edit.remove((String) obj2);
                }
                edit.apply();
            }
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }
}
