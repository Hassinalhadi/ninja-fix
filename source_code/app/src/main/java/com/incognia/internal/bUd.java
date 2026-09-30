package com.incognia.internal;

import com.clevertap.android.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import pf.AbstractC2360j;

/* loaded from: classes2.dex */
public final class bUd extends Lambda implements Function1 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f10179J;
    public final /* synthetic */ ArrayList PqK;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f10180W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lrk f10181b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ W2t f10182f9;
    public final /* synthetic */ Ref.ObjectRef gmP;
    public final /* synthetic */ kotlin.jvm.internal.q sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bUd(lrk lrkVar, StringBuilder sb2, W2t w2t, kotlin.jvm.internal.q qVar, Ref.ObjectRef objectRef, StringBuilder sb3, ArrayList arrayList) {
        super(1);
        this.f10181b = lrkVar;
        this.f10180W = sb2;
        this.f10182f9 = w2t;
        this.sVU = qVar;
        this.gmP = objectRef;
        this.f10179J = sb3;
        this.PqK = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<String> groupValues;
        zJO zjo;
        List<String> groupValues2;
        String str;
        int collectionSizeOrDefault;
        String str2 = (String) obj;
        if (this.f10181b.f10861W) {
            StringBuilder sb2 = this.f10180W;
            sb2.append(str2);
            sb2.append('\n');
        }
        boolean z2 = false;
        String str3 = null;
        Long l10 = null;
        r8 = null;
        r8 = null;
        Long l11 = null;
        str3 = null;
        if (this.f10181b.f10863f9.alpha(str2)) {
            MatchResult find$default = Regex.find$default(this.f10181b.f10863f9, str2, 0, 2, null);
            if (find$default != null) {
                W2t w2t = this.f10182f9;
                MatchResult.Destructured destructured = find$default.getDestructured();
                String str4 = destructured.getMatch().getGroupValues().get(1);
                String str5 = destructured.getMatch().getGroupValues().get(2);
                String str6 = destructured.getMatch().getGroupValues().get(3);
                w2t.f9826b = Long.valueOf(Long.parseLong(str4));
                TimeZone timeZone = TimeZone.getTimeZone("GMT" + str6);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(lrk.f10858n9, Locale.US);
                simpleDateFormat.setTimeZone(timeZone);
                Date parse = simpleDateFormat.parse(StringsKt.b(str5).toString());
                if (parse != null) {
                    l10 = Long.valueOf(parse.getTime());
                }
                w2t.f9825W = l10;
                w2t.f9827f9 = timeZone.getID();
            }
        } else {
            String str7 = lrk.f10856Y;
            if (kotlin.text.r.quebec(str2, str7, false)) {
                this.f10182f9.sVU = StringsKt.b(StringsKt.lime(str2, str7)).toString();
            } else {
                String str8 = lrk.f10854P;
                if (kotlin.text.r.quebec(str2, str8, false)) {
                    this.f10182f9.gmP = StringsKt.c(StringsKt.plum(str2, str8, str2), ' ', '\'');
                } else {
                    String str9 = lrk.f10853L;
                    if (kotlin.text.r.quebec(str2, str9, false)) {
                        this.f10182f9.f9822J = StringsKt.c(StringsKt.plum(str2, str9, str2), ' ', '\'');
                    } else {
                        String str10 = lrk.FL;
                        if (kotlin.text.r.quebec(str2, str10, false)) {
                            this.f10182f9.PqK = StringsKt.b(StringsKt.plum(str2, str10, str2)).toString();
                        } else {
                            String str11 = lrk.f10857ar;
                            try {
                                if (StringsKt.beige(str2, str11, false)) {
                                    List maroon = StringsKt.maroon((String) StringsKt.maroon(StringsKt.b((String) StringsKt.maroon((CharSequence) StringsKt.maroon(str2, new String[]{str11}, 6).get(1), new String[]{";"}, 6).get(0)).toString(), new String[]{Constants.SEPARATOR_COMMA}, 6).get(1), new String[]{"/"}, 6);
                                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(maroon, 10);
                                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                    Iterator it = maroon.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Long.valueOf(Long.parseLong(StringsKt.magenta(StringsKt.b((String) it.next()).toString(), lrk.a2F))));
                                    }
                                    if (!arrayList.isEmpty()) {
                                        this.f10182f9.f9824V = Long.valueOf(((Number) arrayList.get(1)).longValue() - ((Number) arrayList.get(0)).longValue());
                                    }
                                } else if (this.f10181b.f10860V.echo(str2)) {
                                    this.f10182f9.olU = Long.valueOf(Long.parseLong(StringsKt.magenta(StringsKt.b(StringsKt.plum(str2, lrk.f10852H, str2)).toString(), lrk.a2F)));
                                } else {
                                    String str12 = lrk.H02;
                                    if (kotlin.text.r.quebec(str2, str12, false)) {
                                        this.f10182f9.f9823R = Long.valueOf(Long.parseLong(StringsKt.magenta(StringsKt.b(StringsKt.plum(str2, str12, str2)).toString(), lrk.a2F)));
                                    } else if (this.f10181b.sVU.alpha(str2)) {
                                        MatchResult find$default2 = Regex.find$default(this.f10181b.sVU, str2, 0, 2, null);
                                        if (find$default2 != null && (groupValues2 = find$default2.getGroupValues()) != null && (str = groupValues2.get(1)) != null) {
                                            l11 = kotlin.text.r.uniform(str);
                                        }
                                        this.f10182f9.IB = l11;
                                    } else if (kotlin.text.r.quebec(str2, "\"", false)) {
                                        if (this.sVU.alpha) {
                                            zu0 zu0Var = (zu0) this.gmP.alpha;
                                            String obj2 = StringsKt.d(this.f10179J.toString()).toString();
                                            zu0Var.getClass();
                                            ECc eCc = new ECc(zu0Var.f11954b, zu0Var.f11953W, zu0Var.f11955f9, zu0Var.sVU, zu0Var.gmP, obj2, zu0Var.f11951J, zu0Var.PqK, zu0Var.f11952V);
                                            if (eCc.b()) {
                                                this.PqK.add(eCc);
                                            }
                                            StringBuilder sb3 = this.f10179J;
                                            Intrinsics.echo(sb3, "<this>");
                                            sb3.setLength(0);
                                            this.gmP.alpha = new zu0();
                                        }
                                        MatchResult find$default3 = Regex.find$default(this.f10181b.gmP, str2, 0, 2, null);
                                        if (find$default3 != null) {
                                            Ref.ObjectRef objectRef = this.gmP;
                                            kotlin.jvm.internal.q qVar = this.sVU;
                                            MatchResult.Destructured destructured2 = find$default3.getDestructured();
                                            String str13 = destructured2.getMatch().getGroupValues().get(1);
                                            String str14 = destructured2.getMatch().getGroupValues().get(2);
                                            String str15 = destructured2.getMatch().getGroupValues().get(3);
                                            String str16 = destructured2.getMatch().getGroupValues().get(4);
                                            String str17 = destructured2.getMatch().getGroupValues().get(5);
                                            zu0 zu0Var2 = (zu0) objectRef.alpha;
                                            zu0Var2.f11954b = str13;
                                            zu0Var2.f11953W = Integer.valueOf(Integer.parseInt(str15));
                                            if (str14.length() > 0) {
                                                z2 = true;
                                            }
                                            zu0Var2.f11955f9 = Boolean.valueOf(z2);
                                            zu0Var2.sVU = Long.valueOf(Long.parseLong(str16));
                                            Lazy lazy = zJO.f11901W;
                                            if (StringsKt.beige(str13, "ibgnd-", true)) {
                                                zjo = Kj1.f9019f9;
                                            } else if (StringsKt.beige(str13, "main", true)) {
                                                zjo = Q9.f9486f9;
                                            } else {
                                                zjo = Cz7.f8505f9;
                                            }
                                            zu0Var2.f11952V = zjo;
                                            Lazy lazy2 = RuF.f9565W;
                                            zu0Var2.f11951J = NPn.b(str17);
                                            qVar.alpha = true;
                                        }
                                    } else if (this.sVU.alpha && this.f10181b.f10859J.alpha(str2)) {
                                        MatchResult find$default4 = Regex.find$default(this.f10181b.f10859J, str2, 0, 2, null);
                                        zu0 zu0Var3 = (zu0) this.gmP.alpha;
                                        if (find$default4 != null && (groupValues = find$default4.getGroupValues()) != null) {
                                            str3 = groupValues.get(1);
                                        }
                                        zu0Var3.gmP = str3;
                                    } else if (this.sVU.alpha && StringsKt.beige(str2, lrk.jgi, false)) {
                                        ((zu0) this.gmP.alpha).PqK = AbstractC2360j.quebec(AbstractC2360j.oscar(Regex.bravo(this.f10181b.PqK, str2), zJn.f11903b));
                                    } else if (this.sVU.alpha && (kotlin.text.r.quebec(str2, "  at ", false) || kotlin.text.r.quebec(str2, "  - ", false))) {
                                        StringBuilder sb4 = this.f10179J;
                                        sb4.append(StringsKt.b(str2).toString());
                                        sb4.append('\n');
                                    } else if (this.sVU.alpha && StringsKt.gray(str2)) {
                                        zu0 zu0Var4 = (zu0) this.gmP.alpha;
                                        String obj3 = StringsKt.d(this.f10179J.toString()).toString();
                                        zu0Var4.getClass();
                                        ECc eCc2 = new ECc(zu0Var4.f11954b, zu0Var4.f11953W, zu0Var4.f11955f9, zu0Var4.sVU, zu0Var4.gmP, obj3, zu0Var4.f11951J, zu0Var4.PqK, zu0Var4.f11952V);
                                        if (eCc2.b()) {
                                            this.PqK.add(eCc2);
                                        }
                                        StringBuilder sb5 = this.f10179J;
                                        Intrinsics.echo(sb5, "<this>");
                                        sb5.setLength(0);
                                        this.gmP.alpha = new zu0();
                                        this.sVU.alpha = false;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
