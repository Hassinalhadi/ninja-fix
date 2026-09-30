package com.incognia.internal;

/* loaded from: classes2.dex */
public final class yL2 implements Eh {

    /* renamed from: b, reason: collision with root package name */
    public static final yL2 f11857b = new yL2();

    /* renamed from: W, reason: collision with root package name */
    public static final String f11856W = (String) wGk.S2R.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public static final String f11858f9 = (String) wGk.Qr.getValue();
    public static final String sVU = (String) wGk.zje.getValue();
    public static final String gmP = (String) wGk.xYr.getValue();

    @Override // com.incognia.internal.Eh
    public final String W() {
        return sVU;
    }

    @Override // com.incognia.internal.Eh
    public final String b() {
        return "DROP TABLE IF EXISTS " + f11856W;
    }

    @Override // com.incognia.internal.Eh
    public final String f9() {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(f11856W);
        sb2.append(" (_id INTEGER PRIMARY KEY,");
        sb2.append(gmP);
        sb2.append(" TEXT,");
        sb2.append(f11858f9);
        sb2.append(" TEXT,");
        return androidx.appcompat.widget.P0.gold(sb2, sVU, " INTEGER)");
    }

    @Override // com.incognia.internal.Eh
    public final String gmP() {
        return f11856W;
    }

    @Override // com.incognia.internal.Eh
    public final String sVU() {
        return gmP;
    }
}
