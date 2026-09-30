package com.google.android.material.datepicker;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.t0;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.google.crypto.tink.shaded.protobuf.C1494l;
import com.google.maps.android.BuildConfig;
import ea.C1645c;
import ea.EnumC1644b;
import ea.InterfaceC1643a;
import g.C1718a;
import g3.InterfaceC1748i;
import i.C1860i;
import i.C1867p;
import i.C1874w;
import i.InterfaceC1869r;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import s6.P5;
import t6.AbstractC3070v2;
import t6.AbstractC3086y3;
import z9.C3488e;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ void bravo(InterfaceC1869r interfaceC1869r, String str, Xd.m mVar, int i4) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        ((C1860i) interfaceC1869r).papa(str, mVar);
    }

    public static /* synthetic */ void charlie(InterfaceC1748i interfaceC1748i, String str, int i4) {
        boolean z2;
        if ((i4 & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        ((Nb.i) interfaceC1748i).alpha(str, OkHttpConstants.READ_TIMEOUT_MS, z2);
    }

    public static void delta(InterfaceC1643a interfaceC1643a) {
        EnumC1644b[] enumC1644bArr = EnumC1644b.alpha;
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        C1645c c1645c = (C1645c) interfaceC1643a;
        c1645c.getClass();
        AbstractC3070v2.charlie(c1645c.alpha, "login_succeeded", tVar);
    }

    public static int echo(int i4, int i5, int i10) {
        return C1494l.coral(i4) + i5 + i10;
    }

    public static int foxtrot(int i4, int i5, int i10, int i11) {
        return C1494l.crimson(i4) + i5 + i10 + i11;
    }

    public static int golf(int i4, int i5, List list) {
        return (list.hashCode() + i4) * i5;
    }

    public static T.s hotel(T.p pVar, float f5, C0585q c0585q, T.p pVar2, float f10) {
        AbstractC0538d.echo(V.echo(pVar, f5), c0585q);
        return V.charlie(pVar2, f10);
    }

    public static String india(int i4, String str) {
        StringBuilder sb2 = new StringBuilder(i4);
        sb2.append(str);
        return sb2.toString();
    }

    public static String juliet(T.p pVar, float f5, C0585q c0585q, int i4, C0585q c0585q2) {
        AbstractC0538d.echo(V.echo(pVar, f5), c0585q);
        return AbstractC3086y3.bravo(c0585q2, i4);
    }

    public static String kilo(String str, long j5, String str2) {
        return str + j5 + str2;
    }

    public static String lima(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String mike(kotlin.jvm.internal.v vVar, Class cls, StringBuilder sb2) {
        sb2.append(vVar.bravo(cls));
        return sb2.toString();
    }

    public static C2492a november(int i4, String str, String str2, String str3) {
        Intrinsics.echo(str, str2);
        return new C2492a(i4, str3);
    }

    public static void oscar(int i4, int i5, int i10, int i11, int i12) {
        P5.alpha(i4);
        P5.alpha(i5);
        P5.alpha(i10);
        P5.alpha(i11);
        P5.alpha(i12);
    }

    public static /* synthetic */ void papa(int i4, String str) {
        if (i4 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(Intrinsics.india(str));
        Intrinsics.kilo(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void quebec(Object obj, Function1 function1) {
        function1.invoke(new Result(obj));
    }

    public static /* synthetic */ boolean romeo(InterfaceC0566c interfaceC0566c) {
        return interfaceC0566c != null;
    }

    public static /* synthetic */ void sierra(int i4, String str) {
        if (i4 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(P0.crimson(str, " must not be null"));
        Intrinsics.kilo(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static androidx.compose.foundation.lazy.layout.ag tango(C1718a c1718a, int i4) {
        Function1 function1;
        C1874w c1874w = (C1874w) c1718a.purple;
        S.g echo = r6.u.echo();
        if (echo != null) {
            function1 = echo.echo();
        } else {
            function1 = null;
        }
        Function1 function12 = function1;
        S.g foxtrot = r6.u.foxtrot(echo);
        try {
            C1867p c1867p = (C1867p) ((t0) c1874w.foxtrot).getValue();
            r6.u.juliet(echo, foxtrot, function12);
            return c1874w.papa.alpha(i4, c1867p.juliet, c1874w.delta, new hd.l(i4, c1867p));
        } catch (Throwable th) {
            r6.u.juliet(echo, foxtrot, function12);
            throw th;
        }
    }

    public static void uniform(C3488e c3488e, Activity activity, String str, String message, String str2, Function0 function0) {
        Intrinsics.echo(activity, "activity");
        Intrinsics.echo(message, "message");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(str);
        builder.setMessage(message);
        builder.setCancelable(false);
        builder.setPositiveButton(str2, new Da.l(function0, 5));
        builder.show();
    }

    public static void victor(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        Ba.m mVar = new Ba.m(1, editTextArr);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(mVar);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new androidx.camera.core.impl.ai(22, editText2), 100L);
    }

    public static /* synthetic */ String whiskey(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? BuildConfig.TRAVIS : "OUT_VARIANCE" : "IN_VARIANCE" : "INVARIANT";
    }
}
