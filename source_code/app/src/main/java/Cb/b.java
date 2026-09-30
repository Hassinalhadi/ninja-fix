package Cb;

import delivery.samurai.android.R;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f793a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f794b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f795c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f796d;
    public static final b purple;
    public static final b red;
    public static final b silver;
    public static final b teal;
    public static final b white;
    public static final b yellow;
    public final int alpha;

    static {
        b bVar = new b("BUTTONS", 0, R.string.showcase_tab_buttons);
        purple = bVar;
        b bVar2 = new b("CARDS", 1, R.string.showcase_tab_cards);
        red = bVar2;
        b bVar3 = new b("INPUTS", 2, R.string.showcase_tab_inputs);
        silver = bVar3;
        b bVar4 = new b("INDICATORS", 3, R.string.showcase_tab_indicators);
        teal = bVar4;
        b bVar5 = new b("IMAGES", 4, R.string.showcase_tab_images);
        white = bVar5;
        b bVar6 = new b("DIALOGS", 5, R.string.showcase_tab_dialogs);
        yellow = bVar6;
        b bVar7 = new b("LISTS", 6, R.string.showcase_tab_lists);
        f793a = bVar7;
        b bVar8 = new b("STATUS_HEADER", 7, R.string.showcase_tab_status_header);
        f794b = bVar8;
        b bVar9 = new b("LAYOUTS", 8, R.string.showcase_tab_layouts);
        f795c = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        f796d = bVarArr;
        AbstractC2708l7.bravo(bVarArr);
    }

    public b(String str, int i4, int i5) {
        this.alpha = i5;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f796d.clone();
    }
}
