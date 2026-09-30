package a4;

import android.graphics.PointF;
import android.graphics.RectF;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ak {
    public final int alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final PointF foxtrot;

    public ak(int i4, ai cropWindowHandler, float f5, float f10) {
        float f11;
        float f12;
        float f13;
        com.google.android.material.datepicker.j.papa(i4, Constants.KEY_TYPE);
        Intrinsics.echo(cropWindowHandler, "cropWindowHandler");
        this.alpha = i4;
        this.bravo = cropWindowHandler.echo();
        this.charlie = cropWindowHandler.delta();
        this.delta = cropWindowHandler.charlie();
        this.echo = cropWindowHandler.bravo();
        float f14 = 0.0f;
        PointF pointF = new PointF(0.0f, 0.0f);
        this.foxtrot = pointF;
        RectF foxtrot = cropWindowHandler.foxtrot();
        switch (aj.$EnumSwitchMapping$0[av.q.mike(i4)]) {
            case 1:
                f14 = foxtrot.left - f5;
                f11 = foxtrot.top;
                f13 = f11 - f10;
                break;
            case 2:
                f14 = foxtrot.right - f5;
                f11 = foxtrot.top;
                f13 = f11 - f10;
                break;
            case 3:
                f14 = foxtrot.left - f5;
                f11 = foxtrot.bottom;
                f13 = f11 - f10;
                break;
            case 4:
                f14 = foxtrot.right - f5;
                f11 = foxtrot.bottom;
                f13 = f11 - f10;
                break;
            case 5:
                f12 = foxtrot.left;
                f14 = f12 - f5;
                f13 = 0.0f;
                break;
            case 6:
                f11 = foxtrot.top;
                f13 = f11 - f10;
                break;
            case 7:
                f12 = foxtrot.right;
                f14 = f12 - f5;
                f13 = 0.0f;
                break;
            case 8:
                f11 = foxtrot.bottom;
                f13 = f11 - f10;
                break;
            case 9:
                f14 = foxtrot.centerX() - f5;
                f11 = foxtrot.centerY();
                f13 = f11 - f10;
                break;
            default:
                f13 = 0.0f;
                break;
        }
        pointF.x = f14;
        pointF.y = f13;
    }

    public static void charlie(RectF rectF, RectF rectF2, float f5) {
        rectF.inset((rectF.width() - (rectF.height() * f5)) / 2, 0.0f);
        float f10 = rectF.left;
        float f11 = rectF2.left;
        if (f10 < f11) {
            rectF.offset(f11 - f10, 0.0f);
        }
        float f12 = rectF.right;
        float f13 = rectF2.right;
        if (f12 > f13) {
            rectF.offset(f13 - f12, 0.0f);
        }
    }

    public static void foxtrot(RectF rectF, RectF rectF2, float f5) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f5)) / 2);
        float f10 = rectF.top;
        float f11 = rectF2.top;
        if (f10 < f11) {
            rectF.offset(0.0f, f11 - f10);
        }
        float f12 = rectF.bottom;
        float f13 = rectF2.bottom;
        if (f12 > f13) {
            rectF.offset(0.0f, f13 - f12);
        }
    }

    public final void alpha(RectF rectF, float f5, RectF rectF2, int i4, float f10, float f11, boolean z2, boolean z10) {
        float f12 = i4;
        PointF pointF = this.foxtrot;
        if (f5 > f12) {
            f5 = ((f5 - f12) / 1.05f) + f12;
            pointF.y -= (f5 - f12) / 1.1f;
        }
        float f13 = rectF2.bottom;
        if (f5 > f13) {
            pointF.y -= (f5 - f13) / 2.0f;
        }
        if (f13 - f5 < f10) {
            f5 = f13;
        }
        float f14 = rectF.top;
        float f15 = f5 - f14;
        float f16 = this.charlie;
        if (f15 < f16) {
            f5 = f14 + f16;
        }
        float f17 = f5 - f14;
        float f18 = this.echo;
        if (f17 > f18) {
            f5 = f14 + f18;
        }
        if (f13 - f5 < f10) {
            f5 = f13;
        }
        if (f11 > 0.0f) {
            float f19 = (f5 - f14) * f11;
            float f20 = this.bravo;
            if (f19 < f20) {
                f5 = Math.min(f13, (f20 / f11) + f14);
                f19 = (f5 - rectF.top) * f11;
            }
            float f21 = this.delta;
            if (f19 > f21) {
                f5 = Math.min(rectF2.bottom, (f21 / f11) + rectF.top);
                f19 = (f5 - rectF.top) * f11;
            }
            if (z2 && z10) {
                f5 = Math.min(f5, Math.min(rectF2.bottom, (rectF2.width() / f11) + rectF.top));
            } else {
                if (z2) {
                    float f22 = rectF.right;
                    float f23 = f22 - f19;
                    float f24 = rectF2.left;
                    if (f23 < f24) {
                        f5 = Math.min(rectF2.bottom, ((f22 - f24) / f11) + rectF.top);
                        f19 = (f5 - rectF.top) * f11;
                    }
                }
                if (z10) {
                    float f25 = rectF.left;
                    float f26 = f19 + f25;
                    float f27 = rectF2.right;
                    if (f26 > f27) {
                        f5 = Math.min(f5, Math.min(rectF2.bottom, ((f27 - f25) / f11) + rectF.top));
                    }
                }
            }
        }
        rectF.bottom = f5;
    }

    public final void bravo(RectF rectF, float f5, RectF rectF2, float f10, float f11, boolean z2, boolean z10) {
        PointF pointF = this.foxtrot;
        if (f5 < 0.0f) {
            f5 /= 1.05f;
            pointF.x -= f5 / 1.1f;
        }
        float f12 = rectF2.left;
        if (f5 < f12) {
            pointF.x -= (f5 - f12) / 2.0f;
        }
        if (f5 - f12 < f10) {
            f5 = f12;
        }
        float f13 = rectF.right;
        float f14 = f13 - f5;
        float f15 = this.bravo;
        if (f14 < f15) {
            f5 = f13 - f15;
        }
        float f16 = f13 - f5;
        float f17 = this.delta;
        if (f16 > f17) {
            f5 = f13 - f17;
        }
        if (f5 - f12 < f10) {
            f5 = f12;
        }
        if (f11 > 0.0f) {
            float f18 = (f13 - f5) / f11;
            float f19 = this.charlie;
            if (f18 < f19) {
                f5 = Math.max(f12, f13 - (f19 * f11));
                f18 = (rectF.right - f5) / f11;
            }
            float f20 = this.echo;
            if (f18 > f20) {
                f5 = Math.max(rectF2.left, rectF.right - (f20 * f11));
                f18 = (rectF.right - f5) / f11;
            }
            if (z2 && z10) {
                f5 = Math.max(f5, Math.max(rectF2.left, rectF.right - (rectF2.height() * f11)));
            } else {
                if (z2) {
                    float f21 = rectF.bottom;
                    float f22 = f21 - f18;
                    float f23 = rectF2.top;
                    if (f22 < f23) {
                        f5 = Math.max(rectF2.left, rectF.right - ((f21 - f23) * f11));
                        f18 = (rectF.right - f5) / f11;
                    }
                }
                if (z10) {
                    float f24 = rectF.top;
                    float f25 = f18 + f24;
                    float f26 = rectF2.bottom;
                    if (f25 > f26) {
                        f5 = Math.max(f5, Math.max(rectF2.left, rectF.right - ((f26 - f24) * f11)));
                    }
                }
            }
        }
        rectF.left = f5;
    }

    public final void delta(RectF rectF, float f5, RectF rectF2, int i4, float f10, float f11, boolean z2, boolean z10) {
        float f12 = i4;
        PointF pointF = this.foxtrot;
        if (f5 > f12) {
            f5 = ((f5 - f12) / 1.05f) + f12;
            pointF.x -= (f5 - f12) / 1.1f;
        }
        float f13 = rectF2.right;
        if (f5 > f13) {
            pointF.x -= (f5 - f13) / 2.0f;
        }
        if (f13 - f5 < f10) {
            f5 = f13;
        }
        float f14 = rectF.left;
        float f15 = f5 - f14;
        float f16 = this.bravo;
        if (f15 < f16) {
            f5 = f14 + f16;
        }
        float f17 = f5 - f14;
        float f18 = this.delta;
        if (f17 > f18) {
            f5 = f14 + f18;
        }
        if (f13 - f5 < f10) {
            f5 = f13;
        }
        if (f11 > 0.0f) {
            float f19 = (f5 - f14) / f11;
            float f20 = this.charlie;
            if (f19 < f20) {
                f5 = Math.min(f13, (f20 * f11) + f14);
                f19 = (f5 - rectF.left) / f11;
            }
            float f21 = this.echo;
            if (f19 > f21) {
                f5 = Math.min(rectF2.right, (f21 * f11) + rectF.left);
                f19 = (f5 - rectF.left) / f11;
            }
            if (z2 && z10) {
                f5 = Math.min(f5, Math.min(rectF2.right, (rectF2.height() * f11) + rectF.left));
            } else {
                if (z2) {
                    float f22 = rectF.bottom;
                    float f23 = f22 - f19;
                    float f24 = rectF2.top;
                    if (f23 < f24) {
                        f5 = Math.min(rectF2.right, ((f22 - f24) * f11) + rectF.left);
                        f19 = (f5 - rectF.left) / f11;
                    }
                }
                if (z10) {
                    float f25 = rectF.top;
                    float f26 = f19 + f25;
                    float f27 = rectF2.bottom;
                    if (f26 > f27) {
                        f5 = Math.min(f5, Math.min(rectF2.right, ((f27 - f25) * f11) + rectF.left));
                    }
                }
            }
        }
        rectF.right = f5;
    }

    public final void echo(RectF rectF, float f5, RectF rectF2, float f10, float f11, boolean z2, boolean z10) {
        PointF pointF = this.foxtrot;
        if (f5 < 0.0f) {
            f5 /= 1.05f;
            pointF.y -= f5 / 1.1f;
        }
        float f12 = rectF2.top;
        if (f5 < f12) {
            pointF.y -= (f5 - f12) / 2.0f;
        }
        if (f5 - f12 < f10) {
            f5 = f12;
        }
        float f13 = rectF.bottom;
        float f14 = f13 - f5;
        float f15 = this.charlie;
        if (f14 < f15) {
            f5 = f13 - f15;
        }
        float f16 = f13 - f5;
        float f17 = this.echo;
        if (f16 > f17) {
            f5 = f13 - f17;
        }
        if (f5 - f12 < f10) {
            f5 = f12;
        }
        if (f11 > 0.0f) {
            float f18 = (f13 - f5) * f11;
            float f19 = this.bravo;
            if (f18 < f19) {
                f5 = Math.max(f12, f13 - (f19 / f11));
                f18 = (rectF.bottom - f5) * f11;
            }
            float f20 = this.delta;
            if (f18 > f20) {
                f5 = Math.max(rectF2.top, rectF.bottom - (f20 / f11));
                f18 = (rectF.bottom - f5) * f11;
            }
            if (z2 && z10) {
                f5 = Math.max(f5, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f11)));
            } else {
                if (z2) {
                    float f21 = rectF.right;
                    float f22 = f21 - f18;
                    float f23 = rectF2.left;
                    if (f22 < f23) {
                        f5 = Math.max(rectF2.top, rectF.bottom - ((f21 - f23) / f11));
                        f18 = (rectF.bottom - f5) * f11;
                    }
                }
                if (z10) {
                    float f24 = rectF.left;
                    float f25 = f18 + f24;
                    float f26 = rectF2.right;
                    if (f25 > f26) {
                        f5 = Math.max(f5, Math.max(rectF2.top, rectF.bottom - ((f26 - f24) / f11)));
                    }
                }
            }
        }
        rectF.top = f5;
    }
}
