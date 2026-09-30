package O1;

import android.util.Log;
import androidx.fragment.app.L;
import androidx.fragment.app.ai;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {
    public static final b alpha = b.alpha;

    public static b alpha(ai aiVar) {
        while (aiVar != null) {
            if (aiVar.isAdded()) {
                Intrinsics.delta(aiVar.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            aiVar = aiVar.getParentFragment();
        }
        return alpha;
    }

    public static void bravo(Violation violation) {
        if (L.gray(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.getFragment().getClass().getName()), violation);
        }
    }

    public static final void charlie(ai fragment, String previousFragmentId) {
        Intrinsics.echo(fragment, "fragment");
        Intrinsics.echo(previousFragmentId, "previousFragmentId");
        bravo(new FragmentReuseViolation(fragment, previousFragmentId));
        alpha(fragment).getClass();
    }
}
