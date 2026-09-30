package y1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import s1.au;
import t0.RunnableC2944v;
import t6.A3;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3391d {
    public static final androidx.viewpager.widget.b xray = new androidx.viewpager.widget.b(1);
    public int alpha;
    public int bravo;
    public float[] delta;
    public float[] echo;
    public float[] foxtrot;
    public float[] golf;
    public int[] hotel;
    public int[] india;
    public int[] juliet;
    public int kilo;
    public VelocityTracker lima;
    public final float mike;
    public float november;
    public int oscar;
    public final int papa;
    public int quebec;
    public final OverScroller romeo;
    public final A3 sierra;
    public View tango;
    public boolean uniform;
    public final ViewGroup victor;
    public int charlie = -1;
    public final RunnableC2944v whiskey = new RunnableC2944v(2, this);

    public C3391d(Context context, ViewGroup viewGroup, A3 a32) {
        if (viewGroup != null) {
            if (a32 != null) {
                this.victor = viewGroup;
                this.sierra = a32;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i4 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.papa = i4;
                this.oscar = i4;
                this.bravo = viewConfiguration.getScaledTouchSlop();
                this.mike = viewConfiguration.getScaledMaximumFlingVelocity();
                this.november = viewConfiguration.getScaledMinimumFlingVelocity();
                this.romeo = new OverScroller(context, xray);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void alpha() {
        this.charlie = -1;
        float[] fArr = this.delta;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.echo, 0.0f);
            Arrays.fill(this.foxtrot, 0.0f);
            Arrays.fill(this.golf, 0.0f);
            Arrays.fill(this.hotel, 0);
            Arrays.fill(this.india, 0);
            Arrays.fill(this.juliet, 0);
            this.kilo = 0;
        }
        VelocityTracker velocityTracker = this.lima;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.lima = null;
        }
    }

    public final void bravo(int i4, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.victor;
        if (parent == viewGroup) {
            this.tango = view;
            this.charlie = i4;
            this.sierra.hotel(i4, view);
            papa(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean charlie(float f5, float f10, int i4, int i5) {
        float abs = Math.abs(f5);
        float abs2 = Math.abs(f10);
        if ((this.hotel[i4] & i5) == i5 && (this.quebec & i5) != 0 && (this.juliet[i4] & i5) != i5 && (this.india[i4] & i5) != i5) {
            float f11 = this.bravo;
            if (abs > f11 || abs2 > f11) {
                if (abs < abs2 * 0.5f) {
                    this.sierra.getClass();
                }
                if ((this.india[i4] & i5) == 0 && abs > this.bravo) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean delta(View view, float f5, float f10) {
        boolean z2;
        boolean z10;
        if (view != null) {
            A3 a32 = this.sierra;
            if (a32.delta(view) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (a32.echo() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2 && z10) {
                float f11 = (f10 * f10) + (f5 * f5);
                int i4 = this.bravo;
                if (f11 > i4 * i4) {
                }
            } else if (!z2 ? !(!z10 || Math.abs(f10) <= this.bravo) : Math.abs(f5) > this.bravo) {
                return true;
            }
        }
        return false;
    }

    public final void echo(int i4) {
        float[] fArr = this.delta;
        if (fArr != null) {
            int i5 = this.kilo;
            int i10 = 1 << i4;
            if ((i5 & i10) != 0) {
                fArr[i4] = 0.0f;
                this.echo[i4] = 0.0f;
                this.foxtrot[i4] = 0.0f;
                this.golf[i4] = 0.0f;
                this.hotel[i4] = 0;
                this.india[i4] = 0;
                this.juliet[i4] = 0;
                this.kilo = (~i10) & i5;
            }
        }
    }

    public final int foxtrot(int i4, int i5, int i10) {
        int abs;
        if (i4 == 0) {
            return 0;
        }
        float width = this.victor.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i5);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / i10) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean golf() {
        if (this.alpha == 2) {
            OverScroller overScroller = this.romeo;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.tango.getLeft();
            int top = currY - this.tango.getTop();
            if (left != 0) {
                View view = this.tango;
                WeakHashMap weakHashMap = au.alpha;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.tango;
                WeakHashMap weakHashMap2 = au.alpha;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.sierra.juliet(this.tango, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.victor.post(this.whiskey);
            }
        }
        if (this.alpha != 2) {
            return false;
        }
        return true;
    }

    public final View hotel(int i4, int i5) {
        ViewGroup viewGroup = this.victor;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.sierra.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean india(int i4, int i5, int i10, int i11) {
        float f5;
        float f10;
        float f11;
        float f12;
        int left = this.tango.getLeft();
        int top = this.tango.getTop();
        int i12 = i4 - left;
        int i13 = i5 - top;
        OverScroller overScroller = this.romeo;
        if (i12 == 0 && i13 == 0) {
            overScroller.abortAnimation();
            papa(0);
            return false;
        }
        View view = this.tango;
        int i14 = (int) this.november;
        int i15 = (int) this.mike;
        int abs = Math.abs(i10);
        if (abs < i14) {
            i10 = 0;
        } else if (abs > i15) {
            if (i10 > 0) {
                i10 = i15;
            } else {
                i10 = -i15;
            }
        }
        int i16 = (int) this.november;
        int abs2 = Math.abs(i11);
        if (abs2 < i16) {
            i11 = 0;
        } else if (abs2 > i15) {
            if (i11 > 0) {
                i11 = i15;
            } else {
                i11 = -i15;
            }
        }
        int abs3 = Math.abs(i12);
        int abs4 = Math.abs(i13);
        int abs5 = Math.abs(i10);
        int abs6 = Math.abs(i11);
        int i17 = abs5 + abs6;
        int i18 = abs3 + abs4;
        if (i10 != 0) {
            f5 = abs5;
            f10 = i17;
        } else {
            f5 = abs3;
            f10 = i18;
        }
        float f13 = f5 / f10;
        if (i11 != 0) {
            f11 = abs6;
            f12 = i17;
        } else {
            f11 = abs4;
            f12 = i18;
        }
        float f14 = f11 / f12;
        A3 a32 = this.sierra;
        overScroller.startScroll(left, top, i12, i13, (int) ((foxtrot(i13, i11, a32.echo()) * f14) + (foxtrot(i12, i10, a32.delta(view)) * f13)));
        papa(2);
        return true;
    }

    public final boolean juliet(int i4) {
        if ((this.kilo & (1 << i4)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void kilo(MotionEvent motionEvent) {
        int i4;
        boolean z2 = true;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            alpha();
        }
        if (this.lima == null) {
            this.lima = VelocityTracker.obtain();
        }
        this.lima.addMovement(motionEvent);
        int i5 = 0;
        A3 a32 = this.sierra;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.alpha == 1 && pointerId == this.charlie) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i5 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i5);
                                            if (pointerId2 != this.charlie) {
                                                View hotel = hotel((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                                                View view = this.tango;
                                                if (hotel == view && tango(pointerId2, view)) {
                                                    i4 = this.charlie;
                                                    break;
                                                }
                                            }
                                            i5++;
                                        } else {
                                            i4 = -1;
                                            break;
                                        }
                                    }
                                    if (i4 == -1) {
                                        lima();
                                    }
                                }
                                echo(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x4 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        november(pointerId3, x4, y10);
                        if (this.alpha == 0) {
                            tango(pointerId3, hotel((int) x4, (int) y10));
                            if ((this.hotel[pointerId3] & this.quebec) != 0) {
                                a32.golf();
                                return;
                            }
                            return;
                        }
                        int i10 = (int) x4;
                        int i11 = (int) y10;
                        View view2 = this.tango;
                        if (view2 == null || i10 < view2.getLeft() || i10 >= view2.getRight() || i11 < view2.getTop() || i11 >= view2.getBottom()) {
                            z2 = false;
                        }
                        if (z2) {
                            tango(pointerId3, this.tango);
                            return;
                        }
                        return;
                    }
                    if (this.alpha == 1) {
                        this.uniform = true;
                        a32.kilo(this.tango, 0.0f, 0.0f);
                        this.uniform = false;
                        if (this.alpha == 1) {
                            papa(0);
                        }
                    }
                    alpha();
                    return;
                }
                if (this.alpha == 1) {
                    if (juliet(this.charlie)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.charlie);
                        float x5 = motionEvent.getX(findPointerIndex);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.foxtrot;
                        int i12 = this.charlie;
                        int i13 = (int) (x5 - fArr[i12]);
                        int i14 = (int) (y11 - this.golf[i12]);
                        int left = this.tango.getLeft() + i13;
                        int top = this.tango.getTop() + i14;
                        int left2 = this.tango.getLeft();
                        int top2 = this.tango.getTop();
                        if (i13 != 0) {
                            left = a32.alpha(left, this.tango);
                            WeakHashMap weakHashMap = au.alpha;
                            this.tango.offsetLeftAndRight(left - left2);
                        }
                        if (i14 != 0) {
                            top = a32.bravo(top, this.tango);
                            WeakHashMap weakHashMap2 = au.alpha;
                            this.tango.offsetTopAndBottom(top - top2);
                        }
                        if (i13 != 0 || i14 != 0) {
                            a32.juliet(this.tango, left, top);
                        }
                        oscar(motionEvent);
                        return;
                    }
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i5 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i5);
                    if (juliet(pointerId4)) {
                        float x10 = motionEvent.getX(i5);
                        float y12 = motionEvent.getY(i5);
                        float f5 = x10 - this.delta[pointerId4];
                        float f10 = y12 - this.echo[pointerId4];
                        mike(pointerId4, f5, f10);
                        if (this.alpha != 1) {
                            View hotel2 = hotel((int) x10, (int) y12);
                            if (delta(hotel2, f5, f10) && tango(pointerId4, hotel2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i5++;
                }
                oscar(motionEvent);
                return;
            }
            if (this.alpha == 1) {
                lima();
            }
            alpha();
            return;
        }
        float x11 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View hotel3 = hotel((int) x11, (int) y13);
        november(pointerId5, x11, y13);
        tango(pointerId5, hotel3);
        if ((this.hotel[pointerId5] & this.quebec) != 0) {
            a32.golf();
        }
    }

    public final void lima() {
        VelocityTracker velocityTracker = this.lima;
        float f5 = this.mike;
        velocityTracker.computeCurrentVelocity(1000, f5);
        float xVelocity = this.lima.getXVelocity(this.charlie);
        float f10 = this.november;
        float abs = Math.abs(xVelocity);
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f5) {
            if (xVelocity > 0.0f) {
                xVelocity = f5;
            } else {
                xVelocity = -f5;
            }
        }
        float yVelocity = this.lima.getYVelocity(this.charlie);
        float f11 = this.november;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f11) {
            f5 = 0.0f;
        } else if (abs2 > f5) {
            if (yVelocity <= 0.0f) {
                f5 = -f5;
            }
        } else {
            f5 = yVelocity;
        }
        this.uniform = true;
        this.sierra.kilo(this.tango, xVelocity, f5);
        this.uniform = false;
        if (this.alpha == 1) {
            papa(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r4v3, types: [t6.A3] */
    public final void mike(int i4, float f5, float f10) {
        boolean charlie = charlie(f5, f10, i4, 1);
        boolean z2 = charlie;
        if (charlie(f10, f5, i4, 4)) {
            z2 = (charlie ? 1 : 0) | 4;
        }
        boolean z10 = z2;
        if (charlie(f5, f10, i4, 2)) {
            z10 = (z2 ? 1 : 0) | 2;
        }
        ?? r02 = z10;
        if (charlie(f10, f5, i4, 8)) {
            r02 = (z10 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.india;
            iArr[i4] = iArr[i4] | r02;
            this.sierra.foxtrot(r02, i4);
        }
    }

    public final void november(int i4, float f5, float f10) {
        float[] fArr = this.delta;
        int i5 = 0;
        if (fArr == null || fArr.length <= i4) {
            int i10 = i4 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.echo;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.foxtrot;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.golf;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.hotel;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.india;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.juliet;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.delta = fArr2;
            this.echo = fArr3;
            this.foxtrot = fArr4;
            this.golf = fArr5;
            this.hotel = iArr;
            this.india = iArr2;
            this.juliet = iArr3;
        }
        float[] fArr9 = this.delta;
        this.foxtrot[i4] = f5;
        fArr9[i4] = f5;
        float[] fArr10 = this.echo;
        this.golf[i4] = f10;
        fArr10[i4] = f10;
        int[] iArr7 = this.hotel;
        int i11 = (int) f5;
        int i12 = (int) f10;
        ViewGroup viewGroup = this.victor;
        if (i11 < viewGroup.getLeft() + this.oscar) {
            i5 = 1;
        }
        if (i12 < viewGroup.getTop() + this.oscar) {
            i5 |= 4;
        }
        if (i11 > viewGroup.getRight() - this.oscar) {
            i5 |= 2;
        }
        if (i12 > viewGroup.getBottom() - this.oscar) {
            i5 |= 8;
        }
        iArr7[i4] = i5;
        this.kilo = (1 << i4) | this.kilo;
    }

    public final void oscar(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (juliet(pointerId)) {
                float x4 = motionEvent.getX(i4);
                float y10 = motionEvent.getY(i4);
                this.foxtrot[pointerId] = x4;
                this.golf[pointerId] = y10;
            }
        }
    }

    public final void papa(int i4) {
        this.victor.removeCallbacks(this.whiskey);
        if (this.alpha != i4) {
            this.alpha = i4;
            this.sierra.india(i4);
            if (this.alpha == 0) {
                this.tango = null;
            }
        }
    }

    public final boolean quebec(int i4, int i5) {
        if (this.uniform) {
            return india(i4, i5, (int) this.lima.getXVelocity(this.charlie), (int) this.lima.getYVelocity(this.charlie));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean romeo(MotionEvent motionEvent) {
        boolean z2;
        View hotel;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            alpha();
        }
        if (this.lima == null) {
            this.lima = VelocityTracker.obtain();
        }
        this.lima.addMovement(motionEvent);
        A3 a32 = this.sierra;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                echo(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x4 = motionEvent.getX(actionIndex);
                            float y10 = motionEvent.getY(actionIndex);
                            november(pointerId, x4, y10);
                            int i4 = this.alpha;
                            if (i4 == 0) {
                                if ((this.hotel[pointerId] & this.quebec) != 0) {
                                    a32.golf();
                                }
                            } else if (i4 == 2 && (hotel = hotel((int) x4, (int) y10)) == this.tango) {
                                tango(pointerId, hotel);
                            }
                        }
                    }
                } else if (this.delta != null && this.echo != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i5 = 0; i5 < pointerCount; i5++) {
                        int pointerId2 = motionEvent.getPointerId(i5);
                        if (juliet(pointerId2)) {
                            float x5 = motionEvent.getX(i5);
                            float y11 = motionEvent.getY(i5);
                            float f5 = x5 - this.delta[pointerId2];
                            float f10 = y11 - this.echo[pointerId2];
                            View hotel2 = hotel((int) x5, (int) y11);
                            if (hotel2 != null && delta(hotel2, f5, f10)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                int left = hotel2.getLeft();
                                int alpha = a32.alpha(((int) f5) + left, hotel2);
                                int top = hotel2.getTop();
                                int bravo = a32.bravo(((int) f10) + top, hotel2);
                                int delta = a32.delta(hotel2);
                                int echo = a32.echo();
                                if (delta != 0) {
                                    if (delta > 0) {
                                    }
                                }
                                if (echo == 0) {
                                    break;
                                }
                                if (echo > 0 && bravo == top) {
                                    break;
                                }
                            }
                            mike(pointerId2, f5, f10);
                            if (this.alpha == 1) {
                                break;
                            }
                            if (z2 && tango(pointerId2, hotel2)) {
                                break;
                            }
                        }
                    }
                    oscar(motionEvent);
                }
            }
            alpha();
        } else {
            float x10 = motionEvent.getX();
            float y12 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            november(pointerId3, x10, y12);
            View hotel3 = hotel((int) x10, (int) y12);
            if (hotel3 == this.tango && this.alpha == 2) {
                tango(pointerId3, hotel3);
            }
            if ((this.hotel[pointerId3] & this.quebec) != 0) {
                a32.golf();
            }
        }
        if (this.alpha == 1) {
            return true;
        }
        return false;
    }

    public final boolean sierra(View view, int i4, int i5) {
        this.tango = view;
        this.charlie = -1;
        boolean india = india(i4, i5, 0, 0);
        if (!india && this.alpha == 0 && this.tango != null) {
            this.tango = null;
        }
        return india;
    }

    public final boolean tango(int i4, View view) {
        if (view == this.tango && this.charlie == i4) {
            return true;
        }
        if (view != null && this.sierra.oscar(i4, view)) {
            this.charlie = i4;
            bravo(i4, view);
            return true;
        }
        return false;
    }
}
