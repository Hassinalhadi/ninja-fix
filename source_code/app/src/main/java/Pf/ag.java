package Pf;

import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Qd.b f1911a;
    public static final ag red;
    public static final ag silver;
    public static final ag teal;
    public static final ag white;
    public static final /* synthetic */ ag[] yellow;
    public final char alpha;
    public final char purple;

    static {
        ag agVar = new ag("OBJ", 0, '{', '}');
        red = agVar;
        ag agVar2 = new ag("LIST", 1, '[', ']');
        silver = agVar2;
        ag agVar3 = new ag("MAP", 2, '{', '}');
        teal = agVar3;
        ag agVar4 = new ag("POLY_OBJ", 3, '[', ']');
        white = agVar4;
        ag[] agVarArr = {agVar, agVar2, agVar3, agVar4};
        yellow = agVarArr;
        f1911a = AbstractC2708l7.bravo(agVarArr);
    }

    public ag(String str, int i4, char c3, char c4) {
        this.alpha = c3;
        this.purple = c4;
    }

    public static ag valueOf(String str) {
        return (ag) Enum.valueOf(ag.class, str);
    }

    public static ag[] values() {
        return (ag[]) yellow.clone();
    }
}
