package com.clevertap.android.sdk.inbox;

import android.view.ViewGroup;
import androidx.fragment.app.L;
import androidx.fragment.app.P;
import androidx.fragment.app.ai;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CTInboxTabAdapter extends P {
    private final ai[] fragmentList;
    private final List<String> fragmentTitleList;

    public CTInboxTabAdapter(L l10, int i4) {
        super(l10);
        this.fragmentTitleList = new ArrayList();
        this.fragmentList = new ai[i4];
    }

    public void addFragment(ai aiVar, String str, int i4) {
        this.fragmentList[i4] = aiVar;
        this.fragmentTitleList.add(str);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.fragmentList.length;
    }

    @Override // androidx.fragment.app.P
    public ai getItem(int i4) {
        return this.fragmentList[i4];
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i4) {
        return this.fragmentTitleList.get(i4);
    }

    @Override // androidx.fragment.app.P, androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        Object instantiateItem = super.instantiateItem(viewGroup, i4);
        this.fragmentList[i4] = (ai) instantiateItem;
        return instantiateItem;
    }
}
