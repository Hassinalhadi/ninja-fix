package t0;

import a0.C0366t;
import ae.AbstractC0422a;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import fe.C1712d;
import g.C1718a;
import id.C1915c;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import p0.AbstractC2264a;
import q0.AbstractC2375K;
import s0.C2563x;
import s1.C2569b;
import s1.C2576i;
import s6.AbstractC2627c7;
import s6.AbstractC2679i5;
import t1.C2951c;
import t1.C2952d;
import t6.AbstractC3060t2;
import t6.I2;
import u0.C3135a;
import y1.AbstractC3388a;

/* renamed from: t0.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2948z extends C1718a {
    public final /* synthetic */ int red;
    public final /* synthetic */ C2569b silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2948z(C2569b c2569b, int i4) {
        super(29);
        this.red = i4;
        this.silver = c2569b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:358:0x07a8, code lost:
    
        if (r4 == false) goto L360;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0cbd  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x08da  */
    /* JADX WARN: Type inference failed for: r4v152, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v153, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v154, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v155, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v159, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v160, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C2952d emerald(int i4) {
        androidx.lifecycle.ab abVar;
        Integer num;
        AccessibilityNodeInfo accessibilityNodeInfo;
        bv.y yVar;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        C2946x c2946x;
        Resources resources;
        bv.y yVar2;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        String str;
        int i5;
        int i10;
        boolean z2;
        A0.a aVar;
        A0.a aVar2;
        A0.a aVar3;
        String uniform;
        boolean z10;
        A0.g gVar;
        int i11;
        A0.b bVar;
        float f5;
        int size;
        C2946x c2946x2;
        C2952d c2952d;
        T0.j mike;
        boolean z11;
        boolean z12;
        boolean z13;
        C2951c c2951c;
        boolean z14;
        C2951c c2951c2;
        A0.b bVar2;
        int i12;
        int i13;
        A0.a aVar4;
        boolean z15;
        String str2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        String str3;
        ?? emptyList;
        ?? emptyList2;
        C1915c c1915c;
        List list;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        O0.o oVar;
        boolean z25;
        A0.s sVar;
        View view;
        androidx.lifecycle.ac lifecycle;
        ad adVar = (ad) this.silver;
        C2946x c2946x3 = adVar.delta;
        C2926m viewTreeOwners = c2946x3.getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycle = viewTreeOwners.alpha.getLifecycle()) != null) {
            abVar = lifecycle.bravo();
        } else {
            abVar = null;
        }
        androidx.lifecycle.ab abVar2 = androidx.lifecycle.ab.alpha;
        AccessibilityManager accessibilityManager = adVar.golf;
        if (abVar == abVar2) {
            if (!accessibilityManager.isEnabled()) {
                c2952d = new C2952d(AccessibilityNodeInfo.obtain());
                i5 = i4;
                if (adVar.romeo) {
                    if (i5 == adVar.november) {
                        adVar.papa = c2952d;
                    }
                    if (i5 == adVar.oscar) {
                        adVar.quebec = c2952d;
                    }
                }
                return c2952d;
            }
            c2952d = null;
            i5 = i4;
            if (adVar.romeo) {
            }
            return c2952d;
        }
        A0.t tVar = (A0.t) adVar.tango().bravo(i4);
        if (tVar == null) {
            if (!accessibilityManager.isEnabled()) {
                c2952d = new C2952d(AccessibilityNodeInfo.obtain());
                i5 = i4;
                if (adVar.romeo) {
                }
                return c2952d;
            }
            c2952d = null;
            i5 = i4;
            if (adVar.romeo) {
            }
            return c2952d;
        }
        A0.s sVar2 = tVar.alpha;
        boolean areEqual = Intrinsics.areEqual(A0.v.delta(sVar2.kilo(), A0.x.november), Boolean.TRUE);
        if (areEqual && !adVar.whiskey()) {
            i5 = i4;
            c2952d = null;
        } else {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
            C2952d c2952d2 = new C2952d(obtain);
            int i20 = Build.VERSION.SDK_INT;
            if (i20 >= 34) {
                AbstractC0422a.november(obtain, areEqual);
            } else {
                c2952d2.hotel(64, areEqual);
            }
            if (i4 == -1) {
                Object parentForAccessibility = c2946x3.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    view = (View) parentForAccessibility;
                } else {
                    view = null;
                }
                c2952d2.bravo = -1;
                obtain.setParent(view);
            } else {
                A0.s lima = sVar2.lima();
                if (lima != null) {
                    num = Integer.valueOf(lima.golf);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == c2946x3.getSemanticsOwner().alpha().golf) {
                        intValue = -1;
                    }
                    c2952d2.bravo = intValue;
                    obtain.setParent(c2946x3, intValue);
                } else {
                    AbstractC2264a.charlie("semanticsNode " + i4 + " has null parent");
                    throw new KotlinNothingValueException();
                }
            }
            c2952d2.charlie = i4;
            obtain.setSource(c2946x3, i4);
            c2952d2.india(adVar.kilo(tVar));
            Resources resources2 = c2946x3.getContext().getResources();
            c2952d2.juliet("android.view.View");
            A0.ac acVar = A0.x.blue;
            A0.k kVar = sVar2.delta;
            bv.al alVar = kVar.alpha;
            if (alVar.charlie(acVar)) {
                c2952d2.juliet("android.widget.EditText");
            }
            if (alVar.charlie(A0.x.amber)) {
                c2952d2.juliet("android.widget.TextView");
            }
            A0.h hVar = (A0.h) A0.v.delta(kVar, A0.x.xray);
            if (hVar != null && (sVar2.echo || A0.s.juliet(4, sVar2).isEmpty())) {
                int i21 = hVar.alpha;
                if (i21 == 4) {
                    obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                } else if (i21 == 2) {
                    obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                } else {
                    String oscar = W.oscar(i21);
                    if (i21 != 5 || sVar2.oscar() || kVar.red) {
                        c2952d2.juliet(oscar);
                    }
                }
            }
            obtain.setPackageName(c2946x3.getContext().getPackageName());
            boolean foxtrot = A0.v.foxtrot(sVar2);
            if (i20 >= 24) {
                obtain.setImportantForAccessibility(foxtrot);
            }
            boolean whiskey = adVar.whiskey();
            List juliet = A0.s.juliet(4, sVar2);
            int size2 = juliet.size();
            int i22 = 0;
            int i23 = 0;
            while (true) {
                accessibilityNodeInfo = c2952d2.alpha;
                boolean z26 = whiskey;
                yVar = adVar.gray;
                if (i23 >= size2) {
                    break;
                }
                int i24 = size2;
                A0.s sVar3 = (A0.s) juliet.get(i23);
                int i25 = i23;
                List list2 = juliet;
                if (adVar.tango().alpha(sVar3.golf)) {
                    T0.j jVar = c2946x3.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(sVar3.charlie);
                    int i26 = sVar3.golf;
                    if (i26 != -1) {
                        if (jVar != null) {
                            accessibilityNodeInfo.addChild(jVar);
                        } else {
                            A0.t tVar2 = (A0.t) adVar.tango().bravo(i26);
                            if (tVar2 != null && (sVar = tVar2.alpha) != null) {
                                z25 = Intrinsics.areEqual(A0.v.delta(sVar.kilo(), A0.x.november), Boolean.TRUE);
                            } else {
                                z25 = false;
                            }
                            if (z26 || !z25) {
                                accessibilityNodeInfo.addChild(c2946x3, i26);
                            }
                        }
                        yVar.foxtrot(i26, i22);
                        i22++;
                    }
                }
                i23 = i25 + 1;
                whiskey = z26;
                size2 = i24;
                juliet = list2;
            }
            if (i4 == adVar.november) {
                accessibilityNodeInfo.setAccessibilityFocused(true);
                c2952d2.bravo(C2951c.india);
            } else {
                accessibilityNodeInfo.setAccessibilityFocused(false);
                c2952d2.bravo(C2951c.hotel);
            }
            D0.g foxtrot2 = ae.foxtrot(sVar2);
            if (foxtrot2 != null) {
                C2946x c2946x4 = adVar.delta;
                c2946x4.getFontFamilyResolver();
                Q0.d density = c2946x4.getDensity();
                String str4 = foxtrot2.purple;
                SpannableString spannableString2 = new SpannableString(str4);
                ArrayList arrayList = foxtrot2.red;
                if (arrayList != null) {
                    str3 = str4;
                    int size3 = arrayList.size();
                    c2946x = c2946x3;
                    int i27 = 0;
                    while (i27 < size3) {
                        int i28 = i27;
                        D0.e eVar = (D0.e) arrayList.get(i27);
                        ArrayList arrayList2 = arrayList;
                        D0.af afVar = (D0.af) eVar.alpha;
                        int i29 = size3;
                        Resources resources3 = resources2;
                        bv.y yVar3 = yVar;
                        long bravo = afVar.alpha.bravo();
                        O0.o oVar2 = afVar.alpha;
                        AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfo;
                        if (!C0366t.charlie(bravo, oVar2.bravo())) {
                            if (bravo != 16) {
                                oVar = new O0.c(bravo);
                            } else {
                                oVar = O0.n.alpha;
                            }
                            oVar2 = oVar;
                        }
                        long bravo2 = oVar2.bravo();
                        int i30 = eVar.bravo;
                        int i31 = eVar.charlie;
                        M0.a.bravo(spannableString2, bravo2, i30, i31);
                        SpannableString spannableString3 = spannableString2;
                        M0.a.charlie(spannableString3, afVar.bravo, density, i30, i31);
                        H0.v vVar = afVar.charlie;
                        H0.r rVar = afVar.delta;
                        if (vVar == null && rVar == null) {
                            i19 = 33;
                        } else {
                            if (vVar == null) {
                                vVar = H0.v.yellow;
                            }
                            if (rVar != null) {
                                i18 = rVar.alpha;
                            } else {
                                i18 = 0;
                            }
                            StyleSpan styleSpan = new StyleSpan(AbstractC2679i5.alpha(vVar, i18));
                            i19 = 33;
                            spannableString3.setSpan(styleSpan, i30, i31, 33);
                        }
                        O0.l lVar = afVar.mike;
                        if (lVar != null) {
                            int i32 = lVar.alpha;
                            if ((i32 | 1) == i32) {
                                spannableString3.setSpan(new UnderlineSpan(), i30, i31, i19);
                            }
                            if ((i32 | 2) == i32) {
                                spannableString3.setSpan(new StrikethroughSpan(), i30, i31, i19);
                            }
                        }
                        O0.p pVar = afVar.juliet;
                        if (pVar != null) {
                            spannableString3.setSpan(new ScaleXSpan(pVar.alpha), i30, i31, i19);
                        }
                        M0.a.delta(spannableString3, afVar.kilo, i30, i31);
                        long j5 = afVar.lima;
                        if (j5 != 16) {
                            spannableString3.setSpan(new BackgroundColorSpan(a0.ao.beige(j5)), i30, i31, 33);
                        }
                        i27 = i28 + 1;
                        spannableString2 = spannableString3;
                        arrayList = arrayList2;
                        size3 = i29;
                        resources2 = resources3;
                        yVar = yVar3;
                        accessibilityNodeInfo = accessibilityNodeInfo4;
                    }
                } else {
                    c2946x = c2946x3;
                    str3 = str4;
                }
                accessibilityNodeInfo2 = accessibilityNodeInfo;
                resources = resources2;
                yVar2 = yVar;
                SpannableString spannableString4 = spannableString2;
                int length = str3.length();
                List list3 = foxtrot2.alpha;
                if (list3 != null) {
                    emptyList = new ArrayList(list3.size());
                    int size4 = list3.size();
                    int i33 = 0;
                    while (i33 < size4) {
                        Object obj = list3.get(i33);
                        D0.e eVar2 = (D0.e) obj;
                        int i34 = size4;
                        if (eVar2.alpha instanceof D0.aq) {
                            i17 = i33;
                            if (D0.h.bravo(0, length, eVar2.bravo, eVar2.charlie)) {
                                emptyList.add(obj);
                            }
                        } else {
                            i17 = i33;
                        }
                        i33 = i17 + 1;
                        size4 = i34;
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                Intrinsics.charlie(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
                int i35 = 0;
                for (int size5 = emptyList.size(); i35 < size5; size5 = size5) {
                    D0.e eVar3 = (D0.e) emptyList.get(i35);
                    D0.aq aqVar = (D0.aq) eVar3.alpha;
                    if (aqVar instanceof D0.aq) {
                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(aqVar.alpha).build(), eVar3.bravo, eVar3.charlie, 33);
                        i35++;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                int length2 = str3.length();
                if (list3 != null) {
                    emptyList2 = new ArrayList(list3.size());
                    int size6 = list3.size();
                    int i36 = 0;
                    while (i36 < size6) {
                        Object obj2 = list3.get(i36);
                        D0.e eVar4 = (D0.e) obj2;
                        List list4 = list3;
                        if (eVar4.alpha instanceof D0.ap) {
                            i16 = size6;
                            if (D0.h.bravo(0, length2, eVar4.bravo, eVar4.charlie)) {
                                emptyList2.add(obj2);
                            }
                        } else {
                            i16 = size6;
                        }
                        i36++;
                        list3 = list4;
                        size6 = i16;
                    }
                } else {
                    emptyList2 = CollectionsKt.emptyList();
                }
                Intrinsics.charlie(emptyList2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
                int size7 = emptyList2.size();
                int i37 = 0;
                while (true) {
                    c1915c = adVar.cyan;
                    if (i37 >= size7) {
                        break;
                    }
                    D0.e eVar5 = (D0.e) emptyList2.get(i37);
                    D0.ap apVar = (D0.ap) eVar5.alpha;
                    WeakHashMap weakHashMap = (WeakHashMap) c1915c.purple;
                    Object obj3 = weakHashMap.get(apVar);
                    if (obj3 == null) {
                        i15 = size7;
                        obj3 = new URLSpan(apVar.alpha);
                        weakHashMap.put(apVar, obj3);
                    } else {
                        i15 = size7;
                    }
                    spannableString4.setSpan((URLSpan) obj3, eVar5.bravo, eVar5.charlie, 33);
                    i37++;
                    size7 = i15;
                }
                List alpha = foxtrot2.alpha(str3.length());
                int size8 = alpha.size();
                int i38 = 0;
                while (i38 < size8) {
                    D0.e eVar6 = (D0.e) alpha.get(i38);
                    int i39 = eVar6.bravo;
                    int i40 = eVar6.charlie;
                    if (i39 != i40) {
                        Object obj4 = eVar6.alpha;
                        list = alpha;
                        D0.m mVar = (D0.m) obj4;
                        i14 = size8;
                        if (mVar instanceof D0.l) {
                            ((D0.l) mVar).getClass();
                            Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                            D0.l lVar2 = (D0.l) obj4;
                            D0.e eVar7 = new D0.e(lVar2, i39, i40);
                            WeakHashMap weakHashMap2 = (WeakHashMap) c1915c.red;
                            Object obj5 = weakHashMap2.get(eVar7);
                            if (obj5 == null) {
                                obj5 = new URLSpan(lVar2.alpha);
                                weakHashMap2.put(eVar7, obj5);
                            }
                            spannableString4.setSpan((URLSpan) obj5, i39, i40, 33);
                        } else {
                            WeakHashMap weakHashMap3 = (WeakHashMap) c1915c.silver;
                            Object obj6 = weakHashMap3.get(eVar6);
                            if (obj6 == null) {
                                obj6 = new L0.g(mVar);
                                weakHashMap3.put(eVar6, obj6);
                            }
                            spannableString4.setSpan((ClickableSpan) obj6, i39, i40, 33);
                        }
                    } else {
                        list = alpha;
                        i14 = size8;
                    }
                    i38++;
                    alpha = list;
                    size8 = i14;
                }
                spannableString = (SpannableString) ad.ivory(spannableString4);
            } else {
                accessibilityNodeInfo2 = accessibilityNodeInfo;
                c2946x = c2946x3;
                resources = resources2;
                yVar2 = yVar;
                spannableString = null;
            }
            c2952d2.november(spannableString);
            A0.ac acVar2 = A0.x.fuchsia;
            if (alVar.charlie(acVar2)) {
                obtain.setContentInvalid(true);
                accessibilityNodeInfo3 = accessibilityNodeInfo2;
                accessibilityNodeInfo3.setError((CharSequence) A0.v.delta(kVar, acVar2));
            } else {
                accessibilityNodeInfo3 = accessibilityNodeInfo2;
            }
            Resources resources4 = resources;
            String echo = ae.echo(sVar2, resources4);
            if (Build.VERSION.SDK_INT >= 30) {
                bc.d.india(accessibilityNodeInfo3, echo);
            } else {
                accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", echo);
            }
            accessibilityNodeInfo3.setCheckable(ae.delta(sVar2));
            C0.a aVar5 = (C0.a) A0.v.delta(kVar, A0.x.cyan);
            if (aVar5 != null) {
                if (aVar5 == C0.a.alpha) {
                    accessibilityNodeInfo3.setChecked(true);
                } else if (aVar5 == C0.a.purple) {
                    accessibilityNodeInfo3.setChecked(false);
                }
            }
            Boolean bool = (Boolean) A0.v.delta(kVar, A0.x.crimson);
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (hVar != null && hVar.alpha == 4) {
                    accessibilityNodeInfo3.setSelected(booleanValue);
                } else {
                    accessibilityNodeInfo3.setChecked(booleanValue);
                }
            }
            if (!kVar.red || A0.s.juliet(4, sVar2).isEmpty()) {
                List list5 = (List) A0.v.delta(kVar, A0.x.alpha);
                if (list5 != null) {
                    str = (String) CollectionsKt.green(list5);
                } else {
                    str = null;
                }
                accessibilityNodeInfo3.setContentDescription(str);
            }
            String str5 = (String) A0.v.delta(kVar, A0.x.yankee);
            if (str5 != null) {
                A0.s sVar4 = sVar2;
                while (true) {
                    if (sVar4 != null) {
                        A0.ac acVar3 = A0.y.alpha;
                        A0.k kVar2 = sVar4.delta;
                        if (kVar2.alpha.charlie(acVar3)) {
                            z24 = ((Boolean) kVar2.bravo(acVar3)).booleanValue();
                            break;
                        }
                        sVar4 = sVar4.lima();
                    } else {
                        z24 = false;
                        break;
                    }
                }
                if (z24) {
                    obtain.setViewIdResourceName(str5);
                }
            }
            if (((Unit) A0.v.delta(kVar, A0.x.hotel)) != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    accessibilityNodeInfo3.setHeading(true);
                } else {
                    c2952d2.hotel(2, true);
                }
            }
            i5 = i4;
            if (i5 != -1) {
                int delta = yVar2.delta(sVar2.golf);
                if (delta != -1) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        obtain.setDrawingOrder(delta);
                    }
                } else {
                    Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                }
            }
            obtain.setPassword(alVar.charlie(A0.x.emerald));
            obtain.setEditable(alVar.charlie(A0.x.gray));
            Integer num2 = (Integer) A0.v.delta(kVar, A0.x.green);
            if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = -1;
            }
            accessibilityNodeInfo3.setMaxTextLength(i10);
            accessibilityNodeInfo3.setEnabled(ae.alpha(sVar2));
            A0.ac acVar4 = A0.x.kilo;
            accessibilityNodeInfo3.setFocusable(alVar.charlie(acVar4));
            if (obtain.isFocusable()) {
                accessibilityNodeInfo3.setFocused(((Boolean) kVar.bravo(acVar4)).booleanValue());
                if (obtain.isFocused()) {
                    c2952d2.alpha(2);
                    adVar.oscar = i5;
                } else {
                    z2 = true;
                    c2952d2.alpha(1);
                    accessibilityNodeInfo3.setVisibleToUser(A0.v.echo(sVar2) ^ z2);
                    accessibilityNodeInfo3.setClickable(false);
                    aVar = (A0.a) A0.v.delta(kVar, A0.j.bravo);
                    char c3 = 3;
                    if (aVar != null) {
                        boolean areEqual2 = Intrinsics.areEqual(A0.v.delta(kVar, A0.x.crimson), Boolean.TRUE);
                        if (hVar == null || hVar.alpha != 4) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                        if (!z20) {
                            if (hVar == null || hVar.alpha != 3) {
                                z23 = false;
                            } else {
                                z23 = true;
                            }
                            if (!z23) {
                                z21 = false;
                                if (!z21 && (!z21 || areEqual2)) {
                                    z22 = false;
                                } else {
                                    z22 = true;
                                }
                                accessibilityNodeInfo3.setClickable(z22);
                                if (ae.alpha(sVar2) && obtain.isClickable()) {
                                    c2952d2.bravo(new C2951c(16, aVar.alpha));
                                }
                            }
                        }
                        z21 = true;
                        if (!z21) {
                        }
                        z22 = true;
                        accessibilityNodeInfo3.setClickable(z22);
                        if (ae.alpha(sVar2)) {
                            c2952d2.bravo(new C2951c(16, aVar.alpha));
                        }
                    }
                    accessibilityNodeInfo3.setLongClickable(false);
                    aVar2 = (A0.a) A0.v.delta(kVar, A0.j.charlie);
                    if (aVar2 != null) {
                        accessibilityNodeInfo3.setLongClickable(true);
                        if (ae.alpha(sVar2)) {
                            c2952d2.bravo(new C2951c(32, aVar2.alpha));
                        }
                    }
                    aVar3 = (A0.a) A0.v.delta(kVar, A0.j.papa);
                    if (aVar3 != null) {
                        c2952d2.bravo(new C2951c(Http2.INITIAL_MAX_FRAME_SIZE, aVar3.alpha));
                    }
                    if (ae.alpha(sVar2)) {
                        A0.a aVar6 = (A0.a) A0.v.delta(kVar, A0.j.juliet);
                        if (aVar6 != null) {
                            c2952d2.bravo(new C2951c(2097152, aVar6.alpha));
                        }
                        A0.a aVar7 = (A0.a) A0.v.delta(kVar, A0.j.oscar);
                        if (aVar7 != null) {
                            c2952d2.bravo(new C2951c(android.R.id.accessibilityActionImeEnter, aVar7.alpha));
                        }
                        A0.a aVar8 = (A0.a) A0.v.delta(kVar, A0.j.quebec);
                        if (aVar8 != null) {
                            c2952d2.bravo(new C2951c(65536, aVar8.alpha));
                        }
                        A0.a aVar9 = (A0.a) A0.v.delta(kVar, A0.j.romeo);
                        if (aVar9 != null && obtain.isFocused()) {
                            ClipDescription primaryClipDescription = c2946x.getClipboardManager().alpha.getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                z19 = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                z19 = false;
                            }
                            if (z19) {
                                c2952d2.bravo(new C2951c(32768, aVar9.alpha));
                            }
                        }
                    }
                    uniform = ad.uniform(sVar2);
                    if (uniform == null && uniform.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    s0.al alVar2 = sVar2.charlie;
                    if (!z10) {
                        obtain.setTextSelection(adVar.sierra(sVar2), adVar.romeo(sVar2));
                        A0.a aVar10 = (A0.a) A0.v.delta(kVar, A0.j.india);
                        if (aVar10 != null) {
                            str2 = aVar10.alpha;
                        } else {
                            str2 = null;
                        }
                        c2952d2.bravo(new C2951c(131072, str2));
                        c2952d2.alpha(Barcode.FORMAT_QR_CODE);
                        c2952d2.alpha(512);
                        accessibilityNodeInfo3.setMovementGranularities(11);
                        List list6 = (List) A0.v.delta(kVar, A0.x.alpha);
                        if (list6 != null && !list6.isEmpty()) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (z16 && alVar.charlie(A0.j.alpha)) {
                            if (!alVar.charlie(A0.x.blue) || Intrinsics.areEqual(A0.v.delta(kVar, acVar4), Boolean.TRUE)) {
                                s0.al charlie = ae.charlie(alVar2, C2932p.yellow);
                                if (charlie != null) {
                                    A0.k xray = charlie.xray();
                                    if (xray != null) {
                                        z18 = Intrinsics.areEqual(A0.v.delta(xray, acVar4), Boolean.TRUE);
                                    } else {
                                        z18 = false;
                                    }
                                }
                                z17 = false;
                                if (!z17) {
                                    accessibilityNodeInfo3.setMovementGranularities(obtain.getMovementGranularities() | 20);
                                }
                            }
                            z17 = true;
                            if (!z17) {
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add("androidx.compose.ui.semantics.id");
                        CharSequence golf = c2952d2.golf();
                        if (golf != null && golf.length() != 0) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z15 && alVar.charlie(A0.j.alpha)) {
                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (alVar.charlie(A0.x.yankee)) {
                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (alVar.charlie(A0.x.indigo)) {
                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            obtain.setAvailableExtraData(arrayList3);
                        }
                    }
                    gVar = (A0.g) A0.v.delta(kVar, A0.x.charlie);
                    float f10 = 0.0f;
                    if (gVar != null) {
                        A0.ac acVar5 = A0.j.hotel;
                        if (alVar.charlie(acVar5)) {
                            c2952d2.juliet("android.widget.SeekBar");
                        } else {
                            c2952d2.juliet("android.widget.ProgressBar");
                        }
                        A0.g gVar2 = A0.g.charlie;
                        float f11 = gVar.alpha;
                        C1712d c1712d = gVar.bravo;
                        if (gVar != gVar2) {
                            c1712d.getClass();
                            accessibilityNodeInfo3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, c1712d.alpha, f11));
                        }
                        if (alVar.charlie(acVar5) && ae.alpha(sVar2)) {
                            float floatValue = Float.valueOf(c1712d.alpha).floatValue();
                            float floatValue2 = Float.valueOf(0.0f).floatValue();
                            if (floatValue < floatValue2) {
                                floatValue = floatValue2;
                            }
                            if (f11 < floatValue) {
                                c2952d2.bravo(C2951c.juliet);
                            }
                            float floatValue3 = Float.valueOf(0.0f).floatValue();
                            float floatValue4 = Float.valueOf(c1712d.alpha).floatValue();
                            if (floatValue3 > floatValue4) {
                                floatValue3 = floatValue4;
                            }
                            if (f11 > floatValue3) {
                                c2952d2.bravo(C2951c.kilo);
                            }
                        }
                    }
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 24 && ae.alpha(sVar2)) {
                        aVar4 = (A0.a) A0.v.delta(sVar2.delta, A0.j.hotel);
                        if (aVar4 != null) {
                            c2952d2.bravo(new C2951c(android.R.id.accessibilityActionSetProgress, aVar4.alpha));
                        }
                    }
                    bVar = (A0.b) A0.v.delta(sVar2.kilo(), A0.x.foxtrot);
                    if (bVar == null) {
                        c2952d2.kilo(C1718a.zulu(bVar.alpha, bVar.bravo, 0));
                        f5 = 0.0f;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        if (A0.v.delta(sVar2.kilo(), A0.x.echo) != null) {
                            List juliet2 = A0.s.juliet(4, sVar2);
                            int size9 = juliet2.size();
                            int i41 = 0;
                            while (i41 < size9) {
                                float f12 = f10;
                                A0.s sVar5 = (A0.s) juliet2.get(i41);
                                char c4 = c3;
                                if (sVar5.kilo().alpha.charlie(A0.x.crimson)) {
                                    arrayList4.add(sVar5);
                                }
                                i41++;
                                c3 = c4;
                                f10 = f12;
                            }
                        }
                        f5 = f10;
                        if (!arrayList4.isEmpty()) {
                            boolean alpha2 = AbstractC3060t2.alpha(arrayList4);
                            int i42 = 1;
                            if (alpha2) {
                                size = 1;
                            } else {
                                size = arrayList4.size();
                            }
                            if (alpha2) {
                                i42 = arrayList4.size();
                            }
                            c2952d2.kilo(C1718a.zulu(size, i42, 0));
                        }
                    }
                    if (A0.v.delta(sVar2.kilo(), A0.x.golf) != null) {
                        A0.s lima2 = sVar2.lima();
                        if (lima2 != null && A0.v.delta(lima2.kilo(), A0.x.echo) != null && ((bVar2 = (A0.b) A0.v.delta(lima2.kilo(), A0.x.foxtrot)) == null || (bVar2.alpha >= 0 && bVar2.bravo >= 0))) {
                            if (sVar2.kilo().alpha.charlie(A0.x.crimson)) {
                                ArrayList arrayList5 = new ArrayList();
                                List juliet3 = A0.s.juliet(4, lima2);
                                int size10 = juliet3.size();
                                int i43 = 0;
                                int i44 = 0;
                                while (i43 < size10) {
                                    A0.s sVar6 = (A0.s) juliet3.get(i43);
                                    List list7 = juliet3;
                                    if (sVar6.kilo().alpha.charlie(A0.x.crimson)) {
                                        arrayList5.add(sVar6);
                                        if (sVar6.charlie.whiskey() < sVar2.charlie.whiskey()) {
                                            i44++;
                                        }
                                    }
                                    i43++;
                                    juliet3 = list7;
                                }
                                if (!arrayList5.isEmpty()) {
                                    boolean alpha3 = AbstractC3060t2.alpha(arrayList5);
                                    if (alpha3) {
                                        i12 = 0;
                                    } else {
                                        i12 = i44;
                                    }
                                    if (alpha3) {
                                        i13 = i44;
                                    } else {
                                        i13 = 0;
                                    }
                                    Object golf2 = sVar2.kilo().alpha.golf(A0.x.crimson);
                                    if (golf2 == null) {
                                        C3135a.alpha.getClass();
                                        golf2 = Boolean.FALSE;
                                    }
                                    c2952d2.lima(C2576i.hotel(i12, 1, i13, 1, false, ((Boolean) golf2).booleanValue()));
                                }
                            }
                        }
                        A0.i iVar = (A0.i) A0.v.delta(kVar, A0.x.tango);
                        A0.a aVar11 = (A0.a) A0.v.delta(kVar, A0.j.delta);
                        if (iVar != null && aVar11 != null) {
                            if (A0.v.delta(sVar2.kilo(), A0.x.foxtrot) == null && A0.v.delta(sVar2.kilo(), A0.x.echo) == null) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (!z12) {
                                c2952d2.juliet("android.widget.HorizontalScrollView");
                            }
                            if (((Number) iVar.bravo.invoke()).floatValue() > f5) {
                                c2952d2.mike(true);
                            }
                            if (ae.alpha(sVar2)) {
                                if (ad.amber(iVar)) {
                                    c2952d2.bravo(C2951c.juliet);
                                    if (alVar2.f13299r == Q0.n.purple) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        c2951c2 = C2951c.romeo;
                                    } else {
                                        c2951c2 = C2951c.papa;
                                    }
                                    c2952d2.bravo(c2951c2);
                                }
                                if (ad.zulu(iVar)) {
                                    c2952d2.bravo(C2951c.kilo);
                                    if (alVar2.f13299r == Q0.n.purple) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z13) {
                                        c2951c = C2951c.papa;
                                    } else {
                                        c2951c = C2951c.romeo;
                                    }
                                    c2952d2.bravo(c2951c);
                                }
                            }
                        }
                        A0.i iVar2 = (A0.i) A0.v.delta(sVar2.mike(), A0.x.uniform);
                        if (iVar2 != null && aVar11 != null) {
                            if (A0.v.delta(sVar2.kilo(), A0.x.foxtrot) == null && A0.v.delta(sVar2.kilo(), A0.x.echo) == null) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (!z11) {
                                c2952d2.juliet("android.widget.ScrollView");
                            }
                            if (((Number) iVar2.bravo.invoke()).floatValue() > f5) {
                                c2952d2.mike(true);
                            }
                            if (ae.alpha(sVar2)) {
                                if (ad.amber(iVar2)) {
                                    c2952d2.bravo(C2951c.juliet);
                                    c2952d2.bravo(C2951c.quebec);
                                }
                                if (ad.zulu(iVar2)) {
                                    c2952d2.bravo(C2951c.kilo);
                                    c2952d2.bravo(C2951c.oscar);
                                }
                            }
                        }
                        if (i11 >= 29) {
                            W.delta(c2952d2, sVar2);
                        }
                        CharSequence charSequence = (CharSequence) A0.v.delta(sVar2.mike(), A0.x.delta);
                        if (i11 >= 28) {
                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (ae.alpha(sVar2)) {
                            A0.a aVar12 = (A0.a) A0.v.delta(sVar2.mike(), A0.j.sierra);
                            if (aVar12 != null) {
                                c2952d2.bravo(new C2951c(262144, aVar12.alpha));
                            }
                            A0.a aVar13 = (A0.a) A0.v.delta(sVar2.mike(), A0.j.tango);
                            if (aVar13 != null) {
                                c2952d2.bravo(new C2951c(524288, aVar13.alpha));
                            }
                            A0.a aVar14 = (A0.a) A0.v.delta(sVar2.mike(), A0.j.uniform);
                            if (aVar14 != null) {
                                c2952d2.bravo(new C2951c(1048576, aVar14.alpha));
                            }
                            A0.k mike2 = sVar2.mike();
                            A0.ac acVar6 = A0.j.whiskey;
                            if (mike2.alpha.charlie(acVar6)) {
                                List list8 = (List) sVar2.mike().bravo(acVar6);
                                int size11 = list8.size();
                                bv.z zVar = ad.jade;
                                if (size11 < zVar.bravo) {
                                    bv.ax axVar = new bv.ax(0);
                                    bv.ag alpha4 = bv.aq.alpha();
                                    bv.ax axVar2 = adVar.victor;
                                    if (axVar2.charlie(i5)) {
                                        bv.ag agVar = (bv.ag) axVar2.delta(i5);
                                        int[] iArr = new int[16];
                                        int[] iArr2 = zVar.alpha;
                                        int i45 = zVar.bravo;
                                        int i46 = 0;
                                        int i47 = 0;
                                        while (i46 < i45) {
                                            int i48 = iArr2[i46];
                                            int i49 = i45;
                                            int i50 = i47 + 1;
                                            bv.ag agVar2 = agVar;
                                            if (iArr.length < i50) {
                                                int[] copyOf = Arrays.copyOf(iArr, Math.max(i50, (iArr.length * 3) / 2));
                                                Intrinsics.delta(copyOf, "copyOf(...)");
                                                iArr = copyOf;
                                            }
                                            iArr[i47] = i48;
                                            i46++;
                                            i47 = i50;
                                            i45 = i49;
                                            agVar = agVar2;
                                        }
                                        bv.ag agVar3 = agVar;
                                        ArrayList arrayList6 = new ArrayList();
                                        if (list8.size() <= 0) {
                                            if (arrayList6.size() > 0) {
                                                ao.ad.cyan(arrayList6.get(0));
                                                if (i47 > 0) {
                                                    int i51 = iArr[0];
                                                    throw null;
                                                }
                                                bw.a.delta("Index must be between 0 and size");
                                                throw null;
                                            }
                                        } else {
                                            ao.ad.cyan(list8.get(0));
                                            Intrinsics.checkNotNull(agVar3);
                                            throw null;
                                        }
                                    } else if (list8.size() > 0) {
                                        ao.ad.cyan(list8.get(0));
                                        zVar.alpha(0);
                                        throw null;
                                    }
                                    adVar.uniform.foxtrot(i5, axVar);
                                    axVar2.foxtrot(i5, alpha4);
                                } else {
                                    throw new IllegalStateException(androidx.appcompat.widget.P0.cyan(new StringBuilder("Can't have more than "), zVar.bravo, " custom actions for one widget"));
                                }
                            }
                        }
                        boolean bravo3 = ae.bravo(sVar2, resources4);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo3.setScreenReaderFocusable(bravo3);
                        } else {
                            c2952d2.hotel(1, bravo3);
                        }
                        int delta2 = adVar.blue.delta(i5);
                        if (delta2 != -1) {
                            T0.j mike3 = W.mike(c2946x.getAndroidViewsHandler$ui_release(), delta2);
                            if (mike3 != null) {
                                accessibilityNodeInfo3.setTraversalBefore(mike3);
                                c2946x2 = c2946x;
                            } else {
                                c2946x2 = c2946x;
                                accessibilityNodeInfo3.setTraversalBefore(c2946x2, delta2);
                            }
                            adVar.juliet(i5, c2952d2, adVar.coral, null);
                        } else {
                            c2946x2 = c2946x;
                        }
                        int delta3 = adVar.bronze.delta(i5);
                        if (delta3 != -1 && (mike = W.mike(c2946x2.getAndroidViewsHandler$ui_release(), delta3)) != null) {
                            accessibilityNodeInfo3.setTraversalAfter(mike);
                            adVar.juliet(i5, c2952d2, adVar.crimson, null);
                        }
                        String str6 = (String) A0.v.delta(sVar2.mike(), A0.y.bravo);
                        if (str6 != null) {
                            c2952d2.juliet(str6);
                        }
                        c2952d = c2952d2;
                    } else {
                        throw new ClassCastException();
                    }
                }
            }
            z2 = true;
            accessibilityNodeInfo3.setVisibleToUser(A0.v.echo(sVar2) ^ z2);
            accessibilityNodeInfo3.setClickable(false);
            aVar = (A0.a) A0.v.delta(kVar, A0.j.bravo);
            char c32 = 3;
            if (aVar != null) {
            }
            accessibilityNodeInfo3.setLongClickable(false);
            aVar2 = (A0.a) A0.v.delta(kVar, A0.j.charlie);
            if (aVar2 != null) {
            }
            aVar3 = (A0.a) A0.v.delta(kVar, A0.j.papa);
            if (aVar3 != null) {
            }
            if (ae.alpha(sVar2)) {
            }
            uniform = ad.uniform(sVar2);
            if (uniform == null) {
            }
            z10 = true;
            s0.al alVar22 = sVar2.charlie;
            if (!z10) {
            }
            if (Build.VERSION.SDK_INT >= 26) {
            }
            gVar = (A0.g) A0.v.delta(kVar, A0.x.charlie);
            float f102 = 0.0f;
            if (gVar != null) {
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                aVar4 = (A0.a) A0.v.delta(sVar2.delta, A0.j.hotel);
                if (aVar4 != null) {
                }
            }
            bVar = (A0.b) A0.v.delta(sVar2.kilo(), A0.x.foxtrot);
            if (bVar == null) {
            }
            if (A0.v.delta(sVar2.kilo(), A0.x.golf) != null) {
            }
        }
        if (adVar.romeo) {
        }
        return c2952d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01fa, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x06cd, code lost:
    
        if (r1 != 16) goto L400;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x00ee. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x078a  */
    /* JADX WARN: Type inference failed for: r10v11, types: [t0.d, K3.b] */
    /* JADX WARN: Type inference failed for: r10v15, types: [t0.c, K3.b] */
    /* JADX WARN: Type inference failed for: r8v20, types: [t0.e, K3.b] */
    @Override // g.C1718a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean blue(int i4, int i5, Bundle bundle) {
        A0.s sVar;
        int i10;
        int i11;
        Integer num;
        boolean z2;
        K3.b bVar;
        int[] tango;
        int i12;
        int i13;
        int i14;
        D0.ak india;
        C2908d c2908d;
        Function0 function0;
        int i15;
        int i16;
        int i17;
        Function0 function02;
        Boolean bool;
        Function0 function03;
        Function0 function04;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float f5;
        Float f10;
        float f11;
        float intBitsToFloat;
        A0.a aVar;
        Function0 function05;
        s0.al alVar;
        float intBitsToFloat2;
        A0.a aVar2;
        Function0 function06;
        Function1 function1;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        String str;
        Function1 function12;
        A0.a aVar3;
        long j5;
        long j6;
        s0.L delta;
        float f12;
        float f13;
        float f14;
        float f15;
        Xd.l lVar;
        A0.a aVar4;
        Function1 function13;
        Function0 function012;
        Function0 function013;
        Function0 function014;
        Function0 function015;
        Function0 function016;
        List list;
        int i18;
        C2569b c2569b = this.silver;
        boolean z17 = true;
        boolean z18 = false;
        switch (this.red) {
            case 0:
                ad adVar = (ad) c2569b;
                A0.t tVar = (A0.t) adVar.tango().bravo(i4);
                if (tVar != null && (sVar = tVar.alpha) != null) {
                    A0.ac acVar = A0.x.november;
                    A0.k kVar = sVar.delta;
                    Object delta2 = A0.v.delta(kVar, acVar);
                    Boolean bool2 = Boolean.TRUE;
                    if (!Intrinsics.areEqual(delta2, bool2) || adVar.whiskey()) {
                        C2946x c2946x = adVar.delta;
                        if (i5 != 64) {
                            if (i5 != 128) {
                                bv.al alVar2 = kVar.alpha;
                                int i19 = sVar.golf;
                                if (i5 != 256 && i5 != 512) {
                                    if (i5 != 16384) {
                                        if (i5 != 131072) {
                                            if (ae.alpha(sVar)) {
                                                if (i5 != 1) {
                                                    if (i5 != 2) {
                                                        float f16 = 0.0f;
                                                        s0.al alVar3 = sVar.charlie;
                                                        switch (i5) {
                                                            case 16:
                                                                A0.a aVar5 = (A0.a) A0.v.delta(kVar, A0.j.bravo);
                                                                if (aVar5 != null && (function03 = (Function0) aVar5.bravo) != null) {
                                                                    bool = (Boolean) function03.invoke();
                                                                } else {
                                                                    bool = null;
                                                                }
                                                                ad.bronze(adVar, i4, 1, null, 12);
                                                                if (bool != null) {
                                                                    return bool.booleanValue();
                                                                }
                                                                break;
                                                            case 32:
                                                                A0.a aVar6 = (A0.a) A0.v.delta(kVar, A0.j.charlie);
                                                                if (aVar6 != null && (function04 = (Function0) aVar6.bravo) != null) {
                                                                    return ((Boolean) function04.invoke()).booleanValue();
                                                                }
                                                                break;
                                                            case 4096:
                                                            case 8192:
                                                                if (i5 == 4096) {
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                                if (i5 == 8192) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                if (i5 == 16908345) {
                                                                    z12 = true;
                                                                } else {
                                                                    z12 = false;
                                                                }
                                                                if (i5 == 16908347) {
                                                                    z13 = true;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                                if (i5 == 16908344) {
                                                                    z14 = true;
                                                                } else {
                                                                    z14 = false;
                                                                }
                                                                if (i5 == 16908346) {
                                                                    z15 = true;
                                                                } else {
                                                                    z15 = false;
                                                                }
                                                                if (!z12 && !z13 && !z10 && !z11) {
                                                                    z16 = false;
                                                                } else {
                                                                    z16 = true;
                                                                }
                                                                if (!z14 && !z15 && !z10 && !z11) {
                                                                    z17 = false;
                                                                }
                                                                if (z10 || z11) {
                                                                    A0.g gVar = (A0.g) A0.v.delta(kVar, A0.x.charlie);
                                                                    A0.a aVar7 = (A0.a) A0.v.delta(kVar, A0.j.hotel);
                                                                    if (gVar != null && aVar7 != null) {
                                                                        float f17 = gVar.bravo.alpha;
                                                                        if (f17 < 0.0f) {
                                                                            f5 = 0.0f;
                                                                        } else {
                                                                            f5 = f17;
                                                                        }
                                                                        if (0.0f > f17) {
                                                                            f16 = f17;
                                                                        }
                                                                        float f18 = (f5 - f16) / 20;
                                                                        if (z11) {
                                                                            f18 = -f18;
                                                                        }
                                                                        Function1 function14 = (Function1) aVar7.bravo;
                                                                        if (function14 != null) {
                                                                            return ((Boolean) function14.invoke(Float.valueOf(gVar.alpha + f18))).booleanValue();
                                                                        }
                                                                    }
                                                                }
                                                                long bravo = AbstractC2375K.echo((C2563x) alVar3.f13305x.echo).bravo();
                                                                ArrayList arrayList = new ArrayList();
                                                                A0.a aVar8 = (A0.a) A0.v.delta(kVar, A0.j.azure);
                                                                if (aVar8 != null && (function1 = (Function1) aVar8.bravo) != null && ((Boolean) function1.invoke(arrayList)).booleanValue()) {
                                                                    f10 = (Float) arrayList.get(0);
                                                                } else {
                                                                    f10 = null;
                                                                }
                                                                A0.a aVar9 = (A0.a) A0.v.delta(kVar, A0.j.delta);
                                                                if (aVar9 != null) {
                                                                    A0.i iVar = (A0.i) A0.v.delta(kVar, A0.x.tango);
                                                                    kotlin.e eVar = aVar9.bravo;
                                                                    if (iVar != null && z16) {
                                                                        if (f10 != null) {
                                                                            intBitsToFloat2 = f10.floatValue();
                                                                            f11 = 0.0f;
                                                                            alVar = alVar3;
                                                                        } else {
                                                                            f11 = 0.0f;
                                                                            alVar = alVar3;
                                                                            intBitsToFloat2 = Float.intBitsToFloat((int) (bravo >> 32));
                                                                        }
                                                                        if (z12 || z11) {
                                                                            intBitsToFloat2 = -intBitsToFloat2;
                                                                        }
                                                                        if (alVar.f13299r == Q0.n.purple && (z12 || z13)) {
                                                                            intBitsToFloat2 = -intBitsToFloat2;
                                                                        }
                                                                        if (ad.yankee(iVar, intBitsToFloat2)) {
                                                                            A0.ac acVar2 = A0.j.yankee;
                                                                            if (!alVar2.charlie(acVar2) && !alVar2.charlie(A0.j.amber)) {
                                                                                Xd.l lVar2 = (Xd.l) eVar;
                                                                                if (lVar2 != null) {
                                                                                    return ((Boolean) lVar2.invoke(Float.valueOf(intBitsToFloat2), Float.valueOf(f11))).booleanValue();
                                                                                }
                                                                            } else {
                                                                                if (intBitsToFloat2 > f11) {
                                                                                    aVar2 = (A0.a) A0.v.delta(kVar, A0.j.amber);
                                                                                } else {
                                                                                    aVar2 = (A0.a) A0.v.delta(kVar, acVar2);
                                                                                }
                                                                                if (aVar2 != null && (function06 = (Function0) aVar2.bravo) != null) {
                                                                                    return ((Boolean) function06.invoke()).booleanValue();
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        f11 = 0.0f;
                                                                    }
                                                                    A0.i iVar2 = (A0.i) A0.v.delta(kVar, A0.x.uniform);
                                                                    if (iVar2 != null && z17) {
                                                                        if (f10 != null) {
                                                                            intBitsToFloat = f10.floatValue();
                                                                        } else {
                                                                            intBitsToFloat = Float.intBitsToFloat((int) (bravo & 4294967295L));
                                                                        }
                                                                        if (z14 || z11) {
                                                                            intBitsToFloat = -intBitsToFloat;
                                                                        }
                                                                        if (ad.yankee(iVar2, intBitsToFloat)) {
                                                                            A0.ac acVar3 = A0.j.xray;
                                                                            if (!alVar2.charlie(acVar3) && !alVar2.charlie(A0.j.zulu)) {
                                                                                Xd.l lVar3 = (Xd.l) eVar;
                                                                                if (lVar3 != null) {
                                                                                    return ((Boolean) lVar3.invoke(Float.valueOf(f11), Float.valueOf(intBitsToFloat))).booleanValue();
                                                                                }
                                                                            } else {
                                                                                if (intBitsToFloat > f11) {
                                                                                    aVar = (A0.a) A0.v.delta(kVar, A0.j.zulu);
                                                                                } else {
                                                                                    aVar = (A0.a) A0.v.delta(kVar, acVar3);
                                                                                }
                                                                                if (aVar != null && (function05 = (Function0) aVar.bravo) != null) {
                                                                                    return ((Boolean) function05.invoke()).booleanValue();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case 32768:
                                                                A0.a aVar10 = (A0.a) A0.v.delta(kVar, A0.j.romeo);
                                                                if (aVar10 != null && (function07 = (Function0) aVar10.bravo) != null) {
                                                                    return ((Boolean) function07.invoke()).booleanValue();
                                                                }
                                                                break;
                                                            case 65536:
                                                                A0.a aVar11 = (A0.a) A0.v.delta(kVar, A0.j.quebec);
                                                                if (aVar11 != null && (function08 = (Function0) aVar11.bravo) != null) {
                                                                    return ((Boolean) function08.invoke()).booleanValue();
                                                                }
                                                                break;
                                                            case 262144:
                                                                A0.a aVar12 = (A0.a) A0.v.delta(kVar, A0.j.sierra);
                                                                if (aVar12 != null && (function09 = (Function0) aVar12.bravo) != null) {
                                                                    return ((Boolean) function09.invoke()).booleanValue();
                                                                }
                                                                break;
                                                            case 524288:
                                                                A0.a aVar13 = (A0.a) A0.v.delta(kVar, A0.j.tango);
                                                                if (aVar13 != null && (function010 = (Function0) aVar13.bravo) != null) {
                                                                    return ((Boolean) function010.invoke()).booleanValue();
                                                                }
                                                                break;
                                                            case 1048576:
                                                                A0.a aVar14 = (A0.a) A0.v.delta(kVar, A0.j.uniform);
                                                                if (aVar14 != null && (function011 = (Function0) aVar14.bravo) != null) {
                                                                    return ((Boolean) function011.invoke()).booleanValue();
                                                                }
                                                                break;
                                                            case 2097152:
                                                                if (bundle != null) {
                                                                    str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                                                                } else {
                                                                    str = null;
                                                                }
                                                                A0.a aVar15 = (A0.a) A0.v.delta(kVar, A0.j.juliet);
                                                                if (aVar15 != null && (function12 = (Function1) aVar15.bravo) != null) {
                                                                    if (str == null) {
                                                                        str = "";
                                                                    }
                                                                    return ((Boolean) function12.invoke(new D0.g(str))).booleanValue();
                                                                }
                                                                break;
                                                            case android.R.id.accessibilityActionShowOnScreen:
                                                                A0.s lima = sVar.lima();
                                                                if (lima != null) {
                                                                    aVar3 = (A0.a) A0.v.delta(lima.delta, A0.j.delta);
                                                                    while (lima != null && aVar3 == null) {
                                                                        lima = lima.lima();
                                                                        if (lima != null) {
                                                                            aVar3 = (A0.a) A0.v.delta(lima.delta, A0.j.delta);
                                                                        }
                                                                    }
                                                                    if (lima == null) {
                                                                        Z.c golf = sVar.golf();
                                                                        return c2946x.requestRectangleOnScreen(new Rect((int) Math.floor(golf.alpha), (int) Math.floor(golf.bravo), Zd.a.delta((float) Math.ceil(golf.charlie)), Zd.a.delta((float) Math.ceil(golf.delta))));
                                                                    }
                                                                    s0.al alVar4 = lima.charlie;
                                                                    Z.c echo = AbstractC2375K.echo((C2563x) alVar4.f13305x.echo);
                                                                    q0.z amber = ((C2563x) alVar4.f13305x.echo).amber();
                                                                    long j7 = 0;
                                                                    if (amber != null) {
                                                                        j5 = ((s0.L) amber).gray(0L);
                                                                    } else {
                                                                        j5 = 0;
                                                                    }
                                                                    Z.c hotel = echo.hotel(j5);
                                                                    s0.L delta3 = sVar.delta();
                                                                    if (delta3 != null) {
                                                                        if (!delta3.india()) {
                                                                            delta3 = null;
                                                                        }
                                                                        if (delta3 != null) {
                                                                            j6 = delta3.gray(0L);
                                                                            delta = sVar.delta();
                                                                            if (delta != null) {
                                                                                j7 = delta.red;
                                                                            }
                                                                            Z.c alpha = I2.alpha(j6, AbstractC2627c7.bravo(j7));
                                                                            A0.ac acVar4 = A0.x.tango;
                                                                            A0.k kVar2 = lima.delta;
                                                                            f12 = alpha.alpha - hotel.alpha;
                                                                            f13 = alpha.charlie - hotel.charlie;
                                                                            if (Math.signum(f12) != Math.signum(f13)) {
                                                                                if (Math.abs(f12) >= Math.abs(f13)) {
                                                                                    f12 = f13;
                                                                                }
                                                                            } else {
                                                                                f12 = 0.0f;
                                                                            }
                                                                            if (alVar3.f13299r == Q0.n.purple) {
                                                                                f12 = -f12;
                                                                            }
                                                                            f14 = alpha.bravo - hotel.bravo;
                                                                            f15 = alpha.delta - hotel.delta;
                                                                            if (Math.signum(f14) == Math.signum(f15)) {
                                                                                if (Math.abs(f14) < Math.abs(f15)) {
                                                                                    f16 = f14;
                                                                                } else {
                                                                                    f16 = f15;
                                                                                }
                                                                            }
                                                                            if (aVar3 != null && (lVar = (Xd.l) aVar3.bravo) != null && ((Boolean) lVar.invoke(Float.valueOf(f12), Float.valueOf(f16))).booleanValue()) {
                                                                                return true;
                                                                            }
                                                                        }
                                                                    }
                                                                    j6 = 0;
                                                                    delta = sVar.delta();
                                                                    if (delta != null) {
                                                                    }
                                                                    Z.c alpha2 = I2.alpha(j6, AbstractC2627c7.bravo(j7));
                                                                    A0.ac acVar42 = A0.x.tango;
                                                                    A0.k kVar22 = lima.delta;
                                                                    f12 = alpha2.alpha - hotel.alpha;
                                                                    f13 = alpha2.charlie - hotel.charlie;
                                                                    if (Math.signum(f12) != Math.signum(f13)) {
                                                                    }
                                                                    if (alVar3.f13299r == Q0.n.purple) {
                                                                    }
                                                                    f14 = alpha2.bravo - hotel.bravo;
                                                                    f15 = alpha2.delta - hotel.delta;
                                                                    if (Math.signum(f14) == Math.signum(f15)) {
                                                                    }
                                                                    if (aVar3 != null) {
                                                                        return true;
                                                                    }
                                                                }
                                                                aVar3 = null;
                                                                break;
                                                            case android.R.id.accessibilityActionSetProgress:
                                                                if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && (aVar4 = (A0.a) A0.v.delta(kVar, A0.j.hotel)) != null && (function13 = (Function1) aVar4.bravo) != null) {
                                                                    return ((Boolean) function13.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                                                }
                                                                break;
                                                            case android.R.id.accessibilityActionImeEnter:
                                                                A0.a aVar16 = (A0.a) A0.v.delta(kVar, A0.j.oscar);
                                                                if (aVar16 != null && (function012 = (Function0) aVar16.bravo) != null) {
                                                                    return ((Boolean) function012.invoke()).booleanValue();
                                                                }
                                                                break;
                                                            default:
                                                                switch (i5) {
                                                                    case android.R.id.accessibilityActionScrollUp:
                                                                    case android.R.id.accessibilityActionScrollLeft:
                                                                    case android.R.id.accessibilityActionScrollDown:
                                                                    case android.R.id.accessibilityActionScrollRight:
                                                                        break;
                                                                    default:
                                                                        switch (i5) {
                                                                            case android.R.id.accessibilityActionPageUp:
                                                                                A0.a aVar17 = (A0.a) A0.v.delta(kVar, A0.j.xray);
                                                                                if (aVar17 != null && (function013 = (Function0) aVar17.bravo) != null) {
                                                                                    return ((Boolean) function013.invoke()).booleanValue();
                                                                                }
                                                                                break;
                                                                            case android.R.id.accessibilityActionPageDown:
                                                                                A0.a aVar18 = (A0.a) A0.v.delta(kVar, A0.j.zulu);
                                                                                if (aVar18 != null && (function014 = (Function0) aVar18.bravo) != null) {
                                                                                    return ((Boolean) function014.invoke()).booleanValue();
                                                                                }
                                                                                break;
                                                                            case android.R.id.accessibilityActionPageLeft:
                                                                                A0.a aVar19 = (A0.a) A0.v.delta(kVar, A0.j.yankee);
                                                                                if (aVar19 != null && (function015 = (Function0) aVar19.bravo) != null) {
                                                                                    return ((Boolean) function015.invoke()).booleanValue();
                                                                                }
                                                                                break;
                                                                            case android.R.id.accessibilityActionPageRight:
                                                                                A0.a aVar20 = (A0.a) A0.v.delta(kVar, A0.j.amber);
                                                                                if (aVar20 != null && (function016 = (Function0) aVar20.bravo) != null) {
                                                                                    return ((Boolean) function016.invoke()).booleanValue();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                bv.ax axVar = (bv.ax) adVar.uniform.delta(i4);
                                                                                if (axVar != null && ((CharSequence) axVar.delta(i5)) != null && (list = (List) A0.v.delta(kVar, A0.j.whiskey)) != null && list.size() > 0) {
                                                                                    list.get(0).getClass();
                                                                                    throw new ClassCastException();
                                                                                }
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                    } else if (Intrinsics.areEqual(A0.v.delta(kVar, A0.x.kilo), bool2)) {
                                                        ((Y.n) c2946x.getFocusOwner()).bravo(8, false, true);
                                                        return true;
                                                    }
                                                } else {
                                                    if (c2946x.isInTouchMode()) {
                                                        c2946x.requestFocusFromTouch();
                                                    }
                                                    A0.a aVar21 = (A0.a) A0.v.delta(kVar, A0.j.victor);
                                                    if (aVar21 != null && (function02 = (Function0) aVar21.bravo) != null) {
                                                        return ((Boolean) function02.invoke()).booleanValue();
                                                    }
                                                }
                                            }
                                        } else {
                                            if (bundle != null) {
                                                i15 = -1;
                                                i16 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                                            } else {
                                                i15 = -1;
                                                i16 = -1;
                                            }
                                            if (bundle != null) {
                                                i17 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i15);
                                            } else {
                                                i17 = -1;
                                            }
                                            boolean gold = adVar.gold(sVar, i16, i17, false);
                                            if (gold) {
                                                ad.bronze(adVar, adVar.azure(i19), 0, null, 12);
                                                return gold;
                                            }
                                            return gold;
                                        }
                                    } else {
                                        A0.a aVar22 = (A0.a) A0.v.delta(kVar, A0.j.papa);
                                        if (aVar22 != null && (function0 = (Function0) aVar22.bravo) != null) {
                                            return ((Boolean) function0.invoke()).booleanValue();
                                        }
                                    }
                                } else if (bundle != null) {
                                    int i20 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                                    boolean z19 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                                    if (i5 == 256) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    Integer num2 = adVar.xray;
                                    if (num2 == null || i19 != num2.intValue()) {
                                        adVar.whiskey = -1;
                                        adVar.xray = Integer.valueOf(i19);
                                    }
                                    String uniform = ad.uniform(sVar);
                                    if (uniform != null && uniform.length() != 0) {
                                        String uniform2 = ad.uniform(sVar);
                                        if (uniform2 != null && uniform2.length() != 0) {
                                            if (i20 != 1) {
                                                if (i20 != 2) {
                                                    if (i20 != 4) {
                                                        if (i20 != 8) {
                                                            break;
                                                        } else {
                                                            if (C2910e.silver == null) {
                                                                C2910e.silver = new K3.b((byte) 0, 6);
                                                            }
                                                            C2910e c2910e = C2910e.silver;
                                                            Intrinsics.charlie(c2910e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                                                            c2910e.purple = uniform2;
                                                            bVar = c2910e;
                                                        }
                                                    }
                                                    if (alVar2.charlie(A0.j.alpha) && (india = W.india(kVar)) != null) {
                                                        if (i20 == 4) {
                                                            if (C2906c.teal == null) {
                                                                C2906c.teal = new K3.b((byte) 0, 6);
                                                            }
                                                            C2906c c2906c = C2906c.teal;
                                                            Intrinsics.charlie(c2906c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                                                            c2906c.purple = uniform2;
                                                            c2906c.silver = india;
                                                            c2908d = c2906c;
                                                        } else {
                                                            if (C2908d.white == null) {
                                                                ?? bVar2 = new K3.b((byte) 0, 6);
                                                                new Rect();
                                                                C2908d.white = bVar2;
                                                            }
                                                            C2908d c2908d2 = C2908d.white;
                                                            Intrinsics.charlie(c2908d2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                                                            c2908d2.purple = uniform2;
                                                            c2908d2.silver = india;
                                                            c2908d2.teal = sVar;
                                                            c2908d = c2908d2;
                                                        }
                                                        bVar = c2908d;
                                                    }
                                                } else {
                                                    Locale locale = c2946x.getContext().getResources().getConfiguration().locale;
                                                    if (C2904b.yellow == null) {
                                                        C2904b c2904b = new C2904b(1);
                                                        c2904b.teal = BreakIterator.getWordInstance(locale);
                                                        C2904b.yellow = c2904b;
                                                    }
                                                    C2904b c2904b2 = C2904b.yellow;
                                                    Intrinsics.charlie(c2904b2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                                                    c2904b2.zulu(uniform2);
                                                    bVar = c2904b2;
                                                }
                                            } else {
                                                Locale locale2 = c2946x.getContext().getResources().getConfiguration().locale;
                                                if (C2904b.white == null) {
                                                    C2904b c2904b3 = new C2904b(0);
                                                    c2904b3.teal = BreakIterator.getCharacterInstance(locale2);
                                                    C2904b.white = c2904b3;
                                                }
                                                C2904b c2904b4 = C2904b.white;
                                                Intrinsics.charlie(c2904b4, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                                                c2904b4.zulu(uniform2);
                                                bVar = c2904b4;
                                            }
                                            if (bVar != null) {
                                                int romeo = adVar.romeo(sVar);
                                                if (romeo == -1) {
                                                    if (z2) {
                                                        romeo = 0;
                                                    } else {
                                                        romeo = uniform.length();
                                                    }
                                                }
                                                if (z2) {
                                                    tango = bVar.foxtrot(romeo);
                                                } else {
                                                    tango = bVar.tango(romeo);
                                                }
                                                if (tango != null) {
                                                    int i21 = tango[0];
                                                    int i22 = tango[1];
                                                    if (z19 && !alVar2.charlie(A0.x.alpha) && alVar2.charlie(A0.x.blue)) {
                                                        i12 = adVar.sierra(sVar);
                                                        if (i12 == -1) {
                                                            if (z2) {
                                                                i12 = i21;
                                                            } else {
                                                                i12 = i22;
                                                            }
                                                        }
                                                        if (z2) {
                                                            i13 = i22;
                                                        } else {
                                                            i13 = i21;
                                                        }
                                                    } else {
                                                        if (z2) {
                                                            i12 = i22;
                                                        } else {
                                                            i12 = i21;
                                                        }
                                                        i13 = i12;
                                                    }
                                                    if (z2) {
                                                        i14 = 256;
                                                    } else {
                                                        i14 = 512;
                                                    }
                                                    adVar.azure = new aa(sVar, i14, i20, i21, i22, SystemClock.uptimeMillis());
                                                    adVar.gold(sVar, i12, i13, true);
                                                    return true;
                                                }
                                            }
                                        }
                                        bVar = null;
                                        if (bVar != null) {
                                        }
                                    }
                                }
                            } else if (adVar.november == i4) {
                                adVar.november = RecyclerView.UNDEFINED_DURATION;
                                adVar.papa = null;
                                c2946x.invalidate();
                                ad.bronze(adVar, i4, 65536, null, 12);
                                return true;
                            }
                        } else {
                            AccessibilityManager accessibilityManager = adVar.golf;
                            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i10 = adVar.november) != i4) {
                                if (i10 != Integer.MIN_VALUE) {
                                    i11 = 12;
                                    num = null;
                                    ad.bronze(adVar, i10, 65536, null, 12);
                                } else {
                                    i11 = 12;
                                    num = null;
                                }
                                adVar.november = i4;
                                c2946x.invalidate();
                                ad.bronze(adVar, i4, 32768, num, i11);
                                return true;
                            }
                        }
                    }
                }
                return false;
            default:
                AbstractC3388a abstractC3388a = (AbstractC3388a) c2569b;
                Chip chip = abstractC3388a.india;
                if (i4 != -1) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 64) {
                                if (i5 != 128) {
                                    R6.d dVar = (R6.d) abstractC3388a;
                                    if (i5 == 16) {
                                        Chip chip2 = dVar.quebec;
                                        if (i4 == 0) {
                                            return chip2.performClick();
                                        }
                                        if (i4 == 1) {
                                            chip2.playSoundEffect(0);
                                            View.OnClickListener onClickListener = chip2.f7965a;
                                            if (onClickListener != null) {
                                                onClickListener.onClick(chip2);
                                                z18 = true;
                                            }
                                            if (chip2.f7975l) {
                                                chip2.f7974k.romeo(1, 1);
                                            }
                                        }
                                    }
                                } else if (abstractC3388a.kilo == i4) {
                                    abstractC3388a.kilo = RecyclerView.UNDEFINED_DURATION;
                                    chip.invalidate();
                                    abstractC3388a.romeo(i4, 65536);
                                    return true;
                                }
                            } else {
                                AccessibilityManager accessibilityManager2 = abstractC3388a.hotel;
                                if (accessibilityManager2.isEnabled() && accessibilityManager2.isTouchExplorationEnabled() && (i18 = abstractC3388a.kilo) != i4) {
                                    if (i18 != Integer.MIN_VALUE) {
                                        abstractC3388a.kilo = RecyclerView.UNDEFINED_DURATION;
                                        abstractC3388a.india.invalidate();
                                        abstractC3388a.romeo(i18, 65536);
                                    }
                                    abstractC3388a.kilo = i4;
                                    chip.invalidate();
                                    abstractC3388a.romeo(i4, 32768);
                                    return true;
                                }
                            }
                            return z18;
                        }
                        return abstractC3388a.juliet(i4);
                    }
                    return abstractC3388a.quebec(i4);
                }
                WeakHashMap weakHashMap = s1.au.alpha;
                return chip.performAccessibilityAction(i5, bundle);
        }
    }

    @Override // g.C1718a
    public void quebec(int i4, C2952d c2952d, String str, Bundle bundle) {
        switch (this.red) {
            case 0:
                ((ad) this.silver).juliet(i4, c2952d, str, bundle);
                return;
            default:
                return;
        }
    }

    @Override // g.C1718a
    public final C2952d romeo(int i4) {
        switch (this.red) {
            case 0:
                return emerald(i4);
            default:
                return new C2952d(AccessibilityNodeInfo.obtain(((AbstractC3388a) this.silver).november(i4).alpha));
        }
    }

    @Override // g.C1718a
    public final C2952d victor(int i4) {
        int i5;
        switch (this.red) {
            case 0:
                ad adVar = (ad) this.silver;
                if (i4 != 1) {
                    if (i4 == 2) {
                        return romeo(adVar.november);
                    }
                    throw new IllegalArgumentException(ao.ad.zulu(i4, "Unknown focus type: "));
                }
                int i10 = adVar.oscar;
                if (i10 == Integer.MIN_VALUE) {
                    return null;
                }
                return romeo(i10);
            default:
                AbstractC3388a abstractC3388a = (AbstractC3388a) this.silver;
                if (i4 == 2) {
                    i5 = abstractC3388a.kilo;
                } else {
                    i5 = abstractC3388a.lima;
                }
                if (i5 == Integer.MIN_VALUE) {
                    return null;
                }
                return romeo(i5);
        }
    }
}
