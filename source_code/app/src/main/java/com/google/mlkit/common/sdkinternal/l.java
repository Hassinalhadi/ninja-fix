package com.google.mlkit.common.sdkinternal;

import V5.x;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.measurement.internal.C1471u;
import java.util.ArrayList;
import java.util.List;
import m6.AbstractC2104e;
import r6.C2497e;
import s6.V4;

/* loaded from: classes2.dex */
public abstract class l {
    public static final Feature[] alpha = new Feature[0];
    public static final Feature bravo;
    public static final r6.l charlie;
    public static final r6.l delta;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        bravo = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        B0.a aVar = new B0.a((byte) 0, 9);
        aVar.oscar("barcode", feature);
        aVar.oscar("custom_ica", feature2);
        aVar.oscar("face", feature3);
        aVar.oscar("ica", feature4);
        aVar.oscar("ocr", feature5);
        aVar.oscar("langid", feature6);
        aVar.oscar("nlclassifier", feature7);
        aVar.oscar("tflite_dynamite", feature8);
        aVar.oscar("barcode_ui", feature9);
        aVar.oscar("smart_reply", feature10);
        C2497e c2497e = (C2497e) aVar.delta;
        if (c2497e == null) {
            r6.l alpha2 = r6.l.alpha(aVar.bravo, (Object[]) aVar.charlie, aVar);
            C2497e c2497e2 = (C2497e) aVar.delta;
            if (c2497e2 == null) {
                charlie = alpha2;
                B0.a aVar2 = new B0.a((byte) 0, 9);
                aVar2.oscar("com.google.android.gms.vision.barcode", feature);
                aVar2.oscar("com.google.android.gms.vision.custom.ica", feature2);
                aVar2.oscar("com.google.android.gms.vision.face", feature3);
                aVar2.oscar("com.google.android.gms.vision.ica", feature4);
                aVar2.oscar("com.google.android.gms.vision.ocr", feature5);
                aVar2.oscar("com.google.android.gms.mlkit.langid", feature6);
                aVar2.oscar("com.google.android.gms.mlkit.nlclassifier", feature7);
                aVar2.oscar("com.google.android.gms.tflite_dynamite", feature8);
                aVar2.oscar("com.google.android.gms.mlkit_smartreply", feature10);
                C2497e c2497e3 = (C2497e) aVar2.delta;
                if (c2497e3 == null) {
                    r6.l alpha3 = r6.l.alpha(aVar2.bravo, (Object[]) aVar2.charlie, aVar2);
                    C2497e c2497e4 = (C2497e) aVar2.delta;
                    if (c2497e4 == null) {
                        delta = alpha3;
                        return;
                    }
                    throw c2497e4.alpha();
                }
                throw c2497e3.alpha();
            }
            throw c2497e2.alpha();
        }
        throw c2497e.alpha();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.common.api.g, Z5.f] */
    public static void alpha(Context context, List list) {
        G6.q delta2;
        if (com.google.android.gms.common.d.getInstance().getApkVersion(context) >= 221500000) {
            Feature[] bravo2 = bravo(charlie, list);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new s(bravo2, 0));
            x.alpha("APIs must not be empty.", !arrayList.isEmpty());
            ?? gVar = new com.google.android.gms.common.api.g(context, null, Z5.f.india, com.google.android.gms.common.api.b.fuchsia, com.google.android.gms.common.api.f.bravo);
            ApiFeatureRequest o5 = ApiFeatureRequest.o(arrayList, true);
            if (o5.alpha.isEmpty()) {
                delta2 = V4.echo(new ModuleInstallResponse(0, false));
            } else {
                T5.o bravo3 = T5.o.bravo();
                bravo3.echo = new Feature[]{AbstractC2104e.charlie};
                bravo3.bravo = true;
                bravo3.charlie = 27304;
                bravo3.delta = new O7.l((Z5.f) gVar, o5);
                delta2 = gVar.delta(0, bravo3.alpha());
            }
            delta2.lima(new C1471u(8));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(Constants.SEPARATOR_COMMA, list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static Feature[] bravo(r6.l lVar, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            Feature feature = (Feature) lVar.get(list.get(i4));
            x.hotel(feature);
            featureArr[i4] = feature;
        }
        return featureArr;
    }
}
