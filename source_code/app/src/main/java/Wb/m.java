package Wb;

import B9.ag;
import Jb.d0;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import com.airbnb.lottie.LottieAnimationView;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends Dialog {
    public static final /* synthetic */ int red = 0;
    public final B2.q alpha;
    public ag purple;

    public m(Context context, B2.q qVar) {
        super(context);
        this.alpha = qVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ag agVar = this.purple;
        if (agVar != null) {
            agVar.f339f.cancelAnimation();
            super.dismiss();
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        z1.g charlie = z1.d.charlie(getLayoutInflater(), R.layout.dialog_address_note_reward, null, false);
        Intrinsics.delta(charlie, "inflate(...)");
        ag agVar = (ag) charlie;
        this.purple = agVar;
        setContentView(agVar.red);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
        }
        ag agVar2 = this.purple;
        if (agVar2 != null) {
            agVar2.f340g.setOnClickListener(new Fb.b(this, 18));
            setCanceledOnTouchOutside(false);
            setOnKeyListener(new d0(1));
            ag agVar3 = this.purple;
            if (agVar3 != null) {
                LottieAnimationView lottieAnimationView = agVar3.f339f;
                lottieAnimationView.setAnimation(R.raw.reward_animation);
                lottieAnimationView.playAnimation();
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
