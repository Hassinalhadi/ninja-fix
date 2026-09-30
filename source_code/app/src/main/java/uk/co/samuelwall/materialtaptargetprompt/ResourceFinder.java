package uk.co.samuelwall.materialtaptargetprompt;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface ResourceFinder {
    View findViewById(int i4);

    Context getContext();

    Drawable getDrawable(int i4);

    ViewGroup getPromptParentView();

    Resources getResources();

    String getString(int i4);

    Resources.Theme getTheme();

    TypedArray obtainStyledAttributes(int i4, int[] iArr);
}
