package Nb;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f1876a;
    public static final b purple;
    public static final b red;
    public static final b silver;
    public static final b teal;
    public static final b white;
    public static final b yellow;
    public final int alpha;

    static {
        b bVar = new b("InternetLost", 0, 1);
        purple = bVar;
        b bVar2 = new b("Reconnecting", 1, 2);
        red = bVar2;
        b bVar3 = new b("ServerTimeout", 2, 3);
        silver = bVar3;
        b bVar4 = new b("GpsWeak", 3, 4);
        teal = bVar4;
        b bVar5 = new b("RecommendedGroupAction", 4, 0);
        white = bVar5;
        b bVar6 = new b("SettlementAction", 5, 0);
        yellow = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        f1876a = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public b(String str, int i4, int i5) {
        this.alpha = i5;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1876a.clone();
    }
}
