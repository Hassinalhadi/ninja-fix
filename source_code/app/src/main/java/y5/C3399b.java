package y5;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.material.internal.s;

/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3399b {
    public int alpha = -1;
    public int bravo = 0;
    public final ScaleGestureDetector charlie;
    public VelocityTracker delta;
    public boolean echo;
    public float foxtrot;
    public float golf;
    public final float hotel;
    public final float india;
    public final tg.b juliet;

    public C3399b(Context context, tg.b bVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.india = viewConfiguration.getScaledMinimumFlingVelocity();
        this.hotel = viewConfiguration.getScaledTouchSlop();
        this.juliet = bVar;
        this.charlie = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC3398a(this));
    }

    public final void alpha(MotionEvent motionEvent) {
        float x4;
        float y10;
        float x5;
        float y11;
        RectF rectF;
        int i4;
        int i5;
        int i10;
        int i11;
        float x10;
        float y12;
        boolean z2;
        boolean z10;
        int action = motionEvent.getAction() & 255;
        int i12 = 0;
        if (action != 0) {
            tg.b bVar = this.juliet;
            int i13 = 1;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 6) {
                            int action2 = (motionEvent.getAction() & 65280) >> 8;
                            if (motionEvent.getPointerId(action2) == this.alpha) {
                                if (action2 != 0) {
                                    i13 = 0;
                                }
                                this.alpha = motionEvent.getPointerId(i13);
                                this.foxtrot = motionEvent.getX(i13);
                                this.golf = motionEvent.getY(i13);
                            }
                        }
                    } else {
                        this.alpha = -1;
                        VelocityTracker velocityTracker = this.delta;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.delta = null;
                        }
                    }
                } else {
                    try {
                        x10 = motionEvent.getX(this.bravo);
                    } catch (Exception unused) {
                        x10 = motionEvent.getX();
                    }
                    try {
                        y12 = motionEvent.getY(this.bravo);
                    } catch (Exception unused2) {
                        y12 = motionEvent.getY();
                    }
                    float f5 = x10 - this.foxtrot;
                    float f10 = y12 - this.golf;
                    if (!this.echo) {
                        if (Math.sqrt((f10 * f10) + (f5 * f5)) >= this.hotel) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.echo = z10;
                    }
                    if (this.echo) {
                        o oVar = (o) bVar.purple;
                        if (!oVar.f14141c.charlie.isInProgress()) {
                            h hVar = oVar.f14148k;
                            if (hVar != null) {
                                j jVar = (j) ((s) hVar).purple;
                                if (jVar.getScale() == 1.0f) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                jVar.setAllowParentInterceptOnEdge(z2);
                            }
                            oVar.f14143f.postTranslate(f5, f10);
                            oVar.alpha();
                            ViewParent parent = oVar.f14139a.getParent();
                            if (oVar.white && !oVar.f14141c.charlie.isInProgress() && !oVar.yellow) {
                                int i14 = oVar.f14150m;
                                if ((i14 == 2 || ((i14 == 0 && f5 >= 1.0f) || (i14 == 1 && f5 <= -1.0f))) && parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(false);
                                }
                            } else if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        this.foxtrot = x10;
                        this.golf = y12;
                        VelocityTracker velocityTracker2 = this.delta;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                    }
                }
            } else {
                this.alpha = -1;
                if (this.echo && this.delta != null) {
                    try {
                        x5 = motionEvent.getX(this.bravo);
                    } catch (Exception unused3) {
                        x5 = motionEvent.getX();
                    }
                    this.foxtrot = x5;
                    try {
                        y11 = motionEvent.getY(this.bravo);
                    } catch (Exception unused4) {
                        y11 = motionEvent.getY();
                    }
                    this.golf = y11;
                    this.delta.addMovement(motionEvent);
                    this.delta.computeCurrentVelocity(1000);
                    float xVelocity = this.delta.getXVelocity();
                    float yVelocity = this.delta.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.india) {
                        o oVar2 = (o) bVar.purple;
                        n nVar = new n(oVar2, oVar2.f14139a.getContext());
                        oVar2.f14149l = nVar;
                        j jVar2 = oVar2.f14139a;
                        int width = (jVar2.getWidth() - jVar2.getPaddingLeft()) - jVar2.getPaddingRight();
                        int height = (jVar2.getHeight() - jVar2.getPaddingTop()) - jVar2.getPaddingBottom();
                        int i15 = (int) (-xVelocity);
                        int i16 = (int) (-yVelocity);
                        oVar2.bravo();
                        Matrix charlie = oVar2.charlie();
                        if (oVar2.f14139a.getDrawable() != null) {
                            rectF = oVar2.f14144g;
                            rectF.set(0.0f, 0.0f, r12.getIntrinsicWidth(), r12.getIntrinsicHeight());
                            charlie.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int round = Math.round(-rectF.left);
                            float f11 = width;
                            if (f11 < rectF.width()) {
                                i4 = Math.round(rectF.width() - f11);
                                i5 = 0;
                            } else {
                                i4 = round;
                                i5 = i4;
                            }
                            int round2 = Math.round(-rectF.top);
                            float f12 = height;
                            if (f12 < rectF.height()) {
                                i10 = Math.round(rectF.height() - f12);
                                i11 = 0;
                            } else {
                                i10 = round2;
                                i11 = i10;
                            }
                            nVar.purple = round;
                            nVar.red = round2;
                            if (round != i4 || round2 != i10) {
                                nVar.alpha.fling(round, round2, i15, i16, i5, i4, i11, i10, 0, 0);
                            }
                        }
                        jVar2.post(oVar2.f14149l);
                    }
                }
                VelocityTracker velocityTracker3 = this.delta;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.delta = null;
                }
            }
        } else {
            this.alpha = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.delta = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x4 = motionEvent.getX(this.bravo);
            } catch (Exception unused5) {
                x4 = motionEvent.getX();
            }
            this.foxtrot = x4;
            try {
                y10 = motionEvent.getY(this.bravo);
            } catch (Exception unused6) {
                y10 = motionEvent.getY();
            }
            this.golf = y10;
            this.echo = false;
        }
        int i17 = this.alpha;
        if (i17 != -1) {
            i12 = i17;
        }
        this.bravo = motionEvent.findPointerIndex(i12);
    }
}
