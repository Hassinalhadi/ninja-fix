package uk.co.samuelwall.materialtaptargetprompt;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ActivityResourceFinder implements ResourceFinder {
    private final Activity mActivity;

    public ActivityResourceFinder(Activity activity) {
        this.mActivity = activity;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public View findViewById(int i4) {
        return this.mActivity.findViewById(i4);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Context getContext() {
        return this.mActivity;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Drawable getDrawable(int i4) {
        return this.mActivity.getDrawable(i4);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public ViewGroup getPromptParentView() {
        return (ViewGroup) this.mActivity.getWindow().getDecorView();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Resources getResources() {
        return this.mActivity.getResources();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public String getString(int i4) {
        return this.mActivity.getString(i4);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Resources.Theme getTheme() {
        return this.mActivity.getTheme();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public TypedArray obtainStyledAttributes(int i4, int[] iArr) {
        return this.mActivity.obtainStyledAttributes(i4, iArr);
    }
}
