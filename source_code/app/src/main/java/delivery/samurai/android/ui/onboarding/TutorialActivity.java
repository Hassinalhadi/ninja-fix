package delivery.samurai.android.ui.onboarding;

import Eb.b;
import Pb.a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.L;
import androidx.fragment.app.P;
import androidx.lifecycle.a0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import delivery.samurai.android.R;
import id.C1915c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s6.M6;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/onboarding/TutorialActivity;", "Landroidx/appcompat/app/i;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class TutorialActivity extends i implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int white = 0;
    public SavedStateHandleHolder alpha;
    public volatile ActivityComponentManager purple;
    public final Object red = new Object();
    public boolean silver = false;
    public C1915c teal;

    public TutorialActivity() {
        addOnContextAvailableListener(new b(this, 10));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: echo, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.purple == null) {
            synchronized (this.red) {
                try {
                    if (this.purple == null) {
                        this.purple = new ActivityComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.purple;
    }

    public final C1915c foxtrot() {
        C1915c c1915c = this.teal;
        if (c1915c != null) {
            return c1915c;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // ae.o, androidx.lifecycle.InterfaceC0651v
    public final a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public final void golf(Bundle bundle) {
        super.onCreate(bundle);
        SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
        this.alpha = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.alpha.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.viewpager.widget.a, androidx.fragment.app.P, x9.g] */
    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        golf(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_tutorial, (ViewGroup) null, false);
        int i4 = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnNext, inflate);
        if (materialButton != null) {
            i4 = R.id.viewPager;
            ViewPager viewPager = (ViewPager) S3.bravo(R.id.viewPager, inflate);
            if (viewPager != null) {
                this.teal = new C1915c((ConstraintLayout) inflate, materialButton, viewPager, 2);
                setContentView((ConstraintLayout) foxtrot().purple);
                L supportFragmentManager = getSupportFragmentManager();
                Intrinsics.delta(supportFragmentManager, "getSupportFragmentManager(...)");
                ?? p4 = new P(supportFragmentManager);
                p4.alpha = new ArrayList();
                p4.bravo = new ArrayList();
                p4.alpha.add(M6.bravo());
                p4.alpha.add(M6.bravo());
                p4.alpha.add(M6.bravo());
                ((ViewPager) foxtrot().silver).setAdapter(p4);
                C1915c foxtrot = foxtrot();
                ((ViewPager) foxtrot.silver).addOnPageChangeListener(new a(this));
                C1915c foxtrot2 = foxtrot();
                ((MaterialButton) foxtrot2.red).setOnClickListener(new Fb.b(this, 7));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.alpha;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
