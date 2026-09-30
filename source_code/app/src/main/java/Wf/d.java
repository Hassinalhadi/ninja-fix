package Wf;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2236a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f2237b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Qd.b f2238c;
    public static final W8.a purple;
    public static final d red;
    public static final d silver;
    public static final d teal;
    public static final d white;
    public static final d yellow;
    public final int alpha;

    static {
        d dVar = new d("LDPI", 0, 120);
        red = dVar;
        d dVar2 = new d("MDPI", 1, 160);
        silver = dVar2;
        d dVar3 = new d("HDPI", 2, 240);
        teal = dVar3;
        d dVar4 = new d("XHDPI", 3, 320);
        white = dVar4;
        d dVar5 = new d("XXHDPI", 4, 480);
        yellow = dVar5;
        d dVar6 = new d("XXXHDPI", 5, 640);
        f2236a = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        f2237b = dVarArr;
        f2238c = AbstractC2708l7.bravo(dVarArr);
        purple = new W8.a(12);
    }

    public d(String str, int i4, int i5) {
        this.alpha = i5;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2237b.clone();
    }
}
