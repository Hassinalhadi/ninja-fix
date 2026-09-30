package L0;

import D0.an;
import D0.s;
import D0.x;
import H0.ae;
import H0.af;
import H0.r;
import H0.v;
import J2.t;
import K1.z;
import O0.o;
import O0.p;
import O0.q;
import a0.AbstractC0362p;
import a0.C0366t;
import a0.ao;
import a0.aq;
import a0.ar;
import a0.au;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.runtime.D0;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Settings;
import s6.AbstractC2636d7;

/* loaded from: classes3.dex */
public final class d implements s {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1700a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final E0.l f1701b;

    /* renamed from: c, reason: collision with root package name */
    public t f1702c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1703d;
    public final int e;
    public final an purple;
    public final List red;
    public final List silver;
    public final H0.j teal;
    public final Q0.d white;
    public final f yellow;

    /* JADX WARN: Code restructure failed: missing block: B:110:0x039a, code lost:
    
        if ((r5.bravo.charlie & 1095216660480L) == 0) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0472, code lost:
    
        if (Q0.p.alpha(r12, s6.AbstractC2636d7.charlie(r8)) == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x009b, code lost:
    
        if (r11 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0875 A[LOOP:6: B:273:0x0873->B:274:0x0875, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v0, types: [L0.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.text.TextPaint, android.graphics.Paint, L0.f] */
    /* JADX WARN: Type inference failed for: r9v37, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(String str, an anVar, List list, List list2, H0.j jVar, Q0.d dVar) {
        Locale locale;
        int i4;
        O0.s sVar;
        int flags;
        int i5;
        int size;
        int i10;
        Object obj;
        boolean alpha;
        v vVar;
        r rVar;
        H0.k kVar;
        af bravo;
        Typeface typeface;
        K0.b bVar;
        String str2;
        p pVar;
        long j5;
        boolean z2;
        long j6;
        long j7;
        boolean z10;
        O0.a aVar;
        boolean z11;
        D0.af afVar;
        ?? r4;
        String str3;
        float textSize;
        an anVar2;
        List list3;
        Q0.d dVar2;
        boolean z12;
        CharSequence charSequence;
        float f5;
        long j10;
        CharSequence charSequence2;
        d dVar3;
        SpannableString spannableString;
        boolean z13;
        D0.t tVar;
        float alpha2;
        int i11;
        q qVar;
        List list4;
        float f10;
        SpannableString spannableString2;
        ArrayList arrayList;
        int size2;
        int i12;
        D0.af afVar2;
        ArrayList arrayList2;
        int i13;
        Q0.d dVar4;
        int size3;
        int i14;
        boolean z14;
        q qVar2;
        int size4;
        int i15;
        int i16;
        int i17;
        int i18;
        Object eVar;
        int i19;
        int i20;
        boolean z15;
        Q0.d dVar5;
        int i21;
        int i22;
        int i23;
        int i24;
        SpannableString spannableString3;
        long j11;
        float charlie;
        float charlie2;
        D0.v vVar2;
        D0.e eVar2;
        K0.a alpha3;
        int collectionSizeOrDefault;
        int i25 = 0;
        ?? obj2 = new Object();
        obj2.alpha = str;
        obj2.purple = anVar;
        obj2.red = list;
        obj2.silver = list2;
        obj2.teal = jVar;
        obj2.white = dVar;
        float alpha4 = dVar.alpha();
        ?? textPaint = new TextPaint(1);
        ((TextPaint) textPaint).density = alpha4;
        textPaint.bravo = O0.l.bravo;
        textPaint.charlie = 3;
        textPaint.delta = ar.delta;
        obj2.yellow = textPaint;
        x xVar = anVar.charlie;
        D8.c cVar = j.alpha;
        D8.c cVar2 = j.alpha;
        D0 d02 = (D0) cVar2.purple;
        if (d02 != null) {
            Intrinsics.checkNotNull(d02);
        } else if (K1.k.delta()) {
            d02 = cVar2.foxtrot();
            cVar2.purple = d02;
            Intrinsics.checkNotNull(d02);
        } else {
            d02 = k.alpha;
        }
        obj2.f1703d = ((Boolean) d02.getValue()).booleanValue();
        D0.t tVar2 = anVar.bravo;
        int i26 = tVar2.bravo;
        D0.af afVar3 = anVar.alpha;
        K0.b bVar2 = afVar3.kilo;
        if (i26 != 4) {
            if (i26 != 5) {
                if (i26 == 1) {
                    i4 = 0;
                } else if (i26 == 2) {
                    i4 = 1;
                } else if (i26 == 3 || i26 == Integer.MIN_VALUE) {
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar2 == null || (locale = bVar2.alpha().alpha) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                } else {
                    throw new IllegalStateException("Invalid TextDirection.");
                }
                obj2.e = i4;
                c cVar3 = new c(i25, obj2);
                sVar = tVar2.india;
                sVar = sVar == null ? O0.s.charlie : sVar;
                if (sVar.bravo) {
                    flags = textPaint.getFlags() | 128;
                } else {
                    flags = textPaint.getFlags() & (-129);
                }
                textPaint.setFlags(flags);
                i5 = sVar.alpha;
                if (i5 == 1) {
                    textPaint.setFlags(textPaint.getFlags() | 64);
                    textPaint.setHinting(0);
                } else if (i5 == 2) {
                    textPaint.getFlags();
                    textPaint.setHinting(1);
                } else if (i5 == 3) {
                    textPaint.getFlags();
                    textPaint.setHinting(0);
                } else {
                    textPaint.getFlags();
                }
                size = list.size();
                i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i10);
                    if (((D0.e) obj).alpha instanceof D0.af) {
                        break;
                    } else {
                        i10++;
                    }
                }
                boolean z16 = obj != null;
                long bravo2 = Q0.p.bravo(afVar3.bravo);
                alpha = Q0.q.alpha(bravo2, 4294967296L);
                long j12 = afVar3.bravo;
                if (alpha) {
                    textPaint.setTextSize(dVar.teal(j12));
                } else if (Q0.q.alpha(bravo2, 8589934592L)) {
                    textPaint.setTextSize(Q0.p.charlie(j12) * textPaint.getTextSize());
                }
                vVar = afVar3.charlie;
                rVar = afVar3.delta;
                kVar = afVar3.foxtrot;
                if (kVar == null || rVar != null || vVar != null) {
                    vVar = vVar == null ? v.yellow : vVar;
                    int i27 = rVar != null ? rVar.alpha : 0;
                    H0.s sVar2 = afVar3.echo;
                    int i28 = sVar2 != null ? sVar2.alpha : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    d dVar6 = (d) cVar3.purple;
                    bravo = ((H0.l) dVar6.teal).bravo(kVar, vVar, i27, i28);
                    if (!(bravo instanceof ae)) {
                        t tVar3 = new t(bravo, dVar6.f1702c);
                        dVar6.f1702c = tVar3;
                        Object obj3 = tVar3.red;
                        Intrinsics.charlie(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj3;
                    } else {
                        Object obj4 = ((ae) bravo).alpha;
                        Intrinsics.charlie(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                        typeface = (Typeface) obj4;
                    }
                    textPaint.setTypeface(typeface);
                }
                bVar = afVar3.kilo;
                if (bVar != null) {
                    K0.b bVar3 = K0.b.red;
                    K0.c cVar4 = K0.d.alpha;
                    if (!Intrinsics.areEqual(bVar, cVar4.delta())) {
                        int i29 = Build.VERSION.SDK_INT;
                        List list5 = bVar.alpha;
                        if (i29 >= 24) {
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bVar, 10);
                            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((K0.a) it.next()).alpha);
                            }
                            Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                            B2.v.quebec(textPaint, s1.af.echo((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                        } else {
                            if (list5.isEmpty()) {
                                alpha3 = cVar4.delta().alpha();
                            } else {
                                alpha3 = bVar.alpha();
                            }
                            textPaint.setTextLocale(alpha3.alpha);
                        }
                    }
                }
                str2 = afVar3.golf;
                if (str2 != null && !Intrinsics.areEqual(str2, "")) {
                    textPaint.setFontFeatureSettings(str2);
                }
                pVar = afVar3.juliet;
                if (pVar != null && !Intrinsics.areEqual(pVar, p.charlie)) {
                    textPaint.setTextScaleX(textPaint.getTextScaleX() * pVar.alpha);
                    textPaint.setTextSkewX(textPaint.getTextSkewX() + pVar.bravo);
                }
                o oVar = afVar3.alpha;
                textPaint.delta(oVar.bravo());
                textPaint.charlie(oVar.echo(), 9205357640488583168L, oVar.alpha());
                textPaint.foxtrot(afVar3.november);
                textPaint.golf(afVar3.mike);
                textPaint.echo(afVar3.papa);
                j5 = afVar3.hotel;
                if (!Q0.q.alpha(Q0.p.bravo(j5), 4294967296L) && Q0.p.charlie(j5) != 0.0f) {
                    float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
                    float teal = dVar.teal(j5);
                    if (textScaleX != 0.0f) {
                        textPaint.setLetterSpacing(teal / textScaleX);
                    }
                } else if (Q0.q.alpha(Q0.p.bravo(j5), 8589934592L)) {
                    textPaint.setLetterSpacing(Q0.p.charlie(j5));
                }
                z2 = (z16 || !Q0.q.alpha(Q0.p.bravo(j5), 4294967296L) || Q0.p.charlie(j5) == 0.0f) ? false : true;
                j6 = C0366t.kilo;
                j7 = afVar3.lima;
                z10 = C0366t.charlie(j7, j6) && !C0366t.charlie(j7, C0366t.juliet);
                aVar = afVar3.india;
                z11 = aVar == null && Float.compare(aVar.alpha, 0.0f) != 0;
                if (!z2 || z10 || z11) {
                    afVar = new D0.af(0L, 0L, (v) null, (r) null, (H0.s) null, (H0.k) null, (String) null, z2 ? j5 : Q0.p.charlie, z11 ? aVar : null, (p) null, (K0.b) null, z10 ? j7 : j6, (O0.l) null, (ar) null, 63103);
                } else {
                    afVar = null;
                }
                if (afVar != null) {
                    int size5 = obj2.red.size() + 1;
                    r4 = new ArrayList(size5);
                    for (int i30 = 0; i30 < size5; i30++) {
                        if (i30 == 0) {
                            eVar2 = new D0.e(afVar, 0, obj2.alpha.length());
                        } else {
                            eVar2 = (D0.e) obj2.red.get(i30 - 1);
                        }
                        r4.add(eVar2);
                    }
                } else {
                    r4 = obj2.red;
                }
                str3 = obj2.alpha;
                textSize = obj2.yellow.getTextSize();
                anVar2 = obj2.purple;
                list3 = obj2.silver;
                dVar2 = obj2.white;
                z12 = obj2.f1703d;
                a aVar2 = b.alpha;
                if (z12 || !K1.k.delta()) {
                    charSequence = str3;
                } else {
                    x xVar2 = anVar2.charlie;
                    if (xVar2 != null) {
                        D0.v vVar3 = xVar2.bravo;
                    }
                    CharSequence golf = K1.k.alpha().golf(0, str3.length(), 0, str3);
                    Intrinsics.checkNotNull(golf);
                    charSequence = golf;
                }
                if (!r4.isEmpty() && list3.isEmpty() && Intrinsics.areEqual(anVar2.bravo.delta, q.charlie)) {
                    f5 = 0.0f;
                    j10 = 0;
                    dVar3 = obj2;
                    charSequence2 = charSequence;
                } else {
                    f5 = 0.0f;
                    j10 = 0;
                }
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                if (Intrinsics.areEqual(anVar2.alpha.mike, O0.l.charlie)) {
                    spannableString.setSpan(b.alpha, 0, str3.length(), 33);
                }
                x xVar3 = anVar2.charlie;
                z13 = (xVar3 != null || (vVar2 = xVar3.bravo) == null) ? false : vVar2.alpha;
                tVar = anVar2.bravo;
                if (!z13 && tVar.foxtrot == null) {
                    float alpha5 = M0.a.alpha(tVar.charlie, textSize, dVar2);
                    if (!Float.isNaN(alpha5)) {
                        spannableString.setSpan(new G0.g(alpha5), 0, spannableString.length(), 33);
                    }
                } else {
                    O0.i iVar = tVar.foxtrot;
                    iVar = iVar == null ? O0.i.charlie : iVar;
                    alpha2 = M0.a.alpha(tVar.charlie, textSize, dVar2);
                    if (!Float.isNaN(alpha2)) {
                        int length = (spannableString.length() == 0 || StringsKt.green(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                        int i31 = iVar.bravo;
                        i11 = 0;
                        spannableString.setSpan(new G0.h(alpha2, length, (i31 & 1) > 0, (i31 & 16) > 0, iVar.alpha, false), 0, spannableString.length(), 33);
                        qVar = tVar.delta;
                        if (qVar == null) {
                            long charlie3 = AbstractC2636d7.charlie(i11);
                            list4 = r4;
                            long j13 = qVar.alpha;
                            boolean alpha6 = Q0.p.alpha(j13, charlie3);
                            float f11 = f5;
                            long j14 = qVar.bravo;
                            f10 = f11;
                            if (alpha6) {
                                spannableString2 = spannableString;
                            }
                            spannableString2 = spannableString;
                            if ((j13 & 1095216660480L) != j10) {
                                spannableString2 = spannableString;
                                if ((j14 & 1095216660480L) != j10) {
                                    long bravo3 = Q0.p.bravo(j13);
                                    if (Q0.q.alpha(bravo3, 4294967296L)) {
                                        charlie = dVar2.teal(j13);
                                        spannableString3 = spannableString;
                                        j11 = 8589934592L;
                                    } else {
                                        spannableString3 = spannableString;
                                        j11 = 8589934592L;
                                        charlie = Q0.q.alpha(bravo3, 8589934592L) ? Q0.p.charlie(j13) * textSize : f10;
                                    }
                                    long bravo4 = Q0.p.bravo(j14);
                                    if (Q0.q.alpha(bravo4, 4294967296L)) {
                                        charlie2 = dVar2.teal(j14);
                                    } else {
                                        charlie2 = Q0.q.alpha(bravo4, j11) ? Q0.p.charlie(j14) * textSize : f10;
                                    }
                                    SpannableString spannableString4 = spannableString3;
                                    spannableString4.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(charlie), (int) Math.ceil(charlie2)), 0, spannableString3.length(), 33);
                                    spannableString2 = spannableString4;
                                }
                            }
                        } else {
                            list4 = r4;
                            f10 = f5;
                            spannableString2 = spannableString;
                        }
                        arrayList = new ArrayList(list4.size());
                        size2 = list4.size();
                        i12 = 0;
                        while (i12 < size2) {
                            List list6 = list4;
                            D0.e eVar3 = (D0.e) list6.get(i12);
                            Object obj5 = eVar3.alpha;
                            if (obj5 instanceof D0.af) {
                                D0.af afVar4 = (D0.af) obj5;
                                if (afVar4.foxtrot != null || afVar4.delta != null || afVar4.charlie != null || ((D0.af) obj5).echo != null) {
                                    arrayList.add(eVar3);
                                }
                            }
                            i12++;
                            list4 = list6;
                        }
                        List list7 = list4;
                        D0.af afVar5 = anVar2.alpha;
                        H0.k kVar2 = afVar5.foxtrot;
                        D0.af afVar6 = (kVar2 != null && afVar5.delta == null && afVar5.charlie == null && afVar5.echo == null) ? null : new D0.af(0L, 0L, afVar5.charlie, afVar5.delta, afVar5.echo, kVar2, (String) null, 0L, (O0.a) null, (p) null, (K0.b) null, 0L, (O0.l) null, (ar) null, 65475);
                        Ec.af afVar7 = new Ec.af(2, spannableString2, cVar3);
                        if (arrayList.size() > 1) {
                            if (!arrayList.isEmpty()) {
                                D0.af afVar8 = (D0.af) ((D0.e) arrayList.get(0)).alpha;
                                afVar7.invoke(afVar6 != null ? afVar6.charlie(afVar8) : afVar8, Integer.valueOf(((D0.e) arrayList.get(0)).bravo), Integer.valueOf(((D0.e) arrayList.get(0)).charlie));
                            }
                        } else {
                            int size6 = arrayList.size();
                            int i32 = size6 * 2;
                            int[] iArr = new int[i32];
                            int size7 = arrayList.size();
                            for (int i33 = 0; i33 < size7; i33++) {
                                D0.e eVar4 = (D0.e) arrayList.get(i33);
                                iArr[i33] = eVar4.bravo;
                                iArr[i33 + size6] = eVar4.charlie;
                            }
                            if (i32 > 1) {
                                Arrays.sort(iArr);
                            }
                            if (i32 != 0) {
                                int i34 = iArr[0];
                                int i35 = 0;
                                while (i35 < i32) {
                                    int i36 = iArr[i35];
                                    if (i36 == i34) {
                                        arrayList2 = arrayList;
                                        afVar2 = afVar6;
                                        i13 = i32;
                                        dVar4 = dVar2;
                                    } else {
                                        int size8 = arrayList.size();
                                        afVar2 = afVar6;
                                        int i37 = 0;
                                        while (i37 < size8) {
                                            ArrayList arrayList4 = arrayList;
                                            D0.e eVar5 = (D0.e) arrayList.get(i37);
                                            int i38 = i32;
                                            int i39 = eVar5.bravo;
                                            Q0.d dVar7 = dVar2;
                                            int i40 = eVar5.charlie;
                                            if (i39 != i40 && D0.h.bravo(i34, i36, i39, i40)) {
                                                D0.af afVar9 = (D0.af) eVar5.alpha;
                                                afVar6 = afVar6 != null ? afVar6.charlie(afVar9) : afVar9;
                                            }
                                            i37++;
                                            i32 = i38;
                                            arrayList = arrayList4;
                                            dVar2 = dVar7;
                                        }
                                        arrayList2 = arrayList;
                                        i13 = i32;
                                        dVar4 = dVar2;
                                        if (afVar6 != null) {
                                            afVar7.invoke(afVar6, Integer.valueOf(i34), Integer.valueOf(i36));
                                        }
                                        i34 = i36;
                                    }
                                    i35++;
                                    afVar6 = afVar2;
                                    i32 = i13;
                                    arrayList = arrayList2;
                                    dVar2 = dVar4;
                                }
                            } else {
                                throw new NoSuchElementException("Array is empty.");
                            }
                        }
                        Q0.d dVar8 = dVar2;
                        i14 = 0;
                        z14 = false;
                        for (size3 = list7.size(); i14 < size3; size3 = i19) {
                            D0.e eVar6 = (D0.e) list7.get(i14);
                            if (!(eVar6.alpha instanceof D0.af) || (i21 = eVar6.bravo) < 0 || i21 >= spannableString2.length() || (i22 = eVar6.charlie) <= i21 || i22 > spannableString2.length()) {
                                i19 = size3;
                                i20 = i14;
                                z15 = z14;
                                dVar5 = dVar8;
                            } else {
                                D0.af afVar10 = (D0.af) eVar6.alpha;
                                O0.a aVar3 = afVar10.india;
                                if (aVar3 != null) {
                                    spannableString2.setSpan(new G0.a(aVar3.alpha, 0), i21, i22, 33);
                                }
                                o oVar2 = afVar10.alpha;
                                M0.a.bravo(spannableString2, oVar2.bravo(), i21, i22);
                                AbstractC0362p echo = oVar2.echo();
                                float alpha7 = oVar2.alpha();
                                if (echo != null) {
                                    if (echo instanceof au) {
                                        M0.a.bravo(spannableString2, ((au) echo).alpha, i21, i22);
                                    } else {
                                        spannableString2.setSpan(new N0.b((aq) echo, alpha7), i21, i22, 33);
                                    }
                                }
                                O0.l lVar = afVar10.mike;
                                if (lVar != null) {
                                    int i41 = lVar.alpha;
                                    spannableString2.setSpan(new G0.k((i41 | 1) == i41, (i41 | 2) == i41), i21, i22, 33);
                                }
                                Q0.d dVar9 = dVar8;
                                M0.a.charlie(spannableString2, afVar10.bravo, dVar9, i21, i22);
                                dVar5 = dVar9;
                                String str4 = afVar10.golf;
                                if (str4 != null) {
                                    i23 = 33;
                                    spannableString2.setSpan(new G0.b(0, str4), i21, i22, 33);
                                } else {
                                    i23 = 33;
                                }
                                p pVar2 = afVar10.juliet;
                                if (pVar2 != null) {
                                    spannableString2.setSpan(new ScaleXSpan(pVar2.alpha), i21, i22, i23);
                                    spannableString2.setSpan(new G0.a(pVar2.bravo, 1), i21, i22, i23);
                                }
                                M0.a.delta(spannableString2, afVar10.kilo, i21, i22);
                                z15 = z14;
                                long j15 = afVar10.lima;
                                if (j15 != 16) {
                                    spannableString2.setSpan(new BackgroundColorSpan(ao.beige(j15)), i21, i22, 33);
                                }
                                ar arVar = afVar10.november;
                                if (arVar != null) {
                                    int beige = ao.beige(arVar.alpha);
                                    i19 = size3;
                                    i20 = i14;
                                    long j16 = arVar.bravo;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j16 & 4294967295L));
                                    float f12 = arVar.charlie;
                                    G0.j jVar2 = new G0.j(intBitsToFloat, intBitsToFloat2, f12 == f10 ? Float.MIN_VALUE : f12, beige);
                                    i24 = 33;
                                    spannableString2.setSpan(jVar2, i21, i22, 33);
                                } else {
                                    i19 = size3;
                                    i20 = i14;
                                    i24 = 33;
                                }
                                c0.e eVar7 = afVar10.papa;
                                if (eVar7 != null) {
                                    spannableString2.setSpan(new N0.a(eVar7), i21, i22, i24);
                                }
                                long j17 = afVar10.hotel;
                                if (Q0.q.alpha(Q0.p.bravo(j17), 4294967296L) || Q0.q.alpha(Q0.p.bravo(j17), 8589934592L)) {
                                    z14 = true;
                                    i14 = i20 + 1;
                                    dVar8 = dVar5;
                                }
                            }
                            z14 = z15;
                            i14 = i20 + 1;
                            dVar8 = dVar5;
                        }
                        Q0.d dVar10 = dVar8;
                        if (z14) {
                            int i42 = 0;
                            for (int size9 = list7.size(); i42 < size9; size9 = i16) {
                                D0.e eVar8 = (D0.e) list7.get(i42);
                                D0.b bVar4 = (D0.b) eVar8.alpha;
                                if (!(bVar4 instanceof D0.af) || (i17 = eVar8.bravo) < 0 || i17 >= spannableString2.length() || (i18 = eVar8.charlie) <= i17 || i18 > spannableString2.length()) {
                                    i16 = size9;
                                } else {
                                    long j18 = ((D0.af) bVar4).hotel;
                                    long bravo5 = Q0.p.bravo(j18);
                                    i16 = size9;
                                    if (Q0.q.alpha(bravo5, 4294967296L)) {
                                        eVar = new G0.f(dVar10.teal(j18));
                                    } else {
                                        eVar = Q0.q.alpha(bravo5, 8589934592L) ? new G0.e(Q0.p.charlie(j18)) : null;
                                    }
                                    if (eVar != null) {
                                        spannableString2.setSpan(eVar, i17, i18, 33);
                                    }
                                }
                                i42++;
                            }
                        }
                        qVar2 = tVar.delta;
                        if (qVar2 != null) {
                            long j19 = qVar2.alpha;
                            long bravo6 = Q0.p.bravo(j19);
                            if (Q0.q.alpha(bravo6, 4294967296L)) {
                                dVar10.teal(j19);
                            } else if (Q0.q.alpha(bravo6, 8589934592L)) {
                                Q0.p.charlie(j19);
                            }
                        }
                        size4 = list7.size();
                        for (i15 = 0; i15 < size4; i15++) {
                            Object obj6 = ((D0.e) list7.get(i15)).alpha;
                        }
                        if (list3.size() <= 0) {
                            D0.e eVar9 = (D0.e) list3.get(0);
                            if (eVar9.alpha == null) {
                                for (Object obj7 : spannableString2.getSpans(eVar9.bravo, eVar9.charlie, z.class)) {
                                    spannableString2.removeSpan((z) obj7);
                                }
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                        dVar3 = this;
                        charSequence2 = spannableString2;
                        dVar3.f1700a = charSequence2;
                        dVar3.f1701b = new E0.l(charSequence2, dVar3.yellow, dVar3.e);
                        return;
                    }
                }
                i11 = 0;
                qVar = tVar.delta;
                if (qVar == null) {
                }
                arrayList = new ArrayList(list4.size());
                size2 = list4.size();
                i12 = 0;
                while (i12 < size2) {
                }
                List list72 = list4;
                D0.af afVar52 = anVar2.alpha;
                H0.k kVar22 = afVar52.foxtrot;
                if (kVar22 != null) {
                }
                Ec.af afVar72 = new Ec.af(2, spannableString2, cVar3);
                if (arrayList.size() > 1) {
                }
                Q0.d dVar82 = dVar2;
                i14 = 0;
                z14 = false;
                while (i14 < size3) {
                }
                Q0.d dVar102 = dVar82;
                if (z14) {
                }
                qVar2 = tVar.delta;
                if (qVar2 != null) {
                }
                size4 = list72.size();
                while (i15 < size4) {
                }
                if (list3.size() <= 0) {
                }
            }
            i4 = 3;
            obj2.e = i4;
            c cVar32 = new c(i25, obj2);
            sVar = tVar2.india;
            if (sVar == null) {
            }
            if (sVar.bravo) {
            }
            textPaint.setFlags(flags);
            i5 = sVar.alpha;
            if (i5 == 1) {
            }
            size = list.size();
            i10 = 0;
            while (true) {
                if (i10 >= size) {
                }
                i10++;
            }
            if (obj != null) {
            }
            long bravo22 = Q0.p.bravo(afVar3.bravo);
            alpha = Q0.q.alpha(bravo22, 4294967296L);
            long j122 = afVar3.bravo;
            if (alpha) {
            }
            vVar = afVar3.charlie;
            rVar = afVar3.delta;
            kVar = afVar3.foxtrot;
            if (kVar == null) {
            }
            if (vVar == null) {
            }
            if (rVar != null) {
            }
            H0.s sVar22 = afVar3.echo;
            if (sVar22 != null) {
            }
            d dVar62 = (d) cVar32.purple;
            bravo = ((H0.l) dVar62.teal).bravo(kVar, vVar, i27, i28);
            if (!(bravo instanceof ae)) {
            }
            textPaint.setTypeface(typeface);
            bVar = afVar3.kilo;
            if (bVar != null) {
            }
            str2 = afVar3.golf;
            if (str2 != null) {
                textPaint.setFontFeatureSettings(str2);
            }
            pVar = afVar3.juliet;
            if (pVar != null) {
                textPaint.setTextScaleX(textPaint.getTextScaleX() * pVar.alpha);
                textPaint.setTextSkewX(textPaint.getTextSkewX() + pVar.bravo);
            }
            o oVar3 = afVar3.alpha;
            textPaint.delta(oVar3.bravo());
            textPaint.charlie(oVar3.echo(), 9205357640488583168L, oVar3.alpha());
            textPaint.foxtrot(afVar3.november);
            textPaint.golf(afVar3.mike);
            textPaint.echo(afVar3.papa);
            j5 = afVar3.hotel;
            if (!Q0.q.alpha(Q0.p.bravo(j5), 4294967296L)) {
            }
            if (Q0.q.alpha(Q0.p.bravo(j5), 8589934592L)) {
            }
            if (z16) {
            }
            j6 = C0366t.kilo;
            j7 = afVar3.lima;
            if (C0366t.charlie(j7, j6)) {
            }
            aVar = afVar3.india;
            if (aVar == null) {
            }
            if (z2) {
            }
            afVar = new D0.af(0L, 0L, (v) null, (r) null, (H0.s) null, (H0.k) null, (String) null, z2 ? j5 : Q0.p.charlie, z11 ? aVar : null, (p) null, (K0.b) null, z10 ? j7 : j6, (O0.l) null, (ar) null, 63103);
            if (afVar != null) {
            }
            str3 = obj2.alpha;
            textSize = obj2.yellow.getTextSize();
            anVar2 = obj2.purple;
            list3 = obj2.silver;
            dVar2 = obj2.white;
            z12 = obj2.f1703d;
            a aVar22 = b.alpha;
            if (z12) {
            }
            charSequence = str3;
            if (!r4.isEmpty()) {
            }
            f5 = 0.0f;
            j10 = 0;
            if (charSequence instanceof Spannable) {
            }
            if (Intrinsics.areEqual(anVar2.alpha.mike, O0.l.charlie)) {
            }
            x xVar32 = anVar2.charlie;
            if (xVar32 != null) {
            }
            tVar = anVar2.bravo;
            if (!z13) {
            }
            O0.i iVar2 = tVar.foxtrot;
            if (iVar2 == null) {
            }
            alpha2 = M0.a.alpha(tVar.charlie, textSize, dVar2);
            if (!Float.isNaN(alpha2)) {
            }
            i11 = 0;
            qVar = tVar.delta;
            if (qVar == null) {
            }
            arrayList = new ArrayList(list4.size());
            size2 = list4.size();
            i12 = 0;
            while (i12 < size2) {
            }
            List list722 = list4;
            D0.af afVar522 = anVar2.alpha;
            H0.k kVar222 = afVar522.foxtrot;
            if (kVar222 != null) {
            }
            Ec.af afVar722 = new Ec.af(2, spannableString2, cVar32);
            if (arrayList.size() > 1) {
            }
            Q0.d dVar822 = dVar2;
            i14 = 0;
            z14 = false;
            while (i14 < size3) {
            }
            Q0.d dVar1022 = dVar822;
            if (z14) {
            }
            qVar2 = tVar.delta;
            if (qVar2 != null) {
            }
            size4 = list722.size();
            while (i15 < size4) {
            }
            if (list3.size() <= 0) {
            }
        }
        i4 = 2;
        obj2.e = i4;
        c cVar322 = new c(i25, obj2);
        sVar = tVar2.india;
        if (sVar == null) {
        }
        if (sVar.bravo) {
        }
        textPaint.setFlags(flags);
        i5 = sVar.alpha;
        if (i5 == 1) {
        }
        size = list.size();
        i10 = 0;
        while (true) {
            if (i10 >= size) {
            }
            i10++;
        }
        if (obj != null) {
        }
        long bravo222 = Q0.p.bravo(afVar3.bravo);
        alpha = Q0.q.alpha(bravo222, 4294967296L);
        long j1222 = afVar3.bravo;
        if (alpha) {
        }
        vVar = afVar3.charlie;
        rVar = afVar3.delta;
        kVar = afVar3.foxtrot;
        if (kVar == null) {
        }
        if (vVar == null) {
        }
        if (rVar != null) {
        }
        H0.s sVar222 = afVar3.echo;
        if (sVar222 != null) {
        }
        d dVar622 = (d) cVar322.purple;
        bravo = ((H0.l) dVar622.teal).bravo(kVar, vVar, i27, i28);
        if (!(bravo instanceof ae)) {
        }
        textPaint.setTypeface(typeface);
        bVar = afVar3.kilo;
        if (bVar != null) {
        }
        str2 = afVar3.golf;
        if (str2 != null) {
        }
        pVar = afVar3.juliet;
        if (pVar != null) {
        }
        o oVar32 = afVar3.alpha;
        textPaint.delta(oVar32.bravo());
        textPaint.charlie(oVar32.echo(), 9205357640488583168L, oVar32.alpha());
        textPaint.foxtrot(afVar3.november);
        textPaint.golf(afVar3.mike);
        textPaint.echo(afVar3.papa);
        j5 = afVar3.hotel;
        if (!Q0.q.alpha(Q0.p.bravo(j5), 4294967296L)) {
        }
        if (Q0.q.alpha(Q0.p.bravo(j5), 8589934592L)) {
        }
        if (z16) {
        }
        j6 = C0366t.kilo;
        j7 = afVar3.lima;
        if (C0366t.charlie(j7, j6)) {
        }
        aVar = afVar3.india;
        if (aVar == null) {
        }
        if (z2) {
        }
        afVar = new D0.af(0L, 0L, (v) null, (r) null, (H0.s) null, (H0.k) null, (String) null, z2 ? j5 : Q0.p.charlie, z11 ? aVar : null, (p) null, (K0.b) null, z10 ? j7 : j6, (O0.l) null, (ar) null, 63103);
        if (afVar != null) {
        }
        str3 = obj2.alpha;
        textSize = obj2.yellow.getTextSize();
        anVar2 = obj2.purple;
        list3 = obj2.silver;
        dVar2 = obj2.white;
        z12 = obj2.f1703d;
        a aVar222 = b.alpha;
        if (z12) {
        }
        charSequence = str3;
        if (!r4.isEmpty()) {
        }
        f5 = 0.0f;
        j10 = 0;
        if (charSequence instanceof Spannable) {
        }
        if (Intrinsics.areEqual(anVar2.alpha.mike, O0.l.charlie)) {
        }
        x xVar322 = anVar2.charlie;
        if (xVar322 != null) {
        }
        tVar = anVar2.bravo;
        if (!z13) {
        }
        O0.i iVar22 = tVar.foxtrot;
        if (iVar22 == null) {
        }
        alpha2 = M0.a.alpha(tVar.charlie, textSize, dVar2);
        if (!Float.isNaN(alpha2)) {
        }
        i11 = 0;
        qVar = tVar.delta;
        if (qVar == null) {
        }
        arrayList = new ArrayList(list4.size());
        size2 = list4.size();
        i12 = 0;
        while (i12 < size2) {
        }
        List list7222 = list4;
        D0.af afVar5222 = anVar2.alpha;
        H0.k kVar2222 = afVar5222.foxtrot;
        if (kVar2222 != null) {
        }
        Ec.af afVar7222 = new Ec.af(2, spannableString2, cVar322);
        if (arrayList.size() > 1) {
        }
        Q0.d dVar8222 = dVar2;
        i14 = 0;
        z14 = false;
        while (i14 < size3) {
        }
        Q0.d dVar10222 = dVar8222;
        if (z14) {
        }
        qVar2 = tVar.delta;
        if (qVar2 != null) {
        }
        size4 = list7222.size();
        while (i15 < size4) {
        }
        if (list3.size() <= 0) {
        }
    }

    @Override // D0.s
    public final boolean delta() {
        boolean z2;
        t tVar = this.f1702c;
        if (tVar != null) {
            z2 = tVar.sierra();
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!this.f1703d) {
                x xVar = this.purple.charlie;
                D8.c cVar = j.alpha;
                D8.c cVar2 = j.alpha;
                D0 d02 = (D0) cVar2.purple;
                if (d02 != null) {
                    Intrinsics.checkNotNull(d02);
                } else if (K1.k.delta()) {
                    d02 = cVar2.foxtrot();
                    cVar2.purple = d02;
                    Intrinsics.checkNotNull(d02);
                } else {
                    d02 = k.alpha;
                }
                if (((Boolean) d02.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // D0.s
    public final float november() {
        float f5;
        E0.l lVar = this.f1701b;
        if (!Float.isNaN(lVar.echo)) {
            return lVar.echo;
        }
        TextPaint textPaint = lVar.bravo;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = lVar.alpha;
        lineInstance.setText(new E0.g(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new E0.k(0));
        int i4 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i4), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < next - i4) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i4), Integer.valueOf(next)));
                }
            }
            i4 = next;
        }
        if (priorityQueue.isEmpty()) {
            f5 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                float desiredWidth = Layout.getDesiredWidth(lVar.bravo(), ((Number) pair2.first).intValue(), ((Number) pair2.second).intValue(), textPaint);
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(lVar.bravo(), ((Number) pair3.first).intValue(), ((Number) pair3.second).intValue(), textPaint));
                }
                f5 = desiredWidth;
            } else {
                throw new NoSuchElementException();
            }
        }
        lVar.echo = f5;
        return f5;
    }

    @Override // D0.s
    public final float romeo() {
        return this.f1701b.charlie();
    }
}
