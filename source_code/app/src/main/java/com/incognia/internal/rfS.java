package com.incognia.internal;

import android.util.Log;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.n;

/* loaded from: classes2.dex */
public abstract class rfS {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f11243b = {"finance", "food", "mobility"};

    public static boolean b(String str) {
        boolean z2;
        String str2;
        ow owVar = (ow) DDS.f8521b.get();
        if (Intrinsics.areEqual(owVar, GLs.f8764b) ? true : Intrinsics.areEqual(owVar, zfv.f11934b)) {
            z2 = true;
        } else {
            if (!(Intrinsics.areEqual(owVar, f0.f10395b) ? true : Intrinsics.areEqual(owVar, RXl.f9550b) ? true : Intrinsics.areEqual(owVar, d3Z.f10279b))) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = false;
        }
        if (!z2 && str != null) {
            if (Intrinsics.areEqual(owVar, f0.f10395b)) {
                str2 = "the Incognia SDK is not initialized";
            } else {
                str2 = Intrinsics.areEqual(owVar, RXl.f9550b) ? true : Intrinsics.areEqual(owVar, d3Z.f10279b) ? "the Incognia SDK is in an error state" : null;
            }
            if (str2 != null && eSs.f10363b.get()) {
                Log.w("Incognia", str + " won't be executed because " + str2);
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(String str, String str2) {
        boolean z2;
        int length;
        boolean z10 = true;
        if (str == null) {
            return;
        }
        String str3 = Jq.f8969b;
        if (new Regex(MJK.f9112b).echo(str)) {
            StringBuilder sb2 = new StringBuilder();
            int length2 = str.length();
            for (int i4 = 0; i4 < length2; i4++) {
                char charAt = str.charAt(i4);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            if (sb3.length() > 0) {
                for (int i5 = 0; i5 < sb3.length(); i5++) {
                    if (sb3.charAt(i5) == sb3.charAt(0)) {
                    }
                }
            }
            String substring = sb3.substring(0, 9);
            String crimson = androidx.appcompat.widget.P0.crimson(substring, MJK.b(10, substring));
            z2 = Intrinsics.areEqual(sb3, crimson + MJK.b(11, crimson));
            if (!z2 && (3 > (length = str.length()) || length >= 255 || !new Regex(Jq.PqK).echo(str))) {
                if (!new Regex(Jq.f8967J).echo(kotlin.text.r.oscar(str, " ", "").toUpperCase(Locale.getDefault()))) {
                    z10 = false;
                }
            }
            if (!z10) {
                if (eSs.f10363b.get()) {
                    Log.e("Incognia", n.charlie("Invalid " + str2 + " received: you should not use personable identifiable information \n                    (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
                    return;
                }
                return;
            }
            if ((new Regex(Jq.f8969b).echo(str) || new Regex(Jq.f8968W).echo(str) || new Regex(Jq.f8970f9).echo(str) || new Regex(Jq.sVU).echo(str) || new Regex(Jq.gmP).echo(str)) && eSs.f10363b.get()) {
                Log.w("Incognia", n.charlie("Possible invalid " + str2 + " received: you should not use personable identifiable \n                    information (such as email or civil registration numbers) as " + str2 + ".\n                    Please hash your value beforehand."));
                return;
            }
            return;
        }
        z2 = false;
        if (!z2) {
            if (!new Regex(Jq.f8967J).echo(kotlin.text.r.oscar(str, " ", "").toUpperCase(Locale.getDefault()))) {
            }
        }
        if (!z10) {
        }
    }
}
