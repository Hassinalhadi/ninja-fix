package hc;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.F;
import androidx.fragment.app.L;
import androidx.fragment.app.an;
import androidx.lifecycle.ab;
import delivery.samurai.android.R;
import ja.burhanrashid52.photoeditor.PhotoEditor;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import s6.S6;

/* renamed from: hc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1842c implements PhotoEditor.OnSaveListener {
    public final /* synthetic */ C1844e alpha;

    public C1842c(C1844e c1844e) {
        this.alpha = c1844e;
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor.OnSaveListener
    public final void onFailure(Exception exception) {
        Intrinsics.echo(exception, "exception");
        C1844e c1844e = this.alpha;
        if (!c1844e.isAdded()) {
            return;
        }
        an requireActivity = c1844e.requireActivity();
        Intrinsics.delta(requireActivity, "requireActivity(...)");
        String string = c1844e.getString(R.string.image_process_failed);
        Intrinsics.delta(string, "getString(...)");
        L9.d.pink(requireActivity, string);
        c1844e.tango(false);
    }

    @Override // ja.burhanrashid52.photoeditor.PhotoEditor.OnSaveListener
    public final void onSuccess(String imagePath) {
        Intrinsics.echo(imagePath, "imagePath");
        C1844e c1844e = this.alpha;
        if (!c1844e.isAdded()) {
            return;
        }
        L parentFragmentManager = c1844e.getParentFragmentManager();
        Bundle charlie = S6.charlie(new Pair("annotatedPath", imagePath));
        F f5 = (F) parentFragmentManager.november.get("annotateResult");
        if (f5 != null && f5.alpha.bravo().compareTo(ab.silver) >= 0) {
            f5.bravo.alpha(charlie);
        } else {
            parentFragmentManager.mike.put("annotateResult", charlie);
        }
        if (L.gray(2)) {
            Log.v("FragmentManager", "Setting fragment result with key annotateResult and result " + charlie);
        }
        c1844e.tango(false);
        c1844e.kilo();
    }
}
