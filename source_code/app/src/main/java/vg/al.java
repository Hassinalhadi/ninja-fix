package vg;

import android.app.NotificationChannel;
import android.view.autofill.AutofillId;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class al {
    public static /* synthetic */ NotificationChannel delta(String str) {
        return new NotificationChannel("zendesk", str, 3);
    }

    public static /* synthetic */ NotificationChannel echo(String str, String str2) {
        return new NotificationChannel(str, str2, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillId hotel(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassification india(Object obj) {
        return (TextClassification) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassificationManager juliet(Object obj) {
        return (TextClassificationManager) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier kilo(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* bridge */ /* synthetic */ TextSelection lima(Object obj) {
        return (TextSelection) obj;
    }

    public static /* bridge */ /* synthetic */ Class mike() {
        return TextClassificationManager.class;
    }

    public static /* bridge */ /* synthetic */ void quebec(Object obj) {
    }
}
