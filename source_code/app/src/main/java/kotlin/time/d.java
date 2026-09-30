package kotlin.time;

import java.util.concurrent.TimeUnit;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f12936a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f12937b;
    public static final d purple;
    public static final d red;
    public static final d silver;
    public static final d teal;
    public static final d white;
    public static final d yellow;
    public final TimeUnit alpha;

    static {
        d dVar = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        purple = dVar;
        d dVar2 = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        red = dVar2;
        d dVar3 = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        silver = dVar3;
        d dVar4 = new d("SECONDS", 3, TimeUnit.SECONDS);
        teal = dVar4;
        d dVar5 = new d("MINUTES", 4, TimeUnit.MINUTES);
        white = dVar5;
        d dVar6 = new d("HOURS", 5, TimeUnit.HOURS);
        yellow = dVar6;
        d dVar7 = new d("DAYS", 6, TimeUnit.DAYS);
        f12936a = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        f12937b = dVarArr;
        AbstractC2708l7.bravo(dVarArr);
    }

    public d(String str, int i4, TimeUnit timeUnit) {
        this.alpha = timeUnit;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12937b.clone();
    }
}
