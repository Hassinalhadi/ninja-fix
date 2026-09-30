package kd;

import D0.am;
import a0.ar;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.widget.TextView;
import com.checkout.components.ui.view.field.PickerFieldViewKt;
import com.clevertap.android.sdk.Constants;
import d.K;
import dd.C1614e;
import id.C1914b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ld.C2066b;
import ld.C2068d;
import ld.C2072h;
import n.at;
import n.c0;
import okhttp3.internal.http2.Settings;
import y.aq;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ l(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Xd.l, Pd.i] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Unit PickerFieldView$lambda$1$lambda$0;
        Unit PickerFieldView$lambda$6$lambda$5;
        int i4;
        K k6;
        D0.af afVar;
        boolean z2 = true;
        switch (this.alpha) {
            case 0:
                C1614e it = (C1614e) obj;
                Intrinsics.echo(it, "it");
                return Boolean.valueOf(!hd.n.bravo(it.echo()));
            case 1:
                if (((Character) obj).charValue() != '-') {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 2:
                if (((Character) obj).charValue() != '-') {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 3:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                if (((Character) obj).charValue() != ':') {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 5:
                if (((Character) obj).charValue() != ':') {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 6:
                char charValue2 = ((Character) obj).charValue();
                if ('0' > charValue2 || charValue2 >= ':') {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 7:
                PickerFieldView$lambda$1$lambda$0 = PickerFieldViewKt.PickerFieldView$lambda$1$lambda$0((A0.ad) obj);
                return PickerFieldView$lambda$1$lambda$0;
            case 8:
                PickerFieldView$lambda$6$lambda$5 = PickerFieldViewKt.PickerFieldView$lambda$6$lambda$5((String) obj);
                return PickerFieldView$lambda$6$lambda$5;
            case 9:
                C1914b createClientPlugin = (C1914b) obj;
                Intrinsics.echo(createClientPlugin, "$this$createClientPlugin");
                C2068d c2068d = (C2068d) createClientPlugin.bravo;
                createClientPlugin.alpha(C2066b.alpha, new C2072h(c2068d.bravo, createClientPlugin, c2068d.alpha, null));
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                aq aqVar = (aq) obj;
                String str = aqVar.golf.purple;
                long j5 = aqVar.foxtrot;
                int i5 = am.charlie;
                int i10 = (int) (j5 & 4294967295L);
                if (i10 > 0) {
                    K1.k uniform = at.uniform();
                    if (uniform == null) {
                        if (i10 > 0) {
                            i4 = Character.offsetByCodePoints(str, i10, -1);
                            if (i4 == -1) {
                                return null;
                            }
                            return new I0.e(((int) (aqVar.foxtrot & 4294967295L)) - i4, 0);
                        }
                    } else {
                        int bravo = uniform.bravo(str, i10 - 1);
                        if (bravo < 0) {
                            if (i10 > 0) {
                                i4 = Character.offsetByCodePoints(str, i10, -1);
                            }
                        } else {
                            i4 = bravo;
                        }
                        if (i4 == -1) {
                        }
                    }
                }
                i4 = -1;
                if (i4 == -1) {
                }
            case 16:
                aq aqVar2 = (aq) obj;
                String str2 = aqVar2.golf.purple;
                long j6 = aqVar2.foxtrot;
                int i11 = am.charlie;
                int quebec = at.quebec((int) (j6 & 4294967295L), str2);
                if (quebec == -1) {
                    return null;
                }
                return new I0.e(0, quebec - ((int) (aqVar2.foxtrot & 4294967295L)));
            case 17:
                aq aqVar3 = (aq) obj;
                Integer echo = aqVar3.echo();
                if (echo == null) {
                    return null;
                }
                int intValue = echo.intValue();
                long j7 = aqVar3.foxtrot;
                int i12 = am.charlie;
                return new I0.e(((int) (j7 & 4294967295L)) - intValue, 0);
            case 18:
                aq aqVar4 = (aq) obj;
                Integer delta = aqVar4.delta();
                if (delta == null) {
                    return null;
                }
                int intValue2 = delta.intValue();
                long j10 = aqVar4.foxtrot;
                int i13 = am.charlie;
                return new I0.e(0, intValue2 - ((int) (j10 & 4294967295L)));
            case 19:
                aq aqVar5 = (aq) obj;
                Integer charlie = aqVar5.charlie();
                if (charlie == null) {
                    return null;
                }
                int intValue3 = charlie.intValue();
                long j11 = aqVar5.foxtrot;
                int i14 = am.charlie;
                return new I0.e(((int) (j11 & 4294967295L)) - intValue3, 0);
            case 20:
                aq aqVar6 = (aq) obj;
                Integer bravo2 = aqVar6.bravo();
                if (bravo2 == null) {
                    return null;
                }
                int intValue4 = bravo2.intValue();
                long j12 = aqVar6.foxtrot;
                int i15 = am.charlie;
                return new I0.e(0, intValue4 - ((int) (j12 & 4294967295L)));
            case 21:
                List list = (List) obj;
                Object obj2 = list.get(1);
                Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj2).booleanValue()) {
                    k6 = K.alpha;
                } else {
                    k6 = K.purple;
                }
                Object obj3 = list.get(0);
                Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new c0(k6, ((Float) obj3).floatValue());
            case 22:
                D0.e eVar = (D0.e) obj;
                Object obj4 = eVar.alpha;
                if (obj4 instanceof D0.m) {
                    Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                    D0.al alpha = ((D0.m) obj4).alpha();
                    if (alpha != null && (alpha.alpha != null || alpha.bravo != null || alpha.charlie != null || alpha.delta != null)) {
                        Object obj5 = eVar.alpha;
                        Intrinsics.charlie(obj5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                        D0.al alpha2 = ((D0.m) obj5).alpha();
                        if (alpha2 == null || (afVar = alpha2.alpha) == null) {
                            afVar = new D0.af(0L, 0L, (H0.v) null, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, (O0.l) null, (ar) null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        }
                        return CollectionsKt.azure(eVar, new D0.e(afVar, eVar.bravo, eVar.charlie));
                    }
                }
                return CollectionsKt.azure(eVar);
            case 23:
                A0.ac acVar = A0.x.zulu;
                Unit unit = Unit.INSTANCE;
                ((A0.k) ((A0.ad) obj)).hotel(acVar, unit);
                return unit;
            case 24:
                Context context = (Context) obj;
                Intrinsics.echo(context, "context");
                TextView textView = new TextView(context);
                textView.setTextIsSelectable(false);
                textView.setBackgroundColor(0);
                return textView;
            case 25:
                Context context2 = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i16 = 0; i16 < size; i16++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i16);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str3 = activityInfo.permission;
                            if (str3 != null && context2.checkSelfPermission(str3) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case 26:
                Intent send = (Intent) obj;
                Intrinsics.echo(send, "$this$send");
                send.putExtra("accuracy_mode", "degraded");
                return Unit.INSTANCE;
            case 27:
                Intent send2 = (Intent) obj;
                Intrinsics.echo(send2, "$this$send");
                send2.putExtra("accuracy_mode", Constants.PRIORITY_HIGH);
                return Unit.INSTANCE;
            case 28:
                p3.ab it2 = (p3.ab) obj;
                Intrinsics.echo(it2, "it");
                p3.ab.crimson = new WeakReference(it2);
                return Unit.INSTANCE;
            default:
                p3.ab it3 = (p3.ab) obj;
                Intrinsics.echo(it3, "it");
                it3.kilo();
                return Unit.INSTANCE;
        }
    }
}
