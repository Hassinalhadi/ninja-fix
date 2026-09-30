package zendesk.classic.messaging.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;
import x2.aa;
import x2.ad;
import x2.af;
import x2.aw;
import x2.s;
import x2.z;
import zendesk.classic.messaging.ConnectionState;
import zendesk.classic.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LostConnectionBanner {
    private final AnimatorSet hideAnimation;
    private final View lostConnectionBanner;
    private final Button lostConnectionButton;
    private final TextView lostConnectionTextView;
    private View.OnClickListener onRetryConnectionClickListener;
    private final ViewGroup rootView;
    private final af showAnimation;
    private State state = State.EXITED;
    private final AtomicReference<ConnectionState> currentConnectionState = new AtomicReference<>(ConnectionState.DISCONNECTED);

    /* renamed from: zendesk.classic.messaging.ui.LostConnectionBanner$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$classic$messaging$ConnectionState;
        static final /* synthetic */ int[] $SwitchMap$zendesk$classic$messaging$ui$LostConnectionBanner$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$zendesk$classic$messaging$ui$LostConnectionBanner$State = iArr;
            try {
                iArr[State.ENTERING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$ui$LostConnectionBanner$State[State.ENTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$ui$LostConnectionBanner$State[State.EXITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$ui$LostConnectionBanner$State[State.EXITING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConnectionState.values().length];
            $SwitchMap$zendesk$classic$messaging$ConnectionState = iArr2;
            try {
                iArr2[ConnectionState.RECONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$ConnectionState[ConnectionState.UNREACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$ConnectionState[ConnectionState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$ConnectionState[ConnectionState.CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$ConnectionState[ConnectionState.CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$ConnectionState[ConnectionState.DISCONNECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum State {
        ENTERING,
        ENTERED,
        EXITING,
        EXITED
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x2.z, x2.aw, x2.s] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, x2.o] */
    private LostConnectionBanner(ViewGroup viewGroup, RecyclerView recyclerView, InputBox inputBox, View view) {
        this.rootView = viewGroup;
        this.lostConnectionBanner = view;
        this.lostConnectionTextView = (TextView) view.findViewById(R.id.zui_lost_connection_label);
        int i4 = R.id.zui_lost_connection_button;
        this.lostConnectionButton = (Button) view.findViewById(i4);
        view.findViewById(i4).setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.LostConnectionBanner.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (LostConnectionBanner.this.onRetryConnectionClickListener != null) {
                    LostConnectionBanner.this.onRetryConnectionClickListener.onClick(view2);
                }
            }
        });
        af afVar = new af();
        afVar.maroon(0);
        ?? awVar = new aw();
        awVar.A = s.f14071E;
        awVar.A = s.f14070D;
        ?? obj = new Object();
        obj.alpha = 48;
        awVar.f14089o = obj;
        afVar.ivory(awVar);
        afVar.cyan(new DecelerateInterpolator());
        long j5 = MessagingView.DEFAULT_ANIMATION_DURATION;
        afVar.coral(j5);
        afVar.indigo(new aa(recyclerView, view, inputBox) { // from class: zendesk.classic.messaging.ui.LostConnectionBanner.2
            final int originalPaddingTop;
            final /* synthetic */ InputBox val$inputBox;
            final /* synthetic */ View val$lostConnectionBanner;
            final /* synthetic */ RecyclerView val$recyclerView;

            {
                this.val$recyclerView = recyclerView;
                this.val$lostConnectionBanner = view;
                this.val$inputBox = inputBox;
                this.originalPaddingTop = recyclerView.getPaddingTop();
            }

            @Override // x2.aa, x2.x
            public void onTransitionEnd(z zVar) {
                RecyclerView recyclerView2 = this.val$recyclerView;
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.val$lostConnectionBanner.getHeight() + this.val$recyclerView.getPaddingTop(), this.val$recyclerView.getPaddingRight(), Math.max(this.val$inputBox.getHeight(), (this.val$recyclerView.getHeight() - this.val$recyclerView.computeVerticalScrollRange()) - this.originalPaddingTop));
                LostConnectionBanner.this.state = State.ENTERED;
            }

            @Override // x2.aa, x2.x
            public void onTransitionStart(z zVar) {
                LostConnectionBanner.this.state = State.ENTERING;
            }

            @Override // x2.aa, x2.x
            public void onTransitionStart(z zVar, boolean z2) {
                onTransitionStart(zVar);
            }

            @Override // x2.aa, x2.x
            public void onTransitionEnd(z zVar, boolean z2) {
                onTransitionEnd(zVar);
            }
        });
        this.showAnimation = afVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        AnimatorSet animatorSet = new AnimatorSet();
        this.hideAnimation = animatorSet;
        ValueAnimator valueAnimator = ValueAnimators.topPaddingAnimator(recyclerView, recyclerView.getPaddingTop(), recyclerView.getPaddingTop() - view.getHeight(), j5);
        int i5 = marginLayoutParams.topMargin;
        animatorSet.playTogether(valueAnimator, ValueAnimators.topMarginAnimator(view, i5, i5 - view.getHeight(), j5));
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter(marginLayoutParams, recyclerView, view, inputBox) { // from class: zendesk.classic.messaging.ui.LostConnectionBanner.3
            private final int originalMargin;
            private final int originalPaddingBottom;
            final /* synthetic */ InputBox val$inputBox;
            final /* synthetic */ View val$lostConnectionBanner;
            final /* synthetic */ ViewGroup.MarginLayoutParams val$params;
            final /* synthetic */ RecyclerView val$recyclerView;

            {
                this.val$params = marginLayoutParams;
                this.val$recyclerView = recyclerView;
                this.val$lostConnectionBanner = view;
                this.val$inputBox = inputBox;
                this.originalMargin = marginLayoutParams.topMargin;
                this.originalPaddingBottom = recyclerView.getPaddingBottom();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = this.val$params;
                marginLayoutParams2.topMargin = this.originalMargin;
                this.val$lostConnectionBanner.setLayoutParams(marginLayoutParams2);
                this.val$lostConnectionBanner.setVisibility(8);
                RecyclerView recyclerView2 = this.val$recyclerView;
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.val$recyclerView.getPaddingTop(), this.val$recyclerView.getPaddingRight(), this.val$inputBox.getHeight() + this.originalPaddingBottom);
                LostConnectionBanner.this.state = State.EXITED;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LostConnectionBanner.this.state = State.EXITING;
            }
        });
    }

    public static LostConnectionBanner create(ViewGroup viewGroup, RecyclerView recyclerView, InputBox inputBox) {
        return new LostConnectionBanner(viewGroup, recyclerView, inputBox, viewGroup.findViewById(R.id.zui_lost_connection_view));
    }

    public void hide() {
        int i4 = AnonymousClass5.$SwitchMap$zendesk$classic$messaging$ui$LostConnectionBanner$State[this.state.ordinal()];
        if (i4 != 1) {
            if (i4 != 3 && i4 != 4) {
                this.hideAnimation.start();
                return;
            }
            return;
        }
        this.showAnimation.indigo(new aa() { // from class: zendesk.classic.messaging.ui.LostConnectionBanner.4
            @Override // x2.aa, x2.x
            public void onTransitionEnd(z zVar) {
                LostConnectionBanner.this.hide();
                LostConnectionBanner.this.showAnimation.lavender(this);
            }

            @Override // x2.aa, x2.x
            public void onTransitionStart(z zVar, boolean z2) {
                onTransitionStart(zVar);
            }

            @Override // x2.aa, x2.x
            public void onTransitionEnd(z zVar, boolean z2) {
                onTransitionEnd(zVar);
            }
        });
    }

    public void setOnRetryConnectionClickListener(View.OnClickListener onClickListener) {
        this.onRetryConnectionClickListener = onClickListener;
    }

    public void show() {
        int i4 = AnonymousClass5.$SwitchMap$zendesk$classic$messaging$ui$LostConnectionBanner$State[this.state.ordinal()];
        if (i4 != 1 && i4 != 2) {
            ad.alpha(this.rootView, this.showAnimation);
            this.lostConnectionBanner.setVisibility(0);
        }
    }

    public void update(ConnectionState connectionState) {
        if (this.currentConnectionState.getAndSet(connectionState) == connectionState) {
            return;
        }
        switch (AnonymousClass5.$SwitchMap$zendesk$classic$messaging$ConnectionState[connectionState.ordinal()]) {
            case 1:
                this.lostConnectionTextView.setText(R.string.zui_label_reconnecting);
                this.lostConnectionButton.setVisibility(8);
                show();
                return;
            case 2:
                this.lostConnectionTextView.setText(R.string.zui_label_reconnecting_failed);
                this.lostConnectionButton.setVisibility(8);
                show();
                return;
            case 3:
                this.lostConnectionTextView.setText(R.string.zui_label_reconnecting_failed);
                this.lostConnectionButton.setVisibility(0);
                show();
                return;
            case 4:
            case 5:
            case 6:
                hide();
                return;
            default:
                return;
        }
    }
}
