package A0;

import a0.as;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class w extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public static final w purple = new w(2, 0);
    public static final w red = new w(2, 1);
    public static final w silver = new w(2, 2);
    public static final w teal = new w(2, 3);
    public static final w white = new w(2, 4);
    public static final w yellow = new w(2, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final w f5c = new w(2, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final w f6d = new w(2, 7);
    public static final w e = new w(2, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final w f7f = new w(2, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final w f8g = new w(2, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final w f9h = new w(2, 11);

    /* renamed from: i, reason: collision with root package name */
    public static final w f10i = new w(2, 12);

    /* renamed from: j, reason: collision with root package name */
    public static final w f11j = new w(2, 13);

    /* renamed from: k, reason: collision with root package name */
    public static final w f12k = new w(2, 14);

    /* renamed from: l, reason: collision with root package name */
    public static final w f13l = new w(2, 15);

    /* renamed from: m, reason: collision with root package name */
    public static final w f14m = new w(2, 16);

    /* renamed from: n, reason: collision with root package name */
    public static final w f15n = new w(2, 17);

    /* renamed from: o, reason: collision with root package name */
    public static final w f16o = new w(2, 18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        String str;
        kotlin.e eVar;
        switch (this.alpha) {
            case 0:
                return (U.d) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list != null) {
                    ArrayList B = CollectionsKt.B(list);
                    B.addAll(list2);
                    return B;
                }
                return list2;
            case 2:
                return (U.n) obj;
            case 3:
                return (Unit) obj;
            case 4:
                return (Unit) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (Unit) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                h hVar = (h) obj;
                int i4 = ((h) obj2).alpha;
                return hVar;
            case 10:
                return (as) obj;
            case 11:
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 != null) {
                    ArrayList B6 = CollectionsKt.B(list3);
                    B6.addAll(list4);
                    return B6;
                }
                return list4;
            case 13:
                Float f5 = (Float) obj;
                ((Number) obj2).floatValue();
                return f5;
            case 14:
                return (String) obj;
            case 15:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.alpha) == null) {
                    str = aVar2.alpha;
                }
                if (aVar == null || (eVar = aVar.bravo) == null) {
                    eVar = aVar2.bravo;
                }
                return new a(str, eVar);
            case 17:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            default:
                s sVar = (s) obj2;
                k kVar = ((s) obj).delta;
                ac acVar = x.sierra;
                Object golf = kVar.alpha.golf(acVar);
                if (golf == null) {
                    l.red.getClass();
                    golf = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) golf).floatValue();
                Object golf2 = sVar.delta.alpha.golf(acVar);
                if (golf2 == null) {
                    l.silver.getClass();
                    golf2 = Float.valueOf(0.0f);
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) golf2).floatValue()));
        }
    }
}
