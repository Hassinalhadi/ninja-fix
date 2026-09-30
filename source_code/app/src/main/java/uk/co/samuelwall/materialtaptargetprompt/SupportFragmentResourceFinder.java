package uk.co.samuelwall.materialtaptargetprompt;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.ai;

/* loaded from: classes.dex */
public class SupportFragmentResourceFinder implements ResourceFinder {
    private final ai fragment;
    private ViewGroup parent;

    public SupportFragmentResourceFinder(ai aiVar) {
        this.fragment = aiVar;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public View findViewById(int i4) {
        return this.fragment.getView().findViewById(i4);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Context getContext() {
        return this.fragment.requireContext();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Drawable getDrawable(int i4) {
        return this.fragment.getResources().getDrawable(i4);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public ViewGroup getPromptParentView() {
        if (this.parent == null) {
            ViewParent parent = this.fragment.getView().getParent();
            while (parent.getClass().getName().contains("FragmentContainerView")) {
                parent = parent.getParent();
            }
            this.parent = (ViewGroup) parent;
        }
        return this.parent;
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Resources getResources() {
        return this.fragment.getResources();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public String getString(int i4) {
        return this.fragment.getString(i4);
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public Resources.Theme getTheme() {
        return this.fragment.requireActivity().getTheme();
    }

    @Override // uk.co.samuelwall.materialtaptargetprompt.ResourceFinder
    public TypedArray obtainStyledAttributes(int i4, int[] iArr) {
        return this.fragment.requireActivity().obtainStyledAttributes(i4, iArr);
    }
}
