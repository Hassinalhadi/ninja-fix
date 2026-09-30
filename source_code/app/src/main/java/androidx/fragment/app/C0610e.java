package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import t6.E3;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0610e extends AbstractC0615j {
    public final boolean bravo;
    public boolean charlie;
    public ao delta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610e(i0 operation, boolean z2) {
        super(operation);
        Intrinsics.echo(operation, "operation");
        this.bravo = z2;
    }

    public final ao bravo(Context context) {
        boolean z2;
        int exitAnim;
        Animation loadAnimation;
        ao aoVar;
        int i4;
        if (this.charlie) {
            return this.delta;
        }
        i0 i0Var = this.alpha;
        ai aiVar = i0Var.charlie;
        if (i0Var.alpha == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int nextTransition = aiVar.getNextTransition();
        if (this.bravo) {
            if (z2) {
                exitAnim = aiVar.getPopEnterAnim();
            } else {
                exitAnim = aiVar.getPopExitAnim();
            }
        } else if (z2) {
            exitAnim = aiVar.getEnterAnim();
        } else {
            exitAnim = aiVar.getExitAnim();
        }
        aiVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = aiVar.mContainer;
        ao aoVar2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            aiVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = aiVar.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = aiVar.onCreateAnimation(nextTransition, z2, exitAnim);
            if (onCreateAnimation != null) {
                aoVar2 = new ao(onCreateAnimation);
            } else {
                Animator onCreateAnimator = aiVar.onCreateAnimator(nextTransition, z2, exitAnim);
                if (onCreateAnimator != null) {
                    aoVar2 = new ao(onCreateAnimator);
                } else {
                    if (exitAnim == 0 && nextTransition != 0) {
                        if (nextTransition != 4097) {
                            if (nextTransition != 8194) {
                                if (nextTransition != 8197) {
                                    if (nextTransition != 4099) {
                                        if (nextTransition != 4100) {
                                            i4 = -1;
                                        } else if (z2) {
                                            i4 = E3.bravo(android.R.attr.activityOpenEnterAnimation, context);
                                        } else {
                                            i4 = E3.bravo(android.R.attr.activityOpenExitAnimation, context);
                                        }
                                    } else if (z2) {
                                        i4 = R.animator.fragment_fade_enter;
                                    } else {
                                        i4 = R.animator.fragment_fade_exit;
                                    }
                                } else if (z2) {
                                    i4 = E3.bravo(android.R.attr.activityCloseEnterAnimation, context);
                                } else {
                                    i4 = E3.bravo(android.R.attr.activityCloseExitAnimation, context);
                                }
                            } else if (z2) {
                                i4 = R.animator.fragment_close_enter;
                            } else {
                                i4 = R.animator.fragment_close_exit;
                            }
                        } else if (z2) {
                            i4 = R.animator.fragment_open_enter;
                        } else {
                            i4 = R.animator.fragment_open_exit;
                        }
                        exitAnim = i4;
                    }
                    if (exitAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    aoVar = new ao(loadAnimation);
                                    aoVar2 = aoVar;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                            if (loadAnimator != null) {
                                aoVar = new ao(loadAnimator);
                                aoVar2 = aoVar;
                            }
                        } catch (RuntimeException e4) {
                            if (!equals) {
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                if (loadAnimation2 != null) {
                                    aoVar2 = new ao(loadAnimation2);
                                }
                            } else {
                                throw e4;
                            }
                        }
                    }
                }
            }
        }
        this.delta = aoVar2;
        this.charlie = true;
        return aoVar2;
    }
}
