package com.clevertap.android.sdk.inapp.fragment;

import androidx.fragment.app.C0606a;
import androidx.fragment.app.L;
import androidx.fragment.app.an;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Utils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "<init>", "()V", "isCleanedUp", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onStart", "", "cleanup", "generateListener", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CTInAppBasePartialFragment extends CTInAppBaseFragment {

    @NotNull
    private final AtomicBoolean isCleanedUp = new AtomicBoolean();

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    public void cleanup() {
        an activity = getActivity();
        if (activity != null && !Utils.isActivityDead(activity) && this.isCleanedUp.compareAndSet(false, true)) {
            L supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.delta(supportFragmentManager, "getSupportFragmentManager(...)");
            C0606a c0606a = new C0606a(supportFragmentManager);
            try {
                c0606a.mike(this);
                c0606a.india();
            } catch (IllegalStateException unused) {
                C0606a c0606a2 = new C0606a(supportFragmentManager);
                c0606a2.mike(this);
                c0606a2.juliet(true, true);
            }
        }
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    public void generateListener() {
        setListener(CleverTapAPI.instanceWithConfig(requireContext(), getConfig()).getCoreState().getInAppController());
    }

    @Override // androidx.fragment.app.ai
    public void onStart() {
        super.onStart();
        if (this.isCleanedUp.get()) {
            cleanup();
        }
    }
}
