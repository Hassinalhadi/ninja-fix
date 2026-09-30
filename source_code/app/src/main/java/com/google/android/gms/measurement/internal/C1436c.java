package com.google.android.gms.measurement.internal;

import java.util.HashSet;

/* renamed from: com.google.android.gms.measurement.internal.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1436c extends U0 {

    /* renamed from: a, reason: collision with root package name */
    public Long f7656a;
    public String silver;
    public HashSet teal;
    public bv.e white;
    public Long yellow;

    @Override // com.google.android.gms.measurement.internal.U0
    public final void Z() {
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList a0(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1436c.a0(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final e1 b0(Integer num) {
        if (this.white.containsKey(num)) {
            return (e1) this.white.get(num);
        }
        e1 e1Var = new e1(this, this.silver);
        this.white.put(num, e1Var);
        return e1Var;
    }
}
