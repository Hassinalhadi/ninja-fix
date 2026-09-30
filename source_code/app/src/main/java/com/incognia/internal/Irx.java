package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.k;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class Irx {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8924b;

    public Irx(Set set) {
        Object m206constructorimpl;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(new Regex(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            Regex regex = (Regex) (m206constructorimpl instanceof k ? null : m206constructorimpl);
            if (regex != null) {
                arrayList.add(regex);
            }
        }
        this.f8924b = arrayList;
    }
}
