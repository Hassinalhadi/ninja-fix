package com.incognia.internal;

/* loaded from: classes2.dex */
public final class hJ implements Eh {

    /* renamed from: b, reason: collision with root package name */
    public static final hJ f10535b = new hJ();

    /* renamed from: W, reason: collision with root package name */
    public static final String f10534W = (String) wGk.f11652Ra.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10536f9 = (String) wGk.ipG.getValue();
    public static final String sVU = (String) wGk.ZkK.getValue();
    public static final String gmP = (String) wGk.BxN.getValue();

    @Override // com.incognia.internal.Eh
    public final String W() {
        return sVU;
    }

    @Override // com.incognia.internal.Eh
    public final String b() {
        return "DROP TABLE IF EXISTS " + f10534W;
    }

    @Override // com.incognia.internal.Eh
    public final String f9() {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(f10534W);
        sb2.append(" (_id INTEGER PRIMARY KEY,");
        sb2.append(gmP);
        sb2.append(" TEXT,");
        sb2.append(f10536f9);
        sb2.append(" TEXT,");
        return androidx.appcompat.widget.P0.gold(sb2, sVU, " INTEGER)");
    }

    @Override // com.incognia.internal.Eh
    public final String gmP() {
        return f10534W;
    }

    @Override // com.incognia.internal.Eh
    public final String sVU() {
        return gmP;
    }
}
