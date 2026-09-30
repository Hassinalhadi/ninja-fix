package Fc;

import kotlin.text.Regex;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    public static final a purple;
    public static final a red;
    public static final a silver;
    public static final /* synthetic */ a[] teal;
    public final Regex alpha;

    static {
        a aVar = new a("NAME", 0, new Regex("^[a-zA-Z]{3,}$"));
        purple = aVar;
        a aVar2 = new a("MIN_LENGTH_8", 1, new Regex("^.{8,}$"));
        red = aVar2;
        a aVar3 = new a("MIN_LENGTH_9", 2, new Regex("^.{9,}$"));
        silver = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3, new a("URPAY_IBAN", 3, new Regex("^.{24}$")), new a("URPAY_ID", 4, new Regex("^.{9,12}$"))};
        teal = aVarArr;
        AbstractC2708l7.bravo(aVarArr);
    }

    public a(String str, int i4, Regex regex) {
        this.alpha = regex;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) teal.clone();
    }
}
