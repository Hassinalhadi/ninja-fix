package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;

/* loaded from: classes3.dex */
public abstract class A {
    public static LocaleList alpha(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void bravo(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
