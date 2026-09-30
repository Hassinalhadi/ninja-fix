package zendesk.support.request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;

/* loaded from: classes.dex */
public class HeadlessFragment<E> extends ai {
    private static final String TAG = "ZendeskHeadlessFragment";
    private E data;

    private E getData() {
        return this.data;
    }

    public static <E> void install(L l10, E e) {
        HeadlessFragment headlessFragment = new HeadlessFragment();
        headlessFragment.setData(e);
        l10.getClass();
        C0606a c0606a = new C0606a(l10);
        c0606a.delta(0, headlessFragment, TAG, 1);
        c0606a.india();
    }

    private void setData(E e) {
        this.data = e;
    }

    @Override // androidx.fragment.app.ai
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setRetainInstance(true);
        return null;
    }

    public static <E> E getData(L l10) {
        ai blue = l10.blue(TAG);
        if (blue instanceof HeadlessFragment) {
            return (E) ((HeadlessFragment) blue).getData();
        }
        return null;
    }
}
